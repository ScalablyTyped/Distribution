package typings.next

import typings.next.anon.OmitEventCliSessionStarte
import typings.next.anon.PayloadEventCliSessionStarted
import typings.next.distServerConfigSharedMod.NextConfigComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryEventsVersionMod {
  
  @JSImport("next/dist/telemetry/events/version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventCliSession(dir: String, nextConfig: NextConfigComplete, event: OmitEventCliSessionStarte): js.Array[PayloadEventCliSessionStarted] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventCliSession")(dir.asInstanceOf[js.Any], nextConfig.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Array[PayloadEventCliSessionStarted]]
  
  trait EventCliSessionStarted extends StObject {
    
    var basePathEnabled: Boolean
    
    var buildTarget: String
    
    var cliCommand: String
    
    var hasBabelConfig: Boolean
    
    var hasNextConfig: Boolean
    
    var hasNowJson: Boolean
    
    var hasWebpackConfig: Boolean
    
    var i18nEnabled: Boolean
    
    var imageDomainsCount: Double | Null
    
    var imageEnabled: Boolean
    
    var imageFormats: String | Null
    
    var imageFutureEnabled: Boolean
    
    var imageLoader: String | Null
    
    var imageRemotePatternsCount: Double | Null
    
    var imageSizes: String | Null
    
    var isCustomServer: Boolean | Null
    
    var isSrcDir: Boolean | Null
    
    var localeDetectionEnabled: Boolean | Null
    
    var localeDomainsCount: Double | Null
    
    var locales: String | Null
    
    var nextVersion: String
    
    var nodeVersion: String
    
    var reactStrictMode: Boolean
    
    var trailingSlashEnabled: Boolean
    
    var turboFlag: Boolean
    
    var webpackVersion: Double | Null
  }
  object EventCliSessionStarted {
    
    inline def apply(
      basePathEnabled: Boolean,
      buildTarget: String,
      cliCommand: String,
      hasBabelConfig: Boolean,
      hasNextConfig: Boolean,
      hasNowJson: Boolean,
      hasWebpackConfig: Boolean,
      i18nEnabled: Boolean,
      imageEnabled: Boolean,
      imageFutureEnabled: Boolean,
      nextVersion: String,
      nodeVersion: String,
      reactStrictMode: Boolean,
      trailingSlashEnabled: Boolean,
      turboFlag: Boolean
    ): EventCliSessionStarted = {
      val __obj = js.Dynamic.literal(basePathEnabled = basePathEnabled.asInstanceOf[js.Any], buildTarget = buildTarget.asInstanceOf[js.Any], cliCommand = cliCommand.asInstanceOf[js.Any], hasBabelConfig = hasBabelConfig.asInstanceOf[js.Any], hasNextConfig = hasNextConfig.asInstanceOf[js.Any], hasNowJson = hasNowJson.asInstanceOf[js.Any], hasWebpackConfig = hasWebpackConfig.asInstanceOf[js.Any], i18nEnabled = i18nEnabled.asInstanceOf[js.Any], imageEnabled = imageEnabled.asInstanceOf[js.Any], imageFutureEnabled = imageFutureEnabled.asInstanceOf[js.Any], nextVersion = nextVersion.asInstanceOf[js.Any], nodeVersion = nodeVersion.asInstanceOf[js.Any], reactStrictMode = reactStrictMode.asInstanceOf[js.Any], trailingSlashEnabled = trailingSlashEnabled.asInstanceOf[js.Any], turboFlag = turboFlag.asInstanceOf[js.Any], imageDomainsCount = null, imageFormats = null, imageLoader = null, imageRemotePatternsCount = null, imageSizes = null, isCustomServer = null, isSrcDir = null, localeDetectionEnabled = null, localeDomainsCount = null, locales = null, webpackVersion = null)
      __obj.asInstanceOf[EventCliSessionStarted]
    }
    
    extension [Self <: EventCliSessionStarted](x: Self) {
      
      inline def setBasePathEnabled(value: Boolean): Self = StObject.set(x, "basePathEnabled", value.asInstanceOf[js.Any])
      
      inline def setBuildTarget(value: String): Self = StObject.set(x, "buildTarget", value.asInstanceOf[js.Any])
      
      inline def setCliCommand(value: String): Self = StObject.set(x, "cliCommand", value.asInstanceOf[js.Any])
      
      inline def setHasBabelConfig(value: Boolean): Self = StObject.set(x, "hasBabelConfig", value.asInstanceOf[js.Any])
      
      inline def setHasNextConfig(value: Boolean): Self = StObject.set(x, "hasNextConfig", value.asInstanceOf[js.Any])
      
      inline def setHasNowJson(value: Boolean): Self = StObject.set(x, "hasNowJson", value.asInstanceOf[js.Any])
      
      inline def setHasWebpackConfig(value: Boolean): Self = StObject.set(x, "hasWebpackConfig", value.asInstanceOf[js.Any])
      
      inline def setI18nEnabled(value: Boolean): Self = StObject.set(x, "i18nEnabled", value.asInstanceOf[js.Any])
      
      inline def setImageDomainsCount(value: Double): Self = StObject.set(x, "imageDomainsCount", value.asInstanceOf[js.Any])
      
      inline def setImageDomainsCountNull: Self = StObject.set(x, "imageDomainsCount", null)
      
      inline def setImageEnabled(value: Boolean): Self = StObject.set(x, "imageEnabled", value.asInstanceOf[js.Any])
      
      inline def setImageFormats(value: String): Self = StObject.set(x, "imageFormats", value.asInstanceOf[js.Any])
      
      inline def setImageFormatsNull: Self = StObject.set(x, "imageFormats", null)
      
      inline def setImageFutureEnabled(value: Boolean): Self = StObject.set(x, "imageFutureEnabled", value.asInstanceOf[js.Any])
      
      inline def setImageLoader(value: String): Self = StObject.set(x, "imageLoader", value.asInstanceOf[js.Any])
      
      inline def setImageLoaderNull: Self = StObject.set(x, "imageLoader", null)
      
      inline def setImageRemotePatternsCount(value: Double): Self = StObject.set(x, "imageRemotePatternsCount", value.asInstanceOf[js.Any])
      
      inline def setImageRemotePatternsCountNull: Self = StObject.set(x, "imageRemotePatternsCount", null)
      
      inline def setImageSizes(value: String): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
      
      inline def setImageSizesNull: Self = StObject.set(x, "imageSizes", null)
      
      inline def setIsCustomServer(value: Boolean): Self = StObject.set(x, "isCustomServer", value.asInstanceOf[js.Any])
      
      inline def setIsCustomServerNull: Self = StObject.set(x, "isCustomServer", null)
      
      inline def setIsSrcDir(value: Boolean): Self = StObject.set(x, "isSrcDir", value.asInstanceOf[js.Any])
      
      inline def setIsSrcDirNull: Self = StObject.set(x, "isSrcDir", null)
      
      inline def setLocaleDetectionEnabled(value: Boolean): Self = StObject.set(x, "localeDetectionEnabled", value.asInstanceOf[js.Any])
      
      inline def setLocaleDetectionEnabledNull: Self = StObject.set(x, "localeDetectionEnabled", null)
      
      inline def setLocaleDomainsCount(value: Double): Self = StObject.set(x, "localeDomainsCount", value.asInstanceOf[js.Any])
      
      inline def setLocaleDomainsCountNull: Self = StObject.set(x, "localeDomainsCount", null)
      
      inline def setLocales(value: String): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesNull: Self = StObject.set(x, "locales", null)
      
      inline def setNextVersion(value: String): Self = StObject.set(x, "nextVersion", value.asInstanceOf[js.Any])
      
      inline def setNodeVersion(value: String): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
      
      inline def setReactStrictMode(value: Boolean): Self = StObject.set(x, "reactStrictMode", value.asInstanceOf[js.Any])
      
      inline def setTrailingSlashEnabled(value: Boolean): Self = StObject.set(x, "trailingSlashEnabled", value.asInstanceOf[js.Any])
      
      inline def setTurboFlag(value: Boolean): Self = StObject.set(x, "turboFlag", value.asInstanceOf[js.Any])
      
      inline def setWebpackVersion(value: Double): Self = StObject.set(x, "webpackVersion", value.asInstanceOf[js.Any])
      
      inline def setWebpackVersionNull: Self = StObject.set(x, "webpackVersion", null)
    }
  }
}
