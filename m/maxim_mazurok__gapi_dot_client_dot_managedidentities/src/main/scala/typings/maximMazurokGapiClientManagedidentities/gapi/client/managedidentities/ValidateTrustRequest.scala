package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateTrustRequest extends js.Object {
  
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
  implicit class ValidateTrustRequestOps[Self <: ValidateTrustRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTrust(value: Trust): Self = this.set("trust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrust: Self = this.set("trust", js.undefined)
  }
}
