package typings.nock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Body = java.lang.String | (typings.std.Record[java.lang.String, js.Any])
  // Essentially valid, decoded JSON with the addition of possible RegExp. TS doesn't currently have
  // a great way to represent JSON type data, this data matcher design is based off this comment.
  // https://github.com/microsoft/TypeScript/issues/1897#issuecomment-338650717
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - `js.undefined`
    - typings.std.RegExp
    - typings.nock.mod.DataMatcherArray
    - typings.nock.mod.DataMatcherMap
  */
  type DataMatcher = js.UndefOr[
    typings.nock.mod._DataMatcher | scala.Boolean | scala.Double | java.lang.String | scala.Null | typings.std.RegExp
  ]
  type InterceptFunction = js.Function3[
    /* uri */ java.lang.String | typings.std.RegExp | (js.Function1[/* uri */ java.lang.String, scala.Boolean]), 
    /* requestBody */ js.UndefOr[typings.nock.mod.RequestBodyMatcher], 
    /* interceptorOptions */ js.UndefOr[typings.nock.mod.Options], 
    typings.nock.mod.Interceptor
  ]
  // a string or decoded JSON
  type ReplyBody = typings.nock.mod.Body | typings.node.Buffer | typings.node.fsMod.ReadStream
  type ReplyFnResult = js.Array[typings.nock.mod.StatusCode] | (js.Tuple2[typings.nock.mod.StatusCode, typings.nock.mod.ReplyBody]) | (js.Tuple3[
    typings.nock.mod.StatusCode, 
    typings.nock.mod.ReplyBody, 
    typings.nock.mod.ReplyHeaders
  ])
  type ReplyHeaderFunction = js.Function3[
    /* req */ typings.node.httpMod.ClientRequest, 
    /* res */ typings.node.httpMod.IncomingMessage, 
    /* body */ java.lang.String | typings.node.Buffer, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type ReplyHeaderValue = java.lang.String | js.Array[java.lang.String] | typings.nock.mod.ReplyHeaderFunction
  type ReplyHeaders = (typings.std.Record[java.lang.String, typings.nock.mod.ReplyHeaderValue]) | (typings.std.Map[java.lang.String, typings.nock.mod.ReplyHeaderValue]) | js.Array[typings.nock.mod.ReplyHeaderValue]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.std.RegExp
    - typings.nock.mod.DataMatcherArray
    - typings.nock.mod.DataMatcherMap
    - js.Function1[/ * body * / js.Any, scala.Boolean]
  */
  type RequestBodyMatcher = typings.nock.mod._RequestBodyMatcher | (js.Function1[/* body */ js.Any, scala.Boolean]) | java.lang.String | typings.node.Buffer | typings.std.RegExp
  type RequestHeaderMatcher = java.lang.String | typings.std.RegExp | (js.Function1[/* fieldValue */ java.lang.String, scala.Boolean])
  type StatusCode = scala.Double
}
