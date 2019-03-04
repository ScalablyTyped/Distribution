package typings
package plottableLib.buildSrcUtilsStackingUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericStackedDatum[D] extends js.Object {
  var axisValue: D
  var offset: scala.Double
  var originalDataset: plottableLib.buildSrcCoreDatasetMod.Dataset
  var originalDatum: js.Any
  var originalIndex: scala.Double
  var value: scala.Double
}

object GenericStackedDatum {
  @scala.inline
  def apply[D](
    axisValue: D,
    offset: scala.Double,
    originalDataset: plottableLib.buildSrcCoreDatasetMod.Dataset,
    originalDatum: js.Any,
    originalIndex: scala.Double,
    value: scala.Double
  ): GenericStackedDatum[D] = {
    val __obj = js.Dynamic.literal(axisValue = axisValue.asInstanceOf[js.Any], offset = offset, originalDataset = originalDataset, originalDatum = originalDatum, originalIndex = originalIndex, value = value)
  
    __obj.asInstanceOf[GenericStackedDatum[D]]
  }
}

