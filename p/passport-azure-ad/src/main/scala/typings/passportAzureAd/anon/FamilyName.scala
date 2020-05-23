package typings.passportAzureAd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FamilyName extends js.Object {
  var familyName: js.UndefOr[String] = js.undefined
  var givenName: js.UndefOr[String] = js.undefined
  var middleName: js.UndefOr[String] = js.undefined
}

object FamilyName {
  @scala.inline
  def apply(familyName: String = null, givenName: String = null, middleName: String = null): FamilyName = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    if (middleName != null) __obj.updateDynamic("middleName")(middleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyName]
  }
}

