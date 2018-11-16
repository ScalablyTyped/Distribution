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

