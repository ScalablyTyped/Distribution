package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsGetResponseData extends js.Object {
  var body: String = js.native
  var columns_url: String = js.native
  var created_at: String = js.native
  var creator: Avatarurl = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var name: String = js.native
  var node_id: String = js.native
  var number: Double = js.native
  var owner_url: String = js.native
  var state: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
}

object ProjectsGetResponseData {
  @scala.inline
  def apply(
    body: String,
    columns_url: String,
    created_at: String,
    creator: Avatarurl,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    number: Double,
    owner_url: String,
    state: String,
    updated_at: String,
    url: String
  ): ProjectsGetResponseData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], columns_url = columns_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner_url = owner_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsGetResponseData]
  }
  @scala.inline
  implicit class ProjectsGetResponseDataOps[Self <: ProjectsGetResponseData] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumns_url(value: String): Self = this.set("columns_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Avatarurl): Self = this.set("creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner_url(value: String): Self = this.set("owner_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

