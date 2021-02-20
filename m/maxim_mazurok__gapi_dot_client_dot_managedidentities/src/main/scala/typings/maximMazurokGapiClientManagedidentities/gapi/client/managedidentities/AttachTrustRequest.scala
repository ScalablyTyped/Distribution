package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachTrustRequest extends StObject {
  
  /** Required. The domain trust resource. */
  var trust: js.UndefOr[Trust] = js.native
}
object AttachTrustRequest {
  
  @scala.inline
  def apply(): AttachTrustRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachTrustRequest]
  }
  
  @scala.inline
  implicit class AttachTrustRequestMutableBuilder[Self <: AttachTrustRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrust(value: Trust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustUndefined: Self = StObject.set(x, "trust", js.undefined)
  }
}
