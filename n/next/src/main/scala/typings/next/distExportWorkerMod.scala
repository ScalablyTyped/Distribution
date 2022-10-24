package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.Content
import typings.next.anon.Warnings
import typings.next.distServerConfigSharedMod.DomainLocale
import typings.next.distServerFontUtilsMod.FontConfig
import typings.next.distServerFontUtilsMod.FontManifest
import typings.next.distServerRequestMetaMod.NextParsedUrlQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExportWorkerMod {
  
  @JSImport("next/dist/export/worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: ExportPageInput): js.Promise[ExportPageResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExportPageResults]]
  
  trait AmpValidation extends StObject {
    
    var page: String
    
    var result: Warnings
  }
  object AmpValidation {
    
    inline def apply(page: String, result: Warnings): AmpValidation = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[AmpValidation]
    }
    
    extension [Self <: AmpValidation](x: Self) {
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Warnings): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExportPageInput extends StObject {
    
    var appPaths: js.Array[String]
    
    var buildExport: js.UndefOr[Boolean] = js.undefined
    
    var disableOptimizedLoading: Any
    
    var distDir: String
    
    var httpAgentOptions: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['httpAgentOptions'] */ js.Any
    
    var optimizeCss: Any
    
    var optimizeFonts: FontConfig
    
    var outDir: String
    
    var pagesDataDir: String
    
    var parentSpanId: Any
    
    var path: String
    
    var pathMap: PathMap
    
    var renderOpts: RenderOpts
    
    var serverComponents: js.UndefOr[Boolean] = js.undefined
    
    var serverRuntimeConfig: StringDictionary[Any]
    
    var serverless: Boolean
    
    var subFolders: js.UndefOr[Boolean] = js.undefined
  }
  object ExportPageInput {
    
    inline def apply(
      appPaths: js.Array[String],
      disableOptimizedLoading: Any,
      distDir: String,
      httpAgentOptions: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['httpAgentOptions'] */ js.Any,
      optimizeCss: Any,
      optimizeFonts: FontConfig,
      outDir: String,
      pagesDataDir: String,
      parentSpanId: Any,
      path: String,
      pathMap: PathMap,
      renderOpts: RenderOpts,
      serverRuntimeConfig: StringDictionary[Any],
      serverless: Boolean
    ): ExportPageInput = {
      val __obj = js.Dynamic.literal(appPaths = appPaths.asInstanceOf[js.Any], disableOptimizedLoading = disableOptimizedLoading.asInstanceOf[js.Any], distDir = distDir.asInstanceOf[js.Any], httpAgentOptions = httpAgentOptions.asInstanceOf[js.Any], optimizeCss = optimizeCss.asInstanceOf[js.Any], optimizeFonts = optimizeFonts.asInstanceOf[js.Any], outDir = outDir.asInstanceOf[js.Any], pagesDataDir = pagesDataDir.asInstanceOf[js.Any], parentSpanId = parentSpanId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathMap = pathMap.asInstanceOf[js.Any], renderOpts = renderOpts.asInstanceOf[js.Any], serverRuntimeConfig = serverRuntimeConfig.asInstanceOf[js.Any], serverless = serverless.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportPageInput]
    }
    
    extension [Self <: ExportPageInput](x: Self) {
      
      inline def setAppPaths(value: js.Array[String]): Self = StObject.set(x, "appPaths", value.asInstanceOf[js.Any])
      
      inline def setAppPathsVarargs(value: String*): Self = StObject.set(x, "appPaths", js.Array(value*))
      
      inline def setBuildExport(value: Boolean): Self = StObject.set(x, "buildExport", value.asInstanceOf[js.Any])
      
      inline def setBuildExportUndefined: Self = StObject.set(x, "buildExport", js.undefined)
      
      inline def setDisableOptimizedLoading(value: Any): Self = StObject.set(x, "disableOptimizedLoading", value.asInstanceOf[js.Any])
      
      inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
      
      inline def setHttpAgentOptions(
        value: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['httpAgentOptions'] */ js.Any
      ): Self = StObject.set(x, "httpAgentOptions", value.asInstanceOf[js.Any])
      
      inline def setOptimizeCss(value: Any): Self = StObject.set(x, "optimizeCss", value.asInstanceOf[js.Any])
      
      inline def setOptimizeFonts(value: FontConfig): Self = StObject.set(x, "optimizeFonts", value.asInstanceOf[js.Any])
      
      inline def setOutDir(value: String): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
      
      inline def setPagesDataDir(value: String): Self = StObject.set(x, "pagesDataDir", value.asInstanceOf[js.Any])
      
      inline def setParentSpanId(value: Any): Self = StObject.set(x, "parentSpanId", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathMap(value: PathMap): Self = StObject.set(x, "pathMap", value.asInstanceOf[js.Any])
      
      inline def setRenderOpts(value: RenderOpts): Self = StObject.set(x, "renderOpts", value.asInstanceOf[js.Any])
      
      inline def setServerComponents(value: Boolean): Self = StObject.set(x, "serverComponents", value.asInstanceOf[js.Any])
      
      inline def setServerComponentsUndefined: Self = StObject.set(x, "serverComponents", js.undefined)
      
      inline def setServerRuntimeConfig(value: StringDictionary[Any]): Self = StObject.set(x, "serverRuntimeConfig", value.asInstanceOf[js.Any])
      
      inline def setServerless(value: Boolean): Self = StObject.set(x, "serverless", value.asInstanceOf[js.Any])
      
      inline def setSubFolders(value: Boolean): Self = StObject.set(x, "subFolders", value.asInstanceOf[js.Any])
      
      inline def setSubFoldersUndefined: Self = StObject.set(x, "subFolders", js.undefined)
    }
  }
  
  trait ExportPageResults extends StObject {
    
    var ampValidations: js.Array[AmpValidation]
    
    var duration: Double
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var fromBuildExportRevalidate: js.UndefOr[Double] = js.undefined
    
    var ssgNotFound: js.UndefOr[Boolean] = js.undefined
  }
  object ExportPageResults {
    
    inline def apply(ampValidations: js.Array[AmpValidation], duration: Double): ExportPageResults = {
      val __obj = js.Dynamic.literal(ampValidations = ampValidations.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportPageResults]
    }
    
    extension [Self <: ExportPageResults](x: Self) {
      
      inline def setAmpValidations(value: js.Array[AmpValidation]): Self = StObject.set(x, "ampValidations", value.asInstanceOf[js.Any])
      
      inline def setAmpValidationsVarargs(value: AmpValidation*): Self = StObject.set(x, "ampValidations", js.Array(value*))
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFromBuildExportRevalidate(value: Double): Self = StObject.set(x, "fromBuildExportRevalidate", value.asInstanceOf[js.Any])
      
      inline def setFromBuildExportRevalidateUndefined: Self = StObject.set(x, "fromBuildExportRevalidate", js.undefined)
      
      inline def setSsgNotFound(value: Boolean): Self = StObject.set(x, "ssgNotFound", value.asInstanceOf[js.Any])
      
      inline def setSsgNotFoundUndefined: Self = StObject.set(x, "ssgNotFound", js.undefined)
    }
  }
  
  trait PathMap extends StObject {
    
    var page: String
    
    var query: js.UndefOr[NextParsedUrlQuery] = js.undefined
  }
  object PathMap {
    
    inline def apply(page: String): PathMap = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathMap]
    }
    
    extension [Self <: PathMap](x: Self) {
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: NextParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait RenderOpts extends StObject {
    
    var ampPath: js.UndefOr[String] = js.undefined
    
    var ampSkipValidation: js.UndefOr[Boolean] = js.undefined
    
    var ampValidatorPath: js.UndefOr[String] = js.undefined
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var disableOptimizedLoading: js.UndefOr[Boolean] = js.undefined
    
    var domainLocales: js.UndefOr[js.Array[DomainLocale]] = js.undefined
    
    var fontManifest: js.UndefOr[FontManifest] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    var optimizeCss: js.UndefOr[Any] = js.undefined
    
    var optimizeFonts: js.UndefOr[FontConfig] = js.undefined
    
    var params: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
    
    var runtimeConfig: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var trailingSlash: js.UndefOr[Boolean] = js.undefined
  }
  object RenderOpts {
    
    inline def apply(): RenderOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOpts]
    }
    
    extension [Self <: RenderOpts](x: Self) {
      
      inline def setAmpPath(value: String): Self = StObject.set(x, "ampPath", value.asInstanceOf[js.Any])
      
      inline def setAmpPathUndefined: Self = StObject.set(x, "ampPath", js.undefined)
      
      inline def setAmpSkipValidation(value: Boolean): Self = StObject.set(x, "ampSkipValidation", value.asInstanceOf[js.Any])
      
      inline def setAmpSkipValidationUndefined: Self = StObject.set(x, "ampSkipValidation", js.undefined)
      
      inline def setAmpValidatorPath(value: String): Self = StObject.set(x, "ampValidatorPath", value.asInstanceOf[js.Any])
      
      inline def setAmpValidatorPathUndefined: Self = StObject.set(x, "ampValidatorPath", js.undefined)
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setDisableOptimizedLoading(value: Boolean): Self = StObject.set(x, "disableOptimizedLoading", value.asInstanceOf[js.Any])
      
      inline def setDisableOptimizedLoadingUndefined: Self = StObject.set(x, "disableOptimizedLoading", js.undefined)
      
      inline def setDomainLocales(value: js.Array[DomainLocale]): Self = StObject.set(x, "domainLocales", value.asInstanceOf[js.Any])
      
      inline def setDomainLocalesUndefined: Self = StObject.set(x, "domainLocales", js.undefined)
      
      inline def setDomainLocalesVarargs(value: DomainLocale*): Self = StObject.set(x, "domainLocales", js.Array(value*))
      
      inline def setFontManifest(value: FontManifest): Self = StObject.set(x, "fontManifest", value.asInstanceOf[js.Any])
      
      inline def setFontManifestUndefined: Self = StObject.set(x, "fontManifest", js.undefined)
      
      inline def setFontManifestVarargs(value: Content*): Self = StObject.set(x, "fontManifest", js.Array(value*))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setOptimizeCss(value: Any): Self = StObject.set(x, "optimizeCss", value.asInstanceOf[js.Any])
      
      inline def setOptimizeCssUndefined: Self = StObject.set(x, "optimizeCss", js.undefined)
      
      inline def setOptimizeFonts(value: FontConfig): Self = StObject.set(x, "optimizeFonts", value.asInstanceOf[js.Any])
      
      inline def setOptimizeFontsUndefined: Self = StObject.set(x, "optimizeFonts", js.undefined)
      
      inline def setParams(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setRuntimeConfig(value: StringDictionary[Any]): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
      
      inline def setRuntimeConfigUndefined: Self = StObject.set(x, "runtimeConfig", js.undefined)
      
      inline def setTrailingSlash(value: Boolean): Self = StObject.set(x, "trailingSlash", value.asInstanceOf[js.Any])
      
      inline def setTrailingSlashUndefined: Self = StObject.set(x, "trailingSlash", js.undefined)
    }
  }
}
