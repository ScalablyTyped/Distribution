package typings
package plottableLib.buildSrcPlotsCommonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightweightPlotEntity extends js.Object {
  var component: plottableLib.buildSrcPlotsPlotMod.Plot
  var dataset: plottableLib.buildSrcCoreDatasetMod.Dataset
  var datasetIndex: scala.Double
  var datum: js.Any
  var drawer: plottableLib.buildSrcDrawersDrawerMod.IDrawer
  var index: scala.Double
  var position: plottableLib.buildSrcCoreInterfacesMod.Point
  var validDatumIndex: scala.Double
}

object ILightweightPlotEntity {
  @scala.inline
  def apply(
    component: plottableLib.buildSrcPlotsPlotMod.Plot,
    dataset: plottableLib.buildSrcCoreDatasetMod.Dataset,
    datasetIndex: scala.Double,
    datum: js.Any,
    drawer: plottableLib.buildSrcDrawersDrawerMod.IDrawer,
    index: scala.Double,
    position: plottableLib.buildSrcCoreInterfacesMod.Point,
    validDatumIndex: scala.Double
  ): ILightweightPlotEntity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("dataset")(dataset)
    __obj.updateDynamic("datasetIndex")(datasetIndex)
    __obj.updateDynamic("datum")(datum)
    __obj.updateDynamic("drawer")(drawer)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("validDatumIndex")(validDatumIndex)
    __obj.asInstanceOf[ILightweightPlotEntity]
  }
}

