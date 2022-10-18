package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import typings.next.distServerApiUtilsMod.ApiPreviewProps
import typings.next.distServerFontUtilsMod.FontConfig
import typings.next.distServerFontUtilsMod.FontManifest
import typings.next.distSharedLibImageConfigMod.ImageConfigComplete
import typings.next.typesMod.ServerRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmpOptimizerConfig extends StObject {
  
  var ampOptimizerConfig: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var assetPrefix: js.UndefOr[String] = js.undefined
  
  var basePath: String
  
  var buildId: String
  
  var canonicalBase: String
  
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  var customServer: js.UndefOr[Boolean] = js.undefined
  
  var defaultLocale: js.UndefOr[String] = js.undefined
  
  var dev: js.UndefOr[Boolean] = js.undefined
  
  var disableOptimizedLoading: js.UndefOr[Boolean] = js.undefined
  
  var distDir: String
  
  var domainLocales: js.UndefOr[js.Array[typings.next.distServerConfigSharedMod.DomainLocale]] = js.undefined
  
  var fontManifest: js.UndefOr[FontManifest] = js.undefined
  
  var generateEtags: Boolean
  
  var images: ImageConfigComplete
  
  var largePageDataBytes: js.UndefOr[Double] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var locales: js.UndefOr[js.Array[String]] = js.undefined
  
  var nextScriptWorkers: Any
  
  var optimizeCss: Any
  
  var optimizeFonts: FontConfig
  
  var poweredByHeader: Boolean
  
  var previewProps: ApiPreviewProps
  
  var renderServerComponentData: js.UndefOr[Boolean] = js.undefined
  
  var runtime: js.UndefOr[ServerRuntime] = js.undefined
  
  var runtimeConfig: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var serverCSSManifest: js.UndefOr[Any] = js.undefined
  
  var serverComponentManifest: js.UndefOr[Any] = js.undefined
  
  var serverComponentProps: js.UndefOr[Any] = js.undefined
  
  var serverComponents: js.UndefOr[Boolean] = js.undefined
  
  var supportsDynamicHTML: js.UndefOr[Boolean] = js.undefined
}
object AmpOptimizerConfig {
  
  inline def apply(
    basePath: String,
    buildId: String,
    canonicalBase: String,
    distDir: String,
    generateEtags: Boolean,
    images: ImageConfigComplete,
    nextScriptWorkers: Any,
    optimizeCss: Any,
    optimizeFonts: FontConfig,
    poweredByHeader: Boolean,
    previewProps: ApiPreviewProps
  ): AmpOptimizerConfig = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], distDir = distDir.asInstanceOf[js.Any], generateEtags = generateEtags.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], nextScriptWorkers = nextScriptWorkers.asInstanceOf[js.Any], optimizeCss = optimizeCss.asInstanceOf[js.Any], optimizeFonts = optimizeFonts.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any], previewProps = previewProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmpOptimizerConfig]
  }
  
  extension [Self <: AmpOptimizerConfig](x: Self) {
    
    inline def setAmpOptimizerConfig(value: StringDictionary[Any]): Self = StObject.set(x, "ampOptimizerConfig", value.asInstanceOf[js.Any])
    
    inline def setAmpOptimizerConfigUndefined: Self = StObject.set(x, "ampOptimizerConfig", js.undefined)
    
    inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
    
    inline def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setCanonicalBase(value: String): Self = StObject.set(x, "canonicalBase", value.asInstanceOf[js.Any])
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setCustomServer(value: Boolean): Self = StObject.set(x, "customServer", value.asInstanceOf[js.Any])
    
    inline def setCustomServerUndefined: Self = StObject.set(x, "customServer", js.undefined)
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
    
    inline def setDisableOptimizedLoading(value: Boolean): Self = StObject.set(x, "disableOptimizedLoading", value.asInstanceOf[js.Any])
    
    inline def setDisableOptimizedLoadingUndefined: Self = StObject.set(x, "disableOptimizedLoading", js.undefined)
    
    inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setDomainLocales(value: js.Array[typings.next.distServerConfigSharedMod.DomainLocale]): Self = StObject.set(x, "domainLocales", value.asInstanceOf[js.Any])
    
    inline def setDomainLocalesUndefined: Self = StObject.set(x, "domainLocales", js.undefined)
    
    inline def setDomainLocalesVarargs(value: typings.next.distServerConfigSharedMod.DomainLocale*): Self = StObject.set(x, "domainLocales", js.Array(value*))
    
    inline def setFontManifest(value: FontManifest): Self = StObject.set(x, "fontManifest", value.asInstanceOf[js.Any])
    
    inline def setFontManifestUndefined: Self = StObject.set(x, "fontManifest", js.undefined)
    
    inline def setFontManifestVarargs(value: Content*): Self = StObject.set(x, "fontManifest", js.Array(value*))
    
    inline def setGenerateEtags(value: Boolean): Self = StObject.set(x, "generateEtags", value.asInstanceOf[js.Any])
    
    inline def setImages(value: ImageConfigComplete): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setLargePageDataBytes(value: Double): Self = StObject.set(x, "largePageDataBytes", value.asInstanceOf[js.Any])
    
    inline def setLargePageDataBytesUndefined: Self = StObject.set(x, "largePageDataBytes", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
    
    inline def setNextScriptWorkers(value: Any): Self = StObject.set(x, "nextScriptWorkers", value.asInstanceOf[js.Any])
    
    inline def setOptimizeCss(value: Any): Self = StObject.set(x, "optimizeCss", value.asInstanceOf[js.Any])
    
    inline def setOptimizeFonts(value: FontConfig): Self = StObject.set(x, "optimizeFonts", value.asInstanceOf[js.Any])
    
    inline def setPoweredByHeader(value: Boolean): Self = StObject.set(x, "poweredByHeader", value.asInstanceOf[js.Any])
    
    inline def setPreviewProps(value: ApiPreviewProps): Self = StObject.set(x, "previewProps", value.asInstanceOf[js.Any])
    
    inline def setRenderServerComponentData(value: Boolean): Self = StObject.set(x, "renderServerComponentData", value.asInstanceOf[js.Any])
    
    inline def setRenderServerComponentDataUndefined: Self = StObject.set(x, "renderServerComponentData", js.undefined)
    
    inline def setRuntime(value: ServerRuntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfig(value: StringDictionary[Any]): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfigUndefined: Self = StObject.set(x, "runtimeConfig", js.undefined)
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setServerCSSManifest(value: Any): Self = StObject.set(x, "serverCSSManifest", value.asInstanceOf[js.Any])
    
    inline def setServerCSSManifestUndefined: Self = StObject.set(x, "serverCSSManifest", js.undefined)
    
    inline def setServerComponentManifest(value: Any): Self = StObject.set(x, "serverComponentManifest", value.asInstanceOf[js.Any])
    
    inline def setServerComponentManifestUndefined: Self = StObject.set(x, "serverComponentManifest", js.undefined)
    
    inline def setServerComponentProps(value: Any): Self = StObject.set(x, "serverComponentProps", value.asInstanceOf[js.Any])
    
    inline def setServerComponentPropsUndefined: Self = StObject.set(x, "serverComponentProps", js.undefined)
    
    inline def setServerComponents(value: Boolean): Self = StObject.set(x, "serverComponents", value.asInstanceOf[js.Any])
    
    inline def setServerComponentsUndefined: Self = StObject.set(x, "serverComponents", js.undefined)
    
    inline def setSupportsDynamicHTML(value: Boolean): Self = StObject.set(x, "supportsDynamicHTML", value.asInstanceOf[js.Any])
    
    inline def setSupportsDynamicHTMLUndefined: Self = StObject.set(x, "supportsDynamicHTML", js.undefined)
  }
}
