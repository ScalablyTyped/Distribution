package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageMultipleChoiceQuestion
  extends StObject
     with AccessPackageQuestion {
  
  // List of answer choices.
  var choices: js.UndefOr[NullableOption[js.Array[AccessPackageAnswerChoice]]] = js.undefined
  
  // Indicates whether requestor can select multiple choices as their answer.
  var isMultipleSelectionAllowed: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object AccessPackageMultipleChoiceQuestion {
  
  inline def apply(): AccessPackageMultipleChoiceQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageMultipleChoiceQuestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPackageMultipleChoiceQuestion] (val x: Self) extends AnyVal {
    
    inline def setChoices(value: NullableOption[js.Array[AccessPackageAnswerChoice]]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesNull: Self = StObject.set(x, "choices", null)
    
    inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
    
    inline def setChoicesVarargs(value: AccessPackageAnswerChoice*): Self = StObject.set(x, "choices", js.Array(value*))
    
    inline def setIsMultipleSelectionAllowed(value: NullableOption[Boolean]): Self = StObject.set(x, "isMultipleSelectionAllowed", value.asInstanceOf[js.Any])
    
    inline def setIsMultipleSelectionAllowedNull: Self = StObject.set(x, "isMultipleSelectionAllowed", null)
    
    inline def setIsMultipleSelectionAllowedUndefined: Self = StObject.set(x, "isMultipleSelectionAllowed", js.undefined)
  }
}
