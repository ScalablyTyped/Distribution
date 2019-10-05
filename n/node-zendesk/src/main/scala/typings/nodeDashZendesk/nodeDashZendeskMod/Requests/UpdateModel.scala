package typings.nodeDashZendesk.nodeDashZendeskMod.Requests

import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/requests#update-request|Zendesk Requests Update}
  */
trait UpdateModel extends js.Object {
  var additional_collaborators: js.UndefOr[js.Array[Collaborator | String | ZendeskID]] = js.undefined
  var comment: js.UndefOr[typings.nodeDashZendesk.nodeDashZendeskMod.Requests.Comments.CreateModel] = js.undefined
  var solved: js.UndefOr[Boolean] = js.undefined
}

object UpdateModel {
  @scala.inline
  def apply(
    additional_collaborators: js.Array[Collaborator | String | ZendeskID] = null,
    comment: typings.nodeDashZendesk.nodeDashZendeskMod.Requests.Comments.CreateModel = null,
    solved: js.UndefOr[Boolean] = js.undefined
  ): UpdateModel = {
    val __obj = js.Dynamic.literal()
    if (additional_collaborators != null) __obj.updateDynamic("additional_collaborators")(additional_collaborators)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (!js.isUndefined(solved)) __obj.updateDynamic("solved")(solved)
    __obj.asInstanceOf[UpdateModel]
  }
}

