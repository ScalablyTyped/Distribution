package typings
package olLib.viewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewOptions extends js.Object {
  var center: js.UndefOr[olLib.coordinateMod.Coordinate] = js.undefined
  var constrainRotation: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var enableRotation: js.UndefOr[scala.Boolean] = js.undefined
  var extent: js.UndefOr[olLib.extentMod.Extent] = js.undefined
  var maxResolution: js.UndefOr[scala.Double] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minResolution: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var projection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var resolution: js.UndefOr[scala.Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
  var zoomFactor: js.UndefOr[scala.Double] = js.undefined
}

object ViewOptions {
  @scala.inline
  def apply(
    center: olLib.coordinateMod.Coordinate = null,
    constrainRotation: scala.Boolean | scala.Double = null,
    enableRotation: js.UndefOr[scala.Boolean] = js.undefined,
    extent: olLib.extentMod.Extent = null,
    maxResolution: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minResolution: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    projection: olLib.projMod.ProjectionLike = null,
    resolution: scala.Int | scala.Double = null,
    resolutions: js.Array[scala.Double] = null,
    rotation: scala.Int | scala.Double = null,
    zoom: scala.Int | scala.Double = null,
    zoomFactor: scala.Int | scala.Double = null
  ): ViewOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (constrainRotation != null) __obj.updateDynamic("constrainRotation")(constrainRotation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRotation)) __obj.updateDynamic("enableRotation")(enableRotation)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewOptions]
  }
}

