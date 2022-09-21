package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookingQuestionAssignment extends StObject {
  
  // The ID of the custom question.
  var isRequired: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether it is mandatory to answer the custom question.
  var questionId: js.UndefOr[String] = js.undefined
}
object BookingQuestionAssignment {
  
  inline def apply(): BookingQuestionAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingQuestionAssignment]
  }
  
  extension [Self <: BookingQuestionAssignment](x: Self) {
    
    inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    inline def setQuestionId(value: String): Self = StObject.set(x, "questionId", value.asInstanceOf[js.Any])
    
    inline def setQuestionIdUndefined: Self = StObject.set(x, "questionId", js.undefined)
  }
}
