package typings.ol.tileWMSMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.olTileMod.LoadFunction
import typings.ol.olTileMod.Tile
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.wmsservertypeMod.WMSServerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  var cacheSize: js.UndefOr[Double] = js.native
  
  var crossOrigin: js.UndefOr[String] = js.native
  
  var gutter: js.UndefOr[Double] = js.native
  
  var hidpi: js.UndefOr[Boolean] = js.native
  
  var imageSmoothing: js.UndefOr[Boolean] = js.native
  
  var params: StringDictionary[js.Any] = js.native
  
  var projection: js.UndefOr[ProjectionLike] = js.native
  
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.native
  
  var serverType: js.UndefOr[WMSServerType | String] = js.native
  
  var tileClass: js.UndefOr[typings.ol.imageTileMod.default] = js.native
  
  var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.native
  
  var tileLoadFunction: js.UndefOr[LoadFunction] = js.native
  
  var transition: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var urls: js.UndefOr[js.Array[String]] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(params: StringDictionary[js.Any]): Options = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
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
    def setParams(value: StringDictionary[js.Any]): Self = this.set("params", value.asInstanceOf[js.Any])
    
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
    def setGutter(value: Double): Self = this.set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    
    @scala.inline
    def setHidpi(value: Boolean): Self = this.set("hidpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidpi: Self = this.set("hidpi", js.undefined)
    
    @scala.inline
    def setImageSmoothing(value: Boolean): Self = this.set("imageSmoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSmoothing: Self = this.set("imageSmoothing", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setReprojectionErrorThreshold(value: Double): Self = this.set("reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReprojectionErrorThreshold: Self = this.set("reprojectionErrorThreshold", js.undefined)
    
    @scala.inline
    def setServerType(value: WMSServerType | String): Self = this.set("serverType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerType: Self = this.set("serverType", js.undefined)
    
    @scala.inline
    def setTileClass(value: typings.ol.imageTileMod.default): Self = this.set("tileClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileClass: Self = this.set("tileClass", js.undefined)
    
    @scala.inline
    def setTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = this.set("tileGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileGrid: Self = this.set("tileGrid", js.undefined)
    
    @scala.inline
    def setTileLoadFunction(value: (/* p0 */ Tile, /* p1 */ String) => Unit): Self = this.set("tileLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTileLoadFunction: Self = this.set("tileLoadFunction", js.undefined)
    
    @scala.inline
    def setTransition(value: Double): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
    
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
}
