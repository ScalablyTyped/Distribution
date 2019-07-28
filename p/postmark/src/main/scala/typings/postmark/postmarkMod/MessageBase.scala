package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// messages
trait MessageBase extends js.Object {
  var Attachments: js.Array[PostmarkAttachment]
  var Cc: String
  var From: String
  var MessageID: String
  var Status: String
  var Subject: String
  var Tag: String
}

object MessageBase {
  @scala.inline
  def apply(
    Attachments: js.Array[PostmarkAttachment],
    Cc: String,
    From: String,
    MessageID: String,
    Status: String,
    Subject: String,
    Tag: String
  ): MessageBase = {
    val __obj = js.Dynamic.literal(Attachments = Attachments, Cc = Cc, From = From, MessageID = MessageID, Status = Status, Subject = Subject, Tag = Tag)
  
    __obj.asInstanceOf[MessageBase]
  }
}

