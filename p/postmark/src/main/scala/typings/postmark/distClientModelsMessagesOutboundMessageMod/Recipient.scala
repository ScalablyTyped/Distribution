package typings.postmark.distClientModelsMessagesOutboundMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recipient extends js.Object {
  var Email: String
  var Name: String
}

object Recipient {
  @scala.inline
  def apply(Email: String, Name: String): Recipient = {
    val __obj = js.Dynamic.literal(Email = Email, Name = Name)
  
    __obj.asInstanceOf[Recipient]
  }
}

