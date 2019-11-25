package typings.nodeDashMailjet.nodeDashMailjetMod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostResponseData extends js.Object {
  val Messages: js.Array[PostResponseDataMessage]
}

object PostResponseData {
  @scala.inline
  def apply(Messages: js.Array[PostResponseDataMessage]): PostResponseData = {
    val __obj = js.Dynamic.literal(Messages = Messages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostResponseData]
  }
}

