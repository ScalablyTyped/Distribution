package typings.plottable.buildSrcPlotsCommonsMod

import typings.plottable.buildSrcCoreDatasetMod.Dataset
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcDrawersDrawerMod.IDrawer
import typings.plottable.buildSrcPlotsPlotMod.Plot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightweightPlotEntity extends js.Object {
  var component: Plot
  var dataset: Dataset
  var datasetIndex: Double
  var datum: js.Any
  var drawer: IDrawer
  var index: Double
  var position: Point
  var validDatumIndex: Double
}

object ILightweightPlotEntity {
  @scala.inline
  def apply(
    component: Plot,
    dataset: Dataset,
    datasetIndex: Double,
    datum: js.Any,
    drawer: IDrawer,
    index: Double,
    position: Point,
    validDatumIndex: Double
  ): ILightweightPlotEntity = {
    val __obj = js.Dynamic.literal(component = component, dataset = dataset, datasetIndex = datasetIndex, datum = datum, drawer = drawer, index = index, position = position, validDatumIndex = validDatumIndex)
  
    __obj.asInstanceOf[ILightweightPlotEntity]
  }
}

