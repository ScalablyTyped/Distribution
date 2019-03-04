package typings
package nodeDashPushnotificationsLib.nodeDashPushnotificationsMod.PushNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /** apn and gcm for ios */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** apn, will take precedence over title and body. It is also accepted a text message in alert */
  var alert: js.UndefOr[js.Object | java.lang.String] = js.undefined
  /** gcm for ios, apn */
  var badge: js.UndefOr[scala.Double] = js.undefined
  /** REQUIRED */
  var body: java.lang.String
  /** gcm, apn */
  var bodyLocArgs: js.UndefOr[java.lang.String] = js.undefined
  /** apn and gcm for ios */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /** gcm for android. In ios, category will be used if not supplied */
  var clickAction: js.UndefOr[java.lang.String] = js.undefined
  /** gcm for android, used as collapseId in apn */
  var collapseKey: js.UndefOr[java.lang.String] = js.undefined
  /** gcm for android */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** ADM */
  var consolidationKey: js.UndefOr[java.lang.String] = js.undefined
  /** gcm for android */
  var contentAvailable: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var custom: js.UndefOr[nodeDashPushnotificationsLib.Anon_Sender] = js.undefined
  /** gcm for android */
  var delayWhileIdle: js.UndefOr[scala.Boolean] = js.undefined
  /** gcm for android */
  var dryRun: js.UndefOr[scala.Boolean] = js.undefined
  /** wns */
  var duration: js.UndefOr[java.lang.String] = js.undefined
  /** apn */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /** seconds */
  var expiry: js.UndefOr[scala.Double] = js.undefined
  /** wns */
  var headers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** gcm for android */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** wns */
  var launch: js.UndefOr[java.lang.String] = js.undefined
  /** apn and gcm for ios */
  var launchImage: js.UndefOr[java.lang.String] = js.undefined
  /** gcm, apn */
  var locKey: js.UndefOr[java.lang.String] = js.undefined
  /** apn and gcm for ios */
  var mdm: js.UndefOr[java.lang.String] = js.undefined
  /** apn */
  var mutableContent: js.UndefOr[scala.Double] = js.undefined
  /**
    * gcm, apn. Supported values are 'high' or 'normal' (gcm). Will be translated to 10 and 5 for apn. Defaults
    * to 'high'
    */
  var priority: js.UndefOr[java.lang.String] = js.undefined
  /** gcm for android */
  var restrictedPackageName: js.UndefOr[java.lang.String] = js.undefined
  /** gcm, apn */
  var retries: js.UndefOr[scala.Double] = js.undefined
  /** gcm, apn */
  var sound: js.UndefOr[java.lang.String] = js.undefined
  /** gcm for android */
  var tag: js.UndefOr[java.lang.String] = js.undefined
  /** if both expiry and timeToLive are given, expiry will take precedency */
  var timeToLive: js.UndefOr[scala.Double] = js.undefined
  /** REQUIRED */
  var title: java.lang.String
  /** gcm, apn */
  var titleLocArgs: js.UndefOr[java.lang.String] = js.undefined
  /** gcm, apn */
  var titleLocKey: js.UndefOr[java.lang.String] = js.undefined
  /** apn and gcm for ios */
  var topic: js.UndefOr[java.lang.String] = js.undefined
  /** apn and gcm for ios */
  var truncateAtWordEnd: js.UndefOr[scala.Boolean] = js.undefined
  /** apn and gcm for ios */
  var urlArgs: js.UndefOr[java.lang.String] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    body: java.lang.String,
    title: java.lang.String,
    action: java.lang.String = null,
    alert: js.Object | java.lang.String = null,
    badge: scala.Int | scala.Double = null,
    bodyLocArgs: java.lang.String = null,
    category: java.lang.String = null,
    clickAction: java.lang.String = null,
    collapseKey: java.lang.String = null,
    color: java.lang.String = null,
    consolidationKey: java.lang.String = null,
    contentAvailable: scala.Boolean | java.lang.String = null,
    custom: nodeDashPushnotificationsLib.Anon_Sender = null,
    delayWhileIdle: js.UndefOr[scala.Boolean] = js.undefined,
    dryRun: js.UndefOr[scala.Boolean] = js.undefined,
    duration: java.lang.String = null,
    encoding: java.lang.String = null,
    expiry: scala.Int | scala.Double = null,
    headers: js.Array[java.lang.String] = null,
    icon: java.lang.String = null,
    launch: java.lang.String = null,
    launchImage: java.lang.String = null,
    locKey: java.lang.String = null,
    mdm: java.lang.String = null,
    mutableContent: scala.Int | scala.Double = null,
    priority: java.lang.String = null,
    restrictedPackageName: java.lang.String = null,
    retries: scala.Int | scala.Double = null,
    sound: java.lang.String = null,
    tag: java.lang.String = null,
    timeToLive: scala.Int | scala.Double = null,
    titleLocArgs: java.lang.String = null,
    titleLocKey: java.lang.String = null,
    topic: java.lang.String = null,
    truncateAtWordEnd: js.UndefOr[scala.Boolean] = js.undefined,
    urlArgs: java.lang.String = null
  ): Data = {
    val __obj = js.Dynamic.literal(body = body, title = title)
    if (action != null) __obj.updateDynamic("action")(action)
    if (alert != null) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (bodyLocArgs != null) __obj.updateDynamic("bodyLocArgs")(bodyLocArgs)
    if (category != null) __obj.updateDynamic("category")(category)
    if (clickAction != null) __obj.updateDynamic("clickAction")(clickAction)
    if (collapseKey != null) __obj.updateDynamic("collapseKey")(collapseKey)
    if (color != null) __obj.updateDynamic("color")(color)
    if (consolidationKey != null) __obj.updateDynamic("consolidationKey")(consolidationKey)
    if (contentAvailable != null) __obj.updateDynamic("contentAvailable")(contentAvailable.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (!js.isUndefined(delayWhileIdle)) __obj.updateDynamic("delayWhileIdle")(delayWhileIdle)
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (launch != null) __obj.updateDynamic("launch")(launch)
    if (launchImage != null) __obj.updateDynamic("launchImage")(launchImage)
    if (locKey != null) __obj.updateDynamic("locKey")(locKey)
    if (mdm != null) __obj.updateDynamic("mdm")(mdm)
    if (mutableContent != null) __obj.updateDynamic("mutableContent")(mutableContent.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (restrictedPackageName != null) __obj.updateDynamic("restrictedPackageName")(restrictedPackageName)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (timeToLive != null) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    if (titleLocArgs != null) __obj.updateDynamic("titleLocArgs")(titleLocArgs)
    if (titleLocKey != null) __obj.updateDynamic("titleLocKey")(titleLocKey)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    if (!js.isUndefined(truncateAtWordEnd)) __obj.updateDynamic("truncateAtWordEnd")(truncateAtWordEnd)
    if (urlArgs != null) __obj.updateDynamic("urlArgs")(urlArgs)
    __obj.asInstanceOf[Data]
  }
}

