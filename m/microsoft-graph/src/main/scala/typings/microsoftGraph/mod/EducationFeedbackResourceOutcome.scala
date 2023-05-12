package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationFeedbackResourceOutcome
  extends StObject
     with EducationOutcome {
  
  // The actual feedback resource.
  var feedbackResource: js.UndefOr[NullableOption[EducationResource]] = js.undefined
  
  /**
    * The status of the feedback resource. The possible values are: notPublished, pendingPublish, published, failedPublish,
    * unknownFutureValue.
    */
  var resourceStatus: js.UndefOr[NullableOption[EducationFeedbackResourceOutcomeStatus]] = js.undefined
}
object EducationFeedbackResourceOutcome {
  
  inline def apply(): EducationFeedbackResourceOutcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationFeedbackResourceOutcome]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EducationFeedbackResourceOutcome] (val x: Self) extends AnyVal {
    
    inline def setFeedbackResource(value: NullableOption[EducationResource]): Self = StObject.set(x, "feedbackResource", value.asInstanceOf[js.Any])
    
    inline def setFeedbackResourceNull: Self = StObject.set(x, "feedbackResource", null)
    
    inline def setFeedbackResourceUndefined: Self = StObject.set(x, "feedbackResource", js.undefined)
    
    inline def setResourceStatus(value: NullableOption[EducationFeedbackResourceOutcomeStatus]): Self = StObject.set(x, "resourceStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceStatusNull: Self = StObject.set(x, "resourceStatus", null)
    
    inline def setResourceStatusUndefined: Self = StObject.set(x, "resourceStatus", js.undefined)
  }
}
