package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RubricLevel extends StObject {
  
  // The description of this rubric level.
  var description: js.UndefOr[NullableOption[EducationItemBody]] = js.undefined
  
  // The name of this rubric level.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Null if this is a no-points rubric; educationAssignmentPointsGradeType if it is a points rubric.
  var grading: js.UndefOr[NullableOption[EducationAssignmentGradeType]] = js.undefined
  
  // The ID of this resource.
  var levelId: js.UndefOr[NullableOption[String]] = js.undefined
}
object RubricLevel {
  
  inline def apply(): RubricLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RubricLevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RubricLevel] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NullableOption[EducationItemBody]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGrading(value: NullableOption[EducationAssignmentGradeType]): Self = StObject.set(x, "grading", value.asInstanceOf[js.Any])
    
    inline def setGradingNull: Self = StObject.set(x, "grading", null)
    
    inline def setGradingUndefined: Self = StObject.set(x, "grading", js.undefined)
    
    inline def setLevelId(value: NullableOption[String]): Self = StObject.set(x, "levelId", value.asInstanceOf[js.Any])
    
    inline def setLevelIdNull: Self = StObject.set(x, "levelId", null)
    
    inline def setLevelIdUndefined: Self = StObject.set(x, "levelId", js.undefined)
  }
}
