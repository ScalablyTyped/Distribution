package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.Comments

import typings.nodeDashZendesk.nodeDashZendeskMod.Attachments.Model
import typings.nodeDashZendesk.nodeDashZendeskMod.Requests.Comments.RequestType
import typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.Via
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel
  extends typings.nodeDashZendesk.nodeDashZendeskMod.Requests.Comments.ResponseModel

object ResponseModel {
  @scala.inline
  def apply(
    attachments: js.Array[Model],
    author_id: ZendeskID,
    body: String,
    created_at: String,
    html_body: String,
    id: ZendeskID,
    plain_body: String,
    public: Boolean,
    request_id: Double,
    `type`: RequestType,
    url: String,
    metadata: Metadata = null,
    via: Via = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], author_id = author_id.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_body = html_body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plain_body = plain_body.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (via != null) __obj.updateDynamic("via")(via.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
}

