package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.Content
import typings.next.anon.ErrorError
import typings.next.distBuildWebpackPluginsFontLoaderManifestPluginMod.FontLoaderManifest
import typings.next.distServerApiUtilsMod.ApiPreviewProps
import typings.next.distServerConfigSharedMod.DomainLocale
import typings.next.distServerFontUtilsMod.FontConfig
import typings.next.distServerFontUtilsMod.FontManifest
import typings.next.distServerGetPageFilesMod.BuildManifest
import typings.next.distServerLoadComponentsMod.LoadComponentsReturnType
import typings.next.distServerLoadComponentsMod.ReactLoadableManifest
import typings.next.distServerRenderResultMod.default
import typings.next.distServerRequestMetaMod.NextParsedUrlQuery
import typings.next.distSharedLibImageConfigMod.ImageConfigComplete
import typings.next.distSharedLibUtilsMod.AppType
import typings.next.distSharedLibUtilsMod.DocumentType
import typings.next.distSharedLibUtilsMod.NextComponentType
import typings.next.distSharedLibUtilsMod.NextPageContext
import typings.next.nextBooleans.`false`
import typings.next.typesMod.PageConfig
import typings.next.typesMod.ServerRuntime
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerRenderMod {
  
  @JSImport("next/dist/server/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderToHTML(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    pathname: String,
    query: NextParsedUrlQuery,
    renderOpts: RenderOpts
  ): js.Promise[default | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToHTML")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any], query.asInstanceOf[js.Any], renderOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[default | Null]]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.next.distServerRenderMod.RenderOptsPartial because var conflicts: serverComponentManifest. Inlined buildId, canonicalBase, runtimeConfig, assetPrefix, err, nextExport, dev, ampPath, ErrorDebug, ampValidator, ampSkipValidation, ampOptimizerConfig, isDataReq, params, previewProps, basePath, unstable_runtimeJS, unstable_JsPreload, optimizeFonts, fontManifest, optimizeCss, nextScriptWorkers, devOnlyCacheBusterQueryString, resolvedUrl, resolvedAsPath, serverCSSManifest, fontLoaderManifest, distDir, locale, locales, defaultLocale, domainLocales, disableOptimizedLoading, supportsDynamicHTML, isBot, runtime, serverComponents, customServer, crossOrigin, images, largePageDataBytes */ trait RenderOpts
    extends StObject
       with LoadComponentsReturnType {
    
    var ErrorDebug: js.UndefOr[ComponentType[ErrorError]] = js.undefined
    
    var ampOptimizerConfig: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var ampPath: js.UndefOr[String] = js.undefined
    
    var ampSkipValidation: js.UndefOr[Boolean] = js.undefined
    
    var ampValidator: js.UndefOr[js.Function2[/* html */ String, /* pathname */ String, js.Promise[Unit]]] = js.undefined
    
    var assetPrefix: js.UndefOr[String] = js.undefined
    
    var basePath: String
    
    var buildId: String
    
    var canonicalBase: String
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var customServer: js.UndefOr[Boolean] = js.undefined
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var devOnlyCacheBusterQueryString: js.UndefOr[String] = js.undefined
    
    var disableOptimizedLoading: js.UndefOr[Boolean] = js.undefined
    
    var distDir: js.UndefOr[String] = js.undefined
    
    var domainLocales: js.UndefOr[js.Array[DomainLocale]] = js.undefined
    
    var err: js.UndefOr[js.Error | Null] = js.undefined
    
    var fontLoaderManifest: js.UndefOr[FontLoaderManifest] = js.undefined
    
    var fontManifest: js.UndefOr[FontManifest] = js.undefined
    
    var images: ImageConfigComplete
    
    var isBot: js.UndefOr[Boolean] = js.undefined
    
    var isDataReq: js.UndefOr[Boolean] = js.undefined
    
    var largePageDataBytes: js.UndefOr[Double] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    var nextExport: js.UndefOr[Boolean] = js.undefined
    
    var nextScriptWorkers: Any
    
    var optimizeCss: Any
    
    var optimizeFonts: FontConfig
    
    var params: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ] = js.undefined
    
    var previewProps: ApiPreviewProps
    
    var resolvedAsPath: js.UndefOr[String] = js.undefined
    
    var resolvedUrl: js.UndefOr[String] = js.undefined
    
    var runtime: js.UndefOr[ServerRuntime] = js.undefined
    
    var runtimeConfig: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var serverCSSManifest: js.UndefOr[Any] = js.undefined
    
    var serverComponents: js.UndefOr[Boolean] = js.undefined
    
    var supportsDynamicHTML: js.UndefOr[Boolean] = js.undefined
    
    var unstable_JsPreload: js.UndefOr[`false`] = js.undefined
    
    var unstable_runtimeJS: js.UndefOr[`false`] = js.undefined
  }
  object RenderOpts {
    
    inline def apply(
      App: AppType[js.Object],
      Component: NextComponentType[NextPageContext, js.Object, js.Object],
      ComponentMod: Any,
      Document: DocumentType,
      basePath: String,
      buildId: String,
      buildManifest: BuildManifest,
      canonicalBase: String,
      images: ImageConfigComplete,
      nextScriptWorkers: Any,
      optimizeCss: Any,
      optimizeFonts: FontConfig,
      pageConfig: PageConfig,
      pathname: String,
      previewProps: ApiPreviewProps,
      reactLoadableManifest: ReactLoadableManifest
    ): RenderOpts = {
      val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], ComponentMod = ComponentMod.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], nextScriptWorkers = nextScriptWorkers.asInstanceOf[js.Any], optimizeCss = optimizeCss.asInstanceOf[js.Any], optimizeFonts = optimizeFonts.asInstanceOf[js.Any], pageConfig = pageConfig.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], previewProps = previewProps.asInstanceOf[js.Any], reactLoadableManifest = reactLoadableManifest.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOpts]
    }
    
    extension [Self <: RenderOpts](x: Self) {
      
      inline def setAmpOptimizerConfig(value: StringDictionary[Any]): Self = StObject.set(x, "ampOptimizerConfig", value.asInstanceOf[js.Any])
      
      inline def setAmpOptimizerConfigUndefined: Self = StObject.set(x, "ampOptimizerConfig", js.undefined)
      
      inline def setAmpPath(value: String): Self = StObject.set(x, "ampPath", value.asInstanceOf[js.Any])
      
      inline def setAmpPathUndefined: Self = StObject.set(x, "ampPath", js.undefined)
      
      inline def setAmpSkipValidation(value: Boolean): Self = StObject.set(x, "ampSkipValidation", value.asInstanceOf[js.Any])
      
      inline def setAmpSkipValidationUndefined: Self = StObject.set(x, "ampSkipValidation", js.undefined)
      
      inline def setAmpValidator(value: (/* html */ String, /* pathname */ String) => js.Promise[Unit]): Self = StObject.set(x, "ampValidator", js.Any.fromFunction2(value))
      
      inline def setAmpValidatorUndefined: Self = StObject.set(x, "ampValidator", js.undefined)
      
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
      
      inline def setDevOnlyCacheBusterQueryString(value: String): Self = StObject.set(x, "devOnlyCacheBusterQueryString", value.asInstanceOf[js.Any])
      
      inline def setDevOnlyCacheBusterQueryStringUndefined: Self = StObject.set(x, "devOnlyCacheBusterQueryString", js.undefined)
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setDisableOptimizedLoading(value: Boolean): Self = StObject.set(x, "disableOptimizedLoading", value.asInstanceOf[js.Any])
      
      inline def setDisableOptimizedLoadingUndefined: Self = StObject.set(x, "disableOptimizedLoading", js.undefined)
      
      inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
      
      inline def setDistDirUndefined: Self = StObject.set(x, "distDir", js.undefined)
      
      inline def setDomainLocales(value: js.Array[DomainLocale]): Self = StObject.set(x, "domainLocales", value.asInstanceOf[js.Any])
      
      inline def setDomainLocalesUndefined: Self = StObject.set(x, "domainLocales", js.undefined)
      
      inline def setDomainLocalesVarargs(value: DomainLocale*): Self = StObject.set(x, "domainLocales", js.Array(value*))
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrNull: Self = StObject.set(x, "err", null)
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setErrorDebug(value: ComponentType[ErrorError]): Self = StObject.set(x, "ErrorDebug", value.asInstanceOf[js.Any])
      
      inline def setErrorDebugUndefined: Self = StObject.set(x, "ErrorDebug", js.undefined)
      
      inline def setFontLoaderManifest(value: FontLoaderManifest): Self = StObject.set(x, "fontLoaderManifest", value.asInstanceOf[js.Any])
      
      inline def setFontLoaderManifestUndefined: Self = StObject.set(x, "fontLoaderManifest", js.undefined)
      
      inline def setFontManifest(value: FontManifest): Self = StObject.set(x, "fontManifest", value.asInstanceOf[js.Any])
      
      inline def setFontManifestUndefined: Self = StObject.set(x, "fontManifest", js.undefined)
      
      inline def setFontManifestVarargs(value: Content*): Self = StObject.set(x, "fontManifest", js.Array(value*))
      
      inline def setImages(value: ImageConfigComplete): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setIsBot(value: Boolean): Self = StObject.set(x, "isBot", value.asInstanceOf[js.Any])
      
      inline def setIsBotUndefined: Self = StObject.set(x, "isBot", js.undefined)
      
      inline def setIsDataReq(value: Boolean): Self = StObject.set(x, "isDataReq", value.asInstanceOf[js.Any])
      
      inline def setIsDataReqUndefined: Self = StObject.set(x, "isDataReq", js.undefined)
      
      inline def setLargePageDataBytes(value: Double): Self = StObject.set(x, "largePageDataBytes", value.asInstanceOf[js.Any])
      
      inline def setLargePageDataBytesUndefined: Self = StObject.set(x, "largePageDataBytes", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setNextExport(value: Boolean): Self = StObject.set(x, "nextExport", value.asInstanceOf[js.Any])
      
      inline def setNextExportUndefined: Self = StObject.set(x, "nextExport", js.undefined)
      
      inline def setNextScriptWorkers(value: Any): Self = StObject.set(x, "nextScriptWorkers", value.asInstanceOf[js.Any])
      
      inline def setOptimizeCss(value: Any): Self = StObject.set(x, "optimizeCss", value.asInstanceOf[js.Any])
      
      inline def setOptimizeFonts(value: FontConfig): Self = StObject.set(x, "optimizeFonts", value.asInstanceOf[js.Any])
      
      inline def setParams(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPreviewProps(value: ApiPreviewProps): Self = StObject.set(x, "previewProps", value.asInstanceOf[js.Any])
      
      inline def setResolvedAsPath(value: String): Self = StObject.set(x, "resolvedAsPath", value.asInstanceOf[js.Any])
      
      inline def setResolvedAsPathUndefined: Self = StObject.set(x, "resolvedAsPath", js.undefined)
      
      inline def setResolvedUrl(value: String): Self = StObject.set(x, "resolvedUrl", value.asInstanceOf[js.Any])
      
      inline def setResolvedUrlUndefined: Self = StObject.set(x, "resolvedUrl", js.undefined)
      
      inline def setRuntime(value: ServerRuntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeConfig(value: StringDictionary[Any]): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
      
      inline def setRuntimeConfigUndefined: Self = StObject.set(x, "runtimeConfig", js.undefined)
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setServerCSSManifest(value: Any): Self = StObject.set(x, "serverCSSManifest", value.asInstanceOf[js.Any])
      
      inline def setServerCSSManifestUndefined: Self = StObject.set(x, "serverCSSManifest", js.undefined)
      
      inline def setServerComponents(value: Boolean): Self = StObject.set(x, "serverComponents", value.asInstanceOf[js.Any])
      
      inline def setServerComponentsUndefined: Self = StObject.set(x, "serverComponents", js.undefined)
      
      inline def setSupportsDynamicHTML(value: Boolean): Self = StObject.set(x, "supportsDynamicHTML", value.asInstanceOf[js.Any])
      
      inline def setSupportsDynamicHTMLUndefined: Self = StObject.set(x, "supportsDynamicHTML", js.undefined)
      
      inline def setUnstable_JsPreload(value: `false`): Self = StObject.set(x, "unstable_JsPreload", value.asInstanceOf[js.Any])
      
      inline def setUnstable_JsPreloadUndefined: Self = StObject.set(x, "unstable_JsPreload", js.undefined)
      
      inline def setUnstable_runtimeJS(value: `false`): Self = StObject.set(x, "unstable_runtimeJS", value.asInstanceOf[js.Any])
      
      inline def setUnstable_runtimeJSUndefined: Self = StObject.set(x, "unstable_runtimeJS", js.undefined)
    }
  }
  
  trait RenderOptsPartial extends StObject {
    
    var ErrorDebug: js.UndefOr[ComponentType[ErrorError]] = js.undefined
    
    var ampOptimizerConfig: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var ampPath: js.UndefOr[String] = js.undefined
    
    var ampSkipValidation: js.UndefOr[Boolean] = js.undefined
    
    var ampValidator: js.UndefOr[js.Function2[/* html */ String, /* pathname */ String, js.Promise[Unit]]] = js.undefined
    
    var assetPrefix: js.UndefOr[String] = js.undefined
    
    var basePath: String
    
    var buildId: String
    
    var canonicalBase: String
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var customServer: js.UndefOr[Boolean] = js.undefined
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var devOnlyCacheBusterQueryString: js.UndefOr[String] = js.undefined
    
    var disableOptimizedLoading: js.UndefOr[Boolean] = js.undefined
    
    var distDir: js.UndefOr[String] = js.undefined
    
    var domainLocales: js.UndefOr[js.Array[DomainLocale]] = js.undefined
    
    var err: js.UndefOr[js.Error | Null] = js.undefined
    
    var fontLoaderManifest: js.UndefOr[FontLoaderManifest] = js.undefined
    
    var fontManifest: js.UndefOr[FontManifest] = js.undefined
    
    var images: ImageConfigComplete
    
    var isBot: js.UndefOr[Boolean] = js.undefined
    
    var isDataReq: js.UndefOr[Boolean] = js.undefined
    
    var largePageDataBytes: js.UndefOr[Double] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    var nextExport: js.UndefOr[Boolean] = js.undefined
    
    var nextScriptWorkers: Any
    
    var optimizeCss: Any
    
    var optimizeFonts: FontConfig
    
    var params: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ] = js.undefined
    
    var previewProps: ApiPreviewProps
    
    var resolvedAsPath: js.UndefOr[String] = js.undefined
    
    var resolvedUrl: js.UndefOr[String] = js.undefined
    
    var runtime: js.UndefOr[ServerRuntime] = js.undefined
    
    var runtimeConfig: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var serverCSSManifest: js.UndefOr[Any] = js.undefined
    
    var serverComponentManifest: js.UndefOr[Any] = js.undefined
    
    var serverComponents: js.UndefOr[Boolean] = js.undefined
    
    var supportsDynamicHTML: js.UndefOr[Boolean] = js.undefined
    
    var unstable_JsPreload: js.UndefOr[`false`] = js.undefined
    
    var unstable_runtimeJS: js.UndefOr[`false`] = js.undefined
  }
  object RenderOptsPartial {
    
    inline def apply(
      basePath: String,
      buildId: String,
      canonicalBase: String,
      images: ImageConfigComplete,
      nextScriptWorkers: Any,
      optimizeCss: Any,
      optimizeFonts: FontConfig,
      previewProps: ApiPreviewProps
    ): RenderOptsPartial = {
      val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], nextScriptWorkers = nextScriptWorkers.asInstanceOf[js.Any], optimizeCss = optimizeCss.asInstanceOf[js.Any], optimizeFonts = optimizeFonts.asInstanceOf[js.Any], previewProps = previewProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOptsPartial]
    }
    
    extension [Self <: RenderOptsPartial](x: Self) {
      
      inline def setAmpOptimizerConfig(value: StringDictionary[Any]): Self = StObject.set(x, "ampOptimizerConfig", value.asInstanceOf[js.Any])
      
      inline def setAmpOptimizerConfigUndefined: Self = StObject.set(x, "ampOptimizerConfig", js.undefined)
      
      inline def setAmpPath(value: String): Self = StObject.set(x, "ampPath", value.asInstanceOf[js.Any])
      
      inline def setAmpPathUndefined: Self = StObject.set(x, "ampPath", js.undefined)
      
      inline def setAmpSkipValidation(value: Boolean): Self = StObject.set(x, "ampSkipValidation", value.asInstanceOf[js.Any])
      
      inline def setAmpSkipValidationUndefined: Self = StObject.set(x, "ampSkipValidation", js.undefined)
      
      inline def setAmpValidator(value: (/* html */ String, /* pathname */ String) => js.Promise[Unit]): Self = StObject.set(x, "ampValidator", js.Any.fromFunction2(value))
      
      inline def setAmpValidatorUndefined: Self = StObject.set(x, "ampValidator", js.undefined)
      
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
      
      inline def setDevOnlyCacheBusterQueryString(value: String): Self = StObject.set(x, "devOnlyCacheBusterQueryString", value.asInstanceOf[js.Any])
      
      inline def setDevOnlyCacheBusterQueryStringUndefined: Self = StObject.set(x, "devOnlyCacheBusterQueryString", js.undefined)
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setDisableOptimizedLoading(value: Boolean): Self = StObject.set(x, "disableOptimizedLoading", value.asInstanceOf[js.Any])
      
      inline def setDisableOptimizedLoadingUndefined: Self = StObject.set(x, "disableOptimizedLoading", js.undefined)
      
      inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
      
      inline def setDistDirUndefined: Self = StObject.set(x, "distDir", js.undefined)
      
      inline def setDomainLocales(value: js.Array[DomainLocale]): Self = StObject.set(x, "domainLocales", value.asInstanceOf[js.Any])
      
      inline def setDomainLocalesUndefined: Self = StObject.set(x, "domainLocales", js.undefined)
      
      inline def setDomainLocalesVarargs(value: DomainLocale*): Self = StObject.set(x, "domainLocales", js.Array(value*))
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrNull: Self = StObject.set(x, "err", null)
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setErrorDebug(value: ComponentType[ErrorError]): Self = StObject.set(x, "ErrorDebug", value.asInstanceOf[js.Any])
      
      inline def setErrorDebugUndefined: Self = StObject.set(x, "ErrorDebug", js.undefined)
      
      inline def setFontLoaderManifest(value: FontLoaderManifest): Self = StObject.set(x, "fontLoaderManifest", value.asInstanceOf[js.Any])
      
      inline def setFontLoaderManifestUndefined: Self = StObject.set(x, "fontLoaderManifest", js.undefined)
      
      inline def setFontManifest(value: FontManifest): Self = StObject.set(x, "fontManifest", value.asInstanceOf[js.Any])
      
      inline def setFontManifestUndefined: Self = StObject.set(x, "fontManifest", js.undefined)
      
      inline def setFontManifestVarargs(value: Content*): Self = StObject.set(x, "fontManifest", js.Array(value*))
      
      inline def setImages(value: ImageConfigComplete): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setIsBot(value: Boolean): Self = StObject.set(x, "isBot", value.asInstanceOf[js.Any])
      
      inline def setIsBotUndefined: Self = StObject.set(x, "isBot", js.undefined)
      
      inline def setIsDataReq(value: Boolean): Self = StObject.set(x, "isDataReq", value.asInstanceOf[js.Any])
      
      inline def setIsDataReqUndefined: Self = StObject.set(x, "isDataReq", js.undefined)
      
      inline def setLargePageDataBytes(value: Double): Self = StObject.set(x, "largePageDataBytes", value.asInstanceOf[js.Any])
      
      inline def setLargePageDataBytesUndefined: Self = StObject.set(x, "largePageDataBytes", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setNextExport(value: Boolean): Self = StObject.set(x, "nextExport", value.asInstanceOf[js.Any])
      
      inline def setNextExportUndefined: Self = StObject.set(x, "nextExport", js.undefined)
      
      inline def setNextScriptWorkers(value: Any): Self = StObject.set(x, "nextScriptWorkers", value.asInstanceOf[js.Any])
      
      inline def setOptimizeCss(value: Any): Self = StObject.set(x, "optimizeCss", value.asInstanceOf[js.Any])
      
      inline def setOptimizeFonts(value: FontConfig): Self = StObject.set(x, "optimizeFonts", value.asInstanceOf[js.Any])
      
      inline def setParams(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPreviewProps(value: ApiPreviewProps): Self = StObject.set(x, "previewProps", value.asInstanceOf[js.Any])
      
      inline def setResolvedAsPath(value: String): Self = StObject.set(x, "resolvedAsPath", value.asInstanceOf[js.Any])
      
      inline def setResolvedAsPathUndefined: Self = StObject.set(x, "resolvedAsPath", js.undefined)
      
      inline def setResolvedUrl(value: String): Self = StObject.set(x, "resolvedUrl", value.asInstanceOf[js.Any])
      
      inline def setResolvedUrlUndefined: Self = StObject.set(x, "resolvedUrl", js.undefined)
      
      inline def setRuntime(value: ServerRuntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeConfig(value: StringDictionary[Any]): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
      
      inline def setRuntimeConfigUndefined: Self = StObject.set(x, "runtimeConfig", js.undefined)
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setServerCSSManifest(value: Any): Self = StObject.set(x, "serverCSSManifest", value.asInstanceOf[js.Any])
      
      inline def setServerCSSManifestUndefined: Self = StObject.set(x, "serverCSSManifest", js.undefined)
      
      inline def setServerComponentManifest(value: Any): Self = StObject.set(x, "serverComponentManifest", value.asInstanceOf[js.Any])
      
      inline def setServerComponentManifestUndefined: Self = StObject.set(x, "serverComponentManifest", js.undefined)
      
      inline def setServerComponents(value: Boolean): Self = StObject.set(x, "serverComponents", value.asInstanceOf[js.Any])
      
      inline def setServerComponentsUndefined: Self = StObject.set(x, "serverComponents", js.undefined)
      
      inline def setSupportsDynamicHTML(value: Boolean): Self = StObject.set(x, "supportsDynamicHTML", value.asInstanceOf[js.Any])
      
      inline def setSupportsDynamicHTMLUndefined: Self = StObject.set(x, "supportsDynamicHTML", js.undefined)
      
      inline def setUnstable_JsPreload(value: `false`): Self = StObject.set(x, "unstable_JsPreload", value.asInstanceOf[js.Any])
      
      inline def setUnstable_JsPreloadUndefined: Self = StObject.set(x, "unstable_JsPreload", js.undefined)
      
      inline def setUnstable_runtimeJS(value: `false`): Self = StObject.set(x, "unstable_runtimeJS", value.asInstanceOf[js.Any])
      
      inline def setUnstable_runtimeJSUndefined: Self = StObject.set(x, "unstable_runtimeJS", js.undefined)
    }
  }
  
  type RenderToHTMLResult = js.Function5[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* pathname */ String, 
    /* query */ NextParsedUrlQuery, 
    /* renderOpts */ RenderOpts, 
    js.Promise[default | Null]
  ]
}
