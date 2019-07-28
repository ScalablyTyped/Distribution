package typings.passportDashAzureDashAd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FamilyName extends js.Object {
  var familyName: js.UndefOr[String] = js.undefined
  var givenName: js.UndefOr[String] = js.undefined
  var middleName: js.UndefOr[String] = js.undefined
}

object Anon_FamilyName {
  @scala.inline
  def apply(familyName: String = null, givenName: String = null, middleName: String = null): Anon_FamilyName = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    if (middleName != null) __obj.updateDynamic("middleName")(middleName)
    __obj.asInstanceOf[Anon_FamilyName]
  }
}

