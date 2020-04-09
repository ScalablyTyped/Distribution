package typings.mobileMessagingCordova.MobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserIdentity extends js.Object {
  var emails: js.UndefOr[js.Array[String]] = js.undefined
  var externalUserId: String
  var phones: js.UndefOr[js.Array[String]] = js.undefined
}

object UserIdentity {
  @scala.inline
  def apply(externalUserId: String, emails: js.Array[String] = null, phones: js.Array[String] = null): UserIdentity = {
    val __obj = js.Dynamic.literal(externalUserId = externalUserId.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (phones != null) __obj.updateDynamic("phones")(phones.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentity]
  }
}

