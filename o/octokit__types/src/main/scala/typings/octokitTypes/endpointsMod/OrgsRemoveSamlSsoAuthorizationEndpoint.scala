package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgsRemoveSamlSsoAuthorizationEndpoint extends js.Object {
  var credential_id: Double = js.native
  @JSName("org")
  var org_ : String = js.native
}

object OrgsRemoveSamlSsoAuthorizationEndpoint {
  @scala.inline
  def apply(credential_id: Double, org_ : String): OrgsRemoveSamlSsoAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(credential_id = credential_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsRemoveSamlSsoAuthorizationEndpoint]
  }
  @scala.inline
  implicit class OrgsRemoveSamlSsoAuthorizationEndpointOps[Self <: OrgsRemoveSamlSsoAuthorizationEndpoint] (val x: Self) extends AnyVal {
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
    def setCredential_id(value: Double): Self = this.set("credential_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
  }
  
}

