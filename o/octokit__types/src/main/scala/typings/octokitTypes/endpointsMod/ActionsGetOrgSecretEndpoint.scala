package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsGetOrgSecretEndpoint extends js.Object {
  @JSName("org")
  var org_ : String = js.native
  var secret_name: String = js.native
}

object ActionsGetOrgSecretEndpoint {
  @scala.inline
  def apply(org_ : String, secret_name: String): ActionsGetOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetOrgSecretEndpoint]
  }
  @scala.inline
  implicit class ActionsGetOrgSecretEndpointOps[Self <: ActionsGetOrgSecretEndpoint] (val x: Self) extends AnyVal {
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
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecret_name(value: String): Self = this.set("secret_name", value.asInstanceOf[js.Any])
  }
  
}

