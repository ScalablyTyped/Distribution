package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessSecretVersionResponse extends js.Object {
  
  /** The resource name of the SecretVersion in the format `projects/∗/secrets/∗/versions/ *`. */
  var name: js.UndefOr[String] = js.native
  
  /** Secret payload */
  var payload: js.UndefOr[SecretPayload] = js.native
}
object AccessSecretVersionResponse {
  
  @scala.inline
  def apply(): AccessSecretVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessSecretVersionResponse]
  }
  
  @scala.inline
  implicit class AccessSecretVersionResponseOps[Self <: AccessSecretVersionResponse] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPayload(value: SecretPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
}
