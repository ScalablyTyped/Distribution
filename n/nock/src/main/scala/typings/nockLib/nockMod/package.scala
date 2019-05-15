package typings
package nockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nockMod {
  type HttpHeaders = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String] | nockLib.Anon_BodyReq]
  type InterceptFunction = js.Function3[
    /* uri */ java.lang.String | stdLib.RegExp | nockLib.Anon_Uri, 
    /* requestBody */ js.UndefOr[RequestBodyMatcher], 
    /* interceptorOptions */ js.UndefOr[Options], 
    Interceptor
  ]
  type POJO = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ReplyBody = java.lang.String | nodeLib.Buffer | nodeLib.fsMod.ReadStream | POJO
  type ReplyCallback = js.Function2[/* err */ js.Any, /* result */ ReplyCallbackResult, scala.Unit]
  type ReplyCallbackResult = ReplyBody | (js.Tuple2[scala.Double, ReplyBody]) | (js.Tuple3[scala.Double, ReplyBody, HttpHeaders])
  type RequestBodyMatcher = java.lang.String | nodeLib.Buffer | stdLib.RegExp | POJO | nockLib.Anon_Body
  type RequestHeaderMatcher = org.scalablytyped.runtime.StringDictionary[java.lang.String | stdLib.RegExp | nockLib.Anon_HeaderValue]
}
