package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationFeedbackOutcome
  extends StObject
     with EducationOutcome {
  
  // Teacher's written feedback to the student.
  var feedback: js.UndefOr[NullableOption[EducationFeedback]] = js.undefined
  
  // A copy of the feedback property that is made when the grade is released to the student.
  var publishedFeedback: js.UndefOr[NullableOption[EducationFeedback]] = js.undefined
}
object EducationFeedbackOutcome {
  
  inline def apply(): EducationFeedbackOutcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationFeedbackOutcome]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EducationFeedbackOutcome] (val x: Self) extends AnyVal {
    
    inline def setFeedback(value: NullableOption[EducationFeedback]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackNull: Self = StObject.set(x, "feedback", null)
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    inline def setPublishedFeedback(value: NullableOption[EducationFeedback]): Self = StObject.set(x, "publishedFeedback", value.asInstanceOf[js.Any])
    
    inline def setPublishedFeedbackNull: Self = StObject.set(x, "publishedFeedback", null)
    
    inline def setPublishedFeedbackUndefined: Self = StObject.set(x, "publishedFeedback", js.undefined)
  }
}
