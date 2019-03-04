package typings
package plottableLib.buildSrcPlotsCommonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlotEntity
  extends plottableLib.buildSrcCoreInterfacesMod.IEntity[plottableLib.buildSrcPlotsPlotMod.Plot] {
  var dataset: plottableLib.buildSrcCoreDatasetMod.Dataset
  var datasetIndex: scala.Double
  var index: scala.Double
}

object IPlotEntity {
  @scala.inline
  def apply(
    bounds: plottableLib.buildSrcCoreInterfacesMod.IEntityBounds,
    component: plottableLib.buildSrcPlotsPlotMod.Plot,
    dataset: plottableLib.buildSrcCoreDatasetMod.Dataset,
    datasetIndex: scala.Double,
    datum: js.Any,
    index: scala.Double,
    position: plottableLib.buildSrcCoreInterfacesMod.Point,
    selection: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_]
  ): IPlotEntity = {
    val __obj = js.Dynamic.literal(bounds = bounds, component = component, dataset = dataset, datasetIndex = datasetIndex, datum = datum, index = index, position = position, selection = selection)
  
    __obj.asInstanceOf[IPlotEntity]
  }
}

