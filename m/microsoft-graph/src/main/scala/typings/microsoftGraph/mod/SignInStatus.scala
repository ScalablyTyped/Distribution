package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignInStatus extends StObject {
  
  // Provides additional details on the sign-in activity
  var additionalDetails: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Provides the 5-6digit error code that's generated during a sign-in failure. Check out the list of error codes and
    * messages.
    */
  var errorCode: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Provides the error message or the reason for failure for the corresponding sign-in activity. Check out the list of
    * error codes and messages.
    */
  var failureReason: js.UndefOr[NullableOption[String]] = js.native
}
object SignInStatus {
  
  @scala.inline
  def apply(): SignInStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignInStatus]
  }
  
  @scala.inline
  implicit class SignInStatusMutableBuilder[Self <: SignInStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalDetails(value: NullableOption[String]): Self = StObject.set(x, "additionalDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDetailsNull: Self = StObject.set(x, "additionalDetails", null)
    
    @scala.inline
    def setAdditionalDetailsUndefined: Self = StObject.set(x, "additionalDetails", js.undefined)
    
    @scala.inline
    def setErrorCode(value: NullableOption[Double]): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setFailureReason(value: NullableOption[String]): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonNull: Self = StObject.set(x, "failureReason", null)
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
  }
}
