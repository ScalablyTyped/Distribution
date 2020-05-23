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
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Scene> */
trait PartialScene extends js.Object {
  var annotations: js.UndefOr[PartialAnnotations | js.Array[PartialAnnotations]] = js.undefined
  var aspectmode: js.UndefOr[auto | cube | data | manual] = js.undefined
  var aspectratio: js.UndefOr[PartialPoint] = js.undefined
  var bgcolor: js.UndefOr[String] = js.undefined
  var camera: js.UndefOr[PartialCamera] = js.undefined
  var captureevents: js.UndefOr[Boolean] = js.undefined
  var domain: js.UndefOr[PartialDomain] = js.undefined
  var dragmode: js.UndefOr[orbit | turntable | zoom | pan | `false`] = js.undefined
  var hovermode: js.UndefOr[closest | `false`] = js.undefined
  var xaxis: js.UndefOr[PartialSceneAxis] = js.undefined
  var yaxis: js.UndefOr[PartialSceneAxis] = js.undefined
  var zaxis: js.UndefOr[PartialSceneAxis] = js.undefined
}

object PartialScene {
  @scala.inline
  def apply(
    annotations: PartialAnnotations | js.Array[PartialAnnotations] = null,
    aspectmode: auto | cube | data | manual = null,
    aspectratio: PartialPoint = null,
    bgcolor: String = null,
    camera: PartialCamera = null,
    captureevents: js.UndefOr[Boolean] = js.undefined,
    domain: PartialDomain = null,
    dragmode: orbit | turntable | zoom | pan | `false` = null,
    hovermode: closest | `false` = null,
    xaxis: PartialSceneAxis = null,
    yaxis: PartialSceneAxis = null,
    zaxis: PartialSceneAxis = null
  ): PartialScene = {
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
    __obj.asInstanceOf[PartialScene]
  }
}

