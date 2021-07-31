package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressCounter extends StObject {
  
  /** The number of units that failed in the operation. */
  var failure: js.UndefOr[String] = js.undefined
  
  /** The number of units that are pending in the operation. */
  var pending: js.UndefOr[String] = js.undefined
  
  /** The number of units that succeeded in the operation. */
  var success: js.UndefOr[String] = js.undefined
}
object ProgressCounter {
  
  @scala.inline
  def apply(): ProgressCounter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressCounter]
  }
  
  @scala.inline
  implicit class ProgressCounterMutableBuilder[Self <: ProgressCounter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: String): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    @scala.inline
    def setPending(value: String): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
    
    @scala.inline
    def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
