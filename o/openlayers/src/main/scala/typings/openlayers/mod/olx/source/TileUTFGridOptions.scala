package typings.openlayers.mod.olx.source

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileUTFGridOptions extends StObject {
  
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
  implicit class TileUTFGridOptionsMutableBuilder[Self <: TileUTFGridOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    @scala.inline
    def setPreemptive(value: Boolean): Self = StObject.set(x, "preemptive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreemptiveUndefined: Self = StObject.set(x, "preemptive", js.undefined)
    
    @scala.inline
    def setTileJSON(value: TileJSON): Self = StObject.set(x, "tileJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileJSONUndefined: Self = StObject.set(x, "tileJSON", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
