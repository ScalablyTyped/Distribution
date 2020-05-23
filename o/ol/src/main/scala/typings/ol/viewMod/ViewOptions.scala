package typings.ol.viewMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewOptions extends js.Object {
  var center: js.UndefOr[Coordinate] = js.undefined
  var constrainOnlyCenter: js.UndefOr[Boolean] = js.undefined
  var constrainResolution: js.UndefOr[Boolean] = js.undefined
  var constrainRotation: js.UndefOr[Boolean | Double] = js.undefined
  var enableRotation: js.UndefOr[Boolean] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var multiWorld: js.UndefOr[Boolean] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var showFullExtent: js.UndefOr[Boolean] = js.undefined
  var smoothExtentConstraint: js.UndefOr[Boolean] = js.undefined
  var smoothResolutionConstraint: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
  var zoomFactor: js.UndefOr[Double] = js.undefined
}

object ViewOptions {
  @scala.inline
  def apply(
    center: Coordinate = null,
    constrainOnlyCenter: js.UndefOr[Boolean] = js.undefined,
    constrainResolution: js.UndefOr[Boolean] = js.undefined,
    constrainRotation: Boolean | Double = null,
    enableRotation: js.UndefOr[Boolean] = js.undefined,
    extent: Extent = null,
    maxResolution: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minResolution: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    multiWorld: js.UndefOr[Boolean] = js.undefined,
    projection: ProjectionLike = null,
    resolution: js.UndefOr[Double] = js.undefined,
    resolutions: js.Array[Double] = null,
    rotation: js.UndefOr[Double] = js.undefined,
    showFullExtent: js.UndefOr[Boolean] = js.undefined,
    smoothExtentConstraint: js.UndefOr[Boolean] = js.undefined,
    smoothResolutionConstraint: js.UndefOr[Boolean] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined,
    zoomFactor: js.UndefOr[Double] = js.undefined
  ): ViewOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainOnlyCenter)) __obj.updateDynamic("constrainOnlyCenter")(constrainOnlyCenter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainResolution)) __obj.updateDynamic("constrainResolution")(constrainResolution.get.asInstanceOf[js.Any])
    if (constrainRotation != null) __obj.updateDynamic("constrainRotation")(constrainRotation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRotation)) __obj.updateDynamic("enableRotation")(enableRotation.get.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResolution)) __obj.updateDynamic("maxResolution")(maxResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minResolution)) __obj.updateDynamic("minResolution")(minResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiWorld)) __obj.updateDynamic("multiWorld")(multiWorld.get.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showFullExtent)) __obj.updateDynamic("showFullExtent")(showFullExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothExtentConstraint)) __obj.updateDynamic("smoothExtentConstraint")(smoothExtentConstraint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothResolutionConstraint)) __obj.updateDynamic("smoothResolutionConstraint")(smoothResolutionConstraint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomFactor)) __obj.updateDynamic("zoomFactor")(zoomFactor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewOptions]
  }
}

