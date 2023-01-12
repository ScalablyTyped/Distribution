package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationRubricOutcome
  extends StObject
     with EducationOutcome {
  
  // A copy of the rubricQualityFeedback property that is made when the grade is released to the student.
  var publishedRubricQualityFeedback: js.UndefOr[NullableOption[js.Array[RubricQualityFeedbackModel]]] = js.undefined
  
  // A copy of the rubricQualitySelectedLevels property that is made when the grade is released to the student.
  var publishedRubricQualitySelectedLevels: js.UndefOr[NullableOption[js.Array[RubricQualitySelectedColumnModel]]] = js.undefined
  
  // A collection of specific feedback for each quality of this rubric.
  var rubricQualityFeedback: js.UndefOr[NullableOption[js.Array[RubricQualityFeedbackModel]]] = js.undefined
  
  // The level that the teacher has selected for each quality while grading this assignment.
  var rubricQualitySelectedLevels: js.UndefOr[NullableOption[js.Array[RubricQualitySelectedColumnModel]]] = js.undefined
}
object EducationRubricOutcome {
  
  inline def apply(): EducationRubricOutcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationRubricOutcome]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EducationRubricOutcome] (val x: Self) extends AnyVal {
    
    inline def setPublishedRubricQualityFeedback(value: NullableOption[js.Array[RubricQualityFeedbackModel]]): Self = StObject.set(x, "publishedRubricQualityFeedback", value.asInstanceOf[js.Any])
    
    inline def setPublishedRubricQualityFeedbackNull: Self = StObject.set(x, "publishedRubricQualityFeedback", null)
    
    inline def setPublishedRubricQualityFeedbackUndefined: Self = StObject.set(x, "publishedRubricQualityFeedback", js.undefined)
    
    inline def setPublishedRubricQualityFeedbackVarargs(value: RubricQualityFeedbackModel*): Self = StObject.set(x, "publishedRubricQualityFeedback", js.Array(value*))
    
    inline def setPublishedRubricQualitySelectedLevels(value: NullableOption[js.Array[RubricQualitySelectedColumnModel]]): Self = StObject.set(x, "publishedRubricQualitySelectedLevels", value.asInstanceOf[js.Any])
    
    inline def setPublishedRubricQualitySelectedLevelsNull: Self = StObject.set(x, "publishedRubricQualitySelectedLevels", null)
    
    inline def setPublishedRubricQualitySelectedLevelsUndefined: Self = StObject.set(x, "publishedRubricQualitySelectedLevels", js.undefined)
    
    inline def setPublishedRubricQualitySelectedLevelsVarargs(value: RubricQualitySelectedColumnModel*): Self = StObject.set(x, "publishedRubricQualitySelectedLevels", js.Array(value*))
    
    inline def setRubricQualityFeedback(value: NullableOption[js.Array[RubricQualityFeedbackModel]]): Self = StObject.set(x, "rubricQualityFeedback", value.asInstanceOf[js.Any])
    
    inline def setRubricQualityFeedbackNull: Self = StObject.set(x, "rubricQualityFeedback", null)
    
    inline def setRubricQualityFeedbackUndefined: Self = StObject.set(x, "rubricQualityFeedback", js.undefined)
    
    inline def setRubricQualityFeedbackVarargs(value: RubricQualityFeedbackModel*): Self = StObject.set(x, "rubricQualityFeedback", js.Array(value*))
    
    inline def setRubricQualitySelectedLevels(value: NullableOption[js.Array[RubricQualitySelectedColumnModel]]): Self = StObject.set(x, "rubricQualitySelectedLevels", value.asInstanceOf[js.Any])
    
    inline def setRubricQualitySelectedLevelsNull: Self = StObject.set(x, "rubricQualitySelectedLevels", null)
    
    inline def setRubricQualitySelectedLevelsUndefined: Self = StObject.set(x, "rubricQualitySelectedLevels", js.undefined)
    
    inline def setRubricQualitySelectedLevelsVarargs(value: RubricQualitySelectedColumnModel*): Self = StObject.set(x, "rubricQualitySelectedLevels", js.Array(value*))
  }
}
