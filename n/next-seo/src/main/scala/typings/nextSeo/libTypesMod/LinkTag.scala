package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkTag extends StObject {
  
  var as: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  var href: String
  
  var keyOverride: js.UndefOr[String] = js.undefined
  
  var media: js.UndefOr[String] = js.undefined
  
  var rel: String
  
  var sizes: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object LinkTag {
  
  inline def apply(href: String, rel: String): LinkTag = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkTag]
  }
  
  extension [Self <: LinkTag](x: Self) {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setKeyOverride(value: String): Self = StObject.set(x, "keyOverride", value.asInstanceOf[js.Any])
    
    inline def setKeyOverrideUndefined: Self = StObject.set(x, "keyOverride", js.undefined)
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
