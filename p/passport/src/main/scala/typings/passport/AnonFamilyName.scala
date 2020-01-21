package typings.passport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFamilyName extends js.Object {
  var familyName: String
  var givenName: String
  var middleName: js.UndefOr[String] = js.undefined
}

object AnonFamilyName {
  @scala.inline
  def apply(familyName: String, givenName: String, middleName: String = null): AnonFamilyName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any])
    if (middleName != null) __obj.updateDynamic("middleName")(middleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFamilyName]
  }
}

