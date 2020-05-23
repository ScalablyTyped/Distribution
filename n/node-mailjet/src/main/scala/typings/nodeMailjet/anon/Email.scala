package typings.nodeMailjet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var Email: String
  var Name: js.UndefOr[String] = js.undefined
}

object Email {
  @scala.inline
  def apply(Email: String, Name: String = null): Email = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

