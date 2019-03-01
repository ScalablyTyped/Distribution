package typings
package nwDotJsLib.nwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clipboard extends js.Object {
  /**
    * Get the clipboard object.
    *
    * @returns {Clipboard} the clipboard object.
    */
  def get(): nwDotJsLib.NWJSUnderscoreHelpersNs.clip
}

object Clipboard {
  @scala.inline
  def apply(get: js.Function0[nwDotJsLib.NWJSUnderscoreHelpersNs.clip]): Clipboard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[Clipboard]
  }
}

