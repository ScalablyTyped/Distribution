package typings.passport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FamilyName extends js.Object {
  var familyName: String
  var givenName: String
  var middleName: js.UndefOr[String] = js.undefined
}

object FamilyName {
  @scala.inline
  def apply(familyName: String, givenName: String, middleName: String = null): FamilyName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any])
    if (middleName != null) __obj.updateDynamic("middleName")(middleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyName]
  }
}

