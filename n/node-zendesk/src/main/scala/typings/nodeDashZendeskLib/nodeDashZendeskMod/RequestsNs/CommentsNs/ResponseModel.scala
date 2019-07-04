package typings
package nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel
  extends nodeDashZendeskLib.nodeDashZendeskMod.TemporalModel {
  val attachments: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.AttachmentsNs.Model]
  val author_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID
  val body: java.lang.String
  val html_body: java.lang.String
  val metadata: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.CommentsNs.Metadata] = js.undefined
  val plain_body: java.lang.String
  val public: scala.Boolean
  val request_id: scala.Double
  val `type`: RequestType
  val url: java.lang.String
  val via: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Via] = js.undefined
}

object ResponseModel {
  @scala.inline
  def apply(
    attachments: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.AttachmentsNs.Model],
    author_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    body: java.lang.String,
    created_at: java.lang.String,
    html_body: java.lang.String,
    id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    plain_body: java.lang.String,
    public: scala.Boolean,
    request_id: scala.Double,
    `type`: RequestType,
    url: java.lang.String,
    metadata: nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.CommentsNs.Metadata = null,
    via: nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Via = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(attachments = attachments, author_id = author_id, body = body, created_at = created_at, html_body = html_body, id = id, plain_body = plain_body, public = public, request_id = request_id, url = url)
    __obj.updateDynamic("type")(`type`)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (via != null) __obj.updateDynamic("via")(via)
    __obj.asInstanceOf[ResponseModel]
  }
}

