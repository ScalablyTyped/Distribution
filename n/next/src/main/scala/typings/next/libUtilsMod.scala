package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.AppInitialPropsnamestring
import typings.next.anon.EnhanceApp
import typings.next.anon.ErrorstatusCodenumberunde
import typings.next.anon.GetInitialProps
import typings.next.anon.Head
import typings.next.anon.MaxAge
import typings.next.anon.RenderDocument
import typings.next.getPageFilesMod.BuildManifest
import typings.next.loadComponentsMod.ManifestItem
import typings.next.nextBooleans.`false`
import typings.next.routerMod.NextRouter
import typings.nextEnv.mod.Env
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.urlMod.UrlObject
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.global.JSX.Element
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("next/dist/next-server/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/next-server/lib/utils", "SP")
  @js.native
  val SP: Boolean = js.native
  
  @JSImport("next/dist/next-server/lib/utils", "ST")
  @js.native
  val ST: Boolean = js.native
  
  @scala.inline
  def execOnce[T /* <: js.Function1[/* repeated */ js.Any, ReturnType[T]] */](fn: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("execOnce")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def formatWithValidation(url: UrlObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatWithValidation")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getDisplayName[P](Component: ComponentType[P]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(Component.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getLocationOrigin(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocationOrigin")().asInstanceOf[String]
  
  @scala.inline
  def getURL(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getURL")().asInstanceOf[String]
  
  @scala.inline
  def isResSent(res: ServerResponse): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResSent")(res.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def loadGetInitialProps[C /* <: BaseContext */, IP, P](App: NextComponentType[C, IP, P], ctx: C): js.Promise[IP] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadGetInitialProps")(App.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IP]]
  
  @JSImport("next/dist/next-server/lib/utils", "urlObjectKeys")
  @js.native
  val urlObjectKeys: js.Array[String] = js.native
  
  trait AppContextType[R /* <: NextRouter */] extends StObject {
    
    var AppTree: AppTreeType
    
    var Component: NextComponentType[NextPageContext, js.Object, js.Object]
    
    var ctx: NextPageContext
    
    var router: R
  }
  object AppContextType {
    
    @scala.inline
    def apply[R /* <: NextRouter */](
      AppTree: AppTreeType,
      Component: NextComponentType[NextPageContext, js.Object, js.Object],
      ctx: NextPageContext,
      router: R
    ): AppContextType[R] = {
      val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppContextType[R]]
    }
    
    @scala.inline
    implicit class AppContextTypeMutableBuilder[Self <: AppContextType[?], R /* <: NextRouter */] (val x: Self & AppContextType[R]) extends AnyVal {
      
      @scala.inline
      def setAppTree(value: AppTreeType): Self = StObject.set(x, "AppTree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponent(value: NextComponentType[NextPageContext, js.Object, js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtx(value: NextPageContext): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouter(value: R): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppInitialProps extends StObject {
    
    var pageProps: js.Any
  }
  object AppInitialProps {
    
    @scala.inline
    def apply(pageProps: js.Any): AppInitialProps = {
      val __obj = js.Dynamic.literal(pageProps = pageProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppInitialProps]
    }
    
    @scala.inline
    implicit class AppInitialPropsMutableBuilder[Self <: AppInitialProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPageProps(value: js.Any): Self = StObject.set(x, "pageProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppPropsType[R /* <: NextRouter */, P]
    extends StObject
       with AppInitialProps {
    
    var Component: NextComponentType[NextPageContext, js.Any, P]
    
    var __N_SSG: js.UndefOr[Boolean] = js.undefined
    
    var __N_SSP: js.UndefOr[Boolean] = js.undefined
    
    var router: R
  }
  object AppPropsType {
    
    @scala.inline
    def apply[R /* <: NextRouter */, P](Component: NextComponentType[NextPageContext, js.Any, P], pageProps: js.Any, router: R): AppPropsType[R, P] = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], pageProps = pageProps.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppPropsType[R, P]]
    }
    
    @scala.inline
    implicit class AppPropsTypeMutableBuilder[Self <: AppPropsType[?, ?], R /* <: NextRouter */, P] (val x: Self & (AppPropsType[R, P])) extends AnyVal {
      
      @scala.inline
      def setComponent(value: NextComponentType[NextPageContext, js.Any, P]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouter(value: R): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__N_SSG(value: Boolean): Self = StObject.set(x, "__N_SSG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__N_SSGUndefined: Self = StObject.set(x, "__N_SSG", js.undefined)
      
      @scala.inline
      def set__N_SSP(value: Boolean): Self = StObject.set(x, "__N_SSP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__N_SSPUndefined: Self = StObject.set(x, "__N_SSP", js.undefined)
    }
  }
  
  type AppTreeType = ComponentType[AppInitialPropsnamestring]
  
  type AppType = NextComponentType[AppContextType[NextRouter], AppInitialProps, AppPropsType[NextRouter, js.Object]]
  
  trait BaseContext
    extends StObject
       with /* k */ StringDictionary[js.Any] {
    
    var res: js.UndefOr[ServerResponse] = js.undefined
  }
  object BaseContext {
    
    @scala.inline
    def apply(): BaseContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseContext]
    }
    
    @scala.inline
    implicit class BaseContextMutableBuilder[Self <: BaseContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRes(value: ServerResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResUndefined: Self = StObject.set(x, "res", js.undefined)
    }
  }
  
  type ComponentsEnhancer = EnhanceApp | (Enhancer[NextComponentType[NextPageContext, js.Object, js.Object]])
  
  trait DocumentContext
    extends StObject
       with NextPageContext {
    
    var renderPage: RenderPage
  }
  object DocumentContext {
    
    @scala.inline
    def apply(
      AppTree: AppTreeType,
      pathname: String,
      query: ParsedUrlQuery,
      renderPage: /* options */ js.UndefOr[ComponentsEnhancer] => RenderPageResult | js.Promise[RenderPageResult]
    ): DocumentContext = {
      val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], renderPage = js.Any.fromFunction1(renderPage))
      __obj.asInstanceOf[DocumentContext]
    }
    
    @scala.inline
    implicit class DocumentContextMutableBuilder[Self <: DocumentContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderPage(
        value: /* options */ js.UndefOr[ComponentsEnhancer] => RenderPageResult | js.Promise[RenderPageResult]
      ): Self = StObject.set(x, "renderPage", js.Any.fromFunction1(value))
    }
  }
  
  trait DocumentInitialProps
    extends StObject
       with RenderPageResult {
    
    var styles: js.UndefOr[js.Array[ReactElement] | ReactFragment] = js.undefined
  }
  object DocumentInitialProps {
    
    @scala.inline
    def apply(html: String): DocumentInitialProps = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentInitialProps]
    }
    
    @scala.inline
    implicit class DocumentInitialPropsMutableBuilder[Self <: DocumentInitialProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: js.Array[ReactElement] | ReactFragment): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setStylesVarargs(value: ReactElement*): Self = StObject.set(x, "styles", js.Array(value :_*))
    }
  }
  
  trait DocumentProps
    extends StObject
       with DocumentInitialProps {
    
    var __NEXT_DATA__ : NEXT_DATA
    
    var ampPath: String
    
    var assetPrefix: js.UndefOr[String] = js.undefined
    
    var buildManifest: BuildManifest
    
    var canonicalBase: String
    
    var dangerousAsPath: String
    
    var devOnlyCacheBusterQueryString: String
    
    var docComponentsRendered: Head
    
    var dynamicImports: js.Array[ManifestItem]
    
    var headTags: js.Array[js.Any]
    
    var hybridAmp: Boolean
    
    var inAmpMode: Boolean
    
    var isDevelopment: Boolean
    
    var locale: js.UndefOr[String] = js.undefined
    
    var unstable_runtimeJS: js.UndefOr[`false`] = js.undefined
  }
  object DocumentProps {
    
    @scala.inline
    def apply(
      __NEXT_DATA__ : NEXT_DATA,
      ampPath: String,
      buildManifest: BuildManifest,
      canonicalBase: String,
      dangerousAsPath: String,
      devOnlyCacheBusterQueryString: String,
      docComponentsRendered: Head,
      dynamicImports: js.Array[ManifestItem],
      headTags: js.Array[js.Any],
      html: String,
      hybridAmp: Boolean,
      inAmpMode: Boolean,
      isDevelopment: Boolean
    ): DocumentProps = {
      val __obj = js.Dynamic.literal(__NEXT_DATA__ = __NEXT_DATA__.asInstanceOf[js.Any], ampPath = ampPath.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], dangerousAsPath = dangerousAsPath.asInstanceOf[js.Any], devOnlyCacheBusterQueryString = devOnlyCacheBusterQueryString.asInstanceOf[js.Any], docComponentsRendered = docComponentsRendered.asInstanceOf[js.Any], dynamicImports = dynamicImports.asInstanceOf[js.Any], headTags = headTags.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], hybridAmp = hybridAmp.asInstanceOf[js.Any], inAmpMode = inAmpMode.asInstanceOf[js.Any], isDevelopment = isDevelopment.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentProps]
    }
    
    @scala.inline
    implicit class DocumentPropsMutableBuilder[Self <: DocumentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmpPath(value: String): Self = StObject.set(x, "ampPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
      
      @scala.inline
      def setBuildManifest(value: BuildManifest): Self = StObject.set(x, "buildManifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanonicalBase(value: String): Self = StObject.set(x, "canonicalBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerousAsPath(value: String): Self = StObject.set(x, "dangerousAsPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevOnlyCacheBusterQueryString(value: String): Self = StObject.set(x, "devOnlyCacheBusterQueryString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocComponentsRendered(value: Head): Self = StObject.set(x, "docComponentsRendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicImports(value: js.Array[ManifestItem]): Self = StObject.set(x, "dynamicImports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicImportsVarargs(value: ManifestItem*): Self = StObject.set(x, "dynamicImports", js.Array(value :_*))
      
      @scala.inline
      def setHeadTags(value: js.Array[js.Any]): Self = StObject.set(x, "headTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadTagsVarargs(value: js.Any*): Self = StObject.set(x, "headTags", js.Array(value :_*))
      
      @scala.inline
      def setHybridAmp(value: Boolean): Self = StObject.set(x, "hybridAmp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInAmpMode(value: Boolean): Self = StObject.set(x, "inAmpMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDevelopment(value: Boolean): Self = StObject.set(x, "isDevelopment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setUnstable_runtimeJS(value: `false`): Self = StObject.set(x, "unstable_runtimeJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstable_runtimeJSUndefined: Self = StObject.set(x, "unstable_runtimeJS", js.undefined)
      
      @scala.inline
      def set__NEXT_DATA__(value: NEXT_DATA): Self = StObject.set(x, "__NEXT_DATA__", value.asInstanceOf[js.Any])
    }
  }
  
  type DocumentType = (NextComponentType[DocumentContext, DocumentInitialProps, DocumentProps]) & RenderDocument
  
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  
  trait NEXT_DATA extends StObject {
    
    var appGip: js.UndefOr[Boolean] = js.undefined
    
    var assetPrefix: js.UndefOr[String] = js.undefined
    
    var autoExport: js.UndefOr[Boolean] = js.undefined
    
    var buildId: String
    
    var customServer: js.UndefOr[Boolean] = js.undefined
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var dynamicIds: js.UndefOr[js.Array[String]] = js.undefined
    
    var err: js.UndefOr[ErrorstatusCodenumberunde] = js.undefined
    
    var gip: js.UndefOr[Boolean] = js.undefined
    
    var gsp: js.UndefOr[Boolean] = js.undefined
    
    var gssp: js.UndefOr[Boolean] = js.undefined
    
    var isFallback: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    var nextExport: js.UndefOr[Boolean] = js.undefined
    
    var page: String
    
    var props: Record[String, js.Any]
    
    var query: ParsedUrlQuery
    
    var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object NEXT_DATA {
    
    @scala.inline
    def apply(buildId: String, page: String, props: Record[String, js.Any], query: ParsedUrlQuery): NEXT_DATA = {
      val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[NEXT_DATA]
    }
    
    @scala.inline
    implicit class NEXT_DATAMutableBuilder[Self <: NEXT_DATA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppGip(value: Boolean): Self = StObject.set(x, "appGip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppGipUndefined: Self = StObject.set(x, "appGip", js.undefined)
      
      @scala.inline
      def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
      
      @scala.inline
      def setAutoExport(value: Boolean): Self = StObject.set(x, "autoExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoExportUndefined: Self = StObject.set(x, "autoExport", js.undefined)
      
      @scala.inline
      def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomServer(value: Boolean): Self = StObject.set(x, "customServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomServerUndefined: Self = StObject.set(x, "customServer", js.undefined)
      
      @scala.inline
      def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      @scala.inline
      def setDynamicIds(value: js.Array[String]): Self = StObject.set(x, "dynamicIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicIdsUndefined: Self = StObject.set(x, "dynamicIds", js.undefined)
      
      @scala.inline
      def setDynamicIdsVarargs(value: String*): Self = StObject.set(x, "dynamicIds", js.Array(value :_*))
      
      @scala.inline
      def setErr(value: ErrorstatusCodenumberunde): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      @scala.inline
      def setGip(value: Boolean): Self = StObject.set(x, "gip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGipUndefined: Self = StObject.set(x, "gip", js.undefined)
      
      @scala.inline
      def setGsp(value: Boolean): Self = StObject.set(x, "gsp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGspUndefined: Self = StObject.set(x, "gsp", js.undefined)
      
      @scala.inline
      def setGssp(value: Boolean): Self = StObject.set(x, "gssp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGsspUndefined: Self = StObject.set(x, "gssp", js.undefined)
      
      @scala.inline
      def setIsFallback(value: Boolean): Self = StObject.set(x, "isFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFallbackUndefined: Self = StObject.set(x, "isFallback", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      @scala.inline
      def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
      
      @scala.inline
      def setNextExport(value: Boolean): Self = StObject.set(x, "nextExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextExportUndefined: Self = StObject.set(x, "nextExport", js.undefined)
      
      @scala.inline
      def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: Record[String, js.Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeConfigUndefined: Self = StObject.set(x, "runtimeConfig", js.undefined)
    }
  }
  
  type NextApiHandler[T] = js.Function2[/* req */ NextApiRequest, /* res */ NextApiResponse[T], Unit | js.Promise[Unit]]
  
  @js.native
  trait NextApiRequest extends IncomingMessage {
    
    var body: js.Any = js.native
    
    /**
      * Object of `cookies` from header
      */
    var cookies: StringDictionary[String] = js.native
    
    var env: Env = js.native
    
    var preview: js.UndefOr[Boolean] = js.native
    
    /**
      * Preview data set on the request, if any
      * */
    var previewData: js.UndefOr[js.Any] = js.native
    
    /**
      * Object of `query` values from url
      */
    var query: StringDictionary[String | js.Array[String]] = js.native
  }
  
  @js.native
  trait NextApiResponse[T] extends ServerResponse {
    
    def clearPreviewData(): NextApiResponse[T] = js.native
    
    /**
      * Send data `json` data in response
      */
    var json: Send[T] = js.native
    
    def redirect(status: Double, url: String): NextApiResponse[T] = js.native
    def redirect(url: String): NextApiResponse[T] = js.native
    
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
      * Error object if encountered during rendering
      */
    var err: js.UndefOr[ErrorstatusCodenumberunde | Null] = js.undefined
    
    /**
      * Path section of `URL`.
      */
    var pathname: String
    
    /**
      * Query string section of `URL` parsed as an object.
      */
    var query: ParsedUrlQuery
    
    /**
      * `HTTP` request object.
      */
    var req: js.UndefOr[IncomingMessage] = js.undefined
    
    /**
      * `HTTP` response object.
      */
    var res: js.UndefOr[ServerResponse] = js.undefined
  }
  object NextPageContext {
    
    @scala.inline
    def apply(AppTree: AppTreeType, pathname: String, query: ParsedUrlQuery): NextPageContext = {
      val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextPageContext]
    }
    
    @scala.inline
    implicit class NextPageContextMutableBuilder[Self <: NextPageContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppTree(value: AppTreeType): Self = StObject.set(x, "AppTree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsPathUndefined: Self = StObject.set(x, "asPath", js.undefined)
      
      @scala.inline
      def setErr(value: ErrorstatusCodenumberunde): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrNull: Self = StObject.set(x, "err", null)
      
      @scala.inline
      def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
      
      @scala.inline
      def setRes(value: ServerResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResUndefined: Self = StObject.set(x, "res", js.undefined)
    }
  }
  
  trait NextWebVitalsMetric extends StObject {
    
    var id: String
    
    var label: String
    
    var name: String
    
    var startTime: Double
    
    var value: Double
  }
  object NextWebVitalsMetric {
    
    @scala.inline
    def apply(id: String, label: String, name: String, startTime: Double, value: Double): NextWebVitalsMetric = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextWebVitalsMetric]
    }
    
    @scala.inline
    implicit class NextWebVitalsMetricMutableBuilder[Self <: NextWebVitalsMetric] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RenderPage = js.Function1[
    /* options */ js.UndefOr[ComponentsEnhancer], 
    RenderPageResult | js.Promise[RenderPageResult]
  ]
  
  trait RenderPageResult extends StObject {
    
    var head: js.UndefOr[js.Array[Element | Null]] = js.undefined
    
    var html: String
  }
  object RenderPageResult {
    
    @scala.inline
    def apply(html: String): RenderPageResult = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderPageResult]
    }
    
    @scala.inline
    implicit class RenderPageResultMutableBuilder[Self <: RenderPageResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHead(value: js.Array[Element | Null]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      @scala.inline
      def setHeadVarargs(value: (Element | Null)*): Self = StObject.set(x, "head", js.Array(value :_*))
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Send body of response
    */
  type Send[T] = js.Function1[/* body */ T, Unit]
}
