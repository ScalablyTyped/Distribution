package typings.plotlyJs.mod

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

trait Scene extends js.Object {
  var annotations: Partial[Annotations] | js.Array[Partial[Annotations]]
  var aspectmode: auto | cube | data | manual
  var aspectratio: Partial[Point]
  var bgcolor: String
  var camera: Partial[Camera]
  var captureevents: Boolean
  var domain: Partial[Domain]
  var dragmode: orbit | turntable | zoom | pan | `false`
  var hovermode: closest | `false`
  var xaxis: Partial[SceneAxis]
  var yaxis: Partial[SceneAxis]
  var zaxis: Partial[SceneAxis]
}

object Scene {
  @scala.inline
  def apply(
    annotations: Partial[Annotations] | js.Array[Partial[Annotations]],
    aspectmode: auto | cube | data | manual,
    aspectratio: Partial[Point],
    bgcolor: String,
    camera: Partial[Camera],
    captureevents: Boolean,
    domain: Partial[Domain],
    dragmode: orbit | turntable | zoom | pan | `false`,
    hovermode: closest | `false`,
    xaxis: Partial[SceneAxis],
    yaxis: Partial[SceneAxis],
    zaxis: Partial[SceneAxis]
  ): Scene = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], aspectmode = aspectmode.asInstanceOf[js.Any], aspectratio = aspectratio.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], captureevents = captureevents.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], zaxis = zaxis.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Scene]
  }
}

