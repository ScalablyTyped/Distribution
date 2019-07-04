package typings
package nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/requests#update-request|Zendesk Requests Update}
  */
trait UpdateModel extends js.Object {
  var additional_collaborators: js.UndefOr[
    js.Array[
      Collaborator | java.lang.String | nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID
    ]
  ] = js.undefined
  var comment: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs.CreateModel] = js.undefined
  var solved: js.UndefOr[scala.Boolean] = js.undefined
}

object UpdateModel {
  @scala.inline
  def apply(
    additional_collaborators: js.Array[
      Collaborator | java.lang.String | nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID
    ] = null,
    comment: nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs.CreateModel = null,
    solved: js.UndefOr[scala.Boolean] = js.undefined
  ): UpdateModel = {
    val __obj = js.Dynamic.literal()
    if (additional_collaborators != null) __obj.updateDynamic("additional_collaborators")(additional_collaborators)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (!js.isUndefined(solved)) __obj.updateDynamic("solved")(solved)
    __obj.asInstanceOf[UpdateModel]
  }
}

