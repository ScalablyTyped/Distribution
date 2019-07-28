package typings.plottable.buildSrcPlotsScatterPlotMod

import typings.plottable.buildSrcCoreDatasetMod.Dataset
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcDrawersDrawerMod.IDrawer
import typings.plottable.buildSrcPlotsCommonsMod.ILightweightPlotEntity
import typings.plottable.buildSrcPlotsPlotMod.Plot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightweightScatterPlotEntity extends ILightweightPlotEntity {
  var diameter: Double
}

object ILightweightScatterPlotEntity {
  @scala.inline
  def apply(
    component: Plot,
    dataset: Dataset,
    datasetIndex: Double,
    datum: js.Any,
    diameter: Double,
    drawer: IDrawer,
    index: Double,
    position: Point,
    validDatumIndex: Double
  ): ILightweightScatterPlotEntity = {
    val __obj = js.Dynamic.literal(component = component, dataset = dataset, datasetIndex = datasetIndex, datum = datum, diameter = diameter, drawer = drawer, index = index, position = position, validDatumIndex = validDatumIndex)
  
    __obj.asInstanceOf[ILightweightScatterPlotEntity]
  }
}

