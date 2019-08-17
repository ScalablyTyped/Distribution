package typings.nock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nockMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.nock.Fn_Body
  import typings.nock.Fn_BodyReq
  import typings.nock.Fn_HeaderValue
  import typings.nock.Fn_Uri
  import typings.node.Buffer
  import typings.node.fsMod.ReadStream
  import typings.std.RegExp

  type HttpHeaders = StringDictionary[String | js.Array[String] | Fn_BodyReq]
  type InterceptFunction = js.Function3[
    /* uri */ String | RegExp | Fn_Uri, 
    /* requestBody */ js.UndefOr[RequestBodyMatcher], 
    /* interceptorOptions */ js.UndefOr[Options], 
    Interceptor
  ]
  type POJO = StringDictionary[js.Any]
  type ReplyBody = String | Buffer | ReadStream | POJO
  type ReplyCallback = js.Function2[/* err */ js.Any, /* result */ ReplyCallbackResult, Unit]
  type ReplyCallbackResult = ReplyBody | (js.Tuple2[Double, ReplyBody]) | (js.Tuple3[Double, ReplyBody, HttpHeaders])
  type RequestBodyMatcher = String | Buffer | RegExp | POJO | Fn_Body
  type RequestHeaderMatcher = StringDictionary[String | RegExp | Fn_HeaderValue]
}
