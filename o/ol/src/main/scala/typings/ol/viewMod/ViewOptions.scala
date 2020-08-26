package typings.ol.viewMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewOptions extends js.Object {
  var center: js.UndefOr[Coordinate] = js.native
  var constrainOnlyCenter: js.UndefOr[Boolean] = js.native
  var constrainResolution: js.UndefOr[Boolean] = js.native
  var constrainRotation: js.UndefOr[Boolean | Double] = js.native
  var enableRotation: js.UndefOr[Boolean] = js.native
  var extent: js.UndefOr[Extent] = js.native
  var maxResolution: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minResolution: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var multiWorld: js.UndefOr[Boolean] = js.native
  var projection: js.UndefOr[ProjectionLike] = js.native
  var resolution: js.UndefOr[Double] = js.native
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var showFullExtent: js.UndefOr[Boolean] = js.native
  var smoothExtentConstraint: js.UndefOr[Boolean] = js.native
  var smoothResolutionConstraint: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Double] = js.native
  var zoomFactor: js.UndefOr[Double] = js.native
}

object ViewOptions {
  @scala.inline
  def apply(): ViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions]
  }
  @scala.inline
  implicit class ViewOptionsOps[Self <: ViewOptions] (val x: Self) extends AnyVal {
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
    def setCenterVarargs(value: Double*): Self = this.set("center", js.Array(value :_*))
    @scala.inline
    def setCenter(value: Coordinate): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setConstrainOnlyCenter(value: Boolean): Self = this.set("constrainOnlyCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainOnlyCenter: Self = this.set("constrainOnlyCenter", js.undefined)
    @scala.inline
    def setConstrainResolution(value: Boolean): Self = this.set("constrainResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainResolution: Self = this.set("constrainResolution", js.undefined)
    @scala.inline
    def setConstrainRotation(value: Boolean | Double): Self = this.set("constrainRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainRotation: Self = this.set("constrainRotation", js.undefined)
    @scala.inline
    def setEnableRotation(value: Boolean): Self = this.set("enableRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRotation: Self = this.set("enableRotation", js.undefined)
    @scala.inline
    def setExtent(value: Extent): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setMaxResolution(value: Double): Self = this.set("maxResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResolution: Self = this.set("maxResolution", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinResolution(value: Double): Self = this.set("minResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinResolution: Self = this.set("minResolution", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setMultiWorld(value: Boolean): Self = this.set("multiWorld", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiWorld: Self = this.set("multiWorld", js.undefined)
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    @scala.inline
    def setResolutionsVarargs(value: Double*): Self = this.set("resolutions", js.Array(value :_*))
    @scala.inline
    def setResolutions(value: js.Array[Double]): Self = this.set("resolutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolutions: Self = this.set("resolutions", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setShowFullExtent(value: Boolean): Self = this.set("showFullExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFullExtent: Self = this.set("showFullExtent", js.undefined)
    @scala.inline
    def setSmoothExtentConstraint(value: Boolean): Self = this.set("smoothExtentConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothExtentConstraint: Self = this.set("smoothExtentConstraint", js.undefined)
    @scala.inline
    def setSmoothResolutionConstraint(value: Boolean): Self = this.set("smoothResolutionConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothResolutionConstraint: Self = this.set("smoothResolutionConstraint", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    @scala.inline
    def setZoomFactor(value: Double): Self = this.set("zoomFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomFactor: Self = this.set("zoomFactor", js.undefined)
  }
  
}

