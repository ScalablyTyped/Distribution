package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractionsGetRestrictionsForRepoResponseData extends js.Object {
  var expires_at: String = js.native
  var limit: String = js.native
  var origin: String = js.native
}

object InteractionsGetRestrictionsForRepoResponseData {
  @scala.inline
  def apply(expires_at: String, limit: String, origin: String): InteractionsGetRestrictionsForRepoResponseData = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsGetRestrictionsForRepoResponseData]
  }
  @scala.inline
  implicit class InteractionsGetRestrictionsForRepoResponseDataOps[Self <: InteractionsGetRestrictionsForRepoResponseData] (val x: Self) extends AnyVal {
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
    def setExpires_at(value: String): Self = this.set("expires_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: String): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
  }
  
}

