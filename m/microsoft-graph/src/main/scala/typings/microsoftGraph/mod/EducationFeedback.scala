package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationFeedback extends StObject {
  
  // User who created the feedback.
  var feedbackBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * Moment in time when the feedback was given. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var feedbackDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Feedback.
  var text: js.UndefOr[NullableOption[EducationItemBody]] = js.undefined
}
object EducationFeedback {
  
  inline def apply(): EducationFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationFeedback]
  }
  
  extension [Self <: EducationFeedback](x: Self) {
    
    inline def setFeedbackBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "feedbackBy", value.asInstanceOf[js.Any])
    
    inline def setFeedbackByNull: Self = StObject.set(x, "feedbackBy", null)
    
    inline def setFeedbackByUndefined: Self = StObject.set(x, "feedbackBy", js.undefined)
    
    inline def setFeedbackDateTime(value: NullableOption[String]): Self = StObject.set(x, "feedbackDateTime", value.asInstanceOf[js.Any])
    
    inline def setFeedbackDateTimeNull: Self = StObject.set(x, "feedbackDateTime", null)
    
    inline def setFeedbackDateTimeUndefined: Self = StObject.set(x, "feedbackDateTime", js.undefined)
    
    inline def setText(value: NullableOption[EducationItemBody]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
