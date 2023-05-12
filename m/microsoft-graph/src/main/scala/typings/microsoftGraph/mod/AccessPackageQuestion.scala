package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageQuestion
  extends StObject
     with Entity {
  
  /**
    * Specifies whether the requestor is allowed to edit answers to questions for an assignment by posting an update to
    * accessPackageAssignmentRequest.
    */
  var isAnswerEditable: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Whether the requestor is required to supply an answer or not.
  var isRequired: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The text of the question represented in a format for a specific locale.
  var localizations: js.UndefOr[NullableOption[js.Array[AccessPackageLocalizedText]]] = js.undefined
  
  // Relative position of this question when displaying a list of questions to the requestor.
  var sequence: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The text of the question to show to the requestor.
  var text: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessPackageQuestion {
  
  inline def apply(): AccessPackageQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageQuestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPackageQuestion] (val x: Self) extends AnyVal {
    
    inline def setIsAnswerEditable(value: NullableOption[Boolean]): Self = StObject.set(x, "isAnswerEditable", value.asInstanceOf[js.Any])
    
    inline def setIsAnswerEditableNull: Self = StObject.set(x, "isAnswerEditable", null)
    
    inline def setIsAnswerEditableUndefined: Self = StObject.set(x, "isAnswerEditable", js.undefined)
    
    inline def setIsRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    inline def setIsRequiredNull: Self = StObject.set(x, "isRequired", null)
    
    inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    inline def setLocalizations(value: NullableOption[js.Array[AccessPackageLocalizedText]]): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    inline def setLocalizationsNull: Self = StObject.set(x, "localizations", null)
    
    inline def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    inline def setLocalizationsVarargs(value: AccessPackageLocalizedText*): Self = StObject.set(x, "localizations", js.Array(value*))
    
    inline def setSequence(value: NullableOption[Double]): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceNull: Self = StObject.set(x, "sequence", null)
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setText(value: NullableOption[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
