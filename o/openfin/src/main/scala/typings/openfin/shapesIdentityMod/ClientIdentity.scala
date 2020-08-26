package typings.openfin.shapesIdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientIdentity extends Identity {
  var endpointId: js.UndefOr[String] = js.native
}

object ClientIdentity {
  @scala.inline
  def apply(uuid: String): ClientIdentity = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientIdentity]
  }
  @scala.inline
  implicit class ClientIdentityOps[Self <: ClientIdentity] (val x: Self) extends AnyVal {
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
    def setEndpointId(value: String): Self = this.set("endpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointId: Self = this.set("endpointId", js.undefined)
  }
  
}

