package typings.nodeDashMailjet.nodeDashMailjetMod.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostResponseData extends js.Object {
  val Messages: js.Array[PostResponseDataMessage]
}

object PostResponseData {
  @scala.inline
  def apply(Messages: js.Array[PostResponseDataMessage]): PostResponseData = {
    val __obj = js.Dynamic.literal(Messages = Messages)
  
    __obj.asInstanceOf[PostResponseData]
  }
}

