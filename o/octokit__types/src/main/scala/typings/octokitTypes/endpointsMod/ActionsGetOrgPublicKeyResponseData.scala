package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsGetOrgPublicKeyResponseData extends js.Object {
  var key: String = js.native
  var key_id: String = js.native
}

object ActionsGetOrgPublicKeyResponseData {
  @scala.inline
  def apply(key: String, key_id: String): ActionsGetOrgPublicKeyResponseData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetOrgPublicKeyResponseData]
  }
  @scala.inline
  implicit class ActionsGetOrgPublicKeyResponseDataOps[Self <: ActionsGetOrgPublicKeyResponseData] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey_id(value: String): Self = this.set("key_id", value.asInstanceOf[js.Any])
  }
  
}

