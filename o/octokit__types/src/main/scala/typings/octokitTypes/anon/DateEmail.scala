package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateEmail extends js.Object {
  var date: String
  var email: String
  var name: String
}

object DateEmail {
  @scala.inline
  def apply(date: String, email: String, name: String): DateEmail = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateEmail]
  }
}

