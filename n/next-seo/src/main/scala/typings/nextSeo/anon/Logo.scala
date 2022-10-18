package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logo extends StObject {
  
  var `@type`: String
  
  var logo: js.UndefOr[TypeUrl] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object Logo {
  
  inline def apply(`@type`: String): Logo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logo]
  }
  
  extension [Self <: Logo](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setLogo(value: TypeUrl): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
