package typings
package nockLib.nockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nockNs {
  type InterceptFunction = js.Function3[
    /* uri */ java.lang.String | stdLib.RegExp | nockLib.Anon_Uri, 
    /* requestBody */ js.UndefOr[java.lang.String | stdLib.RegExp | nockLib.Anon_Body | js.Any], 
    /* interceptorOptions */ js.UndefOr[Options], 
    Interceptor
  ]
  type NockBackMode = nockLib.nockLibStrings.wild | nockLib.nockLibStrings.dryrun | nockLib.nockLibStrings.record | nockLib.nockLibStrings.lockdown
  type ReplyCallback = js.Function2[/* err */ js.Any, /* result */ ReplyCallbackResult, scala.Unit]
  type ReplyCallbackResult = java.lang.String | (js.Tuple2[scala.Double, java.lang.String | js.Any]) | (js.Tuple3[scala.Double, java.lang.String | js.Any, HttpHeaders]) | js.Any
}
