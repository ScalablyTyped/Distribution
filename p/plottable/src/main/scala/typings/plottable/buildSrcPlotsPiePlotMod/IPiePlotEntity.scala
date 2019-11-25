package typings.plottable.buildSrcPlotsPiePlotMod

import typings.plottable.buildSrcCoreDatasetMod.Dataset
import typings.plottable.buildSrcCoreInterfacesMod.IEntityBounds
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcCoreInterfacesMod.SimpleSelection
import typings.plottable.buildSrcPlotsCommonsMod.IPlotEntity
import typings.plottable.buildSrcPlotsPlotMod.Plot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPiePlotEntity extends IPlotEntity {
  var strokeSelection: SimpleSelection[_]
}

object IPiePlotEntity {
  @scala.inline
  def apply(
    bounds: IEntityBounds,
    component: Plot,
    dataset: Dataset,
    datasetIndex: Double,
    datum: js.Any,
    index: Double,
    position: Point,
    selection: SimpleSelection[_],
    strokeSelection: SimpleSelection[_]
  ): IPiePlotEntity = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], datasetIndex = datasetIndex.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], strokeSelection = strokeSelection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPiePlotEntity]
  }
}

