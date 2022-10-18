package typings.nextAuth.coreTypesMod

import typings.nextAuth.nextAuthStrings.auto
import typings.nextAuth.nextAuthStrings.dark
import typings.nextAuth.nextAuthStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  var brandColor: js.UndefOr[String] = js.undefined
  
  var buttonText: js.UndefOr[String] = js.undefined
  
  var colorScheme: js.UndefOr[auto | dark | light] = js.undefined
  
  var logo: js.UndefOr[String] = js.undefined
}
object Theme {
  
  inline def apply(): Theme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme]
  }
  
  extension [Self <: Theme](x: Self) {
    
    inline def setBrandColor(value: String): Self = StObject.set(x, "brandColor", value.asInstanceOf[js.Any])
    
    inline def setBrandColorUndefined: Self = StObject.set(x, "brandColor", js.undefined)
    
    inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    inline def setColorScheme(value: auto | dark | light): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
  }
}
