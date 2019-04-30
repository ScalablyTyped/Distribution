package typings
package nockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nockMod {
  type HttpHeaders = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String] | nockLib.Anon_Body]
  type InterceptFunction = js.Function3[
    /* uri */ java.lang.String | stdLib.RegExp | nockLib.Anon_Uri, 
    /* requestBody */ js.UndefOr[java.lang.String | stdLib.RegExp | nockLib.Anon_BodyAny | js.Any], 
    /* interceptorOptions */ js.UndefOr[Options], 
    Interceptor
  ]
  type ReplyCallback = js.Function2[/* err */ js.Any, /* result */ ReplyCallbackResult, scala.Unit]
  type ReplyCallbackResult = java.lang.String | (js.Tuple2[scala.Double, java.lang.String | js.Any]) | (js.Tuple3[scala.Double, java.lang.String | js.Any, HttpHeaders]) | js.Any
}
