package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignInStatus extends StObject {
  
  // Provides additional details on the sign-in activity
  var additionalDetails: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Provides the 5-6digit error code that's generated during a sign-in failure. Check out the list of error codes and
    * messages.
    */
  var errorCode: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Provides the error message or the reason for failure for the corresponding sign-in activity. Check out the list of
    * error codes and messages.
    */
  var failureReason: js.UndefOr[NullableOption[String]] = js.undefined
}
object SignInStatus {
  
  inline def apply(): SignInStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignInStatus]
  }
  
  extension [Self <: SignInStatus](x: Self) {
    
    inline def setAdditionalDetails(value: NullableOption[String]): Self = StObject.set(x, "additionalDetails", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDetailsNull: Self = StObject.set(x, "additionalDetails", null)
    
    inline def setAdditionalDetailsUndefined: Self = StObject.set(x, "additionalDetails", js.undefined)
    
    inline def setErrorCode(value: NullableOption[Double]): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setFailureReason(value: NullableOption[String]): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonNull: Self = StObject.set(x, "failureReason", null)
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
  }
}
