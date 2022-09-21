package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationAssignmentGrade extends StObject {
  
  // User who did the grading.
  var gradedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * Moment in time when the grade was applied to this submission object. The Timestamp type represents date and time
    * information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is
    * 2014-01-01T00:00:00Z
    */
  var gradedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationAssignmentGrade {
  
  inline def apply(): EducationAssignmentGrade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationAssignmentGrade]
  }
  
  extension [Self <: EducationAssignmentGrade](x: Self) {
    
    inline def setGradedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "gradedBy", value.asInstanceOf[js.Any])
    
    inline def setGradedByNull: Self = StObject.set(x, "gradedBy", null)
    
    inline def setGradedByUndefined: Self = StObject.set(x, "gradedBy", js.undefined)
    
    inline def setGradedDateTime(value: NullableOption[String]): Self = StObject.set(x, "gradedDateTime", value.asInstanceOf[js.Any])
    
    inline def setGradedDateTimeNull: Self = StObject.set(x, "gradedDateTime", null)
    
    inline def setGradedDateTimeUndefined: Self = StObject.set(x, "gradedDateTime", js.undefined)
  }
}
