package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashInsightsLib {
  type CallbackFunc = js.Function2[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* responseBody */ java.lang.String, 
    scala.Unit
  ]
}
