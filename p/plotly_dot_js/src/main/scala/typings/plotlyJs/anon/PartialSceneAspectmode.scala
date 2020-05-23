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
trait PartialSceneAspectmode extends js.Object {
  var annotations: js.UndefOr[Partial[Annotations] | js.Array[Partial[Annotations]]] = js.undefined
  var aspectmode: js.UndefOr[auto | cube | data | manual] = js.undefined
  var aspectratio: js.UndefOr[Partial[Point]] = js.undefined
  var bgcolor: js.UndefOr[String] = js.undefined
  var camera: js.UndefOr[Partial[Camera]] = js.undefined
  var captureevents: js.UndefOr[Boolean] = js.undefined
  var domain: js.UndefOr[Partial[Domain]] = js.undefined
  var dragmode: js.UndefOr[orbit | turntable | zoom | pan | `false`] = js.undefined
  var hovermode: js.UndefOr[closest | `false`] = js.undefined
  var xaxis: js.UndefOr[Partial[SceneAxis]] = js.undefined
  var yaxis: js.UndefOr[Partial[SceneAxis]] = js.undefined
  var zaxis: js.UndefOr[Partial[SceneAxis]] = js.undefined
}

object PartialSceneAspectmode {
  @scala.inline
  def apply(
    annotations: Partial[Annotations] | js.Array[Partial[Annotations]] = null,
    aspectmode: auto | cube | data | manual = null,
    aspectratio: Partial[Point] = null,
    bgcolor: String = null,
    camera: Partial[Camera] = null,
    captureevents: js.UndefOr[Boolean] = js.undefined,
    domain: Partial[Domain] = null,
    dragmode: orbit | turntable | zoom | pan | `false` = null,
    hovermode: closest | `false` = null,
    xaxis: Partial[SceneAxis] = null,
    yaxis: Partial[SceneAxis] = null,
    zaxis: Partial[SceneAxis] = null
  ): PartialSceneAspectmode = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (aspectmode != null) __obj.updateDynamic("aspectmode")(aspectmode.asInstanceOf[js.Any])
    if (aspectratio != null) __obj.updateDynamic("aspectratio")(aspectratio.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (!js.isUndefined(captureevents)) __obj.updateDynamic("captureevents")(captureevents.get.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (dragmode != null) __obj.updateDynamic("dragmode")(dragmode.asInstanceOf[js.Any])
    if (hovermode != null) __obj.updateDynamic("hovermode")(hovermode.asInstanceOf[js.Any])
    if (xaxis != null) __obj.updateDynamic("xaxis")(xaxis.asInstanceOf[js.Any])
    if (yaxis != null) __obj.updateDynamic("yaxis")(yaxis.asInstanceOf[js.Any])
    if (zaxis != null) __obj.updateDynamic("zaxis")(zaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSceneAspectmode]
  }
}

