package typings.nock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nockMod {
  import typings.nock.Anon_Proto
  import typings.nock.Fn_FieldValue
  import typings.nock.Fn_Uri
  import typings.node.Buffer
  import typings.node.fsMod.ReadStream
  import typings.node.httpMod.ClientRequest
  import typings.node.httpMod.IncomingMessage
  import typings.node.httpMod.RequestOptions
  import typings.std.Map
  import typings.std.Record
  import typings.std.RegExp

  type Body = String | (Record[String, js.Any])
  type InterceptFunction = js.Function3[
    /* uri */ String | RegExp | Fn_Uri, 
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
    - typings.nock.nockMod.DataMatcher
    - typings.nock.Fn_Body
  */
  type RequestBodyMatcher = _RequestBodyMatcher | String | Buffer | RegExp
  type RequestHeaderMatcher = String | RegExp | Fn_FieldValue
  type StatusCode = Double
}
