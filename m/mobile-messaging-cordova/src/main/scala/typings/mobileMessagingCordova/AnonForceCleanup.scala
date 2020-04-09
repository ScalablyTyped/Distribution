package typings.mobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForceCleanup extends js.Object {
  var forceCleanup: js.UndefOr[Boolean] = js.undefined
  var logging: js.UndefOr[Boolean] = js.undefined
  var notificationTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonForceCleanup {
  @scala.inline
  def apply(
    forceCleanup: js.UndefOr[Boolean] = js.undefined,
    logging: js.UndefOr[Boolean] = js.undefined,
    notificationTypes: js.Array[String] = null
  ): AnonForceCleanup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceCleanup)) __obj.updateDynamic("forceCleanup")(forceCleanup.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (notificationTypes != null) __obj.updateDynamic("notificationTypes")(notificationTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForceCleanup]
  }
}

