package typings.passport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FamilyName extends js.Object {
  var familyName: String
  var givenName: String
  var middleName: js.UndefOr[String] = js.undefined
}

object Anon_FamilyName {
  @scala.inline
  def apply(familyName: String, givenName: String, middleName: String = null): Anon_FamilyName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any])
    if (middleName != null) __obj.updateDynamic("middleName")(middleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FamilyName]
  }
}

