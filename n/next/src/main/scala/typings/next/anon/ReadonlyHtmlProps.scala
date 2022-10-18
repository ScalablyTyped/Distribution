package typings.next.anon

import typings.next.distServerFontUtilsMod.FontConfig
import typings.next.distSharedLibUtilsMod.NEXT_DATA
import typings.next.nextBooleans.`false`
import typings.next.typesMod.ServerRuntime
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<next.next/dist/shared/lib/html-context.HtmlProps> */
trait ReadonlyHtmlProps extends StObject {
  
  val __NEXT_DATA__ : NEXT_DATA
  
  val ampPath: String
  
  val assetPrefix: js.UndefOr[String] = js.undefined
  
  val buildManifest: typings.next.distServerGetPageFilesMod.BuildManifest
  
  val canonicalBase: String
  
  val crossOrigin: js.UndefOr[String] = js.undefined
  
  val dangerousAsPath: String
  
  val devOnlyCacheBusterQueryString: String
  
  val disableOptimizedLoading: js.UndefOr[Boolean] = js.undefined
  
  val docComponentsRendered: Head
  
  val dynamicImports: js.Array[String]
  
  val hasConcurrentFeatures: js.UndefOr[Boolean] = js.undefined
  
  val head: js.UndefOr[js.Array[typings.react.mod.global.JSX.Element | Null]] = js.undefined
  
  val headTags: js.Array[Any]
  
  val hybridAmp: Boolean
  
  val inAmpMode: Boolean
  
  val isDevelopment: Boolean
  
  val largePageDataBytes: js.UndefOr[Double] = js.undefined
  
  val locale: js.UndefOr[String] = js.undefined
  
  val nextScriptWorkers: js.UndefOr[Boolean] = js.undefined
  
  val optimizeCss: js.UndefOr[Any] = js.undefined
  
  val optimizeFonts: js.UndefOr[FontConfig] = js.undefined
  
  val runtime: js.UndefOr[ServerRuntime] = js.undefined
  
  val scriptLoader: AfterInteractive
  
  val styles: js.UndefOr[js.Array[ReactElement] | ReactFragment] = js.undefined
  
  val unstable_JsPreload: js.UndefOr[`false`] = js.undefined
  
  val unstable_runtimeJS: js.UndefOr[`false`] = js.undefined
}
object ReadonlyHtmlProps {
  
  inline def apply(
    __NEXT_DATA__ : NEXT_DATA,
    ampPath: String,
    buildManifest: typings.next.distServerGetPageFilesMod.BuildManifest,
    canonicalBase: String,
    dangerousAsPath: String,
    devOnlyCacheBusterQueryString: String,
    docComponentsRendered: Head,
    dynamicImports: js.Array[String],
    headTags: js.Array[Any],
    hybridAmp: Boolean,
    inAmpMode: Boolean,
    isDevelopment: Boolean,
    scriptLoader: AfterInteractive
  ): ReadonlyHtmlProps = {
    val __obj = js.Dynamic.literal(__NEXT_DATA__ = __NEXT_DATA__.asInstanceOf[js.Any], ampPath = ampPath.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], dangerousAsPath = dangerousAsPath.asInstanceOf[js.Any], devOnlyCacheBusterQueryString = devOnlyCacheBusterQueryString.asInstanceOf[js.Any], docComponentsRendered = docComponentsRendered.asInstanceOf[js.Any], dynamicImports = dynamicImports.asInstanceOf[js.Any], headTags = headTags.asInstanceOf[js.Any], hybridAmp = hybridAmp.asInstanceOf[js.Any], inAmpMode = inAmpMode.asInstanceOf[js.Any], isDevelopment = isDevelopment.asInstanceOf[js.Any], scriptLoader = scriptLoader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyHtmlProps]
  }
  
  extension [Self <: ReadonlyHtmlProps](x: Self) {
    
    inline def setAmpPath(value: String): Self = StObject.set(x, "ampPath", value.asInstanceOf[js.Any])
    
    inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
    
    inline def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
    
    inline def setBuildManifest(value: typings.next.distServerGetPageFilesMod.BuildManifest): Self = StObject.set(x, "buildManifest", value.asInstanceOf[js.Any])
    
    inline def setCanonicalBase(value: String): Self = StObject.set(x, "canonicalBase", value.asInstanceOf[js.Any])
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDangerousAsPath(value: String): Self = StObject.set(x, "dangerousAsPath", value.asInstanceOf[js.Any])
    
    inline def setDevOnlyCacheBusterQueryString(value: String): Self = StObject.set(x, "devOnlyCacheBusterQueryString", value.asInstanceOf[js.Any])
    
    inline def setDisableOptimizedLoading(value: Boolean): Self = StObject.set(x, "disableOptimizedLoading", value.asInstanceOf[js.Any])
    
    inline def setDisableOptimizedLoadingUndefined: Self = StObject.set(x, "disableOptimizedLoading", js.undefined)
    
    inline def setDocComponentsRendered(value: Head): Self = StObject.set(x, "docComponentsRendered", value.asInstanceOf[js.Any])
    
    inline def setDynamicImports(value: js.Array[String]): Self = StObject.set(x, "dynamicImports", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportsVarargs(value: String*): Self = StObject.set(x, "dynamicImports", js.Array(value*))
    
    inline def setHasConcurrentFeatures(value: Boolean): Self = StObject.set(x, "hasConcurrentFeatures", value.asInstanceOf[js.Any])
    
    inline def setHasConcurrentFeaturesUndefined: Self = StObject.set(x, "hasConcurrentFeatures", js.undefined)
    
    inline def setHead(value: js.Array[typings.react.mod.global.JSX.Element | Null]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setHeadTags(value: js.Array[Any]): Self = StObject.set(x, "headTags", value.asInstanceOf[js.Any])
    
    inline def setHeadTagsVarargs(value: Any*): Self = StObject.set(x, "headTags", js.Array(value*))
    
    inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
    
    inline def setHeadVarargs(value: (typings.react.mod.global.JSX.Element | Null)*): Self = StObject.set(x, "head", js.Array(value*))
    
    inline def setHybridAmp(value: Boolean): Self = StObject.set(x, "hybridAmp", value.asInstanceOf[js.Any])
    
    inline def setInAmpMode(value: Boolean): Self = StObject.set(x, "inAmpMode", value.asInstanceOf[js.Any])
    
    inline def setIsDevelopment(value: Boolean): Self = StObject.set(x, "isDevelopment", value.asInstanceOf[js.Any])
    
    inline def setLargePageDataBytes(value: Double): Self = StObject.set(x, "largePageDataBytes", value.asInstanceOf[js.Any])
    
    inline def setLargePageDataBytesUndefined: Self = StObject.set(x, "largePageDataBytes", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setNextScriptWorkers(value: Boolean): Self = StObject.set(x, "nextScriptWorkers", value.asInstanceOf[js.Any])
    
    inline def setNextScriptWorkersUndefined: Self = StObject.set(x, "nextScriptWorkers", js.undefined)
    
    inline def setOptimizeCss(value: Any): Self = StObject.set(x, "optimizeCss", value.asInstanceOf[js.Any])
    
    inline def setOptimizeCssUndefined: Self = StObject.set(x, "optimizeCss", js.undefined)
    
    inline def setOptimizeFonts(value: FontConfig): Self = StObject.set(x, "optimizeFonts", value.asInstanceOf[js.Any])
    
    inline def setOptimizeFontsUndefined: Self = StObject.set(x, "optimizeFonts", js.undefined)
    
    inline def setRuntime(value: ServerRuntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setScriptLoader(value: AfterInteractive): Self = StObject.set(x, "scriptLoader", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: js.Array[ReactElement] | ReactFragment): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: ReactElement*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setUnstable_JsPreload(value: `false`): Self = StObject.set(x, "unstable_JsPreload", value.asInstanceOf[js.Any])
    
    inline def setUnstable_JsPreloadUndefined: Self = StObject.set(x, "unstable_JsPreload", js.undefined)
    
    inline def setUnstable_runtimeJS(value: `false`): Self = StObject.set(x, "unstable_runtimeJS", value.asInstanceOf[js.Any])
    
    inline def setUnstable_runtimeJSUndefined: Self = StObject.set(x, "unstable_runtimeJS", js.undefined)
    
    inline def set__NEXT_DATA__(value: NEXT_DATA): Self = StObject.set(x, "__NEXT_DATA__", value.asInstanceOf[js.Any])
  }
}
