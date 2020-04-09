package typings.plotlyJs.mod

import typings.plotlyJs.PartialAnnotationsArrowcolor
import typings.plotlyJs.PartialCameraCenter
import typings.plotlyJs.PartialDomain
import typings.plotlyJs.PartialPoint
import typings.plotlyJs.PartialSceneAxisBackgroundcolor
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

trait Scene extends js.Object {
  var annotations: PartialAnnotationsArrowcolor | js.Array[PartialAnnotationsArrowcolor]
  var aspectmode: auto | cube | data | manual
  var aspectratio: PartialPoint
  var bgcolor: String
  var camera: PartialCameraCenter
  var captureevents: Boolean
  var domain: PartialDomain
  var dragmode: orbit | turntable | zoom | pan | `false`
  var hovermode: closest | `false`
  var xaxis: PartialSceneAxisBackgroundcolor
  var yaxis: PartialSceneAxisBackgroundcolor
  var zaxis: PartialSceneAxisBackgroundcolor
}

object Scene {
  @scala.inline
  def apply(
    annotations: PartialAnnotationsArrowcolor | js.Array[PartialAnnotationsArrowcolor],
    aspectmode: auto | cube | data | manual,
    aspectratio: PartialPoint,
    bgcolor: String,
    camera: PartialCameraCenter,
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
}

