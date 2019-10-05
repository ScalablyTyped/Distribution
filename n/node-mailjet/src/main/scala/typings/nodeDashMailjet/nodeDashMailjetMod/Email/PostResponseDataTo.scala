package typings.nodeDashMailjet.nodeDashMailjetMod.Email

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
    val __obj = js.Dynamic.literal(Email = Email, MessageHref = MessageHref, MessageID = MessageID, MessageUUID = MessageUUID)
  
    __obj.asInstanceOf[PostResponseDataTo]
  }
}

