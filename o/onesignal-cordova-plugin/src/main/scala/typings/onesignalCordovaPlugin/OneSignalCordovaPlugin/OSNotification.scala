package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSNotification extends js.Object {
  var adm_big_picture: js.UndefOr[String] = js.undefined
  var adm_group: js.UndefOr[String] = js.undefined
  var adm_group_message: js.UndefOr[js.Any] = js.undefined
  var adm_large_icon: js.UndefOr[String] = js.undefined
  var adm_small_icon: js.UndefOr[String] = js.undefined
  var adm_sound: js.UndefOr[String] = js.undefined
  var amazon_background_data: js.UndefOr[Boolean] = js.undefined
  var androidNotificationId: js.UndefOr[Double] = js.undefined
  var android_accent_color: js.UndefOr[String] = js.undefined
  var android_group: js.UndefOr[String] = js.undefined
  var android_group_message: js.UndefOr[js.Any] = js.undefined
  var android_led_color: js.UndefOr[String] = js.undefined
  var android_sound: js.UndefOr[String] = js.undefined
  var android_visibility: js.UndefOr[Double] = js.undefined
  var app_id: js.UndefOr[String] = js.undefined
  var app_ids: js.UndefOr[js.Array[String]] = js.undefined
  var big_picture: js.UndefOr[String] = js.undefined
  var buttons: js.UndefOr[js.Any] = js.undefined
  var chrome_big_picture: js.UndefOr[String] = js.undefined
  var chrome_icon: js.UndefOr[String] = js.undefined
  var chrome_web_icon: js.UndefOr[String] = js.undefined
  var content_available: js.UndefOr[Boolean] = js.undefined
  var contents: js.Any
  var data: js.UndefOr[js.Any] = js.undefined
  var delayed_option: js.UndefOr[String] = js.undefined
  var delivery_time_of_day: js.UndefOr[String] = js.undefined
  var displayType: OSDisplayType
  var excluded_segments: js.UndefOr[js.Array[String]] = js.undefined
  var firefox_icon: js.UndefOr[String] = js.undefined
  var groupedNotifications: js.UndefOr[js.Array[OSNotificationPayload]] = js.undefined
  var headings: js.UndefOr[js.Any] = js.undefined
  var include_amazon_reg_ids: js.UndefOr[js.Array[String]] = js.undefined
  var include_android_reg_ids: js.UndefOr[js.Array[String]] = js.undefined
  var include_chrome_reg_ids: js.UndefOr[js.Array[String]] = js.undefined
  var include_chrome_web_reg_ids: js.UndefOr[js.Array[String]] = js.undefined
  var include_ios_tokens: js.UndefOr[js.Array[String]] = js.undefined
  var include_player_ids: js.UndefOr[js.Array[String]] = js.undefined
  var include_wp_uris: js.UndefOr[js.Array[String]] = js.undefined
  var include_wp_wns_uris: js.UndefOr[js.Array[String]] = js.undefined
  var included_segments: js.UndefOr[js.Array[String]] = js.undefined
  var ios_badgeCount: js.UndefOr[Double] = js.undefined
  var ios_badgeType: js.UndefOr[String] = js.undefined
  var ios_category: js.UndefOr[String] = js.undefined
  var ios_sound: js.UndefOr[String] = js.undefined
  var isAdm: js.UndefOr[Boolean] = js.undefined
  var isAndroid: js.UndefOr[Boolean] = js.undefined
  var isAnyWeb: js.UndefOr[Boolean] = js.undefined
  var isAppInFocus: Boolean
  var isChrome: js.UndefOr[Boolean] = js.undefined
  var isChromeWeb: js.UndefOr[Boolean] = js.undefined
  var isIos: js.UndefOr[Boolean] = js.undefined
  var isSafari: js.UndefOr[Boolean] = js.undefined
  var isWP: js.UndefOr[Boolean] = js.undefined
  var isWP_WNS: js.UndefOr[Boolean] = js.undefined
  var large_icon: js.UndefOr[String] = js.undefined
  var payload: OSNotificationPayload
  var priority: js.UndefOr[Double] = js.undefined
  var send_after: js.UndefOr[String] = js.undefined
  var shown: Boolean
  var small_icon: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[_]] = js.undefined
  var template_id: js.UndefOr[String] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var wp_sound: js.UndefOr[String] = js.undefined
  var wp_wns_sound: js.UndefOr[String] = js.undefined
}

object OSNotification {
  @scala.inline
  def apply(
    contents: js.Any,
    displayType: OSDisplayType,
    isAppInFocus: Boolean,
    payload: OSNotificationPayload,
    shown: Boolean,
    adm_big_picture: String = null,
    adm_group: String = null,
    adm_group_message: js.Any = null,
    adm_large_icon: String = null,
    adm_small_icon: String = null,
    adm_sound: String = null,
    amazon_background_data: js.UndefOr[Boolean] = js.undefined,
    androidNotificationId: js.UndefOr[Double] = js.undefined,
    android_accent_color: String = null,
    android_group: String = null,
    android_group_message: js.Any = null,
    android_led_color: String = null,
    android_sound: String = null,
    android_visibility: js.UndefOr[Double] = js.undefined,
    app_id: String = null,
    app_ids: js.Array[String] = null,
    big_picture: String = null,
    buttons: js.Any = null,
    chrome_big_picture: String = null,
    chrome_icon: String = null,
    chrome_web_icon: String = null,
    content_available: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    delayed_option: String = null,
    delivery_time_of_day: String = null,
    excluded_segments: js.Array[String] = null,
    firefox_icon: String = null,
    groupedNotifications: js.Array[OSNotificationPayload] = null,
    headings: js.Any = null,
    include_amazon_reg_ids: js.Array[String] = null,
    include_android_reg_ids: js.Array[String] = null,
    include_chrome_reg_ids: js.Array[String] = null,
    include_chrome_web_reg_ids: js.Array[String] = null,
    include_ios_tokens: js.Array[String] = null,
    include_player_ids: js.Array[String] = null,
    include_wp_uris: js.Array[String] = null,
    include_wp_wns_uris: js.Array[String] = null,
    included_segments: js.Array[String] = null,
    ios_badgeCount: js.UndefOr[Double] = js.undefined,
    ios_badgeType: String = null,
    ios_category: String = null,
    ios_sound: String = null,
    isAdm: js.UndefOr[Boolean] = js.undefined,
    isAndroid: js.UndefOr[Boolean] = js.undefined,
    isAnyWeb: js.UndefOr[Boolean] = js.undefined,
    isChrome: js.UndefOr[Boolean] = js.undefined,
    isChromeWeb: js.UndefOr[Boolean] = js.undefined,
    isIos: js.UndefOr[Boolean] = js.undefined,
    isSafari: js.UndefOr[Boolean] = js.undefined,
    isWP: js.UndefOr[Boolean] = js.undefined,
    isWP_WNS: js.UndefOr[Boolean] = js.undefined,
    large_icon: String = null,
    priority: js.UndefOr[Double] = js.undefined,
    send_after: String = null,
    small_icon: String = null,
    tags: js.Array[_] = null,
    template_id: String = null,
    ttl: js.UndefOr[Double] = js.undefined,
    url: String = null,
    wp_sound: String = null,
    wp_wns_sound: String = null
  ): OSNotification = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], isAppInFocus = isAppInFocus.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    if (adm_big_picture != null) __obj.updateDynamic("adm_big_picture")(adm_big_picture.asInstanceOf[js.Any])
    if (adm_group != null) __obj.updateDynamic("adm_group")(adm_group.asInstanceOf[js.Any])
    if (adm_group_message != null) __obj.updateDynamic("adm_group_message")(adm_group_message.asInstanceOf[js.Any])
    if (adm_large_icon != null) __obj.updateDynamic("adm_large_icon")(adm_large_icon.asInstanceOf[js.Any])
    if (adm_small_icon != null) __obj.updateDynamic("adm_small_icon")(adm_small_icon.asInstanceOf[js.Any])
    if (adm_sound != null) __obj.updateDynamic("adm_sound")(adm_sound.asInstanceOf[js.Any])
    if (!js.isUndefined(amazon_background_data)) __obj.updateDynamic("amazon_background_data")(amazon_background_data.get.asInstanceOf[js.Any])
    if (!js.isUndefined(androidNotificationId)) __obj.updateDynamic("androidNotificationId")(androidNotificationId.get.asInstanceOf[js.Any])
    if (android_accent_color != null) __obj.updateDynamic("android_accent_color")(android_accent_color.asInstanceOf[js.Any])
    if (android_group != null) __obj.updateDynamic("android_group")(android_group.asInstanceOf[js.Any])
    if (android_group_message != null) __obj.updateDynamic("android_group_message")(android_group_message.asInstanceOf[js.Any])
    if (android_led_color != null) __obj.updateDynamic("android_led_color")(android_led_color.asInstanceOf[js.Any])
    if (android_sound != null) __obj.updateDynamic("android_sound")(android_sound.asInstanceOf[js.Any])
    if (!js.isUndefined(android_visibility)) __obj.updateDynamic("android_visibility")(android_visibility.get.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (app_ids != null) __obj.updateDynamic("app_ids")(app_ids.asInstanceOf[js.Any])
    if (big_picture != null) __obj.updateDynamic("big_picture")(big_picture.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (chrome_big_picture != null) __obj.updateDynamic("chrome_big_picture")(chrome_big_picture.asInstanceOf[js.Any])
    if (chrome_icon != null) __obj.updateDynamic("chrome_icon")(chrome_icon.asInstanceOf[js.Any])
    if (chrome_web_icon != null) __obj.updateDynamic("chrome_web_icon")(chrome_web_icon.asInstanceOf[js.Any])
    if (!js.isUndefined(content_available)) __obj.updateDynamic("content_available")(content_available.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (delayed_option != null) __obj.updateDynamic("delayed_option")(delayed_option.asInstanceOf[js.Any])
    if (delivery_time_of_day != null) __obj.updateDynamic("delivery_time_of_day")(delivery_time_of_day.asInstanceOf[js.Any])
    if (excluded_segments != null) __obj.updateDynamic("excluded_segments")(excluded_segments.asInstanceOf[js.Any])
    if (firefox_icon != null) __obj.updateDynamic("firefox_icon")(firefox_icon.asInstanceOf[js.Any])
    if (groupedNotifications != null) __obj.updateDynamic("groupedNotifications")(groupedNotifications.asInstanceOf[js.Any])
    if (headings != null) __obj.updateDynamic("headings")(headings.asInstanceOf[js.Any])
    if (include_amazon_reg_ids != null) __obj.updateDynamic("include_amazon_reg_ids")(include_amazon_reg_ids.asInstanceOf[js.Any])
    if (include_android_reg_ids != null) __obj.updateDynamic("include_android_reg_ids")(include_android_reg_ids.asInstanceOf[js.Any])
    if (include_chrome_reg_ids != null) __obj.updateDynamic("include_chrome_reg_ids")(include_chrome_reg_ids.asInstanceOf[js.Any])
    if (include_chrome_web_reg_ids != null) __obj.updateDynamic("include_chrome_web_reg_ids")(include_chrome_web_reg_ids.asInstanceOf[js.Any])
    if (include_ios_tokens != null) __obj.updateDynamic("include_ios_tokens")(include_ios_tokens.asInstanceOf[js.Any])
    if (include_player_ids != null) __obj.updateDynamic("include_player_ids")(include_player_ids.asInstanceOf[js.Any])
    if (include_wp_uris != null) __obj.updateDynamic("include_wp_uris")(include_wp_uris.asInstanceOf[js.Any])
    if (include_wp_wns_uris != null) __obj.updateDynamic("include_wp_wns_uris")(include_wp_wns_uris.asInstanceOf[js.Any])
    if (included_segments != null) __obj.updateDynamic("included_segments")(included_segments.asInstanceOf[js.Any])
    if (!js.isUndefined(ios_badgeCount)) __obj.updateDynamic("ios_badgeCount")(ios_badgeCount.get.asInstanceOf[js.Any])
    if (ios_badgeType != null) __obj.updateDynamic("ios_badgeType")(ios_badgeType.asInstanceOf[js.Any])
    if (ios_category != null) __obj.updateDynamic("ios_category")(ios_category.asInstanceOf[js.Any])
    if (ios_sound != null) __obj.updateDynamic("ios_sound")(ios_sound.asInstanceOf[js.Any])
    if (!js.isUndefined(isAdm)) __obj.updateDynamic("isAdm")(isAdm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isAndroid)) __obj.updateDynamic("isAndroid")(isAndroid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnyWeb)) __obj.updateDynamic("isAnyWeb")(isAnyWeb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isChrome)) __obj.updateDynamic("isChrome")(isChrome.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isChromeWeb)) __obj.updateDynamic("isChromeWeb")(isChromeWeb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isIos)) __obj.updateDynamic("isIos")(isIos.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSafari)) __obj.updateDynamic("isSafari")(isSafari.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isWP)) __obj.updateDynamic("isWP")(isWP.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isWP_WNS)) __obj.updateDynamic("isWP_WNS")(isWP_WNS.get.asInstanceOf[js.Any])
    if (large_icon != null) __obj.updateDynamic("large_icon")(large_icon.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (send_after != null) __obj.updateDynamic("send_after")(send_after.asInstanceOf[js.Any])
    if (small_icon != null) __obj.updateDynamic("small_icon")(small_icon.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (template_id != null) __obj.updateDynamic("template_id")(template_id.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (wp_sound != null) __obj.updateDynamic("wp_sound")(wp_sound.asInstanceOf[js.Any])
    if (wp_wns_sound != null) __obj.updateDynamic("wp_wns_sound")(wp_wns_sound.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSNotification]
  }
}

