package typings.maximMazurokGapiClientRedis.gapi.client.redis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailoverInstanceRequest extends js.Object {
  
  /** Optional. Available data protection modes that the user can choose. If it's unspecified, data protection mode will be LIMITED_DATA_LOSS by default. */
  var dataProtectionMode: js.UndefOr[String] = js.native
}
object FailoverInstanceRequest {
  
  @scala.inline
  def apply(): FailoverInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverInstanceRequest]
  }
  
  @scala.inline
  implicit class FailoverInstanceRequestOps[Self <: FailoverInstanceRequest] (val x: Self) extends AnyVal {
    
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
    def setDataProtectionMode(value: String): Self = this.set("dataProtectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataProtectionMode: Self = this.set("dataProtectionMode", js.undefined)
  }
}
