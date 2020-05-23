package typings.passportInstagram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FamilyName extends js.Object {
  var familyName: String
  var givenName: String
}

object FamilyName {
  @scala.inline
  def apply(familyName: String, givenName: String): FamilyName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyName]
  }
}

