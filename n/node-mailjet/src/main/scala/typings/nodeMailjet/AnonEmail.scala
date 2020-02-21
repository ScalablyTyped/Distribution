package typings.nodeMailjet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var Email: String
  var Name: js.UndefOr[String] = js.undefined
}

object AnonEmail {
  @scala.inline
  def apply(Email: String, Name: String = null): AnonEmail = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}

