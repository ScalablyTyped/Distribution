package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleInfo extends StObject {
  
  // A name representing the user's locale in natural language, for example, 'English (United States)'.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A locale representation for the user, which includes the user's preferred language and country/region. For example,
    * 'en-us'. The language component follows 2-letter codes as defined in ISO 639-1, and the country component follows
    * 2-letter codes as defined in ISO 3166-1 alpha-2.
    */
  var locale: js.UndefOr[NullableOption[String]] = js.undefined
}
object LocaleInfo {
  
  inline def apply(): LocaleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocaleInfo] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLocale(value: NullableOption[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
