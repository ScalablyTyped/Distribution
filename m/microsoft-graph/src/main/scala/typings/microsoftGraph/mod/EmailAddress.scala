package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailAddress extends js.Object {
  // The email address of the person or entity.
  var address: js.UndefOr[String] = js.undefined
  // The display name of the person or entity.
  var name: js.UndefOr[String] = js.undefined
}

object EmailAddress {
  @scala.inline
  def apply(address: String = null, name: String = null): EmailAddress = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAddress]
  }
}

