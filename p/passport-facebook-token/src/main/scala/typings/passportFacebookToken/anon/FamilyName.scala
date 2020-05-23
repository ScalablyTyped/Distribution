package typings.passportFacebookToken.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FamilyName extends js.Object {
  var familyName: String
  var givenName: String
  var middleName: String
}

object FamilyName {
  @scala.inline
  def apply(familyName: String, givenName: String, middleName: String): FamilyName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyName]
  }
}

