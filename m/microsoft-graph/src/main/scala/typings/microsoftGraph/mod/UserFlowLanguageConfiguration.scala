package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserFlowLanguageConfiguration
  extends StObject
     with Entity {
  
  /**
    * Collection of pages with the default content to display in a user flow for a specified language. This collection does
    * not allow any kind of modification.
    */
  var defaultPages: js.UndefOr[NullableOption[js.Array[UserFlowLanguagePage]]] = js.undefined
  
  // The language name to display. This property is read-only.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether the language is enabled within the user flow.
  var isEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Collection of pages with the overrides messages to display in a user flow for a specified language. This collection
    * only allows to modify the content of the page, any other modification is not allowed (creation or deletion of pages).
    */
  var overridesPages: js.UndefOr[NullableOption[js.Array[UserFlowLanguagePage]]] = js.undefined
}
object UserFlowLanguageConfiguration {
  
  inline def apply(): UserFlowLanguageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserFlowLanguageConfiguration]
  }
  
  extension [Self <: UserFlowLanguageConfiguration](x: Self) {
    
    inline def setDefaultPages(value: NullableOption[js.Array[UserFlowLanguagePage]]): Self = StObject.set(x, "defaultPages", value.asInstanceOf[js.Any])
    
    inline def setDefaultPagesNull: Self = StObject.set(x, "defaultPages", null)
    
    inline def setDefaultPagesUndefined: Self = StObject.set(x, "defaultPages", js.undefined)
    
    inline def setDefaultPagesVarargs(value: UserFlowLanguagePage*): Self = StObject.set(x, "defaultPages", js.Array(value*))
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setOverridesPages(value: NullableOption[js.Array[UserFlowLanguagePage]]): Self = StObject.set(x, "overridesPages", value.asInstanceOf[js.Any])
    
    inline def setOverridesPagesNull: Self = StObject.set(x, "overridesPages", null)
    
    inline def setOverridesPagesUndefined: Self = StObject.set(x, "overridesPages", js.undefined)
    
    inline def setOverridesPagesVarargs(value: UserFlowLanguagePage*): Self = StObject.set(x, "overridesPages", js.Array(value*))
  }
}
