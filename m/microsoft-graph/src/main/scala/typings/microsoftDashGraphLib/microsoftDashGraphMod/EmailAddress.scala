package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailAddress extends js.Object {
  // The email address of the person or entity.
  var address: js.UndefOr[java.lang.String] = js.undefined
  // The display name of the person or entity.
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object EmailAddress {
  @scala.inline
  def apply(address: java.lang.String = null, name: java.lang.String = null): EmailAddress = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[EmailAddress]
  }
}

