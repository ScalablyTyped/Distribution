package typings.plotlyJs

import typings.plotlyJs.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRange extends js.Object {
  var color: Color
  var range: js.Array[Double]
}

object AnonRange {
  @scala.inline
  def apply(color: Color, range: js.Array[Double]): AnonRange = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRange]
  }
}

