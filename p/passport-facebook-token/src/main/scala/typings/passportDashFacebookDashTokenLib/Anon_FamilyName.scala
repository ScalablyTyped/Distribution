package typings
package passportDashFacebookDashTokenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FamilyName extends js.Object {
  var familyName: java.lang.String
  var givenName: java.lang.String
  var middleName: java.lang.String
}

object Anon_FamilyName {
  @scala.inline
  def apply(familyName: java.lang.String, givenName: java.lang.String, middleName: java.lang.String): Anon_FamilyName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("familyName")(familyName)
    __obj.updateDynamic("givenName")(givenName)
    __obj.updateDynamic("middleName")(middleName)
    __obj.asInstanceOf[Anon_FamilyName]
  }
}

