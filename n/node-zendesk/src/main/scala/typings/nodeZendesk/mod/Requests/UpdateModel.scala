package typings.nodeZendesk.mod.Requests

import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/requests#update-request|Zendesk Requests Update}
  */
trait UpdateModel extends js.Object {
  var additional_collaborators: js.UndefOr[js.Array[Collaborator | String | ZendeskID]] = js.undefined
  var comment: js.UndefOr[typings.nodeZendesk.mod.Requests.Comments.CreateModel] = js.undefined
  var solved: js.UndefOr[Boolean] = js.undefined
}

object UpdateModel {
  @scala.inline
  def apply(
    additional_collaborators: js.Array[Collaborator | String | ZendeskID] = null,
    comment: typings.nodeZendesk.mod.Requests.Comments.CreateModel = null,
    solved: js.UndefOr[Boolean] = js.undefined
  ): UpdateModel = {
    val __obj = js.Dynamic.literal()
    if (additional_collaborators != null) __obj.updateDynamic("additional_collaborators")(additional_collaborators.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (!js.isUndefined(solved)) __obj.updateDynamic("solved")(solved.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModel]
  }
}

