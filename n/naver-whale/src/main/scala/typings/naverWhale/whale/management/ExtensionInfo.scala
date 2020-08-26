package typings.naverWhale.whale.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionInfo extends js.Object {
  /** Optional. The launch url (only present for apps). */
  var appLaunchUrl: js.UndefOr[String] = js.native
  /**
    * Optional.
    * The currently available launch types (only present for apps).
    * @since Chrome 37.
    */
  var availableLaunchTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The description of this extension, app, or theme.
    * @since Chrome 9.
    */
  var description: String = js.native
  /**
    * Optional.
    * A reason the item is disabled.
    * @since Chrome 17.
    */
  var disabledReason: js.UndefOr[String] = js.native
  /** Whether it is currently enabled or disabled. */
  var enabled: Boolean = js.native
  /**
    * Optional.
    * The URL of the homepage of this extension, app, or theme.
    * @since Chrome 11.
    */
  var homepageUrl: js.UndefOr[String] = js.native
  /**
    * Returns a list of host based permissions.
    * @since Chrome 9.
    */
  var hostPermissions: js.Array[String] = js.native
  /**
    * Optional.
    * A list of icon information. Note that this just reflects what was declared in the manifest, and the actual image at that url may be larger or smaller than what was declared, so you might consider using explicit width and height attributes on img tags referencing these images. See the manifest documentation on icons for more details.
    */
  var icons: js.UndefOr[js.Array[typings.chrome.chrome.management.IconInfo]] = js.native
  /** The extension's unique identifier. */
  var id: String = js.native
  /**
    * How the extension was installed.
    * @since Chrome 22.
    */
  var installType: String = js.native
  /**
    * True if this is an app.
    * @deprecated since Chrome 33. Please use management.ExtensionInfo.type.
    */
  var isApp: Boolean = js.native
  /**
    * Optional.
    * The app launch type (only present for apps).
    * @since Chrome 37.
    */
  var launchType: js.UndefOr[String] = js.native
  /**
    * Whether this extension can be disabled or uninstalled by the user.
    * @since Chrome 12.
    */
  var mayDisable: Boolean = js.native
  /** The name of this extension, app, or theme. */
  var name: String = js.native
  /**
    * Whether the extension, app, or theme declares that it supports offline.
    * @since Chrome 15.
    */
  var offlineEnabled: Boolean = js.native
  /** The url for the item's options page, if it has one. */
  var optionsUrl: String = js.native
  /**
    * Returns a list of API based permissions.
    * @since Chrome 9.
    */
  var permissions: js.Array[String] = js.native
  /**
    * A short version of the name of this extension, app, or theme.
    * @since Chrome 31.
    */
  var shortName: String = js.native
  /**
    * The type of this extension, app, or theme.
    * @since Chrome 23.
    */
  var `type`: String = js.native
  /**
    * Optional.
    * The update URL of this extension, app, or theme.
    * @since Chrome 16.
    */
  var updateUrl: js.UndefOr[String] = js.native
  /** The version of this extension, app, or theme. */
  var version: String = js.native
}

object ExtensionInfo {
  @scala.inline
  def apply(
    description: String,
    enabled: Boolean,
    hostPermissions: js.Array[String],
    id: String,
    installType: String,
    isApp: Boolean,
    mayDisable: Boolean,
    name: String,
    offlineEnabled: Boolean,
    optionsUrl: String,
    permissions: js.Array[String],
    shortName: String,
    `type`: String,
    version: String
  ): ExtensionInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hostPermissions = hostPermissions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installType = installType.asInstanceOf[js.Any], isApp = isApp.asInstanceOf[js.Any], mayDisable = mayDisable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offlineEnabled = offlineEnabled.asInstanceOf[js.Any], optionsUrl = optionsUrl.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionInfo]
  }
  @scala.inline
  implicit class ExtensionInfoOps[Self <: ExtensionInfo] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostPermissionsVarargs(value: String*): Self = this.set("hostPermissions", js.Array(value :_*))
    @scala.inline
    def setHostPermissions(value: js.Array[String]): Self = this.set("hostPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstallType(value: String): Self = this.set("installType", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsApp(value: Boolean): Self = this.set("isApp", value.asInstanceOf[js.Any])
    @scala.inline
    def setMayDisable(value: Boolean): Self = this.set("mayDisable", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfflineEnabled(value: Boolean): Self = this.set("offlineEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsUrl(value: String): Self = this.set("optionsUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppLaunchUrl(value: String): Self = this.set("appLaunchUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppLaunchUrl: Self = this.set("appLaunchUrl", js.undefined)
    @scala.inline
    def setAvailableLaunchTypesVarargs(value: String*): Self = this.set("availableLaunchTypes", js.Array(value :_*))
    @scala.inline
    def setAvailableLaunchTypes(value: js.Array[String]): Self = this.set("availableLaunchTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableLaunchTypes: Self = this.set("availableLaunchTypes", js.undefined)
    @scala.inline
    def setDisabledReason(value: String): Self = this.set("disabledReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledReason: Self = this.set("disabledReason", js.undefined)
    @scala.inline
    def setHomepageUrl(value: String): Self = this.set("homepageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomepageUrl: Self = this.set("homepageUrl", js.undefined)
    @scala.inline
    def setIconsVarargs(value: typings.chrome.chrome.management.IconInfo*): Self = this.set("icons", js.Array(value :_*))
    @scala.inline
    def setIcons(value: js.Array[typings.chrome.chrome.management.IconInfo]): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setLaunchType(value: String): Self = this.set("launchType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchType: Self = this.set("launchType", js.undefined)
    @scala.inline
    def setUpdateUrl(value: String): Self = this.set("updateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateUrl: Self = this.set("updateUrl", js.undefined)
  }
  
}

