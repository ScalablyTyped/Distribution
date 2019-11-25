package typings.plottable.buildSrcUtilsStackingUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackExtent[D] extends js.Object {
  var axisValue: D
  var extent: Double
  var stackedDatum: GenericStackedDatum[D]
}

object StackExtent {
  @scala.inline
  def apply[D](axisValue: D, extent: Double, stackedDatum: GenericStackedDatum[D]): StackExtent[D] = {
    val __obj = js.Dynamic.literal(axisValue = axisValue.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], stackedDatum = stackedDatum.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StackExtent[D]]
  }
}

