package typings.passportDashFacebookDashToken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FamilyName extends js.Object {
  var familyName: String
  var givenName: String
  var middleName: String
}

object Anon_FamilyName {
  @scala.inline
  def apply(familyName: String, givenName: String, middleName: String): Anon_FamilyName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FamilyName]
  }
}

