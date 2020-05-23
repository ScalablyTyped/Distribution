package typings.openfin.directoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends js.Object {
  /**
    * The Application Identifier. Please see https://fdc3.finos.org/docs/1.0/appd-discovery#application-identifier.
    * By convention this should be the same as your [OpenFin UUID](https://developers.openfin.co/docs/application-configuration).
    *
    * If you can't use your OpenFin UUID as the appId, then instead specify your application's UUID by adding an
    * `appUuid` property to the [[customConfig]] field.
    */
  var appId: AppId
  /**
    * Contact email address.
    */
  var contactEmail: js.UndefOr[String] = js.undefined
  /**
    * Additional config.
    *
    * The OpenFin FDC3 service supports the following configuration values:
    * * `appUuid`: Informs the service that the application launched by this [[manifest]] will have this UUID. By
    * default, the service will expect the UUID of the application to match the [[appId]]. This configuration value
    * can be used to override this.
    *
    * Any additional fields will still be accessible to applications (via APIs such as [[findIntent]]), but will not
    * have any impact on the operation of the service.
    */
  var customConfig: js.UndefOr[js.Array[NameValuePair]] = js.undefined
  /**
    * Longer description of the app.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Icons used in the app directory display. A launcher may be able to use various sizes.
    */
  var icons: js.UndefOr[js.Array[Icon]] = js.undefined
  /**
    * Images that can be displayed as part of the app directory entry. Use these for screenshots, previews or similar. These are not the
    * application icons - use [[icons]] for that.
    */
  var images: js.UndefOr[js.Array[AppImage]] = js.undefined
  /**
    * The set of intents associated with this application directory entry.
    */
  var intents: js.UndefOr[js.Array[AppDirIntent]] = js.undefined
  /**
    * An application manifest, used to launch the app. This should be a URL that points to an OpenFin JSON manifest.
    */
  var manifest: String
  /**
    * The manifest type. Always `'openfin'`.
    */
  var manifestType: String
  /**
    * The machine-readable app name, used to identify the application in various API calls to the application directory.
    * This may well be human-readable, too. If it's not, you can provide a title, and that will be used everywhere
    * a name needs to be rendered to a user.
    */
  var name: AppName
  /**
    * Name of the publishing company, organization, or individual.
    */
  var publisher: js.UndefOr[String] = js.undefined
  /**
    * The email address to send your support requests to.
    */
  var supportEmail: js.UndefOr[String] = js.undefined
  /**
    * The human-readable title of the app, typically used by the launcher UI. If not provided, [[name]] is used.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * A short explanatory text string. For use in tooltips shown by any UIs that display app information.
    */
  var tooltip: js.UndefOr[String] = js.undefined
  /**
    * The version of the app. Please use [semantic versioning](https://semver.org/).
    */
  var version: js.UndefOr[String] = js.undefined
}

object Application {
  @scala.inline
  def apply(
    appId: AppId,
    manifest: String,
    manifestType: String,
    name: AppName,
    contactEmail: String = null,
    customConfig: js.Array[NameValuePair] = null,
    description: String = null,
    icons: js.Array[Icon] = null,
    images: js.Array[AppImage] = null,
    intents: js.Array[AppDirIntent] = null,
    publisher: String = null,
    supportEmail: String = null,
    title: String = null,
    tooltip: String = null,
    version: String = null
  ): Application = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], manifestType = manifestType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (contactEmail != null) __obj.updateDynamic("contactEmail")(contactEmail.asInstanceOf[js.Any])
    if (customConfig != null) __obj.updateDynamic("customConfig")(customConfig.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (supportEmail != null) __obj.updateDynamic("supportEmail")(supportEmail.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
}

