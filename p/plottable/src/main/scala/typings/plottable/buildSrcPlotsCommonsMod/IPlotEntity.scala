package typings.plottable.buildSrcPlotsCommonsMod

import typings.plottable.buildSrcCoreDatasetMod.Dataset
import typings.plottable.buildSrcCoreInterfacesMod.IEntity
import typings.plottable.buildSrcCoreInterfacesMod.IEntityBounds
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcCoreInterfacesMod.SimpleSelection
import typings.plottable.buildSrcPlotsPlotMod.Plot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlotEntity extends IEntity[Plot] {
  var dataset: Dataset
  var datasetIndex: Double
  var index: Double
}

object IPlotEntity {
  @scala.inline
  def apply(
    bounds: IEntityBounds,
    component: Plot,
    dataset: Dataset,
    datasetIndex: Double,
    datum: js.Any,
    index: Double,
    position: Point,
    selection: SimpleSelection[_]
  ): IPlotEntity = {
    val __obj = js.Dynamic.literal(bounds = bounds, component = component, dataset = dataset, datasetIndex = datasetIndex, datum = datum, index = index, position = position, selection = selection)
  
    __obj.asInstanceOf[IPlotEntity]
  }
}

