package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalizedProperty extends StObject {
  
  var default: js.UndefOr[String] = js.undefined
  
  /** The language of the default property. */
  var defaultLanguage: js.UndefOr[LanguageTag] = js.undefined
  
  var localized: js.UndefOr[js.Array[LocalizedString]] = js.undefined
}
object LocalizedProperty {
  
  inline def apply(): LocalizedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedProperty]
  }
  
  extension [Self <: LocalizedProperty](x: Self) {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguage(value: LanguageTag): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setLocalized(value: js.Array[LocalizedString]): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    
    inline def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
    
    inline def setLocalizedVarargs(value: LocalizedString*): Self = StObject.set(x, "localized", js.Array(value*))
  }
}
