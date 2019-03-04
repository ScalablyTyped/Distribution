package typings
package plottableLib.buildSrcPlotsScatterPlotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightweightScatterPlotEntity
  extends plottableLib.buildSrcPlotsCommonsMod.ILightweightPlotEntity {
  var diameter: scala.Double
}

object ILightweightScatterPlotEntity {
  @scala.inline
  def apply(
    component: plottableLib.buildSrcPlotsPlotMod.Plot,
    dataset: plottableLib.buildSrcCoreDatasetMod.Dataset,
    datasetIndex: scala.Double,
    datum: js.Any,
    diameter: scala.Double,
    drawer: plottableLib.buildSrcDrawersDrawerMod.IDrawer,
    index: scala.Double,
    position: plottableLib.buildSrcCoreInterfacesMod.Point,
    validDatumIndex: scala.Double
  ): ILightweightScatterPlotEntity = {
    val __obj = js.Dynamic.literal(component = component, dataset = dataset, datasetIndex = datasetIndex, datum = datum, diameter = diameter, drawer = drawer, index = index, position = position, validDatumIndex = validDatumIndex)
  
    __obj.asInstanceOf[ILightweightScatterPlotEntity]
  }
}

