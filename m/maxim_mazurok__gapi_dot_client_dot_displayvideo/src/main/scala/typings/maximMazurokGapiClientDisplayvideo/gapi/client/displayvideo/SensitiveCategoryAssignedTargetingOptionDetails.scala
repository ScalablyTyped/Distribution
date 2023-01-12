package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensitiveCategoryAssignedTargetingOptionDetails extends StObject {
  
  /** Required. ID of the sensitive category to be EXCLUDED. */
  var excludedTargetingOptionId: js.UndefOr[String] = js.undefined
  
  /** Output only. An enum for the DV360 Sensitive category content classifier. */
  var sensitiveCategory: js.UndefOr[String] = js.undefined
}
object SensitiveCategoryAssignedTargetingOptionDetails {
  
  inline def apply(): SensitiveCategoryAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensitiveCategoryAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SensitiveCategoryAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setExcludedTargetingOptionId(value: String): Self = StObject.set(x, "excludedTargetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setExcludedTargetingOptionIdUndefined: Self = StObject.set(x, "excludedTargetingOptionId", js.undefined)
    
    inline def setSensitiveCategory(value: String): Self = StObject.set(x, "sensitiveCategory", value.asInstanceOf[js.Any])
    
    inline def setSensitiveCategoryUndefined: Self = StObject.set(x, "sensitiveCategory", js.undefined)
  }
}
