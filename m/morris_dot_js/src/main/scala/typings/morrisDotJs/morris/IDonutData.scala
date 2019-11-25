package typings.morrisDotJs.morris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDonutData extends js.Object {
  /** Label of the segment of the donut chart.*/
  var label: String
  /** Size of the segment of the donut chart.*/
  var value: Double
}

object IDonutData {
  @scala.inline
  def apply(label: String, value: Double): IDonutData = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDonutData]
  }
}

