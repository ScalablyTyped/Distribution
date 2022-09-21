package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationAssignmentPointsGrade
  extends StObject
     with EducationAssignmentGrade {
  
  // Number of points a teacher is giving this submission object.
  var points: js.UndefOr[NullableOption[Double]] = js.undefined
}
object EducationAssignmentPointsGrade {
  
  inline def apply(): EducationAssignmentPointsGrade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationAssignmentPointsGrade]
  }
  
  extension [Self <: EducationAssignmentPointsGrade](x: Self) {
    
    inline def setPoints(value: NullableOption[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsNull: Self = StObject.set(x, "points", null)
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
  }
}
