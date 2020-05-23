package typings.mobileMessagingCordova.MobileMessagingCordova

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Installation extends js.Object {
  var appVersion: js.UndefOr[String] = js.undefined
  var applicationUserId: js.UndefOr[String] = js.undefined
  var customAttributes: js.UndefOr[Record[String, String]] = js.undefined
  var deviceManufacturer: js.UndefOr[String] = js.undefined
  var deviceModel: js.UndefOr[String] = js.undefined
  var deviceName: js.UndefOr[String] = js.undefined
  var deviceSecure: js.UndefOr[Boolean] = js.undefined
  var deviceTimezoneId: js.UndefOr[String] = js.undefined
  var geoEnabled: js.UndefOr[Boolean] = js.undefined
  var isPrimaryDevice: js.UndefOr[Boolean] = js.undefined
  var isPushRegistrationEnabled: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var notificationsEnabled: js.UndefOr[Boolean] = js.undefined
  var os: js.UndefOr[OS] = js.undefined
  var osVersion: String
  var sdkVersion: js.UndefOr[String] = js.undefined
}

object Installation {
  @scala.inline
  def apply(
    osVersion: String,
    appVersion: String = null,
    applicationUserId: String = null,
    customAttributes: Record[String, String] = null,
    deviceManufacturer: String = null,
    deviceModel: String = null,
    deviceName: String = null,
    deviceSecure: js.UndefOr[Boolean] = js.undefined,
    deviceTimezoneId: String = null,
    geoEnabled: js.UndefOr[Boolean] = js.undefined,
    isPrimaryDevice: js.UndefOr[Boolean] = js.undefined,
    isPushRegistrationEnabled: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    notificationsEnabled: js.UndefOr[Boolean] = js.undefined,
    os: OS = null,
    sdkVersion: String = null
  ): Installation = {
    val __obj = js.Dynamic.literal(osVersion = osVersion.asInstanceOf[js.Any])
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion.asInstanceOf[js.Any])
    if (applicationUserId != null) __obj.updateDynamic("applicationUserId")(applicationUserId.asInstanceOf[js.Any])
    if (customAttributes != null) __obj.updateDynamic("customAttributes")(customAttributes.asInstanceOf[js.Any])
    if (deviceManufacturer != null) __obj.updateDynamic("deviceManufacturer")(deviceManufacturer.asInstanceOf[js.Any])
    if (deviceModel != null) __obj.updateDynamic("deviceModel")(deviceModel.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceSecure)) __obj.updateDynamic("deviceSecure")(deviceSecure.get.asInstanceOf[js.Any])
    if (deviceTimezoneId != null) __obj.updateDynamic("deviceTimezoneId")(deviceTimezoneId.asInstanceOf[js.Any])
    if (!js.isUndefined(geoEnabled)) __obj.updateDynamic("geoEnabled")(geoEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrimaryDevice)) __obj.updateDynamic("isPrimaryDevice")(isPrimaryDevice.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPushRegistrationEnabled)) __obj.updateDynamic("isPushRegistrationEnabled")(isPushRegistrationEnabled.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(notificationsEnabled)) __obj.updateDynamic("notificationsEnabled")(notificationsEnabled.get.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    if (sdkVersion != null) __obj.updateDynamic("sdkVersion")(sdkVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Installation]
  }
}

