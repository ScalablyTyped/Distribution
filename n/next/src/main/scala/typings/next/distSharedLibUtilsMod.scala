package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.AfterInteractive
import typings.next.anon.AppInitialPropsanynamestr
import typings.next.anon.EnhanceApp
import typings.next.anon.ErrorstatusCodenumberunde
import typings.next.anon.ErrorstatusCodenumberundeCause
import typings.next.anon.GetInitialProps
import typings.next.anon.Head
import typings.next.anon.MaxAge
import typings.next.anon.Mtime
import typings.next.anon.Nonce
import typings.next.anon.Path
import typings.next.anon.UnstableonlyGenerated
import typings.next.distServerConfigSharedMod.DomainLocale
import typings.next.distServerFontUtilsMod.FontConfig
import typings.next.distServerGetPageFilesMod.BuildManifest
import typings.next.distSharedLibRouterRouterMod.NextRouter
import typings.next.nextBooleans.`false`
import typings.next.nextStrings.CLS
import typings.next.nextStrings.FCP
import typings.next.nextStrings.FID
import typings.next.nextStrings.INP
import typings.next.nextStrings.LCP
import typings.next.nextStrings.TTFB
import typings.next.nextStrings.`NextDotjs-hydration`
import typings.next.nextStrings.`NextDotjs-render`
import typings.next.nextStrings.`NextDotjs-route-change-to-render`
import typings.next.typesMod.PreviewData
import typings.next.typesMod.ServerRuntime
import typings.nextEnv.mod.Env
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.global.JSX.Element
import typings.std.Error
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibUtilsMod {
  
  @JSImport("next/dist/shared/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/shared/lib/utils", "DecodeError")
  @js.native
  open class DecodeError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("next/dist/shared/lib/utils", "MiddlewareNotFoundError")
  @js.native
  open class MiddlewareNotFoundError ()
    extends StObject
       with Error {
    
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("next/dist/shared/lib/utils", "MissingStaticPage")
  @js.native
  open class MissingStaticPage protected ()
    extends StObject
       with Error {
    def this(page: String, message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("next/dist/shared/lib/utils", "NormalizeError")
  @js.native
  open class NormalizeError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("next/dist/shared/lib/utils", "PageNotFoundError")
  @js.native
  open class PageNotFoundError protected ()
    extends StObject
       with Error {
    def this(page: String) = this()
    
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("next/dist/shared/lib/utils", "SP")
  @js.native
  val SP: Boolean = js.native
  
  @JSImport("next/dist/shared/lib/utils", "ST")
  @js.native
  val ST: Boolean = js.native
  
  inline def execOnce[T /* <: js.Function1[/* repeated */ Any, ReturnType[T]] */](fn: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("execOnce")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getDisplayName[P](Component: ComponentType[P]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(Component.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getLocationOrigin(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocationOrigin")().asInstanceOf[String]
  
  inline def getURL(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getURL")().asInstanceOf[String]
  
  inline def isAbsoluteUrl(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsoluteUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isResSent(res: ServerResponse[IncomingMessage]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResSent")(res.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def loadGetInitialProps[C /* <: BaseContext */, IP, P](App: NextComponentType[C, IP, P], ctx: C): js.Promise[IP] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadGetInitialProps")(App.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IP]]
  
  inline def normalizeRepeatedSlashes(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRepeatedSlashes")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("next/dist/shared/lib/utils", "warnOnce")
  @js.native
  def warnOnce: js.Function1[/* _ */ String, Unit] = js.native
  inline def warnOnce_=(x: js.Function1[/* _ */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warnOnce")(x.asInstanceOf[js.Any])
  
  trait AppContextType[R /* <: NextRouter */] extends StObject {
    
    var AppTree: AppTreeType
    
    var Component: NextComponentType[NextPageContext, js.Object, js.Object]
    
    var ctx: NextPageContext
    
    var router: R
  }
  object AppContextType {
    
    inline def apply[R /* <: NextRouter */](
      AppTree: AppTreeType,
      Component: NextComponentType[NextPageContext, js.Object, js.Object],
      ctx: NextPageContext,
      router: R
    ): AppContextType[R] = {
      val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppContextType[R]]
    }
    
    extension [Self <: AppContextType[?], R /* <: NextRouter */](x: Self & AppContextType[R]) {
      
      inline def setAppTree(value: AppTreeType): Self = StObject.set(x, "AppTree", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: NextComponentType[NextPageContext, js.Object, js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: NextPageContext): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setRouter(value: R): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppInitialProps[P] extends StObject {
    
    var pageProps: P
  }
  object AppInitialProps {
    
    inline def apply[P](pageProps: P): AppInitialProps[P] = {
      val __obj = js.Dynamic.literal(pageProps = pageProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppInitialProps[P]]
    }
    
    extension [Self <: AppInitialProps[?], P](x: Self & AppInitialProps[P]) {
      
      inline def setPageProps(value: P): Self = StObject.set(x, "pageProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppPropsType[R /* <: NextRouter */, P]
    extends StObject
       with AppInitialProps[P] {
    
    var Component: NextComponentType[NextPageContext, Any, Any]
    
    var __N_SSG: js.UndefOr[Boolean] = js.undefined
    
    var __N_SSP: js.UndefOr[Boolean] = js.undefined
    
    var router: R
  }
  object AppPropsType {
    
    inline def apply[R /* <: NextRouter */, P](Component: NextComponentType[NextPageContext, Any, Any], pageProps: P, router: R): AppPropsType[R, P] = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], pageProps = pageProps.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppPropsType[R, P]]
    }
    
    extension [Self <: AppPropsType[?, ?], R /* <: NextRouter */, P](x: Self & (AppPropsType[R, P])) {
      
      inline def setComponent(value: NextComponentType[NextPageContext, Any, Any]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setRouter(value: R): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def set__N_SSG(value: Boolean): Self = StObject.set(x, "__N_SSG", value.asInstanceOf[js.Any])
      
      inline def set__N_SSGUndefined: Self = StObject.set(x, "__N_SSG", js.undefined)
      
      inline def set__N_SSP(value: Boolean): Self = StObject.set(x, "__N_SSP", value.asInstanceOf[js.Any])
      
      inline def set__N_SSPUndefined: Self = StObject.set(x, "__N_SSP", js.undefined)
    }
  }
  
  type AppTreeType = ComponentType[AppInitialPropsanynamestr]
  
  type AppType[P] = NextComponentType[AppContextType[NextRouter], P, AppPropsType[Any, P]]
  
  trait BaseContext
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    var res: js.UndefOr[ServerResponse[IncomingMessage]] = js.undefined
  }
  object BaseContext {
    
    inline def apply(): BaseContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseContext]
    }
    
    extension [Self <: BaseContext](x: Self) {
      
      inline def setRes(value: ServerResponse[IncomingMessage]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
    }
  }
  
  trait CacheFs extends StObject {
    
    def mkdir(dir: String): js.Promise[Unit | String]
    
    def readFile(f: String): js.Promise[String]
    
    def readFileSync(f: String): String
    
    def stat(f: String): js.Promise[Mtime]
    
    def writeFile(f: String, d: Any): js.Promise[Unit]
  }
  object CacheFs {
    
    inline def apply(
      mkdir: String => js.Promise[Unit | String],
      readFile: String => js.Promise[String],
      readFileSync: String => String,
      stat: String => js.Promise[Mtime],
      writeFile: (String, Any) => js.Promise[Unit]
    ): CacheFs = {
      val __obj = js.Dynamic.literal(mkdir = js.Any.fromFunction1(mkdir), readFile = js.Any.fromFunction1(readFile), readFileSync = js.Any.fromFunction1(readFileSync), stat = js.Any.fromFunction1(stat), writeFile = js.Any.fromFunction2(writeFile))
      __obj.asInstanceOf[CacheFs]
    }
    
    extension [Self <: CacheFs](x: Self) {
      
      inline def setMkdir(value: String => js.Promise[Unit | String]): Self = StObject.set(x, "mkdir", js.Any.fromFunction1(value))
      
      inline def setReadFile(value: String => js.Promise[String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
      
      inline def setReadFileSync(value: String => String): Self = StObject.set(x, "readFileSync", js.Any.fromFunction1(value))
      
      inline def setStat(value: String => js.Promise[Mtime]): Self = StObject.set(x, "stat", js.Any.fromFunction1(value))
      
      inline def setWriteFile(value: (String, Any) => js.Promise[Unit]): Self = StObject.set(x, "writeFile", js.Any.fromFunction2(value))
    }
  }
  
  type ComponentsEnhancer = EnhanceApp | (Enhancer[NextComponentType[NextPageContext, js.Object, js.Object]])
  
  @js.native
  trait DocumentContext
    extends StObject
       with NextPageContext {
    
    def defaultGetInitialProps(ctx: DocumentContext): js.Promise[DocumentInitialProps] = js.native
    def defaultGetInitialProps(ctx: DocumentContext, options: Nonce): js.Promise[DocumentInitialProps] = js.native
    
    var renderPage: RenderPage = js.native
  }
  
  trait DocumentInitialProps
    extends StObject
       with RenderPageResult {
    
    var styles: js.UndefOr[js.Array[ReactElement] | ReactFragment | Element] = js.undefined
  }
  object DocumentInitialProps {
    
    inline def apply(html: String): DocumentInitialProps = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentInitialProps]
    }
    
    extension [Self <: DocumentInitialProps](x: Self) {
      
      inline def setStyles(value: js.Array[ReactElement] | ReactFragment | Element): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setStylesVarargs(value: ReactElement*): Self = StObject.set(x, "styles", js.Array(value*))
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.next.distSharedLibHtmlContextMod.HtmlProps because var conflicts: head, styles. Inlined __NEXT_DATA__, dangerousAsPath, docComponentsRendered, buildManifest, ampPath, inAmpMode, hybridAmp, isDevelopment, dynamicImports, assetPrefix, canonicalBase, headTags, unstable_runtimeJS, unstable_JsPreload, devOnlyCacheBusterQueryString, scriptLoader, locale, disableOptimizedLoading, crossOrigin, optimizeCss, optimizeFonts, nextScriptWorkers, runtime, hasConcurrentFeatures, largePageDataBytes */ trait DocumentProps
    extends StObject
       with DocumentInitialProps {
    
    var __NEXT_DATA__ : NEXT_DATA
    
    var ampPath: String
    
    var assetPrefix: js.UndefOr[String] = js.undefined
    
    var buildManifest: BuildManifest
    
    var canonicalBase: String
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var dangerousAsPath: String
    
    var devOnlyCacheBusterQueryString: String
    
    var disableOptimizedLoading: js.UndefOr[Boolean] = js.undefined
    
    var docComponentsRendered: Head
    
    var dynamicImports: js.Array[String]
    
    var hasConcurrentFeatures: js.UndefOr[Boolean] = js.undefined
    
    var headTags: js.Array[Any]
    
    var hybridAmp: Boolean
    
    var inAmpMode: Boolean
    
    var isDevelopment: Boolean
    
    var largePageDataBytes: js.UndefOr[Double] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var nextScriptWorkers: js.UndefOr[Boolean] = js.undefined
    
    var optimizeCss: js.UndefOr[Any] = js.undefined
    
    var optimizeFonts: js.UndefOr[FontConfig] = js.undefined
    
    var runtime: js.UndefOr[ServerRuntime] = js.undefined
    
    var scriptLoader: AfterInteractive
    
    var unstable_JsPreload: js.UndefOr[`false`] = js.undefined
    
    var unstable_runtimeJS: js.UndefOr[`false`] = js.undefined
  }
  object DocumentProps {
    
    inline def apply(
      __NEXT_DATA__ : NEXT_DATA,
      ampPath: String,
      buildManifest: BuildManifest,
      canonicalBase: String,
      dangerousAsPath: String,
      devOnlyCacheBusterQueryString: String,
      docComponentsRendered: Head,
      dynamicImports: js.Array[String],
      headTags: js.Array[Any],
      html: String,
      hybridAmp: Boolean,
      inAmpMode: Boolean,
      isDevelopment: Boolean,
      scriptLoader: AfterInteractive
    ): DocumentProps = {
      val __obj = js.Dynamic.literal(__NEXT_DATA__ = __NEXT_DATA__.asInstanceOf[js.Any], ampPath = ampPath.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], dangerousAsPath = dangerousAsPath.asInstanceOf[js.Any], devOnlyCacheBusterQueryString = devOnlyCacheBusterQueryString.asInstanceOf[js.Any], docComponentsRendered = docComponentsRendered.asInstanceOf[js.Any], dynamicImports = dynamicImports.asInstanceOf[js.Any], headTags = headTags.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], hybridAmp = hybridAmp.asInstanceOf[js.Any], inAmpMode = inAmpMode.asInstanceOf[js.Any], isDevelopment = isDevelopment.asInstanceOf[js.Any], scriptLoader = scriptLoader.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentProps]
    }
    
    extension [Self <: DocumentProps](x: Self) {
      
      inline def setAmpPath(value: String): Self = StObject.set(x, "ampPath", value.asInstanceOf[js.Any])
      
      inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
      
      inline def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
      
      inline def setBuildManifest(value: BuildManifest): Self = StObject.set(x, "buildManifest", value.asInstanceOf[js.Any])
      
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
      
      inline def setHeadTags(value: js.Array[Any]): Self = StObject.set(x, "headTags", value.asInstanceOf[js.Any])
      
      inline def setHeadTagsVarargs(value: Any*): Self = StObject.set(x, "headTags", js.Array(value*))
      
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
      
      inline def setUnstable_JsPreload(value: `false`): Self = StObject.set(x, "unstable_JsPreload", value.asInstanceOf[js.Any])
      
      inline def setUnstable_JsPreloadUndefined: Self = StObject.set(x, "unstable_JsPreload", js.undefined)
      
      inline def setUnstable_runtimeJS(value: `false`): Self = StObject.set(x, "unstable_runtimeJS", value.asInstanceOf[js.Any])
      
      inline def setUnstable_runtimeJSUndefined: Self = StObject.set(x, "unstable_runtimeJS", js.undefined)
      
      inline def set__NEXT_DATA__(value: NEXT_DATA): Self = StObject.set(x, "__NEXT_DATA__", value.asInstanceOf[js.Any])
    }
  }
  
  type DocumentType = NextComponentType[DocumentContext, DocumentInitialProps, DocumentProps]
  
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  
  trait NEXT_DATA extends StObject {
    
    var appGip: js.UndefOr[Boolean] = js.undefined
    
    var assetPrefix: js.UndefOr[String] = js.undefined
    
    var autoExport: js.UndefOr[Boolean] = js.undefined
    
    var buildId: String
    
    var customServer: js.UndefOr[Boolean] = js.undefined
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var domainLocales: js.UndefOr[js.Array[DomainLocale]] = js.undefined
    
    var dynamicIds: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var err: js.UndefOr[ErrorstatusCodenumberunde] = js.undefined
    
    var gip: js.UndefOr[Boolean] = js.undefined
    
    var gsp: js.UndefOr[Boolean] = js.undefined
    
    var gssp: js.UndefOr[Boolean] = js.undefined
    
    var isFallback: js.UndefOr[Boolean] = js.undefined
    
    var isPreview: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    var nextExport: js.UndefOr[Boolean] = js.undefined
    
    var notFoundSrcPage: js.UndefOr[String] = js.undefined
    
    var page: String
    
    var props: Record[String, Any]
    
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    
    var runtimeConfig: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var scriptLoader: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object NEXT_DATA {
    
    inline def apply(
      buildId: String,
      page: String,
      props: Record[String, Any],
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): NEXT_DATA = {
      val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[NEXT_DATA]
    }
    
    extension [Self <: NEXT_DATA](x: Self) {
      
      inline def setAppGip(value: Boolean): Self = StObject.set(x, "appGip", value.asInstanceOf[js.Any])
      
      inline def setAppGipUndefined: Self = StObject.set(x, "appGip", js.undefined)
      
      inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
      
      inline def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
      
      inline def setAutoExport(value: Boolean): Self = StObject.set(x, "autoExport", value.asInstanceOf[js.Any])
      
      inline def setAutoExportUndefined: Self = StObject.set(x, "autoExport", js.undefined)
      
      inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setCustomServer(value: Boolean): Self = StObject.set(x, "customServer", value.asInstanceOf[js.Any])
      
      inline def setCustomServerUndefined: Self = StObject.set(x, "customServer", js.undefined)
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setDomainLocales(value: js.Array[DomainLocale]): Self = StObject.set(x, "domainLocales", value.asInstanceOf[js.Any])
      
      inline def setDomainLocalesUndefined: Self = StObject.set(x, "domainLocales", js.undefined)
      
      inline def setDomainLocalesVarargs(value: DomainLocale*): Self = StObject.set(x, "domainLocales", js.Array(value*))
      
      inline def setDynamicIds(value: js.Array[String | Double]): Self = StObject.set(x, "dynamicIds", value.asInstanceOf[js.Any])
      
      inline def setDynamicIdsUndefined: Self = StObject.set(x, "dynamicIds", js.undefined)
      
      inline def setDynamicIdsVarargs(value: (String | Double)*): Self = StObject.set(x, "dynamicIds", js.Array(value*))
      
      inline def setErr(value: ErrorstatusCodenumberunde): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setGip(value: Boolean): Self = StObject.set(x, "gip", value.asInstanceOf[js.Any])
      
      inline def setGipUndefined: Self = StObject.set(x, "gip", js.undefined)
      
      inline def setGsp(value: Boolean): Self = StObject.set(x, "gsp", value.asInstanceOf[js.Any])
      
      inline def setGspUndefined: Self = StObject.set(x, "gsp", js.undefined)
      
      inline def setGssp(value: Boolean): Self = StObject.set(x, "gssp", value.asInstanceOf[js.Any])
      
      inline def setGsspUndefined: Self = StObject.set(x, "gssp", js.undefined)
      
      inline def setIsFallback(value: Boolean): Self = StObject.set(x, "isFallback", value.asInstanceOf[js.Any])
      
      inline def setIsFallbackUndefined: Self = StObject.set(x, "isFallback", js.undefined)
      
      inline def setIsPreview(value: Boolean): Self = StObject.set(x, "isPreview", value.asInstanceOf[js.Any])
      
      inline def setIsPreviewUndefined: Self = StObject.set(x, "isPreview", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setNextExport(value: Boolean): Self = StObject.set(x, "nextExport", value.asInstanceOf[js.Any])
      
      inline def setNextExportUndefined: Self = StObject.set(x, "nextExport", js.undefined)
      
      inline def setNotFoundSrcPage(value: String): Self = StObject.set(x, "notFoundSrcPage", value.asInstanceOf[js.Any])
      
      inline def setNotFoundSrcPageUndefined: Self = StObject.set(x, "notFoundSrcPage", js.undefined)
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Record[String, Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setQuery(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRuntimeConfig(value: StringDictionary[Any]): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
      
      inline def setRuntimeConfigUndefined: Self = StObject.set(x, "runtimeConfig", js.undefined)
      
      inline def setScriptLoader(value: js.Array[Any]): Self = StObject.set(x, "scriptLoader", value.asInstanceOf[js.Any])
      
      inline def setScriptLoaderUndefined: Self = StObject.set(x, "scriptLoader", js.undefined)
      
      inline def setScriptLoaderVarargs(value: Any*): Self = StObject.set(x, "scriptLoader", js.Array(value*))
    }
  }
  
  type NextApiHandler[T] = js.Function2[/* req */ NextApiRequest, /* res */ NextApiResponse[T], Any | js.Promise[Any]]
  
  @js.native
  trait NextApiRequest extends IncomingMessage {
    
    var body: Any = js.native
    
    var env: Env = js.native
    
    var preview: js.UndefOr[Boolean] = js.native
    
    /**
      * Preview data set on the request, if any
      * */
    var previewData: js.UndefOr[PreviewData] = js.native
  }
  
  @js.native
  trait NextApiResponse[T] extends ServerResponse[IncomingMessage] {
    
    /**
      * Clear preview data for Next.js' prerender mode
      */
    def clearPreviewData(): NextApiResponse[T] = js.native
    def clearPreviewData(options: Path): NextApiResponse[T] = js.native
    
    /**
      * Send data `json` data in response
      */
    var json: Send[T] = js.native
    
    def redirect(status: Double, url: String): NextApiResponse[T] = js.native
    def redirect(url: String): NextApiResponse[T] = js.native
    
    def revalidate(urlPath: String): js.Promise[Unit] = js.native
    def revalidate(urlPath: String, opts: UnstableonlyGenerated): js.Promise[Unit] = js.native
    
    /**
      * Send data `any` data in response
      */
    var send: Send[T] = js.native
    
    def setPreviewData(data: String): NextApiResponse[T] = js.native
    def setPreviewData(data: String, options: MaxAge): NextApiResponse[T] = js.native
    /**
      * Set preview data for Next.js' prerender mode
      */
    def setPreviewData(data: js.Object): NextApiResponse[T] = js.native
    def setPreviewData(data: js.Object, options: MaxAge): NextApiResponse[T] = js.native
    
    def status(statusCode: Double): NextApiResponse[T] = js.native
    
    /**
      * @deprecated `unstable_revalidate` has been renamed to `revalidate`
      */
    def unstable_revalidate(): Unit = js.native
  }
  
  type NextComponentType[C /* <: BaseContext */, IP, P] = ComponentType[P] & (GetInitialProps[C, IP])
  
  trait NextPageContext extends StObject {
    
    /**
      * `Component` the tree of the App to use if needing to render separately
      */
    var AppTree: AppTreeType
    
    /**
      * `String` of the actual path including query.
      */
    var asPath: js.UndefOr[String] = js.undefined
    
    /**
      * The configured default locale
      */
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    /**
      * Error object if encountered during rendering
      */
    var err: js.UndefOr[ErrorstatusCodenumberundeCause | Null] = js.undefined
    
    /**
      * The currently active locale
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /**
      * All configured locales
      */
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Path section of `URL`.
      */
    var pathname: String
    
    /**
      * Query string section of `URL` parsed as an object.
      */
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    
    /**
      * `HTTP` request object.
      */
    var req: js.UndefOr[IncomingMessage] = js.undefined
    
    /**
      * `HTTP` response object.
      */
    var res: js.UndefOr[ServerResponse[IncomingMessage]] = js.undefined
  }
  object NextPageContext {
    
    inline def apply(
      AppTree: AppTreeType,
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): NextPageContext = {
      val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextPageContext]
    }
    
    extension [Self <: NextPageContext](x: Self) {
      
      inline def setAppTree(value: AppTreeType): Self = StObject.set(x, "AppTree", value.asInstanceOf[js.Any])
      
      inline def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
      
      inline def setAsPathUndefined: Self = StObject.set(x, "asPath", js.undefined)
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setErr(value: ErrorstatusCodenumberundeCause): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrNull: Self = StObject.set(x, "err", null)
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setQuery(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
      
      inline def setRes(value: ServerResponse[IncomingMessage]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.anon.labelwebvitalnameFCPLCPCL
    - typings.next.anon.labelcustomnameNextjshydr
  */
  trait NextWebVitalsMetric extends StObject
  object NextWebVitalsMetric {
    
    inline def labelcustomnameNextjshydr(
      id: String,
      name: `NextDotjs-hydration` | `NextDotjs-route-change-to-render` | `NextDotjs-render`,
      startTime: Double,
      value: Double
    ): typings.next.anon.labelcustomnameNextjshydr = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = "custom", name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.labelcustomnameNextjshydr]
    }
    
    inline def labelwebvitalnameFCPLCPCL(id: String, name: FCP | LCP | CLS | FID | TTFB | INP, startTime: Double, value: Double): typings.next.anon.labelwebvitalnameFCPLCPCL = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = "web-vital", name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.labelwebvitalnameFCPLCPCL]
    }
  }
  
  type RenderPage = js.Function1[
    /* options */ js.UndefOr[ComponentsEnhancer], 
    DocumentInitialProps | js.Promise[DocumentInitialProps]
  ]
  
  trait RenderPageResult extends StObject {
    
    var head: js.UndefOr[js.Array[Element | Null]] = js.undefined
    
    var html: String
  }
  object RenderPageResult {
    
    inline def apply(html: String): RenderPageResult = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderPageResult]
    }
    
    extension [Self <: RenderPageResult](x: Self) {
      
      inline def setHead(value: js.Array[Element | Null]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setHeadVarargs(value: (Element | Null)*): Self = StObject.set(x, "head", js.Array(value*))
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Send body of response
    */
  type Send[T] = js.Function1[/* body */ T, Unit]
}
