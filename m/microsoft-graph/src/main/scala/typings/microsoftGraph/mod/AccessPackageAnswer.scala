package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageAnswer extends StObject {
  
  var answeredQuestion: js.UndefOr[NullableOption[AccessPackageQuestion]] = js.undefined
  
  // The localized display value shown to the requestor and approvers.
  var displayValue: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessPackageAnswer {
  
  inline def apply(): AccessPackageAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageAnswer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPackageAnswer] (val x: Self) extends AnyVal {
    
    inline def setAnsweredQuestion(value: NullableOption[AccessPackageQuestion]): Self = StObject.set(x, "answeredQuestion", value.asInstanceOf[js.Any])
    
    inline def setAnsweredQuestionNull: Self = StObject.set(x, "answeredQuestion", null)
    
    inline def setAnsweredQuestionUndefined: Self = StObject.set(x, "answeredQuestion", js.undefined)
    
    inline def setDisplayValue(value: NullableOption[String]): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    inline def setDisplayValueNull: Self = StObject.set(x, "displayValue", null)
    
    inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
  }
}
