package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveRecipient extends js.Object {
  /** The alias of the domain object, for cases where an email address is unavailable (e.g. security groups). */
  var alias: js.UndefOr[java.lang.String] = js.undefined
  /** The email address for the recipient, if the recipient has an associated email address. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** The unique identifier for the recipient in the directory. */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object DriveRecipient {
  @scala.inline
  def apply(alias: java.lang.String = null, email: java.lang.String = null, objectId: java.lang.String = null): DriveRecipient = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (email != null) __obj.updateDynamic("email")(email)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[DriveRecipient]
  }
}

