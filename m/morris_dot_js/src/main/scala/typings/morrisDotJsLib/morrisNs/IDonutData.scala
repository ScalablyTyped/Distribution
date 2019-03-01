package typings
package morrisDotJsLib.morrisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDonutData extends js.Object {
  /** Label of the segment of the donut chart.*/
  var label: java.lang.String
  /** Size of the segment of the donut chart.*/
  var value: scala.Double
}

object IDonutData {
  @scala.inline
  def apply(label: java.lang.String, value: scala.Double): IDonutData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IDonutData]
  }
}

