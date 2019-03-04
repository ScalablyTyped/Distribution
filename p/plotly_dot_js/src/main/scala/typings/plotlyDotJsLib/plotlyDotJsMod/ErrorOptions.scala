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
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], opacity = opacity, symmetric = symmetric, thickness = thickness, visible = visible, width = width)
  
    __obj.asInstanceOf[ErrorOptions]
  }
}

