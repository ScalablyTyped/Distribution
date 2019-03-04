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
    val __obj = js.Dynamic.literal(axisValue = axisValue.asInstanceOf[js.Any], extent = extent, stackedDatum = stackedDatum)
  
    __obj.asInstanceOf[StackExtent[D]]
  }
}

