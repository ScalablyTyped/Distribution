package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandedEmail extends js.Object {
  var Email: java.lang.String
  var Name: java.lang.String
}

object ExpandedEmail {
  @scala.inline
  def apply(Email: java.lang.String, Name: java.lang.String): ExpandedEmail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Email")(Email)
    __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[ExpandedEmail]
  }
}

