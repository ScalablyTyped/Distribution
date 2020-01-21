package typings.passportAzureAd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFamilyName extends js.Object {
  var familyName: js.UndefOr[String] = js.undefined
  var givenName: js.UndefOr[String] = js.undefined
  var middleName: js.UndefOr[String] = js.undefined
}

object AnonFamilyName {
  @scala.inline
  def apply(familyName: String = null, givenName: String = null, middleName: String = null): AnonFamilyName = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    if (middleName != null) __obj.updateDynamic("middleName")(middleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFamilyName]
  }
}

