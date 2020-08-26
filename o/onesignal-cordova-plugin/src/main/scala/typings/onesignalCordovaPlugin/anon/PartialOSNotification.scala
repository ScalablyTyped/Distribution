package typings.onesignalCordovaPlugin.anon

import typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSDisplayType
import typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSNotificationPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<onesignal-cordova-plugin.OneSignalCordovaPlugin.OSNotification> */
@js.native
trait PartialOSNotification extends js.Object {
  var adm_big_picture: js.UndefOr[String] = js.native
  var adm_group: js.UndefOr[String] = js.native
  var adm_group_message: js.UndefOr[js.Any] = js.native
  var adm_large_icon: js.UndefOr[String] = js.native
  var adm_small_icon: js.UndefOr[String] = js.native
  var adm_sound: js.UndefOr[String] = js.native
  var amazon_background_data: js.UndefOr[Boolean] = js.native
  var androidNotificationId: js.UndefOr[Double] = js.native
  var android_accent_color: js.UndefOr[String] = js.native
  var android_group: js.UndefOr[String] = js.native
  var android_group_message: js.UndefOr[js.Any] = js.native
  var android_led_color: js.UndefOr[String] = js.native
  var android_sound: js.UndefOr[String] = js.native
  var android_visibility: js.UndefOr[Double] = js.native
  var app_id: js.UndefOr[String] = js.native
  var app_ids: js.UndefOr[js.Array[String]] = js.native
  var big_picture: js.UndefOr[String] = js.native
  var buttons: js.UndefOr[js.Any] = js.native
  var chrome_big_picture: js.UndefOr[String] = js.native
  var chrome_icon: js.UndefOr[String] = js.native
  var chrome_web_icon: js.UndefOr[String] = js.native
  var content_available: js.UndefOr[Boolean] = js.native
  var contents: js.UndefOr[js.Any] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var delayed_option: js.UndefOr[String] = js.native
  var delivery_time_of_day: js.UndefOr[String] = js.native
  var displayType: js.UndefOr[OSDisplayType] = js.native
  var excluded_segments: js.UndefOr[js.Array[String]] = js.native
  var firefox_icon: js.UndefOr[String] = js.native
  var groupedNotifications: js.UndefOr[js.Array[OSNotificationPayload]] = js.native
  var headings: js.UndefOr[js.Any] = js.native
  var include_amazon_reg_ids: js.UndefOr[js.Array[String]] = js.native
  var include_android_reg_ids: js.UndefOr[js.Array[String]] = js.native
  var include_chrome_reg_ids: js.UndefOr[js.Array[String]] = js.native
  var include_chrome_web_reg_ids: js.UndefOr[js.Array[String]] = js.native
  var include_ios_tokens: js.UndefOr[js.Array[String]] = js.native
  var include_player_ids: js.UndefOr[js.Array[String]] = js.native
  var include_wp_uris: js.UndefOr[js.Array[String]] = js.native
  var include_wp_wns_uris: js.UndefOr[js.Array[String]] = js.native
  var included_segments: js.UndefOr[js.Array[String]] = js.native
  var ios_badgeCount: js.UndefOr[Double] = js.native
  var ios_badgeType: js.UndefOr[String] = js.native
  var ios_category: js.UndefOr[String] = js.native
  var ios_sound: js.UndefOr[String] = js.native
  var isAdm: js.UndefOr[Boolean] = js.native
  var isAndroid: js.UndefOr[Boolean] = js.native
  var isAnyWeb: js.UndefOr[Boolean] = js.native
  var isAppInFocus: js.UndefOr[Boolean] = js.native
  var isChrome: js.UndefOr[Boolean] = js.native
  var isChromeWeb: js.UndefOr[Boolean] = js.native
  var isIos: js.UndefOr[Boolean] = js.native
  var isSafari: js.UndefOr[Boolean] = js.native
  var isWP: js.UndefOr[Boolean] = js.native
  var isWP_WNS: js.UndefOr[Boolean] = js.native
  var large_icon: js.UndefOr[String] = js.native
  var payload: js.UndefOr[OSNotificationPayload] = js.native
  var priority: js.UndefOr[Double] = js.native
  var send_after: js.UndefOr[String] = js.native
  var shown: js.UndefOr[Boolean] = js.native
  var small_icon: js.UndefOr[String] = js.native
  var tags: js.UndefOr[js.Array[_]] = js.native
  var template_id: js.UndefOr[String] = js.native
  var ttl: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
  var wp_sound: js.UndefOr[String] = js.native
  var wp_wns_sound: js.UndefOr[String] = js.native
}

object PartialOSNotification {
  @scala.inline
  def apply(): PartialOSNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOSNotification]
  }
  @scala.inline
  implicit class PartialOSNotificationOps[Self <: PartialOSNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdm_big_picture(value: String): Self = this.set("adm_big_picture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdm_big_picture: Self = this.set("adm_big_picture", js.undefined)
    @scala.inline
    def setAdm_group(value: String): Self = this.set("adm_group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdm_group: Self = this.set("adm_group", js.undefined)
    @scala.inline
    def setAdm_group_message(value: js.Any): Self = this.set("adm_group_message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdm_group_message: Self = this.set("adm_group_message", js.undefined)
    @scala.inline
    def setAdm_large_icon(value: String): Self = this.set("adm_large_icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdm_large_icon: Self = this.set("adm_large_icon", js.undefined)
    @scala.inline
    def setAdm_small_icon(value: String): Self = this.set("adm_small_icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdm_small_icon: Self = this.set("adm_small_icon", js.undefined)
    @scala.inline
    def setAdm_sound(value: String): Self = this.set("adm_sound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdm_sound: Self = this.set("adm_sound", js.undefined)
    @scala.inline
    def setAmazon_background_data(value: Boolean): Self = this.set("amazon_background_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmazon_background_data: Self = this.set("amazon_background_data", js.undefined)
    @scala.inline
    def setAndroidNotificationId(value: Double): Self = this.set("androidNotificationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidNotificationId: Self = this.set("androidNotificationId", js.undefined)
    @scala.inline
    def setAndroid_accent_color(value: String): Self = this.set("android_accent_color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroid_accent_color: Self = this.set("android_accent_color", js.undefined)
    @scala.inline
    def setAndroid_group(value: String): Self = this.set("android_group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroid_group: Self = this.set("android_group", js.undefined)
    @scala.inline
    def setAndroid_group_message(value: js.Any): Self = this.set("android_group_message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroid_group_message: Self = this.set("android_group_message", js.undefined)
    @scala.inline
    def setAndroid_led_color(value: String): Self = this.set("android_led_color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroid_led_color: Self = this.set("android_led_color", js.undefined)
    @scala.inline
    def setAndroid_sound(value: String): Self = this.set("android_sound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroid_sound: Self = this.set("android_sound", js.undefined)
    @scala.inline
    def setAndroid_visibility(value: Double): Self = this.set("android_visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroid_visibility: Self = this.set("android_visibility", js.undefined)
    @scala.inline
    def setApp_id(value: String): Self = this.set("app_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp_id: Self = this.set("app_id", js.undefined)
    @scala.inline
    def setApp_idsVarargs(value: String*): Self = this.set("app_ids", js.Array(value :_*))
    @scala.inline
    def setApp_ids(value: js.Array[String]): Self = this.set("app_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp_ids: Self = this.set("app_ids", js.undefined)
    @scala.inline
    def setBig_picture(value: String): Self = this.set("big_picture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBig_picture: Self = this.set("big_picture", js.undefined)
    @scala.inline
    def setButtons(value: js.Any): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setChrome_big_picture(value: String): Self = this.set("chrome_big_picture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChrome_big_picture: Self = this.set("chrome_big_picture", js.undefined)
    @scala.inline
    def setChrome_icon(value: String): Self = this.set("chrome_icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChrome_icon: Self = this.set("chrome_icon", js.undefined)
    @scala.inline
    def setChrome_web_icon(value: String): Self = this.set("chrome_web_icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChrome_web_icon: Self = this.set("chrome_web_icon", js.undefined)
    @scala.inline
    def setContent_available(value: Boolean): Self = this.set("content_available", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_available: Self = this.set("content_available", js.undefined)
    @scala.inline
    def setContents(value: js.Any): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDelayed_option(value: String): Self = this.set("delayed_option", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayed_option: Self = this.set("delayed_option", js.undefined)
    @scala.inline
    def setDelivery_time_of_day(value: String): Self = this.set("delivery_time_of_day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelivery_time_of_day: Self = this.set("delivery_time_of_day", js.undefined)
    @scala.inline
    def setDisplayType(value: OSDisplayType): Self = this.set("displayType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayType: Self = this.set("displayType", js.undefined)
    @scala.inline
    def setExcluded_segmentsVarargs(value: String*): Self = this.set("excluded_segments", js.Array(value :_*))
    @scala.inline
    def setExcluded_segments(value: js.Array[String]): Self = this.set("excluded_segments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcluded_segments: Self = this.set("excluded_segments", js.undefined)
    @scala.inline
    def setFirefox_icon(value: String): Self = this.set("firefox_icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirefox_icon: Self = this.set("firefox_icon", js.undefined)
    @scala.inline
    def setGroupedNotificationsVarargs(value: OSNotificationPayload*): Self = this.set("groupedNotifications", js.Array(value :_*))
    @scala.inline
    def setGroupedNotifications(value: js.Array[OSNotificationPayload]): Self = this.set("groupedNotifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupedNotifications: Self = this.set("groupedNotifications", js.undefined)
    @scala.inline
    def setHeadings(value: js.Any): Self = this.set("headings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadings: Self = this.set("headings", js.undefined)
    @scala.inline
    def setInclude_amazon_reg_idsVarargs(value: String*): Self = this.set("include_amazon_reg_ids", js.Array(value :_*))
    @scala.inline
    def setInclude_amazon_reg_ids(value: js.Array[String]): Self = this.set("include_amazon_reg_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_amazon_reg_ids: Self = this.set("include_amazon_reg_ids", js.undefined)
    @scala.inline
    def setInclude_android_reg_idsVarargs(value: String*): Self = this.set("include_android_reg_ids", js.Array(value :_*))
    @scala.inline
    def setInclude_android_reg_ids(value: js.Array[String]): Self = this.set("include_android_reg_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_android_reg_ids: Self = this.set("include_android_reg_ids", js.undefined)
    @scala.inline
    def setInclude_chrome_reg_idsVarargs(value: String*): Self = this.set("include_chrome_reg_ids", js.Array(value :_*))
    @scala.inline
    def setInclude_chrome_reg_ids(value: js.Array[String]): Self = this.set("include_chrome_reg_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_chrome_reg_ids: Self = this.set("include_chrome_reg_ids", js.undefined)
    @scala.inline
    def setInclude_chrome_web_reg_idsVarargs(value: String*): Self = this.set("include_chrome_web_reg_ids", js.Array(value :_*))
    @scala.inline
    def setInclude_chrome_web_reg_ids(value: js.Array[String]): Self = this.set("include_chrome_web_reg_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_chrome_web_reg_ids: Self = this.set("include_chrome_web_reg_ids", js.undefined)
    @scala.inline
    def setInclude_ios_tokensVarargs(value: String*): Self = this.set("include_ios_tokens", js.Array(value :_*))
    @scala.inline
    def setInclude_ios_tokens(value: js.Array[String]): Self = this.set("include_ios_tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_ios_tokens: Self = this.set("include_ios_tokens", js.undefined)
    @scala.inline
    def setInclude_player_idsVarargs(value: String*): Self = this.set("include_player_ids", js.Array(value :_*))
    @scala.inline
    def setInclude_player_ids(value: js.Array[String]): Self = this.set("include_player_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_player_ids: Self = this.set("include_player_ids", js.undefined)
    @scala.inline
    def setInclude_wp_urisVarargs(value: String*): Self = this.set("include_wp_uris", js.Array(value :_*))
    @scala.inline
    def setInclude_wp_uris(value: js.Array[String]): Self = this.set("include_wp_uris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_wp_uris: Self = this.set("include_wp_uris", js.undefined)
    @scala.inline
    def setInclude_wp_wns_urisVarargs(value: String*): Self = this.set("include_wp_wns_uris", js.Array(value :_*))
    @scala.inline
    def setInclude_wp_wns_uris(value: js.Array[String]): Self = this.set("include_wp_wns_uris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_wp_wns_uris: Self = this.set("include_wp_wns_uris", js.undefined)
    @scala.inline
    def setIncluded_segmentsVarargs(value: String*): Self = this.set("included_segments", js.Array(value :_*))
    @scala.inline
    def setIncluded_segments(value: js.Array[String]): Self = this.set("included_segments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncluded_segments: Self = this.set("included_segments", js.undefined)
    @scala.inline
    def setIos_badgeCount(value: Double): Self = this.set("ios_badgeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIos_badgeCount: Self = this.set("ios_badgeCount", js.undefined)
    @scala.inline
    def setIos_badgeType(value: String): Self = this.set("ios_badgeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIos_badgeType: Self = this.set("ios_badgeType", js.undefined)
    @scala.inline
    def setIos_category(value: String): Self = this.set("ios_category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIos_category: Self = this.set("ios_category", js.undefined)
    @scala.inline
    def setIos_sound(value: String): Self = this.set("ios_sound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIos_sound: Self = this.set("ios_sound", js.undefined)
    @scala.inline
    def setIsAdm(value: Boolean): Self = this.set("isAdm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAdm: Self = this.set("isAdm", js.undefined)
    @scala.inline
    def setIsAndroid(value: Boolean): Self = this.set("isAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAndroid: Self = this.set("isAndroid", js.undefined)
    @scala.inline
    def setIsAnyWeb(value: Boolean): Self = this.set("isAnyWeb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAnyWeb: Self = this.set("isAnyWeb", js.undefined)
    @scala.inline
    def setIsAppInFocus(value: Boolean): Self = this.set("isAppInFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAppInFocus: Self = this.set("isAppInFocus", js.undefined)
    @scala.inline
    def setIsChrome(value: Boolean): Self = this.set("isChrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChrome: Self = this.set("isChrome", js.undefined)
    @scala.inline
    def setIsChromeWeb(value: Boolean): Self = this.set("isChromeWeb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChromeWeb: Self = this.set("isChromeWeb", js.undefined)
    @scala.inline
    def setIsIos(value: Boolean): Self = this.set("isIos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsIos: Self = this.set("isIos", js.undefined)
    @scala.inline
    def setIsSafari(value: Boolean): Self = this.set("isSafari", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSafari: Self = this.set("isSafari", js.undefined)
    @scala.inline
    def setIsWP(value: Boolean): Self = this.set("isWP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsWP: Self = this.set("isWP", js.undefined)
    @scala.inline
    def setIsWP_WNS(value: Boolean): Self = this.set("isWP_WNS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsWP_WNS: Self = this.set("isWP_WNS", js.undefined)
    @scala.inline
    def setLarge_icon(value: String): Self = this.set("large_icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLarge_icon: Self = this.set("large_icon", js.undefined)
    @scala.inline
    def setPayload(value: OSNotificationPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setSend_after(value: String): Self = this.set("send_after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSend_after: Self = this.set("send_after", js.undefined)
    @scala.inline
    def setShown(value: Boolean): Self = this.set("shown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShown: Self = this.set("shown", js.undefined)
    @scala.inline
    def setSmall_icon(value: String): Self = this.set("small_icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmall_icon: Self = this.set("small_icon", js.undefined)
    @scala.inline
    def setTagsVarargs(value: js.Any*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[_]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTemplate_id(value: String): Self = this.set("template_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate_id: Self = this.set("template_id", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWp_sound(value: String): Self = this.set("wp_sound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWp_sound: Self = this.set("wp_sound", js.undefined)
    @scala.inline
    def setWp_wns_sound(value: String): Self = this.set("wp_wns_sound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWp_wns_sound: Self = this.set("wp_wns_sound", js.undefined)
  }
  
}

