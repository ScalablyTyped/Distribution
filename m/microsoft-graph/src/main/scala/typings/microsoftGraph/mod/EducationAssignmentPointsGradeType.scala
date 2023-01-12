package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationAssignmentPointsGradeType
  extends StObject
     with EducationAssignmentGradeType {
  
  // Max points possible for this assignment.
  var maxPoints: js.UndefOr[NullableOption[Double]] = js.undefined
}
object EducationAssignmentPointsGradeType {
  
  inline def apply(): EducationAssignmentPointsGradeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationAssignmentPointsGradeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EducationAssignmentPointsGradeType] (val x: Self) extends AnyVal {
    
    inline def setMaxPoints(value: NullableOption[Double]): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
    
    inline def setMaxPointsNull: Self = StObject.set(x, "maxPoints", null)
    
    inline def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
  }
}
