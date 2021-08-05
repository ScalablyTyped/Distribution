package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import typings.next.apiUtilsMod.ApiPreviewProps
import typings.next.fontUtilsMod.FontManifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmpOptimizerConfig extends StObject {
  
  var ampOptimizerConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var assetPrefix: js.UndefOr[String] = js.undefined
  
  var basePath: String
  
  var buildId: String
  
  var canonicalBase: String
  
  var customServer: js.UndefOr[Boolean] = js.undefined
  
  var defaultLocale: js.UndefOr[String] = js.undefined
  
  var dev: js.UndefOr[Boolean] = js.undefined
  
  var fontManifest: FontManifest
  
  var generateEtags: Boolean
  
  var images: String
  
  var locale: js.UndefOr[String] = js.undefined
  
  var locales: js.UndefOr[js.Array[String]] = js.undefined
  
  var optimizeFonts: Boolean
  
  var optimizeImages: Boolean
  
  var poweredByHeader: Boolean
  
  var previewProps: ApiPreviewProps
  
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object AmpOptimizerConfig {
  
  inline def apply(
    basePath: String,
    buildId: String,
    canonicalBase: String,
    fontManifest: FontManifest,
    generateEtags: Boolean,
    images: String,
    optimizeFonts: Boolean,
    optimizeImages: Boolean,
    poweredByHeader: Boolean,
    previewProps: ApiPreviewProps
  ): AmpOptimizerConfig = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], fontManifest = fontManifest.asInstanceOf[js.Any], generateEtags = generateEtags.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], optimizeFonts = optimizeFonts.asInstanceOf[js.Any], optimizeImages = optimizeImages.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any], previewProps = previewProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmpOptimizerConfig]
  }
  
  extension [Self <: AmpOptimizerConfig](x: Self) {
    
    inline def setAmpOptimizerConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "ampOptimizerConfig", value.asInstanceOf[js.Any])
    
    inline def setAmpOptimizerConfigUndefined: Self = StObject.set(x, "ampOptimizerConfig", js.undefined)
    
    inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
    
    inline def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setCanonicalBase(value: String): Self = StObject.set(x, "canonicalBase", value.asInstanceOf[js.Any])
    
    inline def setCustomServer(value: Boolean): Self = StObject.set(x, "customServer", value.asInstanceOf[js.Any])
    
    inline def setCustomServerUndefined: Self = StObject.set(x, "customServer", js.undefined)
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
    
    inline def setFontManifest(value: FontManifest): Self = StObject.set(x, "fontManifest", value.asInstanceOf[js.Any])
    
    inline def setFontManifestVarargs(value: Content*): Self = StObject.set(x, "fontManifest", js.Array(value :_*))
    
    inline def setGenerateEtags(value: Boolean): Self = StObject.set(x, "generateEtags", value.asInstanceOf[js.Any])
    
    inline def setImages(value: String): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
    
    inline def setOptimizeFonts(value: Boolean): Self = StObject.set(x, "optimizeFonts", value.asInstanceOf[js.Any])
    
    inline def setOptimizeImages(value: Boolean): Self = StObject.set(x, "optimizeImages", value.asInstanceOf[js.Any])
    
    inline def setPoweredByHeader(value: Boolean): Self = StObject.set(x, "poweredByHeader", value.asInstanceOf[js.Any])
    
    inline def setPreviewProps(value: ApiPreviewProps): Self = StObject.set(x, "previewProps", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfigUndefined: Self = StObject.set(x, "runtimeConfig", js.undefined)
  }
}
