package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The serving environment. */
  var environment: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_ENVIRONMENT` (e.g., "508010" for targeting the `ENVIRONMENT_WEB_OPTIMIZED` option). */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object EnvironmentAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): EnvironmentAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class EnvironmentAssignedTargetingOptionDetailsMutableBuilder[Self <: EnvironmentAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
