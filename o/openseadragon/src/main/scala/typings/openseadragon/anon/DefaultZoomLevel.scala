package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultZoomLevel extends js.Object {
  var animationTime: js.UndefOr[Double] = js.native
  var defaultZoomLevel: js.UndefOr[Double] = js.native
  var degrees: js.UndefOr[Double] = js.native
  var homeFillsViewer: js.UndefOr[Boolean] = js.native
  var margins: js.Object = js.native
  var maxZoomLevel: js.UndefOr[Double] = js.native
  var maxZoomPixelRatio: js.UndefOr[Double] = js.native
  var minZoomImageRatio: js.UndefOr[Double] = js.native
  var minZoomLevel: js.UndefOr[Double] = js.native
  var springStiffness: js.UndefOr[Double] = js.native
  var visibilityRatio: js.UndefOr[Double] = js.native
  var wrapHorizontal: js.UndefOr[Boolean] = js.native
  var wrapVertical: js.UndefOr[Boolean] = js.native
}

object DefaultZoomLevel {
  @scala.inline
  def apply(margins: js.Object): DefaultZoomLevel = {
    val __obj = js.Dynamic.literal(margins = margins.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultZoomLevel]
  }
  @scala.inline
  implicit class DefaultZoomLevelOps[Self <: DefaultZoomLevel] (val x: Self) extends AnyVal {
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
    def setMargins(value: js.Object): Self = this.set("margins", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationTime(value: Double): Self = this.set("animationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationTime: Self = this.set("animationTime", js.undefined)
    @scala.inline
    def setDefaultZoomLevel(value: Double): Self = this.set("defaultZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultZoomLevel: Self = this.set("defaultZoomLevel", js.undefined)
    @scala.inline
    def setDegrees(value: Double): Self = this.set("degrees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDegrees: Self = this.set("degrees", js.undefined)
    @scala.inline
    def setHomeFillsViewer(value: Boolean): Self = this.set("homeFillsViewer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeFillsViewer: Self = this.set("homeFillsViewer", js.undefined)
    @scala.inline
    def setMaxZoomLevel(value: Double): Self = this.set("maxZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoomLevel: Self = this.set("maxZoomLevel", js.undefined)
    @scala.inline
    def setMaxZoomPixelRatio(value: Double): Self = this.set("maxZoomPixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoomPixelRatio: Self = this.set("maxZoomPixelRatio", js.undefined)
    @scala.inline
    def setMinZoomImageRatio(value: Double): Self = this.set("minZoomImageRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoomImageRatio: Self = this.set("minZoomImageRatio", js.undefined)
    @scala.inline
    def setMinZoomLevel(value: Double): Self = this.set("minZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoomLevel: Self = this.set("minZoomLevel", js.undefined)
    @scala.inline
    def setSpringStiffness(value: Double): Self = this.set("springStiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpringStiffness: Self = this.set("springStiffness", js.undefined)
    @scala.inline
    def setVisibilityRatio(value: Double): Self = this.set("visibilityRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibilityRatio: Self = this.set("visibilityRatio", js.undefined)
    @scala.inline
    def setWrapHorizontal(value: Boolean): Self = this.set("wrapHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapHorizontal: Self = this.set("wrapHorizontal", js.undefined)
    @scala.inline
    def setWrapVertical(value: Boolean): Self = this.set("wrapVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapVertical: Self = this.set("wrapVertical", js.undefined)
  }
  
}

