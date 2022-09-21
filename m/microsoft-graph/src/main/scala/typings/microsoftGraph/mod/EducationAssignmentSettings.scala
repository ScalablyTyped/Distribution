package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationAssignmentSettings
  extends StObject
     with Entity {
  
  /**
    * Indicates whether turn-in celebration animation will be shown. A value of true indicates that the animation will not be
    * shown. Default value is false.
    */
  var submissionAnimationDisabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object EducationAssignmentSettings {
  
  inline def apply(): EducationAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationAssignmentSettings]
  }
  
  extension [Self <: EducationAssignmentSettings](x: Self) {
    
    inline def setSubmissionAnimationDisabled(value: NullableOption[Boolean]): Self = StObject.set(x, "submissionAnimationDisabled", value.asInstanceOf[js.Any])
    
    inline def setSubmissionAnimationDisabledNull: Self = StObject.set(x, "submissionAnimationDisabled", null)
    
    inline def setSubmissionAnimationDisabledUndefined: Self = StObject.set(x, "submissionAnimationDisabled", js.undefined)
  }
}
