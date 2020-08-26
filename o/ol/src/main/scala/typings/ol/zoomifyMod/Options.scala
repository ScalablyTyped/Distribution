package typings.ol.zoomifyMod

import typings.ol.extentMod.Extent
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  var cacheSize: js.UndefOr[Double] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var extent: js.UndefOr[Extent] = js.native
  var projection: js.UndefOr[ProjectionLike] = js.native
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.native
  var size: Size = js.native
  var tierSizeCalculation: js.UndefOr[String] = js.native
  var tilePixelRatio: js.UndefOr[Double] = js.native
  var tileSize: js.UndefOr[Double] = js.native
  var transition: js.UndefOr[Double] = js.native
  var url: String = js.native
  var zDirection: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(size: Size, url: String): Options = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributionsVarargs(value: String*): Self = this.set("attributions", js.Array(value :_*))
    @scala.inline
    def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = this.set("attributions", js.Any.fromFunction1(value))
    @scala.inline
    def setAttributions(value: AttributionLike): Self = this.set("attributions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributions: Self = this.set("attributions", js.undefined)
    @scala.inline
    def setCacheSize(value: Double): Self = this.set("cacheSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheSize: Self = this.set("cacheSize", js.undefined)
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setExtent(value: Extent): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setReprojectionErrorThreshold(value: Double): Self = this.set("reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReprojectionErrorThreshold: Self = this.set("reprojectionErrorThreshold", js.undefined)
    @scala.inline
    def setTierSizeCalculation(value: String): Self = this.set("tierSizeCalculation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTierSizeCalculation: Self = this.set("tierSizeCalculation", js.undefined)
    @scala.inline
    def setTilePixelRatio(value: Double): Self = this.set("tilePixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTilePixelRatio: Self = this.set("tilePixelRatio", js.undefined)
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    @scala.inline
    def setTransition(value: Double): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setZDirection(value: Double): Self = this.set("zDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZDirection: Self = this.set("zDirection", js.undefined)
  }
  
}

