package typings.openlayers.mod.olx.source

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileUTFGridOptions extends StObject {
  
  var jsonp: js.UndefOr[Boolean] = js.undefined
  
  var preemptive: js.UndefOr[Boolean] = js.undefined
  
  var tileJSON: js.UndefOr[TileJSON] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object TileUTFGridOptions {
  
  inline def apply(): TileUTFGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileUTFGridOptions]
  }
  
  extension [Self <: TileUTFGridOptions](x: Self) {
    
    inline def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    inline def setPreemptive(value: Boolean): Self = StObject.set(x, "preemptive", value.asInstanceOf[js.Any])
    
    inline def setPreemptiveUndefined: Self = StObject.set(x, "preemptive", js.undefined)
    
    inline def setTileJSON(value: TileJSON): Self = StObject.set(x, "tileJSON", value.asInstanceOf[js.Any])
    
    inline def setTileJSONUndefined: Self = StObject.set(x, "tileJSON", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
