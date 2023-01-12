package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningErrorInfo extends StObject {
  
  // Additional details in case of error.
  var additionalDetails: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Categorizes the error code. Possible values are failure, nonServiceFailure, success, unknownFutureValue
  var errorCategory: js.UndefOr[NullableOption[ProvisioningStatusErrorCategory]] = js.undefined
  
  // Unique error code if any occurred. Learn more
  var errorCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Summarizes the status and describes why the status happened.
  var reason: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Provides the resolution for the corresponding error.
  var recommendedAction: js.UndefOr[NullableOption[String]] = js.undefined
}
object ProvisioningErrorInfo {
  
  inline def apply(): ProvisioningErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningErrorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisioningErrorInfo] (val x: Self) extends AnyVal {
    
    inline def setAdditionalDetails(value: NullableOption[String]): Self = StObject.set(x, "additionalDetails", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDetailsNull: Self = StObject.set(x, "additionalDetails", null)
    
    inline def setAdditionalDetailsUndefined: Self = StObject.set(x, "additionalDetails", js.undefined)
    
    inline def setErrorCategory(value: NullableOption[ProvisioningStatusErrorCategory]): Self = StObject.set(x, "errorCategory", value.asInstanceOf[js.Any])
    
    inline def setErrorCategoryNull: Self = StObject.set(x, "errorCategory", null)
    
    inline def setErrorCategoryUndefined: Self = StObject.set(x, "errorCategory", js.undefined)
    
    inline def setErrorCode(value: NullableOption[String]): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setReason(value: NullableOption[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRecommendedAction(value: NullableOption[String]): Self = StObject.set(x, "recommendedAction", value.asInstanceOf[js.Any])
    
    inline def setRecommendedActionNull: Self = StObject.set(x, "recommendedAction", null)
    
    inline def setRecommendedActionUndefined: Self = StObject.set(x, "recommendedAction", js.undefined)
  }
}
