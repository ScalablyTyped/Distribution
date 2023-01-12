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
  
  inline def apply(): ProgressCounter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressCounter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProgressCounter] (val x: Self) extends AnyVal {
    
    inline def setFailure(value: String): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setPending(value: String): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
    
    inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
