package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlinedAttachment extends Attachment {
  var ContentID: String
}

object InlinedAttachment {
  @scala.inline
  def apply(Base64Content: String, ContentID: String, ContentType: String, Filename: String): InlinedAttachment = {
    val __obj = js.Dynamic.literal(Base64Content = Base64Content.asInstanceOf[js.Any], ContentID = ContentID.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], Filename = Filename.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InlinedAttachment]
  }
}

