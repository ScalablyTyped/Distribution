package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldLogoMod {
  
  @JSImport("next-seo/lib/jsonld/logo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasTypeKeyOverrideRest: LogoJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTypeKeyOverrideRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait LogoJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var logo: String
    
    var url: String
  }
  object LogoJsonLdProps {
    
    inline def apply(logo: String, url: String): LogoJsonLdProps = {
      val __obj = js.Dynamic.literal(logo = logo.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogoJsonLdProps]
    }
    
    extension [Self <: LogoJsonLdProps](x: Self) {
      
      inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
