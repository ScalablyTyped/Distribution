package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveRecipient extends js.Object {
  // The alias of the domain object, for cases where an email address is unavailable (e.g. security groups).
  var alias: js.UndefOr[String] = js.undefined
  // The email address for the recipient, if the recipient has an associated email address.
  var email: js.UndefOr[String] = js.undefined
  // The unique identifier for the recipient in the directory.
  var objectId: js.UndefOr[String] = js.undefined
}

object DriveRecipient {
  @scala.inline
  def apply(alias: String = null, email: String = null, objectId: String = null): DriveRecipient = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveRecipient]
  }
}

