package typings.nodeZendesk.mod.Requests.Comments

import typings.nodeZendesk.mod.PaginablePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPayload extends PaginablePayload {
  var comments: js.Array[ResponseModel] = js.native
  var organizations: js.Array[typings.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel] = js.native
  var users: js.Array[typings.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel] = js.native
}

object ListPayload {
  @scala.inline
  def apply(
    comments: js.Array[ResponseModel],
    count: Double,
    organizations: js.Array[typings.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel],
    users: js.Array[typings.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel]
  ): ListPayload = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
  @scala.inline
  implicit class ListPayloadOps[Self <: ListPayload] (val x: Self) extends AnyVal {
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
    def setCommentsVarargs(value: ResponseModel*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[ResponseModel]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationsVarargs(value: typings.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel*): Self = this.set("organizations", js.Array(value :_*))
    @scala.inline
    def setOrganizations(value: js.Array[typings.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel]): Self = this.set("organizations", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsersVarargs(value: typings.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[typings.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
  
}

