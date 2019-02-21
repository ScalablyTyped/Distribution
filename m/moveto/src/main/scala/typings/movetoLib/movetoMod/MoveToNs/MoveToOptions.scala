package typings
package movetoLib.movetoMod.MoveToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveToOptions extends js.Object {
  /**
    * The function to be run after scrolling complete. Target passes as the first argument
    */
  var callback: js.UndefOr[callbackType] = js.undefined
  /**
    * The container been computed and scrolled
    */
  var container: js.UndefOr[stdLib.Window | stdLib.HTMLElement] = js.undefined
  /**
    * Duration of scrolling, in milliseconds
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Ease function name
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tolerance of the target to be scrolled, can be negative or positive
    */
  var tolerance: js.UndefOr[scala.Double] = js.undefined
}

