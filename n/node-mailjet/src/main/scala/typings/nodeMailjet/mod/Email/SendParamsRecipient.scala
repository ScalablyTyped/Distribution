package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// other types
trait SendParamsRecipient extends js.Object {
  var Email: String
  var Name: String
}

object SendParamsRecipient {
  @scala.inline
  def apply(Email: String, Name: String): SendParamsRecipient = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendParamsRecipient]
  }
}

