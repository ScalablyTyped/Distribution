package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityProvider extends Entity {
  var clientId: js.UndefOr[String] = js.native
  var clientSecret: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object IdentityProvider {
  @scala.inline
  def apply(): IdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProvider]
  }
  @scala.inline
  implicit class IdentityProviderOps[Self <: IdentityProvider] (val x: Self) extends AnyVal {
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientSecret: Self = this.set("clientSecret", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

