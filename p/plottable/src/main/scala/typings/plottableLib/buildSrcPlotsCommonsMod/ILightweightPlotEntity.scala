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
    val __obj = js.Dynamic.literal(component = component, dataset = dataset, datasetIndex = datasetIndex, datum = datum, drawer = drawer, index = index, position = position, validDatumIndex = validDatumIndex)
  
    __obj.asInstanceOf[ILightweightPlotEntity]
  }
}

