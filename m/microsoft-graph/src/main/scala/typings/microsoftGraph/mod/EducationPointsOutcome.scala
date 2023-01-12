package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationPointsOutcome
  extends StObject
     with EducationOutcome {
  
  // The numeric grade the teacher has given the student for this assignment.
  var points: js.UndefOr[NullableOption[EducationAssignmentPointsGrade]] = js.undefined
  
  // A copy of the points property that is made when the grade is released to the student.
  var publishedPoints: js.UndefOr[NullableOption[EducationAssignmentPointsGrade]] = js.undefined
}
object EducationPointsOutcome {
  
  inline def apply(): EducationPointsOutcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationPointsOutcome]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EducationPointsOutcome] (val x: Self) extends AnyVal {
    
    inline def setPoints(value: NullableOption[EducationAssignmentPointsGrade]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsNull: Self = StObject.set(x, "points", null)
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPublishedPoints(value: NullableOption[EducationAssignmentPointsGrade]): Self = StObject.set(x, "publishedPoints", value.asInstanceOf[js.Any])
    
    inline def setPublishedPointsNull: Self = StObject.set(x, "publishedPoints", null)
    
    inline def setPublishedPointsUndefined: Self = StObject.set(x, "publishedPoints", js.undefined)
  }
}
