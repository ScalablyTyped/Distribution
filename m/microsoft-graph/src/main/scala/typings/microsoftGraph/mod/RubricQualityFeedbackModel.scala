package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RubricQualityFeedbackModel extends StObject {
  
  // Specific feedback for one quality of this rubric.
  var feedback: js.UndefOr[NullableOption[EducationItemBody]] = js.undefined
  
  // The ID of the rubricQuality that this feedback is related to.
  var qualityId: js.UndefOr[NullableOption[String]] = js.undefined
}
object RubricQualityFeedbackModel {
  
  inline def apply(): RubricQualityFeedbackModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RubricQualityFeedbackModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RubricQualityFeedbackModel] (val x: Self) extends AnyVal {
    
    inline def setFeedback(value: NullableOption[EducationItemBody]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackNull: Self = StObject.set(x, "feedback", null)
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    inline def setQualityId(value: NullableOption[String]): Self = StObject.set(x, "qualityId", value.asInstanceOf[js.Any])
    
    inline def setQualityIdNull: Self = StObject.set(x, "qualityId", null)
    
    inline def setQualityIdUndefined: Self = StObject.set(x, "qualityId", js.undefined)
  }
}
