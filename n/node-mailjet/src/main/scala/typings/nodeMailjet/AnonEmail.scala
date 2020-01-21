package typings.nodeMailjet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var Email: String
  var Name: String
}

object AnonEmail {
  @scala.inline
  def apply(Email: String, Name: String): AnonEmail = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEmail]
  }
}

