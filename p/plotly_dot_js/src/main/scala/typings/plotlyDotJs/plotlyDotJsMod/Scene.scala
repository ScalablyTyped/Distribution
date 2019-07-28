package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.plotlyDotJsNumbers.`false`
import typings.plotlyDotJs.plotlyDotJsStrings.auto
import typings.plotlyDotJs.plotlyDotJsStrings.closest
import typings.plotlyDotJs.plotlyDotJsStrings.cube
import typings.plotlyDotJs.plotlyDotJsStrings.data
import typings.plotlyDotJs.plotlyDotJsStrings.manual
import typings.plotlyDotJs.plotlyDotJsStrings.orbit
import typings.plotlyDotJs.plotlyDotJsStrings.pan
import typings.plotlyDotJs.plotlyDotJsStrings.turntable
import typings.plotlyDotJs.plotlyDotJsStrings.zoom
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
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], aspectmode = aspectmode.asInstanceOf[js.Any], aspectratio = aspectratio, bgcolor = bgcolor, camera = camera, captureevents = captureevents, domain = domain, dragmode = dragmode.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], xaxis = xaxis, yaxis = yaxis, zaxis = zaxis)
  
    __obj.asInstanceOf[Scene]
  }
}

