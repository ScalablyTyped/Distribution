package typings.nodeZendesk.mod.Requests

import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/requests#update-request|Zendesk Requests Update}
  */
@js.native
trait UpdateModel extends js.Object {
  var additional_collaborators: js.UndefOr[js.Array[Collaborator | String | ZendeskID]] = js.native
  var comment: js.UndefOr[typings.nodeZendesk.mod.Requests.Comments.CreateModel] = js.native
  var solved: js.UndefOr[Boolean] = js.native
}

object UpdateModel {
  @scala.inline
  def apply(): UpdateModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateModel]
  }
  @scala.inline
  implicit class UpdateModelOps[Self <: UpdateModel] (val x: Self) extends AnyVal {
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
    def setAdditional_collaboratorsVarargs(value: (Collaborator | String | ZendeskID)*): Self = this.set("additional_collaborators", js.Array(value :_*))
    @scala.inline
    def setAdditional_collaborators(value: js.Array[Collaborator | String | ZendeskID]): Self = this.set("additional_collaborators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditional_collaborators: Self = this.set("additional_collaborators", js.undefined)
    @scala.inline
    def setComment(value: typings.nodeZendesk.mod.Requests.Comments.CreateModel): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setSolved(value: Boolean): Self = this.set("solved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolved: Self = this.set("solved", js.undefined)
  }
  
}

