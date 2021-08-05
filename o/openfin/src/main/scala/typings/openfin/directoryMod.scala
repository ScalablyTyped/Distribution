package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directoryMod {
  
  trait AppDirIntent extends StObject {
    
    /**
      * The context types that this intent supports. A context type is a namespaced name;
      * examples are given [here](https://fdc3.finos.org/docs/1.0/context-spec).
      */
    var contexts: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Custom configuration for the intent. Currently unused, reserved for future use.
      */
    var customConfig: js.UndefOr[js.Any] = js.undefined
    
    /**
      * A short, human-readable description of this intent.
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * The intent name.
      */
    var name: String
  }
  object AppDirIntent {
    
    inline def apply(name: String): AppDirIntent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppDirIntent]
    }
    
    extension [Self <: AppDirIntent](x: Self) {
      
      inline def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      inline def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value :_*))
      
      inline def setCustomConfig(value: js.Any): Self = StObject.set(x, "customConfig", value.asInstanceOf[js.Any])
      
      inline def setCustomConfigUndefined: Self = StObject.set(x, "customConfig", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type AppId = String
  
  trait AppImage extends StObject {
    
    /**
      * Additional text description.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Alt text to be displayed with the image.
      */
    var tooltip: js.UndefOr[String] = js.undefined
    
    /**
      * A URL that points to an image.
      */
    var url: String
  }
  object AppImage {
    
    inline def apply(url: String): AppImage = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppImage]
    }
    
    extension [Self <: AppImage](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type AppName = String
  
  trait Application extends StObject {
    
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
    
    inline def apply(appId: AppId, manifest: String, manifestType: String, name: AppName): Application = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], manifestType = manifestType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Application]
    }
    
    extension [Self <: Application](x: Self) {
      
      inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setContactEmail(value: String): Self = StObject.set(x, "contactEmail", value.asInstanceOf[js.Any])
      
      inline def setContactEmailUndefined: Self = StObject.set(x, "contactEmail", js.undefined)
      
      inline def setCustomConfig(value: js.Array[NameValuePair]): Self = StObject.set(x, "customConfig", value.asInstanceOf[js.Any])
      
      inline def setCustomConfigUndefined: Self = StObject.set(x, "customConfig", js.undefined)
      
      inline def setCustomConfigVarargs(value: NameValuePair*): Self = StObject.set(x, "customConfig", js.Array(value :_*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIcons(value: js.Array[Icon]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setIconsVarargs(value: Icon*): Self = StObject.set(x, "icons", js.Array(value :_*))
      
      inline def setImages(value: js.Array[AppImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: AppImage*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      inline def setIntents(value: js.Array[AppDirIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
      
      inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
      
      inline def setIntentsVarargs(value: AppDirIntent*): Self = StObject.set(x, "intents", js.Array(value :_*))
      
      inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestType(value: String): Self = StObject.set(x, "manifestType", value.asInstanceOf[js.Any])
      
      inline def setName(value: AppName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
      
      inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
      
      inline def setSupportEmail(value: String): Self = StObject.set(x, "supportEmail", value.asInstanceOf[js.Any])
      
      inline def setSupportEmailUndefined: Self = StObject.set(x, "supportEmail", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Icon extends StObject {
    
    /**
      * A URL that points to an icon.
      */
    var icon: String
  }
  object Icon {
    
    inline def apply(icon: String): Icon = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Icon]
    }
    
    extension [Self <: Icon](x: Self) {
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
  
  trait NameValuePair extends StObject {
    
    var name: String
    
    var value: String
  }
  object NameValuePair {
    
    inline def apply(name: String, value: String): NameValuePair = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameValuePair]
    }
    
    extension [Self <: NameValuePair](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
