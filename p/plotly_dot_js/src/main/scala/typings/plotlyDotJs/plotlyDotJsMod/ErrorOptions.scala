package typings.plotlyDotJs.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorOptions extends js.Object {
  var color: Color
  var opacity: Double
  var symmetric: Boolean
  var thickness: Double
  var visible: Boolean
  var width: Double
}

object ErrorOptions {
  @scala.inline
  def apply(
    color: Color,
    opacity: Double,
    symmetric: Boolean,
    thickness: Double,
    visible: Boolean,
    width: Double
  ): ErrorOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], opacity = opacity, symmetric = symmetric, thickness = thickness, visible = visible, width = width)
  
    __obj.asInstanceOf[ErrorOptions]
  }
}

