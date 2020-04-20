package typings.passportFacebookToken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFamilyName extends js.Object {
  var familyName: String
  var givenName: String
  var middleName: String
}

object AnonFamilyName {
  @scala.inline
  def apply(familyName: String, givenName: String, middleName: String): AnonFamilyName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFamilyName]
  }
}

