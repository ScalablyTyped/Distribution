package typings.nodeZendesk.mod.Requests.Comments

import typings.nodeZendesk.mod.Attachments.Model
import typings.nodeZendesk.mod.TemporalModel
import typings.nodeZendesk.mod.Tickets.Comments.Metadata
import typings.nodeZendesk.mod.Tickets.Via
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseModel extends TemporalModel {
  val attachments: js.Array[Model] = js.native
  val author_id: ZendeskID = js.native
  val body: String = js.native
  val html_body: String = js.native
  val metadata: js.UndefOr[Metadata] = js.native
  val plain_body: String = js.native
  val public: Boolean = js.native
  val request_id: Double = js.native
  val `type`: RequestType = js.native
  val url: String = js.native
  val via: js.UndefOr[Via] = js.native
}

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
    url: String
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], author_id = author_id.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_body = html_body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plain_body = plain_body.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
  @scala.inline
  implicit class ResponseModelOps[Self <: ResponseModel] (val x: Self) extends AnyVal {
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
    def setAttachmentsVarargs(value: Model*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[Model]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor_id(value: ZendeskID): Self = this.set("author_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_body(value: String): Self = this.set("html_body", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlain_body(value: String): Self = this.set("plain_body", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest_id(value: Double): Self = this.set("request_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: RequestType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setVia(value: Via): Self = this.set("via", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVia: Self = this.set("via", js.undefined)
  }
  
}

