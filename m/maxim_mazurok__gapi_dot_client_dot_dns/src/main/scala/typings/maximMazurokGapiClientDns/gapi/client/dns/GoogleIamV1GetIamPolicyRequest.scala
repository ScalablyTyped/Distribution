package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleIamV1GetIamPolicyRequest extends StObject {
  
  /** OPTIONAL: A `GetPolicyOptions` object for specifying options to `GetIamPolicy`. */
  var options: js.UndefOr[GoogleIamV1GetPolicyOptions] = js.undefined
}
object GoogleIamV1GetIamPolicyRequest {
  
  inline def apply(): GoogleIamV1GetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIamV1GetIamPolicyRequest]
  }
  
  extension [Self <: GoogleIamV1GetIamPolicyRequest](x: Self) {
    
    inline def setOptions(value: GoogleIamV1GetPolicyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
