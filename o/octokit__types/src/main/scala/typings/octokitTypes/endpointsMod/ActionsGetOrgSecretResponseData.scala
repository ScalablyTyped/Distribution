package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsGetOrgSecretResponseData extends js.Object {
  var created_at: String = js.native
  var name: String = js.native
  var selected_repositories_url: String = js.native
  var updated_at: String = js.native
  var visibility: String = js.native
}

object ActionsGetOrgSecretResponseData {
  @scala.inline
  def apply(
    created_at: String,
    name: String,
    selected_repositories_url: String,
    updated_at: String,
    visibility: String
  ): ActionsGetOrgSecretResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selected_repositories_url = selected_repositories_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetOrgSecretResponseData]
  }
  @scala.inline
  implicit class ActionsGetOrgSecretResponseDataOps[Self <: ActionsGetOrgSecretResponseData] (val x: Self) extends AnyVal {
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected_repositories_url(value: String): Self = this.set("selected_repositories_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
  }
  
}

