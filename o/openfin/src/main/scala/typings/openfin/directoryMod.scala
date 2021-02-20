package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directoryMod {
  
  @js.native
  trait AppDirIntent extends StObject {
    
    /**
      * The context types that this intent supports. A context type is a namespaced name;
      * examples are given [here](https://fdc3.finos.org/docs/1.0/context-spec).
      */
    var contexts: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Custom configuration for the intent. Currently unused, reserved for future use.
      */
    var customConfig: js.UndefOr[js.Any] = js.native
    
    /**
      * A short, human-readable description of this intent.
      */
    var displayName: js.UndefOr[String] = js.native
    
    /**
      * The intent name.
      */
    var name: String = js.native
  }
  object AppDirIntent {
    
    @scala.inline
    def apply(name: String): AppDirIntent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppDirIntent]
    }
    
    @scala.inline
    implicit class AppDirIntentMutableBuilder[Self <: AppDirIntent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      @scala.inline
      def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value :_*))
      
      @scala.inline
      def setCustomConfig(value: js.Any): Self = StObject.set(x, "customConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomConfigUndefined: Self = StObject.set(x, "customConfig", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type AppId = String
  
  @js.native
  trait AppImage extends StObject {
    
    /**
      * Additional text description.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * Alt text to be displayed with the image.
      */
    var tooltip: js.UndefOr[String] = js.native
    
    /**
      * A URL that points to an image.
      */
    var url: String = js.native
  }
  object AppImage {
    
    @scala.inline
    def apply(url: String): AppImage = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppImage]
    }
    
    @scala.inline
    implicit class AppImageMutableBuilder[Self <: AppImage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type AppName = String
  
  @js.native
  trait Application extends StObject {
    
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
    implicit class ApplicationMutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContactEmail(value: String): Self = StObject.set(x, "contactEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContactEmailUndefined: Self = StObject.set(x, "contactEmail", js.undefined)
      
      @scala.inline
      def setCustomConfig(value: js.Array[NameValuePair]): Self = StObject.set(x, "customConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomConfigUndefined: Self = StObject.set(x, "customConfig", js.undefined)
      
      @scala.inline
      def setCustomConfigVarargs(value: NameValuePair*): Self = StObject.set(x, "customConfig", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIcons(value: js.Array[Icon]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setIconsVarargs(value: Icon*): Self = StObject.set(x, "icons", js.Array(value :_*))
      
      @scala.inline
      def setImages(value: js.Array[AppImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      @scala.inline
      def setImagesVarargs(value: AppImage*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      @scala.inline
      def setIntents(value: js.Array[AppDirIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
      
      @scala.inline
      def setIntentsVarargs(value: AppDirIntent*): Self = StObject.set(x, "intents", js.Array(value :_*))
      
      @scala.inline
      def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestType(value: String): Self = StObject.set(x, "manifestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: AppName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
      
      @scala.inline
      def setSupportEmail(value: String): Self = StObject.set(x, "supportEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportEmailUndefined: Self = StObject.set(x, "supportEmail", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Icon extends StObject {
    
    /**
      * A URL that points to an icon.
      */
    var icon: String = js.native
  }
  object Icon {
    
    @scala.inline
    def apply(icon: String): Icon = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Icon]
    }
    
    @scala.inline
    implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NameValuePair extends StObject {
    
    var name: String = js.native
    
    var value: String = js.native
  }
  object NameValuePair {
    
    @scala.inline
    def apply(name: String, value: String): NameValuePair = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameValuePair]
    }
    
    @scala.inline
    implicit class NameValuePairMutableBuilder[Self <: NameValuePair] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
