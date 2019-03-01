package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blackberry extends js.Object {
  var blackberry: scala.Boolean
  var blackberry10: scala.Boolean
  var chrome: scala.Boolean
  var device: scala.Boolean
  var firefox: scala.Boolean
  var opera: scala.Boolean
}

object Anon_Blackberry {
  @scala.inline
  def apply(
    blackberry: scala.Boolean,
    blackberry10: scala.Boolean,
    chrome: scala.Boolean,
    device: scala.Boolean,
    firefox: scala.Boolean,
    opera: scala.Boolean
  ): Anon_Blackberry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blackberry")(blackberry)
    __obj.updateDynamic("blackberry10")(blackberry10)
    __obj.updateDynamic("chrome")(chrome)
    __obj.updateDynamic("device")(device)
    __obj.updateDynamic("firefox")(firefox)
    __obj.updateDynamic("opera")(opera)
    __obj.asInstanceOf[Anon_Blackberry]
  }
}

