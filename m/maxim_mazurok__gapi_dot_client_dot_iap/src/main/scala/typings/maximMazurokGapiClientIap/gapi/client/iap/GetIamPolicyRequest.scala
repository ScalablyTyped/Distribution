package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIamPolicyRequest extends StObject {
  
  /** OPTIONAL: A `GetPolicyOptions` object for specifying options to `GetIamPolicy`. */
  var options: js.UndefOr[GetPolicyOptions] = js.undefined
}
object GetIamPolicyRequest {
  
  inline def apply(): GetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIamPolicyRequest]
  }
  
  extension [Self <: GetIamPolicyRequest](x: Self) {
    
    inline def setOptions(value: GetPolicyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
