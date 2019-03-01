package typings
package meteorLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Settings **/
/** User **/
trait UserEmail extends js.Object {
  var address: java.lang.String
  var verified: scala.Boolean
}

object UserEmail {
  @scala.inline
  def apply(address: java.lang.String, verified: scala.Boolean): UserEmail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("verified")(verified)
    __obj.asInstanceOf[UserEmail]
  }
}

