package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenGraphMedia extends StObject {
  
  var alt: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var secureUrl: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var url: String
  
  var width: js.UndefOr[Double] = js.undefined
}
object OpenGraphMedia {
  
  inline def apply(url: String): OpenGraphMedia = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenGraphMedia]
  }
  
  extension [Self <: OpenGraphMedia](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSecureUrl(value: String): Self = StObject.set(x, "secureUrl", value.asInstanceOf[js.Any])
    
    inline def setSecureUrlUndefined: Self = StObject.set(x, "secureUrl", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
