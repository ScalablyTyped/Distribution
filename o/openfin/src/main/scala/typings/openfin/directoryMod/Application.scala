package typings.openfin.directoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends js.Object {
  /**
    * The Application Identifier. Please see https://fdc3.finos.org/docs/1.0/appd-discovery#application-identifier.
    * By convention this should be the same as your [OpenFin UUID](https://developers.openfin.co/docs/application-configuration).
    *
    * If you can't use your OpenFin UUID as the appId, then instead specify your application's UUID by adding an
    * `appUuid` property to the [[customConfig]] field.
    */
  var appId: AppId = js.native
  /**
    * Contact email address.
    */
  var contactEmail: js.UndefOr[String] = js.native
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
  var customConfig: js.UndefOr[js.Array[NameValuePair]] = js.native
  /**
    * Longer description of the app.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Icons used in the app directory display. A launcher may be able to use various sizes.
    */
  var icons: js.UndefOr[js.Array[Icon]] = js.native
  /**
    * Images that can be displayed as part of the app directory entry. Use these for screenshots, previews or similar. These are not the
    * application icons - use [[icons]] for that.
    */
  var images: js.UndefOr[js.Array[AppImage]] = js.native
  /**
    * The set of intents associated with this application directory entry.
    */
  var intents: js.UndefOr[js.Array[AppDirIntent]] = js.native
  /**
    * An application manifest, used to launch the app. This should be a URL that points to an OpenFin JSON manifest.
    */
  var manifest: String = js.native
  /**
    * The manifest type. Always `'openfin'`.
    */
  var manifestType: String = js.native
  /**
    * The machine-readable app name, used to identify the application in various API calls to the application directory.
    * This may well be human-readable, too. If it's not, you can provide a title, and that will be used everywhere
    * a name needs to be rendered to a user.
    */
  var name: AppName = js.native
  /**
    * Name of the publishing company, organization, or individual.
    */
  var publisher: js.UndefOr[String] = js.native
  /**
    * The email address to send your support requests to.
    */
  var supportEmail: js.UndefOr[String] = js.native
  /**
    * The human-readable title of the app, typically used by the launcher UI. If not provided, [[name]] is used.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * A short explanatory text string. For use in tooltips shown by any UIs that display app information.
    */
  var tooltip: js.UndefOr[String] = js.native
  /**
    * The version of the app. Please use [semantic versioning](https://semver.org/).
    */
  var version: js.UndefOr[String] = js.native
}

object Application {
  @scala.inline
  def apply(appId: AppId, manifest: String, manifestType: String, name: AppName): Application = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], manifestType = manifestType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
  @scala.inline
  implicit class ApplicationOps[Self <: Application] (val x: Self) extends AnyVal {
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
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setManifest(value: String): Self = this.set("manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def setManifestType(value: String): Self = this.set("manifestType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: AppName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setContactEmail(value: String): Self = this.set("contactEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactEmail: Self = this.set("contactEmail", js.undefined)
    @scala.inline
    def setCustomConfigVarargs(value: NameValuePair*): Self = this.set("customConfig", js.Array(value :_*))
    @scala.inline
    def setCustomConfig(value: js.Array[NameValuePair]): Self = this.set("customConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomConfig: Self = this.set("customConfig", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIconsVarargs(value: Icon*): Self = this.set("icons", js.Array(value :_*))
    @scala.inline
    def setIcons(value: js.Array[Icon]): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setImagesVarargs(value: AppImage*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[AppImage]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setIntentsVarargs(value: AppDirIntent*): Self = this.set("intents", js.Array(value :_*))
    @scala.inline
    def setIntents(value: js.Array[AppDirIntent]): Self = this.set("intents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntents: Self = this.set("intents", js.undefined)
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    @scala.inline
    def setSupportEmail(value: String): Self = this.set("supportEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportEmail: Self = this.set("supportEmail", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

