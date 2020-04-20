package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostResponseDataTo extends js.Object {
  val Email: String
  val MessageHref: String
  val MessageID: Double
  val MessageUUID: String
}

object PostResponseDataTo {
  @scala.inline
  def apply(Email: String, MessageHref: String, MessageID: Double, MessageUUID: String): PostResponseDataTo = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], MessageHref = MessageHref.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageUUID = MessageUUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponseDataTo]
  }
}

