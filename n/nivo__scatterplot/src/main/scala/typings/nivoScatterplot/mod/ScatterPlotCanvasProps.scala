package typings.nivoScatterplot.mod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterPlotCanvasProps extends ScatterPlotProps {
  var layers: js.UndefOr[js.Array[CustomLayerId | CustomCanvasLayer]] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var renderNode: js.UndefOr[NodeCanvasComponent] = js.native
}

object ScatterPlotCanvasProps {
  @scala.inline
  def apply(data: js.Array[Serie]): ScatterPlotCanvasProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterPlotCanvasProps]
  }
  @scala.inline
  implicit class ScatterPlotCanvasPropsOps[Self <: ScatterPlotCanvasProps] (val x: Self) extends AnyVal {
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
    def setLayersVarargs(value: (CustomLayerId | CustomCanvasLayer)*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[CustomLayerId | CustomCanvasLayer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    @scala.inline
    def setRenderNode(value: (/* ctx */ CanvasRenderingContext2D, /* props */ NodeProps) => Unit): Self = this.set("renderNode", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenderNode: Self = this.set("renderNode", js.undefined)
  }
  
}

