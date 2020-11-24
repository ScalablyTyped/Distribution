package typings.openlayers.mod.olx.source

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileUTFGridOptions extends js.Object {
  
  var jsonp: js.UndefOr[Boolean] = js.native
  
  var preemptive: js.UndefOr[Boolean] = js.native
  
  var tileJSON: js.UndefOr[TileJSON] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object TileUTFGridOptions {
  
  @scala.inline
  def apply(): TileUTFGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileUTFGridOptions]
  }
  
  @scala.inline
  implicit class TileUTFGridOptionsOps[Self <: TileUTFGridOptions] (val x: Self) extends AnyVal {
    
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
    def setJsonp(value: Boolean): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonp: Self = this.set("jsonp", js.undefined)
    
    @scala.inline
    def setPreemptive(value: Boolean): Self = this.set("preemptive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreemptive: Self = this.set("preemptive", js.undefined)
    
    @scala.inline
    def setTileJSON(value: TileJSON): Self = this.set("tileJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileJSON: Self = this.set("tileJSON", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
