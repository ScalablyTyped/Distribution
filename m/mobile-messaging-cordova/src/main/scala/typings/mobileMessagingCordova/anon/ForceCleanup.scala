package typings.mobileMessagingCordova.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceCleanup extends js.Object {
  var forceCleanup: js.UndefOr[Boolean] = js.undefined
  var logging: js.UndefOr[Boolean] = js.undefined
  var notificationTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object ForceCleanup {
  @scala.inline
  def apply(
    forceCleanup: js.UndefOr[Boolean] = js.undefined,
    logging: js.UndefOr[Boolean] = js.undefined,
    notificationTypes: js.Array[String] = null
  ): ForceCleanup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceCleanup)) __obj.updateDynamic("forceCleanup")(forceCleanup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.get.asInstanceOf[js.Any])
    if (notificationTypes != null) __obj.updateDynamic("notificationTypes")(notificationTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceCleanup]
  }
}

