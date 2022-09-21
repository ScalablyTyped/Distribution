package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayNameLocalization extends StObject {
  
  /**
    * If present, the value of this field contains the displayName string that has been set for the language present in the
    * languageTag field.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Provides the language culture-code and friendly name of the language that the displayName field has been provided in.
  var languageTag: js.UndefOr[NullableOption[String]] = js.undefined
}
object DisplayNameLocalization {
  
  inline def apply(): DisplayNameLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayNameLocalization]
  }
  
  extension [Self <: DisplayNameLocalization](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLanguageTag(value: NullableOption[String]): Self = StObject.set(x, "languageTag", value.asInstanceOf[js.Any])
    
    inline def setLanguageTagNull: Self = StObject.set(x, "languageTag", null)
    
    inline def setLanguageTagUndefined: Self = StObject.set(x, "languageTag", js.undefined)
  }
}
