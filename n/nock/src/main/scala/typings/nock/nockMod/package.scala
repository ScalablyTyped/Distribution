package typings.nock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nockMod {
  import typings.nock.Anon_Proto
  import typings.node.Buffer
  import typings.node.fsMod.ReadStream
  import typings.node.httpMod.ClientRequest
  import typings.node.httpMod.IncomingMessage
  import typings.node.httpMod.RequestOptions
  import typings.std.Map
  import typings.std.Record
  import typings.std.RegExp

  type Body = String | (Record[String, js.Any])
  // Essentially valid, decoded JSON with the addition of possible RegExp. TS doesn't currently have
  // a great way to represent JSON type data, this data matcher design is based off this comment.
  // https://github.com/microsoft/TypeScript/issues/1897#issuecomment-338650717
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - `js.undefined`
    - scala.Nothing
    - typings.std.RegExp
    - typings.nock.nockMod.DataMatcherArray
    - typings.nock.nockMod.DataMatcherMap
  */
  type DataMatcher = js.UndefOr[_DataMatcher | Boolean | Double | String | Null | RegExp]
  type InterceptFunction = js.Function3[
    /* uri */ String | RegExp | (js.Function1[/* uri */ String, Boolean]), 
    /* requestBody */ js.UndefOr[RequestBodyMatcher], 
    /* interceptorOptions */ js.UndefOr[Options], 
    Interceptor
  ]
  // a string or decoded JSON
  type ReplyBody = Body | Buffer | ReadStream
  type ReplyFnResult = js.Array[StatusCode] | (js.Tuple2[StatusCode, ReplyBody]) | (js.Tuple3[StatusCode, ReplyBody, ReplyHeaders])
  type ReplyHeaderFunction = js.Function3[
    /* req */ ClientRequest, 
    /* res */ IncomingMessage, 
    /* body */ String | Buffer, 
    String | js.Array[String]
  ]
  type ReplyHeaderValue = String | js.Array[String] | ReplyHeaderFunction
  type ReplyHeaders = (Record[String, ReplyHeaderValue]) | (Map[String, ReplyHeaderValue]) | js.Array[ReplyHeaderValue]
  type ReqOptions = RequestOptions with Anon_Proto
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.std.RegExp
    - typings.nock.nockMod.DataMatcherArray
    - typings.nock.nockMod.DataMatcherMap
    - js.Function1[/ * body * / js.Any, scala.Boolean]
  */
  type RequestBodyMatcher = _RequestBodyMatcher | (js.Function1[/* body */ js.Any, Boolean]) | String | Buffer | RegExp
  type RequestHeaderMatcher = String | RegExp | (js.Function1[/* fieldValue */ String, Boolean])
  type StatusCode = Double
}
