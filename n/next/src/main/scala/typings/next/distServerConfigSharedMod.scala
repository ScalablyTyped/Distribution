package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.AfterFilesBeforeFiles
import typings.next.anon.Algorithm
import typings.next.anon.Babel
import typings.next.anon.BuildActivity
import typings.next.anon.CanonicalBase
import typings.next.anon.Compress
import typings.next.anon.ConfigFile
import typings.next.anon.ContextDirectory
import typings.next.anon.Emotion
import typings.next.anon.KeepAlive
import typings.next.anon.Loader
import typings.next.anon.MaxInactiveAge
import typings.next.anon.Optimizer
import typings.next.anon.OutDir
import typings.next.anon.Page
import typings.next.anon.PreventFullImport
import typings.next.anon.`0`
import typings.next.distLibLoadCustomRoutesMod.Header
import typings.next.distLibLoadCustomRoutesMod.Redirect
import typings.next.distLibLoadCustomRoutesMod.Rewrite
import typings.next.distSharedLibImageConfigMod.ImageConfig
import typings.next.nextBooleans.`false`
import typings.next.nextBooleans.`true`
import typings.next.nextStrings.CLS
import typings.next.nextStrings.FCP
import typings.next.nextStrings.FID
import typings.next.nextStrings.INP
import typings.next.nextStrings.LCP
import typings.next.nextStrings.TTFB
import typings.next.nextStrings.`use-credentials`
import typings.next.nextStrings.anonymous
import typings.next.nextStrings.edge
import typings.next.nextStrings.loose
import typings.next.nextStrings.nodejs
import typings.next.nextStrings.standalone
import typings.next.typesMod.ServerRuntime
import typings.std.Exclude
import typings.std.Record
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerConfigSharedMod {
  
  @JSImport("next/dist/server/config-shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/server/config-shared", "defaultConfig")
  @js.native
  val defaultConfig: NextConfig = js.native
  
  inline def isServerRuntime(): /* is next.next/types.ServerRuntime */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isServerRuntime")().asInstanceOf[/* is next.next/types.ServerRuntime */ Boolean]
  inline def isServerRuntime(value: String): /* is next.next/types.ServerRuntime */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isServerRuntime")(value.asInstanceOf[js.Any]).asInstanceOf[/* is next.next/types.ServerRuntime */ Boolean]
  
  inline def normalizeConfig(phase: String, config: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeConfig")(phase.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def validateConfig(userConfig: NextConfig): `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(userConfig.asInstanceOf[js.Any]).asInstanceOf[`0`]
  
  trait DomainLocale extends StObject {
    
    var defaultLocale: String
    
    var domain: String
    
    var http: js.UndefOr[`true`] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DomainLocale {
    
    inline def apply(defaultLocale: String, domain: String): DomainLocale = {
      val __obj = js.Dynamic.literal(defaultLocale = defaultLocale.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainLocale]
    }
    
    extension [Self <: DomainLocale](x: Self) {
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setHttp(value: `true`): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
    }
  }
  
  trait ESLintConfig extends StObject {
    
    /** Only run ESLint on these directories with `next lint` and `next build`. */
    var dirs: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Do not run ESLint during production builds (`next build`). */
    var ignoreDuringBuilds: js.UndefOr[Boolean] = js.undefined
  }
  object ESLintConfig {
    
    inline def apply(): ESLintConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ESLintConfig]
    }
    
    extension [Self <: ESLintConfig](x: Self) {
      
      inline def setDirs(value: js.Array[String]): Self = StObject.set(x, "dirs", value.asInstanceOf[js.Any])
      
      inline def setDirsUndefined: Self = StObject.set(x, "dirs", js.undefined)
      
      inline def setDirsVarargs(value: String*): Self = StObject.set(x, "dirs", js.Array(value*))
      
      inline def setIgnoreDuringBuilds(value: Boolean): Self = StObject.set(x, "ignoreDuringBuilds", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDuringBuildsUndefined: Self = StObject.set(x, "ignoreDuringBuilds", js.undefined)
    }
  }
  
  trait ExperimentalConfig extends StObject {
    
    var adjustFontFallbacks: js.UndefOr[Boolean] = js.undefined
    
    var adjustFontFallbacksWithSizeAdjust: js.UndefOr[Boolean] = js.undefined
    
    var allowMiddlewareResponseBody: js.UndefOr[Boolean] = js.undefined
    
    var amp: js.UndefOr[Optimizer] = js.undefined
    
    var appDir: js.UndefOr[Boolean] = js.undefined
    
    var cpus: js.UndefOr[Double] = js.undefined
    
    var craCompat: js.UndefOr[Boolean] = js.undefined
    
    var disableOptimizedLoading: js.UndefOr[Boolean] = js.undefined
    
    var disablePostcssPresetEnv: js.UndefOr[Boolean] = js.undefined
    
    var enableUndici: js.UndefOr[Boolean] = js.undefined
    
    var esmExternals: js.UndefOr[Boolean | loose] = js.undefined
    
    var externalDir: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `false`, webpack won't fall back to polyfill Node.js modules in the browser
      * Full list of old polyfills is accessible here:
      * [webpack/webpack#ModuleNotoundError.js#L13-L42](https://github.com/webpack/webpack/blob/2a0536cf510768111a3a6dceeb14cb79b9f59273/lib/ModuleNotFoundError.js#L13-L42)
      */
    var fallbackNodePolyfills: js.UndefOr[`false`] = js.undefined
    
    var fontLoaders: js.UndefOr[js.Array[Loader]] = js.undefined
    
    var forceSwcTransforms: js.UndefOr[Boolean] = js.undefined
    
    var fullySpecified: js.UndefOr[Boolean] = js.undefined
    
    var gzipSize: js.UndefOr[Boolean] = js.undefined
    
    var incrementalCacheHandlerPath: js.UndefOr[String] = js.undefined
    
    var isrFlushToDisk: js.UndefOr[Boolean] = js.undefined
    
    var isrMemoryCacheSize: js.UndefOr[Double] = js.undefined
    
    var largePageDataBytes: js.UndefOr[Double] = js.undefined
    
    var legacyBrowsers: js.UndefOr[Boolean] = js.undefined
    
    var manualClientBasePath: js.UndefOr[Boolean] = js.undefined
    
    var modularizeImports: js.UndefOr[Record[String, PreventFullImport]] = js.undefined
    
    var newNextLinkBehavior: js.UndefOr[Boolean] = js.undefined
    
    var nextScriptWorkers: js.UndefOr[Boolean] = js.undefined
    
    var optimisticClientCache: js.UndefOr[Boolean] = js.undefined
    
    var optimizeCss: js.UndefOr[Boolean | (Record[String, Any])] = js.undefined
    
    var outputFileTracingRoot: js.UndefOr[String] = js.undefined
    
    var pageEnv: js.UndefOr[Boolean] = js.undefined
    
    var profiling: js.UndefOr[Boolean] = js.undefined
    
    var proxyTimeout: js.UndefOr[Double] = js.undefined
    
    var runtime: js.UndefOr[Exclude[ServerRuntime, Unit]] = js.undefined
    
    var scrollRestoration: js.UndefOr[Boolean] = js.undefined
    
    var serverComponentsExternalPackages: js.UndefOr[js.Array[String]] = js.undefined
    
    var sharedPool: js.UndefOr[Boolean] = js.undefined
    
    var skipMiddlewareUrlNormalize: js.UndefOr[Boolean] = js.undefined
    
    var skipTrailingSlashRedirect: js.UndefOr[Boolean] = js.undefined
    
    var sri: js.UndefOr[Algorithm] = js.undefined
    
    var swcFileReading: js.UndefOr[Boolean] = js.undefined
    
    var swcMinify: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The option for the minifier of [SWC compiler](https://swc.rs).
      * This option is only for debugging the SWC minifier, and will be removed once the SWC minifier is stable.
      *
      * @see [SWC Minification](https://nextjs.org/docs/advanced-features/compiler#minification)
      */
    var swcMinifyDebugOptions: js.UndefOr[Compress] = js.undefined
    
    var swcPlugins: js.UndefOr[js.Array[js.Tuple2[String, Record[String, Any]]]] = js.undefined
    
    var swcTraceProfiling: js.UndefOr[Boolean] = js.undefined
    
    var transpilePackages: js.UndefOr[js.Array[String]] = js.undefined
    
    var turbotrace: js.UndefOr[ContextDirectory] = js.undefined
    
    var urlImports: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<next.next/dist/compiled/webpack/webpack.webpack.Configuration['experiments']>['buildHttp'] */ js.Any
      ] = js.undefined
    
    var webVitalsAttribution: js.UndefOr[js.Array[CLS | FCP | FID | INP | LCP | TTFB]] = js.undefined
    
    var workerThreads: js.UndefOr[Boolean] = js.undefined
  }
  object ExperimentalConfig {
    
    inline def apply(): ExperimentalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExperimentalConfig]
    }
    
    extension [Self <: ExperimentalConfig](x: Self) {
      
      inline def setAdjustFontFallbacks(value: Boolean): Self = StObject.set(x, "adjustFontFallbacks", value.asInstanceOf[js.Any])
      
      inline def setAdjustFontFallbacksUndefined: Self = StObject.set(x, "adjustFontFallbacks", js.undefined)
      
      inline def setAdjustFontFallbacksWithSizeAdjust(value: Boolean): Self = StObject.set(x, "adjustFontFallbacksWithSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setAdjustFontFallbacksWithSizeAdjustUndefined: Self = StObject.set(x, "adjustFontFallbacksWithSizeAdjust", js.undefined)
      
      inline def setAllowMiddlewareResponseBody(value: Boolean): Self = StObject.set(x, "allowMiddlewareResponseBody", value.asInstanceOf[js.Any])
      
      inline def setAllowMiddlewareResponseBodyUndefined: Self = StObject.set(x, "allowMiddlewareResponseBody", js.undefined)
      
      inline def setAmp(value: Optimizer): Self = StObject.set(x, "amp", value.asInstanceOf[js.Any])
      
      inline def setAmpUndefined: Self = StObject.set(x, "amp", js.undefined)
      
      inline def setAppDir(value: Boolean): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
      
      inline def setAppDirUndefined: Self = StObject.set(x, "appDir", js.undefined)
      
      inline def setCpus(value: Double): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
      
      inline def setCpusUndefined: Self = StObject.set(x, "cpus", js.undefined)
      
      inline def setCraCompat(value: Boolean): Self = StObject.set(x, "craCompat", value.asInstanceOf[js.Any])
      
      inline def setCraCompatUndefined: Self = StObject.set(x, "craCompat", js.undefined)
      
      inline def setDisableOptimizedLoading(value: Boolean): Self = StObject.set(x, "disableOptimizedLoading", value.asInstanceOf[js.Any])
      
      inline def setDisableOptimizedLoadingUndefined: Self = StObject.set(x, "disableOptimizedLoading", js.undefined)
      
      inline def setDisablePostcssPresetEnv(value: Boolean): Self = StObject.set(x, "disablePostcssPresetEnv", value.asInstanceOf[js.Any])
      
      inline def setDisablePostcssPresetEnvUndefined: Self = StObject.set(x, "disablePostcssPresetEnv", js.undefined)
      
      inline def setEnableUndici(value: Boolean): Self = StObject.set(x, "enableUndici", value.asInstanceOf[js.Any])
      
      inline def setEnableUndiciUndefined: Self = StObject.set(x, "enableUndici", js.undefined)
      
      inline def setEsmExternals(value: Boolean | loose): Self = StObject.set(x, "esmExternals", value.asInstanceOf[js.Any])
      
      inline def setEsmExternalsUndefined: Self = StObject.set(x, "esmExternals", js.undefined)
      
      inline def setExternalDir(value: Boolean): Self = StObject.set(x, "externalDir", value.asInstanceOf[js.Any])
      
      inline def setExternalDirUndefined: Self = StObject.set(x, "externalDir", js.undefined)
      
      inline def setFallbackNodePolyfills(value: `false`): Self = StObject.set(x, "fallbackNodePolyfills", value.asInstanceOf[js.Any])
      
      inline def setFallbackNodePolyfillsUndefined: Self = StObject.set(x, "fallbackNodePolyfills", js.undefined)
      
      inline def setFontLoaders(value: js.Array[Loader]): Self = StObject.set(x, "fontLoaders", value.asInstanceOf[js.Any])
      
      inline def setFontLoadersUndefined: Self = StObject.set(x, "fontLoaders", js.undefined)
      
      inline def setFontLoadersVarargs(value: Loader*): Self = StObject.set(x, "fontLoaders", js.Array(value*))
      
      inline def setForceSwcTransforms(value: Boolean): Self = StObject.set(x, "forceSwcTransforms", value.asInstanceOf[js.Any])
      
      inline def setForceSwcTransformsUndefined: Self = StObject.set(x, "forceSwcTransforms", js.undefined)
      
      inline def setFullySpecified(value: Boolean): Self = StObject.set(x, "fullySpecified", value.asInstanceOf[js.Any])
      
      inline def setFullySpecifiedUndefined: Self = StObject.set(x, "fullySpecified", js.undefined)
      
      inline def setGzipSize(value: Boolean): Self = StObject.set(x, "gzipSize", value.asInstanceOf[js.Any])
      
      inline def setGzipSizeUndefined: Self = StObject.set(x, "gzipSize", js.undefined)
      
      inline def setIncrementalCacheHandlerPath(value: String): Self = StObject.set(x, "incrementalCacheHandlerPath", value.asInstanceOf[js.Any])
      
      inline def setIncrementalCacheHandlerPathUndefined: Self = StObject.set(x, "incrementalCacheHandlerPath", js.undefined)
      
      inline def setIsrFlushToDisk(value: Boolean): Self = StObject.set(x, "isrFlushToDisk", value.asInstanceOf[js.Any])
      
      inline def setIsrFlushToDiskUndefined: Self = StObject.set(x, "isrFlushToDisk", js.undefined)
      
      inline def setIsrMemoryCacheSize(value: Double): Self = StObject.set(x, "isrMemoryCacheSize", value.asInstanceOf[js.Any])
      
      inline def setIsrMemoryCacheSizeUndefined: Self = StObject.set(x, "isrMemoryCacheSize", js.undefined)
      
      inline def setLargePageDataBytes(value: Double): Self = StObject.set(x, "largePageDataBytes", value.asInstanceOf[js.Any])
      
      inline def setLargePageDataBytesUndefined: Self = StObject.set(x, "largePageDataBytes", js.undefined)
      
      inline def setLegacyBrowsers(value: Boolean): Self = StObject.set(x, "legacyBrowsers", value.asInstanceOf[js.Any])
      
      inline def setLegacyBrowsersUndefined: Self = StObject.set(x, "legacyBrowsers", js.undefined)
      
      inline def setManualClientBasePath(value: Boolean): Self = StObject.set(x, "manualClientBasePath", value.asInstanceOf[js.Any])
      
      inline def setManualClientBasePathUndefined: Self = StObject.set(x, "manualClientBasePath", js.undefined)
      
      inline def setModularizeImports(value: Record[String, PreventFullImport]): Self = StObject.set(x, "modularizeImports", value.asInstanceOf[js.Any])
      
      inline def setModularizeImportsUndefined: Self = StObject.set(x, "modularizeImports", js.undefined)
      
      inline def setNewNextLinkBehavior(value: Boolean): Self = StObject.set(x, "newNextLinkBehavior", value.asInstanceOf[js.Any])
      
      inline def setNewNextLinkBehaviorUndefined: Self = StObject.set(x, "newNextLinkBehavior", js.undefined)
      
      inline def setNextScriptWorkers(value: Boolean): Self = StObject.set(x, "nextScriptWorkers", value.asInstanceOf[js.Any])
      
      inline def setNextScriptWorkersUndefined: Self = StObject.set(x, "nextScriptWorkers", js.undefined)
      
      inline def setOptimisticClientCache(value: Boolean): Self = StObject.set(x, "optimisticClientCache", value.asInstanceOf[js.Any])
      
      inline def setOptimisticClientCacheUndefined: Self = StObject.set(x, "optimisticClientCache", js.undefined)
      
      inline def setOptimizeCss(value: Boolean | (Record[String, Any])): Self = StObject.set(x, "optimizeCss", value.asInstanceOf[js.Any])
      
      inline def setOptimizeCssUndefined: Self = StObject.set(x, "optimizeCss", js.undefined)
      
      inline def setOutputFileTracingRoot(value: String): Self = StObject.set(x, "outputFileTracingRoot", value.asInstanceOf[js.Any])
      
      inline def setOutputFileTracingRootUndefined: Self = StObject.set(x, "outputFileTracingRoot", js.undefined)
      
      inline def setPageEnv(value: Boolean): Self = StObject.set(x, "pageEnv", value.asInstanceOf[js.Any])
      
      inline def setPageEnvUndefined: Self = StObject.set(x, "pageEnv", js.undefined)
      
      inline def setProfiling(value: Boolean): Self = StObject.set(x, "profiling", value.asInstanceOf[js.Any])
      
      inline def setProfilingUndefined: Self = StObject.set(x, "profiling", js.undefined)
      
      inline def setProxyTimeout(value: Double): Self = StObject.set(x, "proxyTimeout", value.asInstanceOf[js.Any])
      
      inline def setProxyTimeoutUndefined: Self = StObject.set(x, "proxyTimeout", js.undefined)
      
      inline def setRuntime(value: Exclude[ServerRuntime, Unit]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setScrollRestoration(value: Boolean): Self = StObject.set(x, "scrollRestoration", value.asInstanceOf[js.Any])
      
      inline def setScrollRestorationUndefined: Self = StObject.set(x, "scrollRestoration", js.undefined)
      
      inline def setServerComponentsExternalPackages(value: js.Array[String]): Self = StObject.set(x, "serverComponentsExternalPackages", value.asInstanceOf[js.Any])
      
      inline def setServerComponentsExternalPackagesUndefined: Self = StObject.set(x, "serverComponentsExternalPackages", js.undefined)
      
      inline def setServerComponentsExternalPackagesVarargs(value: String*): Self = StObject.set(x, "serverComponentsExternalPackages", js.Array(value*))
      
      inline def setSharedPool(value: Boolean): Self = StObject.set(x, "sharedPool", value.asInstanceOf[js.Any])
      
      inline def setSharedPoolUndefined: Self = StObject.set(x, "sharedPool", js.undefined)
      
      inline def setSkipMiddlewareUrlNormalize(value: Boolean): Self = StObject.set(x, "skipMiddlewareUrlNormalize", value.asInstanceOf[js.Any])
      
      inline def setSkipMiddlewareUrlNormalizeUndefined: Self = StObject.set(x, "skipMiddlewareUrlNormalize", js.undefined)
      
      inline def setSkipTrailingSlashRedirect(value: Boolean): Self = StObject.set(x, "skipTrailingSlashRedirect", value.asInstanceOf[js.Any])
      
      inline def setSkipTrailingSlashRedirectUndefined: Self = StObject.set(x, "skipTrailingSlashRedirect", js.undefined)
      
      inline def setSri(value: Algorithm): Self = StObject.set(x, "sri", value.asInstanceOf[js.Any])
      
      inline def setSriUndefined: Self = StObject.set(x, "sri", js.undefined)
      
      inline def setSwcFileReading(value: Boolean): Self = StObject.set(x, "swcFileReading", value.asInstanceOf[js.Any])
      
      inline def setSwcFileReadingUndefined: Self = StObject.set(x, "swcFileReading", js.undefined)
      
      inline def setSwcMinify(value: Boolean): Self = StObject.set(x, "swcMinify", value.asInstanceOf[js.Any])
      
      inline def setSwcMinifyDebugOptions(value: Compress): Self = StObject.set(x, "swcMinifyDebugOptions", value.asInstanceOf[js.Any])
      
      inline def setSwcMinifyDebugOptionsUndefined: Self = StObject.set(x, "swcMinifyDebugOptions", js.undefined)
      
      inline def setSwcMinifyUndefined: Self = StObject.set(x, "swcMinify", js.undefined)
      
      inline def setSwcPlugins(value: js.Array[js.Tuple2[String, Record[String, Any]]]): Self = StObject.set(x, "swcPlugins", value.asInstanceOf[js.Any])
      
      inline def setSwcPluginsUndefined: Self = StObject.set(x, "swcPlugins", js.undefined)
      
      inline def setSwcPluginsVarargs(value: (js.Tuple2[String, Record[String, Any]])*): Self = StObject.set(x, "swcPlugins", js.Array(value*))
      
      inline def setSwcTraceProfiling(value: Boolean): Self = StObject.set(x, "swcTraceProfiling", value.asInstanceOf[js.Any])
      
      inline def setSwcTraceProfilingUndefined: Self = StObject.set(x, "swcTraceProfiling", js.undefined)
      
      inline def setTranspilePackages(value: js.Array[String]): Self = StObject.set(x, "transpilePackages", value.asInstanceOf[js.Any])
      
      inline def setTranspilePackagesUndefined: Self = StObject.set(x, "transpilePackages", js.undefined)
      
      inline def setTranspilePackagesVarargs(value: String*): Self = StObject.set(x, "transpilePackages", js.Array(value*))
      
      inline def setTurbotrace(value: ContextDirectory): Self = StObject.set(x, "turbotrace", value.asInstanceOf[js.Any])
      
      inline def setTurbotraceUndefined: Self = StObject.set(x, "turbotrace", js.undefined)
      
      inline def setUrlImports(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<next.next/dist/compiled/webpack/webpack.webpack.Configuration['experiments']>['buildHttp'] */ js.Any
      ): Self = StObject.set(x, "urlImports", value.asInstanceOf[js.Any])
      
      inline def setUrlImportsUndefined: Self = StObject.set(x, "urlImports", js.undefined)
      
      inline def setWebVitalsAttribution(value: js.Array[CLS | FCP | FID | INP | LCP | TTFB]): Self = StObject.set(x, "webVitalsAttribution", value.asInstanceOf[js.Any])
      
      inline def setWebVitalsAttributionUndefined: Self = StObject.set(x, "webVitalsAttribution", js.undefined)
      
      inline def setWebVitalsAttributionVarargs(value: (CLS | FCP | FID | INP | LCP | TTFB)*): Self = StObject.set(x, "webVitalsAttribution", js.Array(value*))
      
      inline def setWorkerThreads(value: Boolean): Self = StObject.set(x, "workerThreads", value.asInstanceOf[js.Any])
      
      inline def setWorkerThreadsUndefined: Self = StObject.set(x, "workerThreads", js.undefined)
    }
  }
  
  type ExportPathMap = StringDictionary[Page]
  
  trait I18NConfig extends StObject {
    
    var defaultLocale: String
    
    var domains: js.UndefOr[js.Array[DomainLocale]] = js.undefined
    
    var localeDetection: js.UndefOr[`false`] = js.undefined
    
    var locales: js.Array[String]
  }
  object I18NConfig {
    
    inline def apply(defaultLocale: String, locales: js.Array[String]): I18NConfig = {
      val __obj = js.Dynamic.literal(defaultLocale = defaultLocale.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18NConfig]
    }
    
    extension [Self <: I18NConfig](x: Self) {
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDomains(value: js.Array[DomainLocale]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
      
      inline def setDomainsVarargs(value: DomainLocale*): Self = StObject.set(x, "domains", js.Array(value*))
      
      inline def setLocaleDetection(value: `false`): Self = StObject.set(x, "localeDetection", value.asInstanceOf[js.Any])
      
      inline def setLocaleDetectionUndefined: Self = StObject.set(x, "localeDetection", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait NextConfig extends StObject {
    
    /** @see [`next/amp`](https://nextjs.org/docs/api-reference/next/amp) */
    var amp: js.UndefOr[CanonicalBase] = js.undefined
    
    /**
      * The field should only be used when a Next.js project is not hosted on Vercel while using Vercel Analytics.
      * Vercel provides zero-configuration analytics for Next.js projects hosted on Vercel.
      *
      * @default ''
      * @see [Next.js Analytics](https://nextjs.org/analytics)
      */
    var analyticsId: js.UndefOr[String] = js.undefined
    
    /**
      * To set up a CDN, you can set up an asset prefix and configure your CDN's origin to resolve to the domain that Next.js is hosted on.
      *
      * @see [CDN Support with Asset Prefix](https://nextjs.org/docs/api-reference/next.config.js/cdn-support-with-asset-prefix)
      */
    var assetPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Deploy a Next.js application under a sub-path of a domain
      *
      * @see [Base path configuration](https://nextjs.org/docs/api-reference/next.config.js/basepath)
      */
    var basePath: js.UndefOr[String] = js.undefined
    
    /**
      * The build output directory (defaults to `.next`) is now cleared by default except for the Next.js caches.
      */
    var cleanDistDir: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optionally enable compiler transforms
      *
      * @see [Supported Compiler Options](https://nextjs.org/docs/advanced-features/compiler#supported-features)
      */
    var compiler: js.UndefOr[Emotion] = js.undefined
    
    /** @see [Compression documentation](https://nextjs.org/docs/api-reference/next.config.js/compression) */
    var compress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add `"crossorigin"` attribute to generated `<script>` elements generated by `<Head />` or `<NextScript />` components
      *
      *
      * @see [`crossorigin` attribute documentation](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/crossorigin)
      */
    var crossOrigin: js.UndefOr[`false` | anonymous | `use-credentials`] = js.undefined
    
    /** Configure indicators in development environment */
    var devIndicators: js.UndefOr[BuildActivity] = js.undefined
    
    /**
      * Destination directory (defaults to `.next`)
      */
    var distDir: js.UndefOr[String] = js.undefined
    
    /**
      * Next.js comes with built-in support for environment variables
      *
      * @see [Environment Variables documentation](https://nextjs.org/docs/api-reference/next.config.js/environment-variables)
      */
    var env: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * @since version 11
      * @see [ESLint configuration](https://nextjs.org/docs/basic-features/eslint)
      */
    var eslint: js.UndefOr[ESLintConfig] = js.undefined
    
    /**
      * @see [Moment.js locales excluded by default](https://nextjs.org/docs/upgrading#momentjs-locales-excluded-by-default)
      */
    var excludeDefaultMomentLocales: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable experimental features. Note that all experimental features are subject to breaking changes in the future.
      */
    var experimental: js.UndefOr[ExperimentalConfig] = js.undefined
    
    var exportPathMap: js.UndefOr[
        js.Function2[
          /* defaultMap */ ExportPathMap, 
          /* ctx */ OutDir, 
          js.Promise[ExportPathMap] | ExportPathMap
        ]
      ] = js.undefined
    
    /**
      * @see [Configuring the build ID](https://nextjs.org/docs/api-reference/next.config.js/configuring-the-build-id)
      */
    var generateBuildId: js.UndefOr[js.Function0[String | Null | (js.Promise[String | Null])]] = js.undefined
    
    /** @see [Disabling ETag Configuration](https://nextjs.org/docs/api-reference/next.config.js/disabling-etag-generation) */
    var generateEtags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Headers allow you to set custom HTTP headers for an incoming request path.
      *
      * @see [Headers configuration documentation](https://nextjs.org/docs/api-reference/next.config.js/headers)
      */
    var headers: js.UndefOr[js.Function0[js.Promise[js.Array[Header]]]] = js.undefined
    
    /**
      * Next.js automatically polyfills node-fetch and enables HTTP Keep-Alive by default.
      * You may want to disable HTTP Keep-Alive for certain `fetch()` calls or globally.
      *
      * @see [Disabling HTTP Keep-Alive](https://nextjs.org/docs/api-reference/next.config.js/disabling-http-keep-alive)
      */
    var httpAgentOptions: js.UndefOr[KeepAlive] = js.undefined
    
    /**
      * Internationalization configuration
      *
      * @see [Internationalization docs](https://nextjs.org/docs/advanced-features/i18n-routing)
      */
    var i18n: js.UndefOr[I18NConfig | Null] = js.undefined
    
    /** @see [Using the Image Component](https://nextjs.org/docs/basic-features/image-optimization#using-the-image-component) */
    var images: js.UndefOr[ImageConfig] = js.undefined
    
    /**
      * Next.js exposes some options that give you some control over how the server will dispose or keep in memory built pages in development.
      *
      * @see [Configuring `onDemandEntries`](https://nextjs.org/docs/api-reference/next.config.js/configuring-onDemandEntries)
      */
    var onDemandEntries: js.UndefOr[MaxInactiveAge] = js.undefined
    
    /**
      * By default, Next.js will automatically inline font CSS at build time
      *
      * @default true
      * @since version 10.2
      * @see [Font Optimization](https://nextjs.org/docs/basic-features/font-optimization)
      */
    var optimizeFonts: js.UndefOr[Boolean] = js.undefined
    
    var output: js.UndefOr[standalone] = js.undefined
    
    /**
      * During a build, Next.js will automatically trace each page and its dependencies to determine all of the files
      * that are needed for deploying a production version of your application.
      *
      * @see [Output File Tracing](https://nextjs.org/docs/advanced-features/output-file-tracing)
      */
    var outputFileTracing: js.UndefOr[Boolean] = js.undefined
    
    /** @see [Including non-page files in the pages directory](https://nextjs.org/docs/api-reference/next.config.js/custom-page-extensions) */
    var pageExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /** @see [Disabling x-powered-by](https://nextjs.org/docs/api-reference/next.config.js/disabling-x-powered-by) */
    var poweredByHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable browser source map generation during the production build
      *
      * @see [Source Maps](https://nextjs.org/docs/advanced-features/source-maps)
      */
    var productionBrowserSourceMaps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add public (in browser) runtime configuration to your app
      *
      * @see [Runtime configuration](https://nextjs.org/docs/api-reference/next.config.js/runtime-configuration)
      */
    var publicRuntimeConfig: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * The Next.js runtime is Strict Mode-compliant.
      *
      * @see [React Strict Mode](https://nextjs.org/docs/api-reference/next.config.js/react-strict-mode)
      */
    var reactStrictMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Redirects allow you to redirect an incoming request path to a different destination path.
      *
      * @see [Redirects configuration documentation](https://nextjs.org/docs/api-reference/next.config.js/redirects)
      */
    var redirects: js.UndefOr[js.Function0[js.Promise[js.Array[Redirect]]]] = js.undefined
    
    /**
      * Rewrites allow you to map an incoming request path to a different destination path.
      *
      * @see [Rewrites configuration documentation](https://nextjs.org/docs/api-reference/next.config.js/rewrites)
      */
    var rewrites: js.UndefOr[js.Function0[js.Promise[js.Array[Rewrite] | AfterFilesBeforeFiles]]] = js.undefined
    
    /** @see [Customizing sass options](https://nextjs.org/docs/basic-features/built-in-css-support#customizing-sass-options) */
    var sassOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Add server runtime configuration to your app
      *
      * @see [Runtime configuration](https://nextjs.org/docs/api-reference/next.config.js/runtime-configuration)
      */
    var serverRuntimeConfig: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Timeout after waiting to generate static pages in seconds
      *
      * @default 60
      */
    var staticPageGenerationTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Use [SWC compiler](https://swc.rs) to minify the generated JavaScript
      *
      * @see [SWC Minification](https://nextjs.org/docs/advanced-features/compiler#minification)
      */
    var swcMinify: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default Next.js will redirect urls with trailing slashes to their counterpart without a trailing slash.
      *
      * @default false
      * @see [Trailing Slash Configuration](https://nextjs.org/docs/api-reference/next.config.js/trailing-slash)
      */
    var trailingSlash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @see [Next.js TypeScript documentation](https://nextjs.org/docs/basic-features/typescript)
      */
    var typescript: js.UndefOr[TypeScriptConfig] = js.undefined
    
    /**
      * By default, `Next` will serve each file in the `pages` folder under a pathname matching the filename.
      * To disable this behavior and prevent routing based set this to `true`.
      *
      * @default true
      * @see [Disabling file-system routing](https://nextjs.org/docs/advanced-features/custom-server#disabling-file-system-routing)
      */
    var useFileSystemPublicRoutes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Before continuing to add custom webpack configuration to your application make sure Next.js doesn't already support your use-case
      *
      * @see [Custom Webpack Config documentation](https://nextjs.org/docs/api-reference/next.config.js/custom-webpack-config)
      */
    var webpack: js.UndefOr[NextJsWebpackConfig | Null] = js.undefined
  }
  object NextConfig {
    
    inline def apply(): NextConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NextConfig]
    }
    
    extension [Self <: NextConfig](x: Self) {
      
      inline def setAmp(value: CanonicalBase): Self = StObject.set(x, "amp", value.asInstanceOf[js.Any])
      
      inline def setAmpUndefined: Self = StObject.set(x, "amp", js.undefined)
      
      inline def setAnalyticsId(value: String): Self = StObject.set(x, "analyticsId", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsIdUndefined: Self = StObject.set(x, "analyticsId", js.undefined)
      
      inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
      
      inline def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setCleanDistDir(value: Boolean): Self = StObject.set(x, "cleanDistDir", value.asInstanceOf[js.Any])
      
      inline def setCleanDistDirUndefined: Self = StObject.set(x, "cleanDistDir", js.undefined)
      
      inline def setCompiler(value: Emotion): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setCrossOrigin(value: `false` | anonymous | `use-credentials`): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDevIndicators(value: BuildActivity): Self = StObject.set(x, "devIndicators", value.asInstanceOf[js.Any])
      
      inline def setDevIndicatorsUndefined: Self = StObject.set(x, "devIndicators", js.undefined)
      
      inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
      
      inline def setDistDirUndefined: Self = StObject.set(x, "distDir", js.undefined)
      
      inline def setEnv(value: Record[String, String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setEslint(value: ESLintConfig): Self = StObject.set(x, "eslint", value.asInstanceOf[js.Any])
      
      inline def setEslintUndefined: Self = StObject.set(x, "eslint", js.undefined)
      
      inline def setExcludeDefaultMomentLocales(value: Boolean): Self = StObject.set(x, "excludeDefaultMomentLocales", value.asInstanceOf[js.Any])
      
      inline def setExcludeDefaultMomentLocalesUndefined: Self = StObject.set(x, "excludeDefaultMomentLocales", js.undefined)
      
      inline def setExperimental(value: ExperimentalConfig): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
      
      inline def setExportPathMap(
        value: (/* defaultMap */ ExportPathMap, /* ctx */ OutDir) => js.Promise[ExportPathMap] | ExportPathMap
      ): Self = StObject.set(x, "exportPathMap", js.Any.fromFunction2(value))
      
      inline def setExportPathMapUndefined: Self = StObject.set(x, "exportPathMap", js.undefined)
      
      inline def setGenerateBuildId(value: () => String | Null | (js.Promise[String | Null])): Self = StObject.set(x, "generateBuildId", js.Any.fromFunction0(value))
      
      inline def setGenerateBuildIdUndefined: Self = StObject.set(x, "generateBuildId", js.undefined)
      
      inline def setGenerateEtags(value: Boolean): Self = StObject.set(x, "generateEtags", value.asInstanceOf[js.Any])
      
      inline def setGenerateEtagsUndefined: Self = StObject.set(x, "generateEtags", js.undefined)
      
      inline def setHeaders(value: () => js.Promise[js.Array[Header]]): Self = StObject.set(x, "headers", js.Any.fromFunction0(value))
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHttpAgentOptions(value: KeepAlive): Self = StObject.set(x, "httpAgentOptions", value.asInstanceOf[js.Any])
      
      inline def setHttpAgentOptionsUndefined: Self = StObject.set(x, "httpAgentOptions", js.undefined)
      
      inline def setI18n(value: I18NConfig): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nNull: Self = StObject.set(x, "i18n", null)
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setImages(value: ImageConfig): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setOnDemandEntries(value: MaxInactiveAge): Self = StObject.set(x, "onDemandEntries", value.asInstanceOf[js.Any])
      
      inline def setOnDemandEntriesUndefined: Self = StObject.set(x, "onDemandEntries", js.undefined)
      
      inline def setOptimizeFonts(value: Boolean): Self = StObject.set(x, "optimizeFonts", value.asInstanceOf[js.Any])
      
      inline def setOptimizeFontsUndefined: Self = StObject.set(x, "optimizeFonts", js.undefined)
      
      inline def setOutput(value: standalone): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputFileTracing(value: Boolean): Self = StObject.set(x, "outputFileTracing", value.asInstanceOf[js.Any])
      
      inline def setOutputFileTracingUndefined: Self = StObject.set(x, "outputFileTracing", js.undefined)
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPageExtensions(value: js.Array[String]): Self = StObject.set(x, "pageExtensions", value.asInstanceOf[js.Any])
      
      inline def setPageExtensionsUndefined: Self = StObject.set(x, "pageExtensions", js.undefined)
      
      inline def setPageExtensionsVarargs(value: String*): Self = StObject.set(x, "pageExtensions", js.Array(value*))
      
      inline def setPoweredByHeader(value: Boolean): Self = StObject.set(x, "poweredByHeader", value.asInstanceOf[js.Any])
      
      inline def setPoweredByHeaderUndefined: Self = StObject.set(x, "poweredByHeader", js.undefined)
      
      inline def setProductionBrowserSourceMaps(value: Boolean): Self = StObject.set(x, "productionBrowserSourceMaps", value.asInstanceOf[js.Any])
      
      inline def setProductionBrowserSourceMapsUndefined: Self = StObject.set(x, "productionBrowserSourceMaps", js.undefined)
      
      inline def setPublicRuntimeConfig(value: StringDictionary[Any]): Self = StObject.set(x, "publicRuntimeConfig", value.asInstanceOf[js.Any])
      
      inline def setPublicRuntimeConfigUndefined: Self = StObject.set(x, "publicRuntimeConfig", js.undefined)
      
      inline def setReactStrictMode(value: Boolean): Self = StObject.set(x, "reactStrictMode", value.asInstanceOf[js.Any])
      
      inline def setReactStrictModeUndefined: Self = StObject.set(x, "reactStrictMode", js.undefined)
      
      inline def setRedirects(value: () => js.Promise[js.Array[Redirect]]): Self = StObject.set(x, "redirects", js.Any.fromFunction0(value))
      
      inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      inline def setRewrites(value: () => js.Promise[js.Array[Rewrite] | AfterFilesBeforeFiles]): Self = StObject.set(x, "rewrites", js.Any.fromFunction0(value))
      
      inline def setRewritesUndefined: Self = StObject.set(x, "rewrites", js.undefined)
      
      inline def setSassOptions(value: StringDictionary[Any]): Self = StObject.set(x, "sassOptions", value.asInstanceOf[js.Any])
      
      inline def setSassOptionsUndefined: Self = StObject.set(x, "sassOptions", js.undefined)
      
      inline def setServerRuntimeConfig(value: StringDictionary[Any]): Self = StObject.set(x, "serverRuntimeConfig", value.asInstanceOf[js.Any])
      
      inline def setServerRuntimeConfigUndefined: Self = StObject.set(x, "serverRuntimeConfig", js.undefined)
      
      inline def setStaticPageGenerationTimeout(value: Double): Self = StObject.set(x, "staticPageGenerationTimeout", value.asInstanceOf[js.Any])
      
      inline def setStaticPageGenerationTimeoutUndefined: Self = StObject.set(x, "staticPageGenerationTimeout", js.undefined)
      
      inline def setSwcMinify(value: Boolean): Self = StObject.set(x, "swcMinify", value.asInstanceOf[js.Any])
      
      inline def setSwcMinifyUndefined: Self = StObject.set(x, "swcMinify", js.undefined)
      
      inline def setTrailingSlash(value: Boolean): Self = StObject.set(x, "trailingSlash", value.asInstanceOf[js.Any])
      
      inline def setTrailingSlashUndefined: Self = StObject.set(x, "trailingSlash", js.undefined)
      
      inline def setTypescript(value: TypeScriptConfig): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
      
      inline def setTypescriptUndefined: Self = StObject.set(x, "typescript", js.undefined)
      
      inline def setUseFileSystemPublicRoutes(value: Boolean): Self = StObject.set(x, "useFileSystemPublicRoutes", value.asInstanceOf[js.Any])
      
      inline def setUseFileSystemPublicRoutesUndefined: Self = StObject.set(x, "useFileSystemPublicRoutes", js.undefined)
      
      inline def setWebpack(value: (/* config */ Any, /* context */ WebpackConfigContext) => Any): Self = StObject.set(x, "webpack", js.Any.fromFunction2(value))
      
      inline def setWebpackNull: Self = StObject.set(x, "webpack", null)
      
      inline def setWebpackUndefined: Self = StObject.set(x, "webpack", js.undefined)
    }
  }
  
  type NextConfigComplete = Required[NextConfig] & ConfigFile
  
  type NextJsWebpackConfig = js.Function2[/* config */ Any, /* context */ WebpackConfigContext, Any]
  
  trait TypeScriptConfig extends StObject {
    
    /** Do not run TypeScript during production builds (`next build`). */
    var ignoreBuildErrors: js.UndefOr[Boolean] = js.undefined
    
    /** Relative path to a custom tsconfig file */
    var tsconfigPath: js.UndefOr[String] = js.undefined
  }
  object TypeScriptConfig {
    
    inline def apply(): TypeScriptConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeScriptConfig]
    }
    
    extension [Self <: TypeScriptConfig](x: Self) {
      
      inline def setIgnoreBuildErrors(value: Boolean): Self = StObject.set(x, "ignoreBuildErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBuildErrorsUndefined: Self = StObject.set(x, "ignoreBuildErrors", js.undefined)
      
      inline def setTsconfigPath(value: String): Self = StObject.set(x, "tsconfigPath", value.asInstanceOf[js.Any])
      
      inline def setTsconfigPathUndefined: Self = StObject.set(x, "tsconfigPath", js.undefined)
    }
  }
  
  trait WebpackConfigContext extends StObject {
    
    /**  The build id, used as a unique identifier between builds */
    var buildId: String
    
    /** The next.config.js merged with default values */
    var config: NextConfigComplete
    
    /** Default loaders used internally by Next.js */
    var defaultLoaders: Babel
    
    /** Indicates if the compilation will be done in development */
    var dev: Boolean
    
    /** Next.js root directory */
    var dir: String
    
    /** It's `true` for server-side compilation, and `false` for client-side compilation */
    var isServer: Boolean
    
    /** The current server runtime */
    var nextRuntime: js.UndefOr[nodejs | edge] = js.undefined
    
    /** Number of total Next.js pages */
    var totalPages: Double
    
    /** The webpack configuration */
    var webpack: Any
  }
  object WebpackConfigContext {
    
    inline def apply(
      buildId: String,
      config: NextConfigComplete,
      defaultLoaders: Babel,
      dev: Boolean,
      dir: String,
      isServer: Boolean,
      totalPages: Double,
      webpack: Any
    ): WebpackConfigContext = {
      val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], defaultLoaders = defaultLoaders.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any], webpack = webpack.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackConfigContext]
    }
    
    extension [Self <: WebpackConfigContext](x: Self) {
      
      inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: NextConfigComplete): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDefaultLoaders(value: Babel): Self = StObject.set(x, "defaultLoaders", value.asInstanceOf[js.Any])
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
      
      inline def setNextRuntime(value: nodejs | edge): Self = StObject.set(x, "nextRuntime", value.asInstanceOf[js.Any])
      
      inline def setNextRuntimeUndefined: Self = StObject.set(x, "nextRuntime", js.undefined)
      
      inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      inline def setWebpack(value: Any): Self = StObject.set(x, "webpack", value.asInstanceOf[js.Any])
    }
  }
}
