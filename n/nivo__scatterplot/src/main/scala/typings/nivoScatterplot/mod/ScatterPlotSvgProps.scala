package typings.nivoScatterplot.mod

import typings.nivoCore.mod.CartesianMarkerProps
import typings.nivoCore.mod.MotionProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterPlotSvgProps
  extends ScatterPlotProps
     with MotionProps {
  var layers: js.UndefOr[js.Array[CustomLayerId | CustomSvgLayer]] = js.native
  var markers: js.UndefOr[js.Array[CartesianMarkerProps]] = js.native
  var renderNode: js.UndefOr[NodeComponent] = js.native
}

object ScatterPlotSvgProps {
  @scala.inline
  def apply(data: js.Array[Serie]): ScatterPlotSvgProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterPlotSvgProps]
  }
  @scala.inline
  implicit class ScatterPlotSvgPropsOps[Self <: ScatterPlotSvgProps] (val x: Self) extends AnyVal {
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
    def setLayersVarargs(value: (CustomLayerId | CustomSvgLayer)*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[CustomLayerId | CustomSvgLayer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setMarkersVarargs(value: CartesianMarkerProps*): Self = this.set("markers", js.Array(value :_*))
    @scala.inline
    def setMarkers(value: js.Array[CartesianMarkerProps]): Self = this.set("markers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkers: Self = this.set("markers", js.undefined)
    @scala.inline
    def setRenderNode(value: /* props */ NodeProps => ReactNode): Self = this.set("renderNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderNode: Self = this.set("renderNode", js.undefined)
  }
  
}

