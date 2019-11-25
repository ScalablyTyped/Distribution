package typings.meteorDashTypings.meteorMeteorMod.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Settings **/
/** User **/
trait UserEmail extends js.Object {
  var address: String
  var verified: Boolean
}

object UserEmail {
  @scala.inline
  def apply(address: String, verified: Boolean): UserEmail = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserEmail]
  }
}

