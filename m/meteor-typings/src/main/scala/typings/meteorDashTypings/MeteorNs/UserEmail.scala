package typings.meteorDashTypings.MeteorNs

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
    val __obj = js.Dynamic.literal(address = address, verified = verified)
  
    __obj.asInstanceOf[UserEmail]
  }
}

