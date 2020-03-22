package typings.plotlyJs

import typings.plotlyJs.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLine extends js.Object {
  var color: Color
  var line: AnonColor
  var thickness: Double
}

object AnonLine {
  @scala.inline
  def apply(color: Color, line: AnonColor, thickness: Double): AnonLine = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLine]
  }
}

