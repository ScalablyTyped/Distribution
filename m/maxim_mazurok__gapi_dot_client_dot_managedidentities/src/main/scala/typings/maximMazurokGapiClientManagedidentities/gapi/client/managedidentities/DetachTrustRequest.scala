package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachTrustRequest extends StObject {
  
  /** Required. The domain trust resource to removed. */
  var trust: js.UndefOr[Trust] = js.native
}
object DetachTrustRequest {
  
  @scala.inline
  def apply(): DetachTrustRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachTrustRequest]
  }
  
  @scala.inline
  implicit class DetachTrustRequestMutableBuilder[Self <: DetachTrustRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrust(value: Trust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustUndefined: Self = StObject.set(x, "trust", js.undefined)
  }
}
