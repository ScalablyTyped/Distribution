package typings.plotlyJs.anon

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Scene> */
@js.native
trait PartialSceneAnnotations extends js.Object {
  
  var annotations: js.UndefOr[PartialAnnotationsArrowcolor | js.Array[PartialAnnotationsArrowcolor]] = js.native
  
  var aspectmode: js.UndefOr[auto | cube | data | manual] = js.native
  
  var aspectratio: js.UndefOr[PartialPoint] = js.native
  
  var bgcolor: js.UndefOr[String] = js.native
  
  var camera: js.UndefOr[PartialCameraCenter] = js.native
  
  var captureevents: js.UndefOr[Boolean] = js.native
  
  var domain: js.UndefOr[PartialDomain] = js.native
  
  var dragmode: js.UndefOr[orbit | turntable | zoom | pan | `false`] = js.native
  
  var hovermode: js.UndefOr[closest | `false`] = js.native
  
  var xaxis: js.UndefOr[PartialSceneAxisAutorange] = js.native
  
  var yaxis: js.UndefOr[PartialSceneAxisAutorange] = js.native
  
  var zaxis: js.UndefOr[PartialSceneAxisAutorange] = js.native
}
object PartialSceneAnnotations {
  
  @scala.inline
  def apply(): PartialSceneAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSceneAnnotations]
  }
  
  @scala.inline
  implicit class PartialSceneAnnotationsOps[Self <: PartialSceneAnnotations] (val x: Self) extends AnyVal {
    
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
    def setAnnotationsVarargs(value: PartialAnnotationsArrowcolor*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: PartialAnnotationsArrowcolor | js.Array[PartialAnnotationsArrowcolor]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setAspectmode(value: auto | cube | data | manual): Self = this.set("aspectmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectmode: Self = this.set("aspectmode", js.undefined)
    
    @scala.inline
    def setAspectratio(value: PartialPoint): Self = this.set("aspectratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectratio: Self = this.set("aspectratio", js.undefined)
    
    @scala.inline
    def setBgcolor(value: String): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgcolor: Self = this.set("bgcolor", js.undefined)
    
    @scala.inline
    def setCamera(value: PartialCameraCenter): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    
    @scala.inline
    def setCaptureevents(value: Boolean): Self = this.set("captureevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureevents: Self = this.set("captureevents", js.undefined)
    
    @scala.inline
    def setDomain(value: PartialDomain): Self = this.set("domain", value.asInstanceOf[js.Any])
    
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
    def setXaxis(value: PartialSceneAxisAutorange): Self = this.set("xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxis: Self = this.set("xaxis", js.undefined)
    
    @scala.inline
    def setYaxis(value: PartialSceneAxisAutorange): Self = this.set("yaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxis: Self = this.set("yaxis", js.undefined)
    
    @scala.inline
    def setZaxis(value: PartialSceneAxisAutorange): Self = this.set("zaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZaxis: Self = this.set("zaxis", js.undefined)
  }
}
