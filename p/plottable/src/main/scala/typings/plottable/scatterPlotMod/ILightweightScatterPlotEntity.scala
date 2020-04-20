package typings.plottable.scatterPlotMod

import typings.plottable.commonsMod.ILightweightPlotEntity
import typings.plottable.datasetMod.Dataset
import typings.plottable.drawerMod.IDrawer
import typings.plottable.interfacesMod.Point
import typings.plottable.plotMod.Plot
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
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], datasetIndex = datasetIndex.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], diameter = diameter.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], validDatumIndex = validDatumIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightweightScatterPlotEntity]
  }
}

