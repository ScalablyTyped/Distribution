package typings
package passportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FamilyName extends js.Object {
  var familyName: java.lang.String
  var givenName: java.lang.String
  var middleName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FamilyName {
  @scala.inline
  def apply(familyName: java.lang.String, givenName: java.lang.String, middleName: java.lang.String = null): Anon_FamilyName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("familyName")(familyName)
    __obj.updateDynamic("givenName")(givenName)
    if (middleName != null) __obj.updateDynamic("middleName")(middleName)
    __obj.asInstanceOf[Anon_FamilyName]
  }
}

