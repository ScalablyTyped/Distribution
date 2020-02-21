package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var Base64Content: String
  var ContentType: String
  var Filename: String
}

object Attachment {
  @scala.inline
  def apply(Base64Content: String, ContentType: String, Filename: String): Attachment = {
    val __obj = js.Dynamic.literal(Base64Content = Base64Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], Filename = Filename.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Attachment]
  }
}

