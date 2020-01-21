package typings.plotlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLine extends js.Object {
  var line: AnonColor
  var thickness: Double
  var value: Double
}

object AnonLine {
  @scala.inline
  def apply(line: AnonColor, thickness: Double, value: Double): AnonLine = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLine]
  }
}

