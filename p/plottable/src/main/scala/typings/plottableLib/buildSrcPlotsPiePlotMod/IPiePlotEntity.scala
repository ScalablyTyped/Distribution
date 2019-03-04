package typings
package plottableLib.buildSrcPlotsPiePlotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPiePlotEntity
  extends plottableLib.buildSrcPlotsCommonsMod.IPlotEntity {
  var strokeSelection: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_]
}

object IPiePlotEntity {
  @scala.inline
  def apply(
    bounds: plottableLib.buildSrcCoreInterfacesMod.IEntityBounds,
    component: plottableLib.buildSrcPlotsPlotMod.Plot,
    dataset: plottableLib.buildSrcCoreDatasetMod.Dataset,
    datasetIndex: scala.Double,
    datum: js.Any,
    index: scala.Double,
    position: plottableLib.buildSrcCoreInterfacesMod.Point,
    selection: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_],
    strokeSelection: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_]
  ): IPiePlotEntity = {
    val __obj = js.Dynamic.literal(bounds = bounds, component = component, dataset = dataset, datasetIndex = datasetIndex, datum = datum, index = index, position = position, selection = selection, strokeSelection = strokeSelection)
  
    __obj.asInstanceOf[IPiePlotEntity]
  }
}

