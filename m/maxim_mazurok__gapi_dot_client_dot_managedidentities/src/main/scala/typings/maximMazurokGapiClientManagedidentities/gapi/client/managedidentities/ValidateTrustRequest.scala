package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateTrustRequest extends StObject {
  
  /** Required. The domain trust to validate trust state for. */
  var trust: js.UndefOr[Trust] = js.native
}
object ValidateTrustRequest {
  
  @scala.inline
  def apply(): ValidateTrustRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateTrustRequest]
  }
  
  @scala.inline
  implicit class ValidateTrustRequestMutableBuilder[Self <: ValidateTrustRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrust(value: Trust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustUndefined: Self = StObject.set(x, "trust", js.undefined)
  }
}
