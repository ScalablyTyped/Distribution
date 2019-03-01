package typings
package postmarkLib.postmarkMod.PostmarkNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Attachments")(Attachments)
    __obj.updateDynamic("Cc")(Cc)
    __obj.updateDynamic("From")(From)
    __obj.updateDynamic("MessageID")(MessageID)
    __obj.updateDynamic("Status")(Status)
    __obj.updateDynamic("Subject")(Subject)
    __obj.updateDynamic("Tag")(Tag)
    __obj.asInstanceOf[MessageBase]
  }
}

