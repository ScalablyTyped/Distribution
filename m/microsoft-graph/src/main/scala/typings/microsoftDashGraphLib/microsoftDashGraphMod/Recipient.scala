package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recipient extends js.Object {
  // The recipient's email address.
  var emailAddress: js.UndefOr[EmailAddress] = js.undefined
}

object Recipient {
  @scala.inline
  def apply(emailAddress: EmailAddress = null): Recipient = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    __obj.asInstanceOf[Recipient]
  }
}

