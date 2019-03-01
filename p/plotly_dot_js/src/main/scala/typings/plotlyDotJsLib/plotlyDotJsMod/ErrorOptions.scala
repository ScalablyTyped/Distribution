package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorOptions extends js.Object {
  var color: Color
  var opacity: scala.Double
  var symmetric: scala.Boolean
  var thickness: scala.Double
  var visible: scala.Boolean
  var width: scala.Double
}

object ErrorOptions {
  @scala.inline
  def apply(
    color: Color,
    opacity: scala.Double,
    symmetric: scala.Boolean,
    thickness: scala.Double,
    visible: scala.Boolean,
    width: scala.Double
  ): ErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("symmetric")(symmetric)
    __obj.updateDynamic("thickness")(thickness)
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ErrorOptions]
  }
}

