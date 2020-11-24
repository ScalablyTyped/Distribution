package typings.openseadragon.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileSourceOptions extends js.Object {
  
  var ajaxHeaders: js.UndefOr[js.Object] = js.native
  
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.native
  
  var getTileUrl: js.UndefOr[js.Function3[/* l */ Double, /* x */ Double, /* y */ Double, String]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var maxLevel: js.UndefOr[Double] = js.native
  
  var minLevel: js.UndefOr[Double] = js.native
  
  var referenceStripThumbnailUrl: js.UndefOr[String] = js.native
  
  var success: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var tileHeight: js.UndefOr[Double] = js.native
  
  var tileOverlap: js.UndefOr[Double] = js.native
  
  var tileSize: js.UndefOr[Double] = js.native
  
  var tileWidth: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object TileSourceOptions {
  
  @scala.inline
  def apply(): TileSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileSourceOptions]
  }
  
  @scala.inline
  implicit class TileSourceOptionsOps[Self <: TileSourceOptions] (val x: Self) extends AnyVal {
    
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
    def setAjaxHeaders(value: js.Object): Self = this.set("ajaxHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxHeaders: Self = this.set("ajaxHeaders", js.undefined)
    
    @scala.inline
    def setAjaxWithCredentials(value: Boolean): Self = this.set("ajaxWithCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxWithCredentials: Self = this.set("ajaxWithCredentials", js.undefined)
    
    @scala.inline
    def setGetTileUrl(value: (/* l */ Double, /* x */ Double, /* y */ Double) => String): Self = this.set("getTileUrl", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGetTileUrl: Self = this.set("getTileUrl", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMaxLevel(value: Double): Self = this.set("maxLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLevel: Self = this.set("maxLevel", js.undefined)
    
    @scala.inline
    def setMinLevel(value: Double): Self = this.set("minLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLevel: Self = this.set("minLevel", js.undefined)
    
    @scala.inline
    def setReferenceStripThumbnailUrl(value: String): Self = this.set("referenceStripThumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceStripThumbnailUrl: Self = this.set("referenceStripThumbnailUrl", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* event */ Event => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setTileHeight(value: Double): Self = this.set("tileHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileHeight: Self = this.set("tileHeight", js.undefined)
    
    @scala.inline
    def setTileOverlap(value: Double): Self = this.set("tileOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileOverlap: Self = this.set("tileOverlap", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    
    @scala.inline
    def setTileWidth(value: Double): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileWidth: Self = this.set("tileWidth", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
