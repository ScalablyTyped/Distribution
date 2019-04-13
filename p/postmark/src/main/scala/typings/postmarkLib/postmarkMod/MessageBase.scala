package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// messages
trait MessageBase extends js.Object {
  var Attachments: js.Array[PostmarkAttachment]
  var Cc: java.lang.String
  var From: java.lang.String
  var MessageID: java.lang.String
  var Status: java.lang.String
  var Subject: java.lang.String
  var Tag: java.lang.String
}

object MessageBase {
  @scala.inline
  def apply(
    Attachments: js.Array[PostmarkAttachment],
    Cc: java.lang.String,
    From: java.lang.String,
    MessageID: java.lang.String,
    Status: java.lang.String,
    Subject: java.lang.String,
    Tag: java.lang.String
  ): MessageBase = {
    val __obj = js.Dynamic.literal(Attachments = Attachments, Cc = Cc, From = From, MessageID = MessageID, Status = Status, Subject = Subject, Tag = Tag)
  
    __obj.asInstanceOf[MessageBase]
  }
}

