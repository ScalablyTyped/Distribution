package typings
package onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OSNotification extends js.Object {
  var adm_big_picture: js.UndefOr[java.lang.String] = js.undefined
  var adm_group: js.UndefOr[java.lang.String] = js.undefined
  var adm_group_message: js.UndefOr[js.Any] = js.undefined
  var adm_large_icon: js.UndefOr[java.lang.String] = js.undefined
  var adm_small_icon: js.UndefOr[java.lang.String] = js.undefined
  var adm_sound: js.UndefOr[java.lang.String] = js.undefined
  var amazon_background_data: js.UndefOr[scala.Boolean] = js.undefined
  var androidNotificationId: js.UndefOr[scala.Double] = js.undefined
  var android_accent_color: js.UndefOr[java.lang.String] = js.undefined
  var android_group: js.UndefOr[java.lang.String] = js.undefined
  var android_group_message: js.UndefOr[js.Any] = js.undefined
  var android_led_color: js.UndefOr[java.lang.String] = js.undefined
  var android_sound: js.UndefOr[java.lang.String] = js.undefined
  var android_visibility: js.UndefOr[scala.Double] = js.undefined
  var app_id: js.UndefOr[java.lang.String] = js.undefined
  var app_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var big_picture: js.UndefOr[java.lang.String] = js.undefined
  var buttons: js.UndefOr[js.Any] = js.undefined
  var chrome_big_picture: js.UndefOr[java.lang.String] = js.undefined
  var chrome_icon: js.UndefOr[java.lang.String] = js.undefined
  var chrome_web_icon: js.UndefOr[java.lang.String] = js.undefined
  var content_available: js.UndefOr[scala.Boolean] = js.undefined
  var contents: js.Any
  var data: js.UndefOr[js.Any] = js.undefined
  var delayed_option: js.UndefOr[java.lang.String] = js.undefined
  var delivery_time_of_day: js.UndefOr[java.lang.String] = js.undefined
  var displayType: OSDisplayType
  var excluded_segments: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var firefox_icon: js.UndefOr[java.lang.String] = js.undefined
  var groupedNotifications: js.UndefOr[js.Array[OSNotificationPayload]] = js.undefined
  var headings: js.UndefOr[js.Any] = js.undefined
  var include_amazon_reg_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_android_reg_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_chrome_reg_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_chrome_web_reg_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_ios_tokens: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_player_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_wp_uris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_wp_wns_uris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var included_segments: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ios_badgeCount: js.UndefOr[scala.Double] = js.undefined
  var ios_badgeType: js.UndefOr[java.lang.String] = js.undefined
  var ios_category: js.UndefOr[java.lang.String] = js.undefined
  var ios_sound: js.UndefOr[java.lang.String] = js.undefined
  var isAdm: js.UndefOr[scala.Boolean] = js.undefined
  var isAndroid: js.UndefOr[scala.Boolean] = js.undefined
  var isAnyWeb: js.UndefOr[scala.Boolean] = js.undefined
  var isAppInFocus: scala.Boolean
  var isChrome: js.UndefOr[scala.Boolean] = js.undefined
  var isChromeWeb: js.UndefOr[scala.Boolean] = js.undefined
  var isIos: js.UndefOr[scala.Boolean] = js.undefined
  var isSafari: js.UndefOr[scala.Boolean] = js.undefined
  var isWP: js.UndefOr[scala.Boolean] = js.undefined
  var isWP_WNS: js.UndefOr[scala.Boolean] = js.undefined
  var large_icon: js.UndefOr[java.lang.String] = js.undefined
  var payload: OSNotificationPayload
  var priority: js.UndefOr[scala.Double] = js.undefined
  var send_after: js.UndefOr[java.lang.String] = js.undefined
  var shown: scala.Boolean
  var small_icon: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[js.Array[_]] = js.undefined
  var template_id: js.UndefOr[java.lang.String] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var wp_sound: js.UndefOr[java.lang.String] = js.undefined
  var wp_wns_sound: js.UndefOr[java.lang.String] = js.undefined
}

