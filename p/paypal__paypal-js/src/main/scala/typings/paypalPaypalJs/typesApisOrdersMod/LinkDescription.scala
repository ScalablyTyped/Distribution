package typings.paypalPaypalJs.typesApisOrdersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkDescription extends StObject {
  
  var encType: js.UndefOr[String] = js.undefined
  
  var href: String
  
  var mediaType: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var rel: String
  
  var title: js.UndefOr[String] = js.undefined
}
object LinkDescription {
  
  inline def apply(href: String, rel: String): LinkDescription = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkDescription]
  }
  
  extension [Self <: LinkDescription](x: Self) {
    
    inline def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
    
    inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
