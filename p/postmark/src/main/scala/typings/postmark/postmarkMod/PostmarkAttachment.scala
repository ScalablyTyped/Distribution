package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostmarkAttachment extends js.Object {
  var Content: String
  var ContentType: String
  var Name: String
}

object PostmarkAttachment {
  @scala.inline
  def apply(Content: String, ContentType: String, Name: String): PostmarkAttachment = {
    val __obj = js.Dynamic.literal(Content = Content, ContentType = ContentType, Name = Name)
  
    __obj.asInstanceOf[PostmarkAttachment]
  }
}

