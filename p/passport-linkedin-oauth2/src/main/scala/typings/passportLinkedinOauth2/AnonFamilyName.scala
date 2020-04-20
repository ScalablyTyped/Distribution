package typings.passportLinkedinOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFamilyName extends js.Object {
  var familyName: String
  var givenName: String
}

object AnonFamilyName {
  @scala.inline
  def apply(familyName: String, givenName: String): AnonFamilyName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFamilyName]
  }
}

