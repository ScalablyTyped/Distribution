package typings.plottable.buildSrcUtilsStackingUtilsMod

import typings.plottable.buildSrcCoreDatasetMod.Dataset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericStackedDatum[D] extends js.Object {
  var axisValue: D
  var offset: Double
  var originalDataset: Dataset
  var originalDatum: js.Any
  var originalIndex: Double
  var value: Double
}

object GenericStackedDatum {
  @scala.inline
  def apply[D](
    axisValue: D,
    offset: Double,
    originalDataset: Dataset,
    originalDatum: js.Any,
    originalIndex: Double,
    value: Double
  ): GenericStackedDatum[D] = {
    val __obj = js.Dynamic.literal(axisValue = axisValue.asInstanceOf[js.Any], offset = offset, originalDataset = originalDataset, originalDatum = originalDatum, originalIndex = originalIndex, value = value)
  
    __obj.asInstanceOf[GenericStackedDatum[D]]
  }
}

