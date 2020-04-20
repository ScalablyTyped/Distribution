package typings.plotlyJs

import typings.plotlyJs.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: Color
  var range: js.Array[Double]
}

object AnonColor {
  @scala.inline
  def apply(color: Color, range: js.Array[Double]): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}

