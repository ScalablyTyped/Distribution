package typings.postmark.outboundMessageMod

import typings.postmark.messageSupportingTypesMod.Attachment
import typings.postmark.messageSupportingTypesMod.LinkTrackingOptions
import typings.postmark.supportingTypesMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutboundMessage extends js.Object {
  var Attachments: js.Array[Attachment] = js.native
  var Bcc: js.Array[Recipient] = js.native
  var Cc: js.Array[Recipient] = js.native
  var From: String = js.native
  var MessageID: String = js.native
  var MessageStream: String = js.native
  var Metadata: Hash[String] = js.native
  var ReceivedAt: String = js.native
  var Recipients: js.Array[String] = js.native
  var Status: String = js.native
  var Subject: String = js.native
  var Tag: js.UndefOr[String] = js.native
  var To: js.Array[Recipient] = js.native
  var TrackLinks: LinkTrackingOptions = js.native
  var TrackOpens: Boolean = js.native
}

object OutboundMessage {
  @scala.inline
  def apply(
    Attachments: js.Array[Attachment],
    Bcc: js.Array[Recipient],
    Cc: js.Array[Recipient],
    From: String,
    MessageID: String,
    MessageStream: String,
    Metadata: Hash[String],
    ReceivedAt: String,
    Recipients: js.Array[String],
    Status: String,
    Subject: String,
    To: js.Array[Recipient],
    TrackLinks: LinkTrackingOptions,
    TrackOpens: Boolean
  ): OutboundMessage = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Metadata = Metadata.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], TrackLinks = TrackLinks.asInstanceOf[js.Any], TrackOpens = TrackOpens.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundMessage]
  }
  @scala.inline
  implicit class OutboundMessageOps[Self <: OutboundMessage] (val x: Self) extends AnyVal {
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
    def setAttachmentsVarargs(value: Attachment*): Self = this.set("Attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[Attachment]): Self = this.set("Attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setBccVarargs(value: Recipient*): Self = this.set("Bcc", js.Array(value :_*))
    @scala.inline
    def setBcc(value: js.Array[Recipient]): Self = this.set("Bcc", value.asInstanceOf[js.Any])
    @scala.inline
    def setCcVarargs(value: Recipient*): Self = this.set("Cc", js.Array(value :_*))
    @scala.inline
    def setCc(value: js.Array[Recipient]): Self = this.set("Cc", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: String): Self = this.set("From", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageID(value: String): Self = this.set("MessageID", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageStream(value: String): Self = this.set("MessageStream", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Hash[String]): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceivedAt(value: String): Self = this.set("ReceivedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipientsVarargs(value: String*): Self = this.set("Recipients", js.Array(value :_*))
    @scala.inline
    def setRecipients(value: js.Array[String]): Self = this.set("Recipients", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setToVarargs(value: Recipient*): Self = this.set("To", js.Array(value :_*))
    @scala.inline
    def setTo(value: js.Array[Recipient]): Self = this.set("To", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackLinks(value: LinkTrackingOptions): Self = this.set("TrackLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackOpens(value: Boolean): Self = this.set("TrackOpens", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

