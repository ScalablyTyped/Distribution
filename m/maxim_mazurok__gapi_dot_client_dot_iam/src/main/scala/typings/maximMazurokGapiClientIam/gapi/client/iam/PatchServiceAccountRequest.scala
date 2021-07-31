package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchServiceAccountRequest extends StObject {
  
  var serviceAccount: js.UndefOr[ServiceAccount] = js.undefined
  
  var updateMask: js.UndefOr[String] = js.undefined
}
object PatchServiceAccountRequest {
  
  @scala.inline
  def apply(): PatchServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchServiceAccountRequest]
  }
  
  @scala.inline
  implicit class PatchServiceAccountRequestMutableBuilder[Self <: PatchServiceAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceAccount(value: ServiceAccount): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
