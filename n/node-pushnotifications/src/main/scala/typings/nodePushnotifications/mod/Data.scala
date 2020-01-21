package typings.nodePushnotifications.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /** apn and gcm for ios */
  var action: js.UndefOr[String] = js.undefined
  /** apn, will take precedence over title and body. It is also accepted a text message in alert */
  var alert: js.UndefOr[js.Object | String] = js.undefined
  /** gcm for ios, apn */
  var badge: js.UndefOr[Double] = js.undefined
  /** REQUIRED */
  var body: String
  /** gcm, apn */
  var bodyLocArgs: js.UndefOr[String] = js.undefined
  /** apn and gcm for ios */
  var category: js.UndefOr[String] = js.undefined
  /** gcm for android. In ios, category will be used if not supplied */
  var clickAction: js.UndefOr[String] = js.undefined
  /** gcm for android, used as collapseId in apn */
  var collapseKey: js.UndefOr[String] = js.undefined
  /** gcm for android */
  var color: js.UndefOr[String] = js.undefined
  /** ADM */
  var consolidationKey: js.UndefOr[String] = js.undefined
  /** gcm for android */
  var contentAvailable: js.UndefOr[Boolean | String] = js.undefined
  var custom: js.UndefOr[(StringDictionary[String | Double]) | String] = js.undefined
  /** gcm for android */
  var delayWhileIdle: js.UndefOr[Boolean] = js.undefined
  /** gcm for android */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  /** wns */
  var duration: js.UndefOr[String] = js.undefined
  /** apn */
  var encoding: js.UndefOr[String] = js.undefined
  /** seconds */
  var expiry: js.UndefOr[Double] = js.undefined
  /** wns */
  var headers: js.UndefOr[js.Array[String]] = js.undefined
  /** gcm for android */
  var icon: js.UndefOr[String] = js.undefined
  /** wns */
  var launch: js.UndefOr[String] = js.undefined
  /** apn and gcm for ios */
  var launchImage: js.UndefOr[String] = js.undefined
  /** gcm, apn */
  var locKey: js.UndefOr[String] = js.undefined
  /** apn and gcm for ios */
  var mdm: js.UndefOr[String] = js.undefined
  /** apn */
  var mutableContent: js.UndefOr[Double] = js.undefined
  /**
    * gcm, apn. Supported values are 'high' or 'normal' (gcm). Will be translated to 10 and 5 for apn. Defaults
    * to 'high'
    */
  var priority: js.UndefOr[String] = js.undefined
  /** gcm for android */
  var restrictedPackageName: js.UndefOr[String] = js.undefined
  /** gcm, apn */
  var retries: js.UndefOr[Double] = js.undefined
  /** gcm, apn */
  var sound: js.UndefOr[String] = js.undefined
  /** gcm for android */
  var tag: js.UndefOr[String] = js.undefined
  /** if both expiry and timeToLive are given, expiry will take precedency */
  var timeToLive: js.UndefOr[Double] = js.undefined
  /** REQUIRED */
  var title: String
  /** gcm, apn */
  var titleLocArgs: js.UndefOr[String] = js.undefined
  /** gcm, apn */
  var titleLocKey: js.UndefOr[String] = js.undefined
  /** apn and gcm for ios */
  var topic: js.UndefOr[String] = js.undefined
  /** apn and gcm for ios */
  var truncateAtWordEnd: js.UndefOr[Boolean] = js.undefined
  /** apn and gcm for ios */
  var urlArgs: js.UndefOr[String] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    body: String,
    title: String,
    action: String = null,
    alert: js.Object | String = null,
    badge: Int | Double = null,
    bodyLocArgs: String = null,
    category: String = null,
    clickAction: String = null,
    collapseKey: String = null,
    color: String = null,
    consolidationKey: String = null,
    contentAvailable: Boolean | String = null,
    custom: (StringDictionary[String | Double]) | String = null,
    delayWhileIdle: js.UndefOr[Boolean] = js.undefined,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    duration: String = null,
    encoding: String = null,
    expiry: Int | Double = null,
    headers: js.Array[String] = null,
    icon: String = null,
    launch: String = null,
    launchImage: String = null,
    locKey: String = null,
    mdm: String = null,
    mutableContent: Int | Double = null,
    priority: String = null,
    restrictedPackageName: String = null,
    retries: Int | Double = null,
    sound: String = null,
    tag: String = null,
    timeToLive: Int | Double = null,
    titleLocArgs: String = null,
    titleLocKey: String = null,
    topic: String = null,
    truncateAtWordEnd: js.UndefOr[Boolean] = js.undefined,
    urlArgs: String = null
  ): Data = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (alert != null) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (bodyLocArgs != null) __obj.updateDynamic("bodyLocArgs")(bodyLocArgs.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (clickAction != null) __obj.updateDynamic("clickAction")(clickAction.asInstanceOf[js.Any])
    if (collapseKey != null) __obj.updateDynamic("collapseKey")(collapseKey.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (consolidationKey != null) __obj.updateDynamic("consolidationKey")(consolidationKey.asInstanceOf[js.Any])
    if (contentAvailable != null) __obj.updateDynamic("contentAvailable")(contentAvailable.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (!js.isUndefined(delayWhileIdle)) __obj.updateDynamic("delayWhileIdle")(delayWhileIdle.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (launch != null) __obj.updateDynamic("launch")(launch.asInstanceOf[js.Any])
    if (launchImage != null) __obj.updateDynamic("launchImage")(launchImage.asInstanceOf[js.Any])
    if (locKey != null) __obj.updateDynamic("locKey")(locKey.asInstanceOf[js.Any])
    if (mdm != null) __obj.updateDynamic("mdm")(mdm.asInstanceOf[js.Any])
    if (mutableContent != null) __obj.updateDynamic("mutableContent")(mutableContent.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (restrictedPackageName != null) __obj.updateDynamic("restrictedPackageName")(restrictedPackageName.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (timeToLive != null) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    if (titleLocArgs != null) __obj.updateDynamic("titleLocArgs")(titleLocArgs.asInstanceOf[js.Any])
    if (titleLocKey != null) __obj.updateDynamic("titleLocKey")(titleLocKey.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (!js.isUndefined(truncateAtWordEnd)) __obj.updateDynamic("truncateAtWordEnd")(truncateAtWordEnd.asInstanceOf[js.Any])
    if (urlArgs != null) __obj.updateDynamic("urlArgs")(urlArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

