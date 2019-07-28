package typings.naverDashWhale.whaleNs.managementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionInfo extends js.Object {
  /** Optional. The launch url (only present for apps). */
  var appLaunchUrl: js.UndefOr[String] = js.undefined
  /**
    * Optional.
    * The currently available launch types (only present for apps).
    * @since Chrome 37.
    */
  var availableLaunchTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The description of this extension, app, or theme.
    * @since Chrome 9.
    */
  var description: String
  /**
    * Optional.
    * A reason the item is disabled.
    * @since Chrome 17.
    */
  var disabledReason: js.UndefOr[String] = js.undefined
  /** Whether it is currently enabled or disabled. */
  var enabled: Boolean
  /**
    * Optional.
    * The URL of the homepage of this extension, app, or theme.
    * @since Chrome 11.
    */
  var homepageUrl: js.UndefOr[String] = js.undefined
  /**
    * Returns a list of host based permissions.
    * @since Chrome 9.
    */
  var hostPermissions: js.Array[String]
  /**
    * Optional.
    * A list of icon information. Note that this just reflects what was declared in the manifest, and the actual image at that url may be larger or smaller than what was declared, so you might consider using explicit width and height attributes on img tags referencing these images. See the manifest documentation on icons for more details.
    */
  var icons: js.UndefOr[js.Array[typings.chrome.chromeNs.managementNs.IconInfo]] = js.undefined
  /** The extension's unique identifier. */
  var id: String
  /**
    * How the extension was installed.
    * @since Chrome 22.
    */
  var installType: String
  /**
    * True if this is an app.
    * @deprecated since Chrome 33. Please use management.ExtensionInfo.type.
    */
  var isApp: Boolean
  /**
    * Optional.
    * The app launch type (only present for apps).
    * @since Chrome 37.
    */
  var launchType: js.UndefOr[String] = js.undefined
  /**
    * Whether this extension can be disabled or uninstalled by the user.
    * @since Chrome 12.
    */
  var mayDisable: Boolean
  /** The name of this extension, app, or theme. */
  var name: String
  /**
    * Whether the extension, app, or theme declares that it supports offline.
    * @since Chrome 15.
    */
  var offlineEnabled: Boolean
  /** The url for the item's options page, if it has one. */
  var optionsUrl: String
  /**
    * Returns a list of API based permissions.
    * @since Chrome 9.
    */
  var permissions: js.Array[String]
  /**
    * A short version of the name of this extension, app, or theme.
    * @since Chrome 31.
    */
  var shortName: String
  /**
    * The type of this extension, app, or theme.
    * @since Chrome 23.
    */
  var `type`: String
  /**
    * Optional.
    * The update URL of this extension, app, or theme.
    * @since Chrome 16.
    */
  var updateUrl: js.UndefOr[String] = js.undefined
  /** The version of this extension, app, or theme. */
  var version: String
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
    version: String,
    appLaunchUrl: String = null,
    availableLaunchTypes: js.Array[String] = null,
    disabledReason: String = null,
    homepageUrl: String = null,
    icons: js.Array[typings.chrome.chromeNs.managementNs.IconInfo] = null,
    launchType: String = null,
    updateUrl: String = null
  ): ExtensionInfo = {
    val __obj = js.Dynamic.literal(description = description, enabled = enabled, hostPermissions = hostPermissions, id = id, installType = installType, isApp = isApp, mayDisable = mayDisable, name = name, offlineEnabled = offlineEnabled, optionsUrl = optionsUrl, permissions = permissions, shortName = shortName, version = version)
    __obj.updateDynamic("type")(`type`)
    if (appLaunchUrl != null) __obj.updateDynamic("appLaunchUrl")(appLaunchUrl)
    if (availableLaunchTypes != null) __obj.updateDynamic("availableLaunchTypes")(availableLaunchTypes)
    if (disabledReason != null) __obj.updateDynamic("disabledReason")(disabledReason)
    if (homepageUrl != null) __obj.updateDynamic("homepageUrl")(homepageUrl)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (launchType != null) __obj.updateDynamic("launchType")(launchType)
    if (updateUrl != null) __obj.updateDynamic("updateUrl")(updateUrl)
    __obj.asInstanceOf[ExtensionInfo]
  }
}

