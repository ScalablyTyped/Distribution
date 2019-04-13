package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostmarkAttachment extends js.Object {
  var Content: java.lang.String
  var ContentType: java.lang.String
  var Name: java.lang.String
}

object PostmarkAttachment {
  @scala.inline
  def apply(Content: java.lang.String, ContentType: java.lang.String, Name: java.lang.String): PostmarkAttachment = {
    val __obj = js.Dynamic.literal(Content = Content, ContentType = ContentType, Name = Name)
  
    __obj.asInstanceOf[PostmarkAttachment]
  }
}

