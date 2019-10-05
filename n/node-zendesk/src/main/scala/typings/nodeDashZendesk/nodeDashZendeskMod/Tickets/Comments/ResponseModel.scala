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
    val __obj = js.Dynamic.literal(attachments = attachments, author_id = author_id, body = body, created_at = created_at, html_body = html_body, id = id, plain_body = plain_body, public = public, request_id = request_id, url = url)
    __obj.updateDynamic("type")(`type`)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (via != null) __obj.updateDynamic("via")(via)
    __obj.asInstanceOf[ResponseModel]
  }
}

