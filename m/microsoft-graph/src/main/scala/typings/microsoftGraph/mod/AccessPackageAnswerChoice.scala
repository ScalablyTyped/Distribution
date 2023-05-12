package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageAnswerChoice extends StObject {
  
  /**
    * The actual value of the selected choice. This is typically a string value which is understandable by applications.
    * Required.
    */
  var actualValue: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The text of the answer choice represented in a format for a specific locale.
  var localizations: js.UndefOr[NullableOption[js.Array[AccessPackageLocalizedText]]] = js.undefined
  
  var text: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessPackageAnswerChoice {
  
  inline def apply(): AccessPackageAnswerChoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageAnswerChoice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPackageAnswerChoice] (val x: Self) extends AnyVal {
    
    inline def setActualValue(value: NullableOption[String]): Self = StObject.set(x, "actualValue", value.asInstanceOf[js.Any])
    
    inline def setActualValueNull: Self = StObject.set(x, "actualValue", null)
    
    inline def setActualValueUndefined: Self = StObject.set(x, "actualValue", js.undefined)
    
    inline def setLocalizations(value: NullableOption[js.Array[AccessPackageLocalizedText]]): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    inline def setLocalizationsNull: Self = StObject.set(x, "localizations", null)
    
    inline def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    inline def setLocalizationsVarargs(value: AccessPackageLocalizedText*): Self = StObject.set(x, "localizations", js.Array(value*))
    
    inline def setText(value: NullableOption[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
