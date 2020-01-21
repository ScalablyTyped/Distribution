package typings.nodeGcm.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageOptions extends js.Object {
  var collapseKey: js.UndefOr[String] = js.undefined
  var contentAvailable: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[StringDictionary[String]] = js.undefined
  var delayWhileIdle: js.UndefOr[Boolean] = js.undefined
  var dryRun: js.UndefOr[Boolean] = js.undefined
  var mutableContent: js.UndefOr[Boolean] = js.undefined
  var notification: js.UndefOr[INotificationOptions] = js.undefined
  var priority: js.UndefOr[String] = js.undefined
  var restrictedPackageName: js.UndefOr[String] = js.undefined
  var timeToLive: js.UndefOr[Double] = js.undefined
}

object IMessageOptions {
  @scala.inline
  def apply(
    collapseKey: String = null,
    contentAvailable: js.UndefOr[Boolean] = js.undefined,
    data: StringDictionary[String] = null,
    delayWhileIdle: js.UndefOr[Boolean] = js.undefined,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    mutableContent: js.UndefOr[Boolean] = js.undefined,
    notification: INotificationOptions = null,
    priority: String = null,
    restrictedPackageName: String = null,
    timeToLive: Int | Double = null
  ): IMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (collapseKey != null) __obj.updateDynamic("collapseKey")(collapseKey.asInstanceOf[js.Any])
    if (!js.isUndefined(contentAvailable)) __obj.updateDynamic("contentAvailable")(contentAvailable.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(delayWhileIdle)) __obj.updateDynamic("delayWhileIdle")(delayWhileIdle.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (!js.isUndefined(mutableContent)) __obj.updateDynamic("mutableContent")(mutableContent.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (restrictedPackageName != null) __obj.updateDynamic("restrictedPackageName")(restrictedPackageName.asInstanceOf[js.Any])
    if (timeToLive != null) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageOptions]
  }
}

