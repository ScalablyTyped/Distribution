package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogoName extends StObject {
  
  var `@type`: String
  
  var logo: js.UndefOr[TypeUrl] = js.undefined
  
  var name: String
}
object LogoName {
  
  inline def apply(`@type`: String, name: String): LogoName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogoName]
  }
  
  extension [Self <: LogoName](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setLogo(value: TypeUrl): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
