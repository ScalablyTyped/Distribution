package typings.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIamPolicyRequest extends StObject {
  
  /** OPTIONAL: A `GetPolicyOptions` object for specifying options to `GetIamPolicy`. */
  var options: js.UndefOr[GetPolicyOptions] = js.undefined
}
object GetIamPolicyRequest {
  
  @scala.inline
  def apply(): GetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIamPolicyRequest]
  }
  
  @scala.inline
  implicit class GetIamPolicyRequestMutableBuilder[Self <: GetIamPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: GetPolicyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
