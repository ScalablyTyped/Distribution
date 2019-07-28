package typings.nodeDashMailjet.nodeDashMailjetMod.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostResponseDataMessage extends js.Object {
  val Bcc: js.Array[PostResponseDataTo]
  val Cc: js.Array[PostResponseDataTo]
  val CustomID: String
  val Status: String
  val To: js.Array[PostResponseDataTo]
}

object PostResponseDataMessage {
  @scala.inline
  def apply(
    Bcc: js.Array[PostResponseDataTo],
    Cc: js.Array[PostResponseDataTo],
    CustomID: String,
    Status: String,
    To: js.Array[PostResponseDataTo]
  ): PostResponseDataMessage = {
    val __obj = js.Dynamic.literal(Bcc = Bcc, Cc = Cc, CustomID = CustomID, Status = Status, To = To)
  
    __obj.asInstanceOf[PostResponseDataMessage]
  }
}

