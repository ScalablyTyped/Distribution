package typings.ol.iiifMod

import typings.ol.extentMod.Extent
import typings.ol.iiifinfoMod.Versions
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  var attributionsCollapsible: js.UndefOr[Boolean] = js.native
  
  var cacheSize: js.UndefOr[Double] = js.native
  
  var crossOrigin: js.UndefOr[String] = js.native
  
  var extent: js.UndefOr[Extent] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var imageSmoothing: js.UndefOr[Boolean] = js.native
  
  var projection: js.UndefOr[ProjectionLike] = js.native
  
  var quality: js.UndefOr[String] = js.native
  
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.native
  
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  
  var size: Size = js.native
  
  var sizes: js.UndefOr[js.Array[Size]] = js.native
  
  var state: js.UndefOr[State] = js.native
  
  var supports: js.UndefOr[js.Array[String]] = js.native
  
  var tilePixelRatio: js.UndefOr[Double] = js.native
  
  var tileSize: js.UndefOr[Double | Size] = js.native
  
  var transition: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[Versions] = js.native
  
  var zDirection: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(size: Size): Options = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
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
    def setAttributionsVarargs(value: String*): Self = this.set("attributions", js.Array(value :_*))
    
    @scala.inline
    def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = this.set("attributions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = this.set("attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributions: Self = this.set("attributions", js.undefined)
    
    @scala.inline
    def setAttributionsCollapsible(value: Boolean): Self = this.set("attributionsCollapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributionsCollapsible: Self = this.set("attributionsCollapsible", js.undefined)
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setImageSmoothing(value: Boolean): Self = this.set("imageSmoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSmoothing: Self = this.set("imageSmoothing", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setQuality(value: String): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setReprojectionErrorThreshold(value: Double): Self = this.set("reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReprojectionErrorThreshold: Self = this.set("reprojectionErrorThreshold", js.undefined)
    
    @scala.inline
    def setResolutionsVarargs(value: Double*): Self = this.set("resolutions", js.Array(value :_*))
    
    @scala.inline
    def setResolutions(value: js.Array[Double]): Self = this.set("resolutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolutions: Self = this.set("resolutions", js.undefined)
    
    @scala.inline
    def setSizesVarargs(value: Size*): Self = this.set("sizes", js.Array(value :_*))
    
    @scala.inline
    def setSizes(value: js.Array[Size]): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSupportsVarargs(value: String*): Self = this.set("supports", js.Array(value :_*))
    
    @scala.inline
    def setSupports(value: js.Array[String]): Self = this.set("supports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupports: Self = this.set("supports", js.undefined)
    
    @scala.inline
    def setTilePixelRatio(value: Double): Self = this.set("tilePixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTilePixelRatio: Self = this.set("tilePixelRatio", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double | Size): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    
    @scala.inline
    def setTransition(value: Double): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setVersion(value: Versions): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setZDirection(value: Double): Self = this.set("zDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZDirection: Self = this.set("zDirection", js.undefined)
  }
}
