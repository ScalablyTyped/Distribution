package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookingCustomQuestion
  extends StObject
     with Entity {
  
  // The expected answer type. The possible values are: text, radioButton, unknownFutureValue.
  var answerInputType: js.UndefOr[NullableOption[AnswerInputType]] = js.undefined
  
  // List of possible answer values.
  var answerOptions: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The display name is suitable for human-readable interfaces.
  var displayName: js.UndefOr[String] = js.undefined
}
object BookingCustomQuestion {
  
  inline def apply(): BookingCustomQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingCustomQuestion]
  }
  
  extension [Self <: BookingCustomQuestion](x: Self) {
    
    inline def setAnswerInputType(value: NullableOption[AnswerInputType]): Self = StObject.set(x, "answerInputType", value.asInstanceOf[js.Any])
    
    inline def setAnswerInputTypeNull: Self = StObject.set(x, "answerInputType", null)
    
    inline def setAnswerInputTypeUndefined: Self = StObject.set(x, "answerInputType", js.undefined)
    
    inline def setAnswerOptions(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "answerOptions", value.asInstanceOf[js.Any])
    
    inline def setAnswerOptionsNull: Self = StObject.set(x, "answerOptions", null)
    
    inline def setAnswerOptionsUndefined: Self = StObject.set(x, "answerOptions", js.undefined)
    
    inline def setAnswerOptionsVarargs(value: String*): Self = StObject.set(x, "answerOptions", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
