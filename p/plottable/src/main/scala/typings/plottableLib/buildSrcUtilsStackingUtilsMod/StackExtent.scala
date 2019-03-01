package typings
package plottableLib.buildSrcUtilsStackingUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackExtent[D] extends js.Object {
  var axisValue: D
  var extent: scala.Double
  var stackedDatum: GenericStackedDatum[D]
}

object StackExtent {
  @scala.inline
  def apply[D](axisValue: D, extent: scala.Double, stackedDatum: GenericStackedDatum[D]): StackExtent[D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axisValue")(axisValue.asInstanceOf[js.Any])
    __obj.updateDynamic("extent")(extent)
    __obj.updateDynamic("stackedDatum")(stackedDatum)
    __obj.asInstanceOf[StackExtent[D]]
  }
}

