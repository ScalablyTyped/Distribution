package typings
package nodeDashMailjetLib.nodeDashMailjetMod.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostResponseDataTo extends js.Object {
  val Email: java.lang.String
  val MessageHref: java.lang.String
  val MessageID: scala.Double
  val MessageUUID: java.lang.String
}

object PostResponseDataTo {
  @scala.inline
  def apply(
    Email: java.lang.String,
    MessageHref: java.lang.String,
    MessageID: scala.Double,
    MessageUUID: java.lang.String
  ): PostResponseDataTo = {
    val __obj = js.Dynamic.literal(Email = Email, MessageHref = MessageHref, MessageID = MessageID, MessageUUID = MessageUUID)
  
    __obj.asInstanceOf[PostResponseDataTo]
  }
}

