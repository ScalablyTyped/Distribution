package typings.mobileMessagingCordova.MobileMessagingCordova

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonalizeContext extends js.Object {
  var forceDepersonalize: js.UndefOr[Boolean] = js.undefined
  var userAttributes: js.UndefOr[Record[String, String]] = js.undefined
  var userIdentity: UserIdentity
}

object PersonalizeContext {
  @scala.inline
  def apply(
    userIdentity: UserIdentity,
    forceDepersonalize: js.UndefOr[Boolean] = js.undefined,
    userAttributes: Record[String, String] = null
  ): PersonalizeContext = {
    val __obj = js.Dynamic.literal(userIdentity = userIdentity.asInstanceOf[js.Any])
    if (!js.isUndefined(forceDepersonalize)) __obj.updateDynamic("forceDepersonalize")(forceDepersonalize.get.asInstanceOf[js.Any])
    if (userAttributes != null) __obj.updateDynamic("userAttributes")(userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonalizeContext]
  }
}

