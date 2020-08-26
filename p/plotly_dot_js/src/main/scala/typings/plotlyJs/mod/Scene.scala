package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialAnnotationsAlign
import typings.plotlyJs.anon.PartialCamera
import typings.plotlyJs.anon.PartialDomain
import typings.plotlyJs.anon.PartialPoint
import typings.plotlyJs.anon.PartialSceneAxisBackgroundcolor
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
import scala.scalajs.js.annotation._

@js.native
trait Scene extends js.Object {
  var annotations: PartialAnnotationsAlign | js.Array[PartialAnnotationsAlign] = js.native
  var aspectmode: auto | cube | data | manual = js.native
  var aspectratio: PartialPoint = js.native
  var bgcolor: String = js.native
  var camera: PartialCamera = js.native
  var captureevents: Boolean = js.native
  var domain: PartialDomain = js.native
  var dragmode: orbit | turntable | zoom | pan | `false` = js.native
  var hovermode: closest | `false` = js.native
  var xaxis: PartialSceneAxisBackgroundcolor = js.native
  var yaxis: PartialSceneAxisBackgroundcolor = js.native
  var zaxis: PartialSceneAxisBackgroundcolor = js.native
}

object Scene {
  @scala.inline
  def apply(
    annotations: PartialAnnotationsAlign | js.Array[PartialAnnotationsAlign],
    aspectmode: auto | cube | data | manual,
    aspectratio: PartialPoint,
    bgcolor: String,
    camera: PartialCamera,
    captureevents: Boolean,
    domain: PartialDomain,
    dragmode: orbit | turntable | zoom | pan | `false`,
    hovermode: closest | `false`,
    xaxis: PartialSceneAxisBackgroundcolor,
    yaxis: PartialSceneAxisBackgroundcolor,
    zaxis: PartialSceneAxisBackgroundcolor
  ): Scene = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], aspectmode = aspectmode.asInstanceOf[js.Any], aspectratio = aspectratio.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], captureevents = captureevents.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], zaxis = zaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
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
    def setAnnotationsVarargs(value: PartialAnnotationsAlign*): Self = this.set("annotations", js.Array(value :_*))
    @scala.inline
    def setAnnotations(value: PartialAnnotationsAlign | js.Array[PartialAnnotationsAlign]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def setAspectmode(value: auto | cube | data | manual): Self = this.set("aspectmode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAspectratio(value: PartialPoint): Self = this.set("aspectratio", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgcolor(value: String): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCamera(value: PartialCamera): Self = this.set("camera", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptureevents(value: Boolean): Self = this.set("captureevents", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: PartialDomain): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragmode(value: orbit | turntable | zoom | pan | `false`): Self = this.set("dragmode", value.asInstanceOf[js.Any])
    @scala.inline
    def setHovermode(value: closest | `false`): Self = this.set("hovermode", value.asInstanceOf[js.Any])
    @scala.inline
    def setXaxis(value: PartialSceneAxisBackgroundcolor): Self = this.set("xaxis", value.asInstanceOf[js.Any])
    @scala.inline
    def setYaxis(value: PartialSceneAxisBackgroundcolor): Self = this.set("yaxis", value.asInstanceOf[js.Any])
    @scala.inline
    def setZaxis(value: PartialSceneAxisBackgroundcolor): Self = this.set("zaxis", value.asInstanceOf[js.Any])
  }
  
}

