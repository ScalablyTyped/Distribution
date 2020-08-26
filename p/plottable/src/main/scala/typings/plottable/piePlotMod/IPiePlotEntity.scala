package typings.plottable.piePlotMod

import typings.plottable.commonsMod.IPlotEntity
import typings.plottable.datasetMod.Dataset
import typings.plottable.interfacesMod.IEntityBounds
import typings.plottable.interfacesMod.Point
import typings.plottable.interfacesMod.SimpleSelection
import typings.plottable.plotMod.Plot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPiePlotEntity extends IPlotEntity {
  var strokeSelection: SimpleSelection[_] = js.native
}

object IPiePlotEntity {
  @scala.inline
  def apply(
    bounds: IEntityBounds,
    component: Plot,
    dataset: Dataset,
    datasetIndex: Double,
    datum: js.Any,
    index: Double,
    position: Point,
    selection: SimpleSelection[_],
    strokeSelection: SimpleSelection[_]
  ): IPiePlotEntity = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], datasetIndex = datasetIndex.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], strokeSelection = strokeSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPiePlotEntity]
  }
  @scala.inline
  implicit class IPiePlotEntityOps[Self <: IPiePlotEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStrokeSelection(value: SimpleSelection[_]): Self = this.set("strokeSelection", value.asInstanceOf[js.Any])
  }
  
}

