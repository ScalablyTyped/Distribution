package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandedEmail extends js.Object {
  var Email: String
  var Name: String
}

object ExpandedEmail {
  @scala.inline
  def apply(Email: String, Name: String): ExpandedEmail = {
    val __obj = js.Dynamic.literal(Email = Email, Name = Name)
  
    __obj.asInstanceOf[ExpandedEmail]
  }
}

