package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IapCredential extends StObject {
  
  /** Authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies. */
  var iapTestServiceAccountInfo: js.UndefOr[IapTestServiceAccountInfo] = js.undefined
}
object IapCredential {
  
  @scala.inline
  def apply(): IapCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IapCredential]
  }
  
  @scala.inline
  implicit class IapCredentialMutableBuilder[Self <: IapCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIapTestServiceAccountInfo(value: IapTestServiceAccountInfo): Self = StObject.set(x, "iapTestServiceAccountInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIapTestServiceAccountInfoUndefined: Self = StObject.set(x, "iapTestServiceAccountInfo", js.undefined)
  }
}
