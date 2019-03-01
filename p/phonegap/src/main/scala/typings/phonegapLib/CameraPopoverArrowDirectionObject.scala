package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraPopoverArrowDirectionObject extends js.Object {
  var ARROW_ANY: scala.Double
  var ARROW_DOWN: scala.Double
  var ARROW_LEFT: scala.Double
  var ARROW_RIGHT: scala.Double
  var ARROW_UP: scala.Double
}

object CameraPopoverArrowDirectionObject {
  @scala.inline
  def apply(
    ARROW_ANY: scala.Double,
    ARROW_DOWN: scala.Double,
    ARROW_LEFT: scala.Double,
    ARROW_RIGHT: scala.Double,
    ARROW_UP: scala.Double
  ): CameraPopoverArrowDirectionObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ARROW_ANY")(ARROW_ANY)
    __obj.updateDynamic("ARROW_DOWN")(ARROW_DOWN)
    __obj.updateDynamic("ARROW_LEFT")(ARROW_LEFT)
    __obj.updateDynamic("ARROW_RIGHT")(ARROW_RIGHT)
    __obj.updateDynamic("ARROW_UP")(ARROW_UP)
    __obj.asInstanceOf[CameraPopoverArrowDirectionObject]
  }
}

