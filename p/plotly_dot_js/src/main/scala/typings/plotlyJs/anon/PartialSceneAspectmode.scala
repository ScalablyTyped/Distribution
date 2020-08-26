package typings.plotlyJs.anon

import typings.plotlyJs.mod.Annotations
import typings.plotlyJs.mod.Camera
import typings.plotlyJs.mod.Domain
import typings.plotlyJs.mod.Point
import typings.plotlyJs.mod.SceneAxis
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.closest
import typings.plotlyJs.plotlyJsStrings.cube
import typings.plotlyJs.plotlyJsStrings.data
import typings.plotlyJs.plotlyJsStrings.manual
import typings.plotlyJs.plotlyJsStrings.orbit
import typings.plotlyJs.plotlyJsStrings.pan
import typings.plotlyJs.plotlyJsStrings.turntable
import typings.plotlyJs.plotlyJsStrings.zoom
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Scene> */
@js.native
trait PartialSceneAspectmode extends js.Object {
  var annotations: js.UndefOr[Partial[Annotations] | js.Array[Partial[Annotations]]] = js.native
  var aspectmode: js.UndefOr[auto | cube | data | manual] = js.native
  var aspectratio: js.UndefOr[Partial[Point]] = js.native
  var bgcolor: js.UndefOr[String] = js.native
  var camera: js.UndefOr[Partial[Camera]] = js.native
  var captureevents: js.UndefOr[Boolean] = js.native
  var domain: js.UndefOr[Partial[Domain]] = js.native
  var dragmode: js.UndefOr[orbit | turntable | zoom | pan | `false`] = js.native
  var hovermode: js.UndefOr[closest | `false`] = js.native
  var xaxis: js.UndefOr[Partial[SceneAxis]] = js.native
  var yaxis: js.UndefOr[Partial[SceneAxis]] = js.native
  var zaxis: js.UndefOr[Partial[SceneAxis]] = js.native
}

object PartialSceneAspectmode {
  @scala.inline
  def apply(): PartialSceneAspectmode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSceneAspectmode]
  }
  @scala.inline
  implicit class PartialSceneAspectmodeOps[Self <: PartialSceneAspectmode] (val x: Self) extends AnyVal {
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
    def setAnnotationsVarargs(value: Partial[Annotations]*): Self = this.set("annotations", js.Array(value :_*))
    @scala.inline
    def setAnnotations(value: Partial[Annotations] | js.Array[Partial[Annotations]]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    @scala.inline
    def setAspectmode(value: auto | cube | data | manual): Self = this.set("aspectmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectmode: Self = this.set("aspectmode", js.undefined)
    @scala.inline
    def setAspectratio(value: Partial[Point]): Self = this.set("aspectratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectratio: Self = this.set("aspectratio", js.undefined)
    @scala.inline
    def setBgcolor(value: String): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgcolor: Self = this.set("bgcolor", js.undefined)
    @scala.inline
    def setCamera(value: Partial[Camera]): Self = this.set("camera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    @scala.inline
    def setCaptureevents(value: Boolean): Self = this.set("captureevents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureevents: Self = this.set("captureevents", js.undefined)
    @scala.inline
    def setDomain(value: Partial[Domain]): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setDragmode(value: orbit | turntable | zoom | pan | `false`): Self = this.set("dragmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragmode: Self = this.set("dragmode", js.undefined)
    @scala.inline
    def setHovermode(value: closest | `false`): Self = this.set("hovermode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHovermode: Self = this.set("hovermode", js.undefined)
    @scala.inline
    def setXaxis(value: Partial[SceneAxis]): Self = this.set("xaxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXaxis: Self = this.set("xaxis", js.undefined)
    @scala.inline
    def setYaxis(value: Partial[SceneAxis]): Self = this.set("yaxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYaxis: Self = this.set("yaxis", js.undefined)
    @scala.inline
    def setZaxis(value: Partial[SceneAxis]): Self = this.set("zaxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZaxis: Self = this.set("zaxis", js.undefined)
  }
  
}

