package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SensitiveCategoryAssignedTargetingOptionDetails extends StObject {
  
  /** Required. ID of the sensitive category to be EXCLUDED. */
  var excludedTargetingOptionId: js.UndefOr[String] = js.native
  
  /** Output only. An enum for the DV360 Sensitive category content classifier. */
  var sensitiveCategory: js.UndefOr[String] = js.native
}
object SensitiveCategoryAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): SensitiveCategoryAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensitiveCategoryAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class SensitiveCategoryAssignedTargetingOptionDetailsMutableBuilder[Self <: SensitiveCategoryAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedTargetingOptionId(value: String): Self = StObject.set(x, "excludedTargetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedTargetingOptionIdUndefined: Self = StObject.set(x, "excludedTargetingOptionId", js.undefined)
    
    @scala.inline
    def setSensitiveCategory(value: String): Self = StObject.set(x, "sensitiveCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitiveCategoryUndefined: Self = StObject.set(x, "sensitiveCategory", js.undefined)
  }
}
