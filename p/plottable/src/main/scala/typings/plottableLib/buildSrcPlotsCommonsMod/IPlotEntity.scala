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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("dataset")(dataset)
    __obj.updateDynamic("datasetIndex")(datasetIndex)
    __obj.updateDynamic("datum")(datum)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("selection")(selection)
    __obj.asInstanceOf[IPlotEntity]
  }
}

