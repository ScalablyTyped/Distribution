package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.anon.EnhanceApp
import typings.nextServer.anon.ErrorstatusCodenumberunde
import typings.nextServer.anon.GetInitialProps
import typings.nextServer.nextServerBooleans.`true`
import typings.nextServer.renderMod.ManifestItem
import typings.nextServer.routerMod.NextRouter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.urlMod.URLFormatOptions
import typings.node.urlMod.UrlObject
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("next-server/dist/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next-server/dist/lib/utils", "SUPPORTS_PERFORMANCE")
  @js.native
  val SUPPORTS_PERFORMANCE: Boolean = js.native
  
  @JSImport("next-server/dist/lib/utils", "SUPPORTS_PERFORMANCE_USER_TIMING")
  @js.native
  val SUPPORTS_PERFORMANCE_USER_TIMING: Boolean = js.native
  
  @scala.inline
  def execOnce(fn: js.Function1[/* args */ js.Any, js.Any]): js.Function1[/* args */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("execOnce")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ js.Any, Unit]]
  
  @scala.inline
  def formatWithValidation(url: UrlObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatWithValidation")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatWithValidation(url: UrlObject, options: URLFormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWithValidation")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getDisplayName(Component: ComponentType[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(Component.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getLocationOrigin(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocationOrigin")().asInstanceOf[String]
  
  @scala.inline
  def getURL(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getURL")().asInstanceOf[String]
  
  @scala.inline
  def isResSent(res: ServerResponse): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResSent")(res.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def loadGetInitialProps[C /* <: BaseContext */, IP, P](Component: NextComponentType[C, IP, P], ctx: C): js.Promise[IP] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadGetInitialProps")(Component.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IP]]
  
  @JSImport("next-server/dist/lib/utils", "urlObjectKeys")
  @js.native
  val urlObjectKeys: js.Array[String] = js.native
  
  trait AppContextType[R /* <: NextRouter */] extends StObject {
    
    var AppTree: AppType
    
    var Component: NextComponentType[NextPageContext, js.Object, js.Object]
    
    var ctx: NextPageContext
    
    var router: R
  }
  object AppContextType {
    
    @scala.inline
    def apply[R /* <: NextRouter */](
      AppTree: AppType,
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
      def setAppTree(value: AppType): Self = StObject.set(x, "AppTree", value.asInstanceOf[js.Any])
      
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
    }
  }
  
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
      AppTree: AppType,
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
    
    var canonicalBase: String
    
    var dangerousAsPath: String
    
    var devFiles: js.Array[String]
    
    var dynamicImports: js.Array[ManifestItem]
    
    var files: js.Array[String]
    
    var hybridAmp: Boolean
    
    var inAmpMode: Boolean
    
    var staticMarkup: Boolean
  }
  object DocumentProps {
    
    @scala.inline
    def apply(
      __NEXT_DATA__ : NEXT_DATA,
      ampPath: String,
      canonicalBase: String,
      dangerousAsPath: String,
      devFiles: js.Array[String],
      dynamicImports: js.Array[ManifestItem],
      files: js.Array[String],
      html: String,
      hybridAmp: Boolean,
      inAmpMode: Boolean,
      staticMarkup: Boolean
    ): DocumentProps = {
      val __obj = js.Dynamic.literal(__NEXT_DATA__ = __NEXT_DATA__.asInstanceOf[js.Any], ampPath = ampPath.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], dangerousAsPath = dangerousAsPath.asInstanceOf[js.Any], devFiles = devFiles.asInstanceOf[js.Any], dynamicImports = dynamicImports.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], hybridAmp = hybridAmp.asInstanceOf[js.Any], inAmpMode = inAmpMode.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
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
      def setCanonicalBase(value: String): Self = StObject.set(x, "canonicalBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerousAsPath(value: String): Self = StObject.set(x, "dangerousAsPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevFiles(value: js.Array[String]): Self = StObject.set(x, "devFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevFilesVarargs(value: String*): Self = StObject.set(x, "devFiles", js.Array(value :_*))
      
      @scala.inline
      def setDynamicImports(value: js.Array[ManifestItem]): Self = StObject.set(x, "dynamicImports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicImportsVarargs(value: ManifestItem*): Self = StObject.set(x, "dynamicImports", js.Array(value :_*))
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setHybridAmp(value: Boolean): Self = StObject.set(x, "hybridAmp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInAmpMode(value: Boolean): Self = StObject.set(x, "inAmpMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticMarkup(value: Boolean): Self = StObject.set(x, "staticMarkup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__NEXT_DATA__(value: NEXT_DATA): Self = StObject.set(x, "__NEXT_DATA__", value.asInstanceOf[js.Any])
    }
  }
  
  type DocumentType = NextComponentType[DocumentContext, DocumentInitialProps, DocumentProps]
  
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  
  trait NEXT_DATA extends StObject {
    
    var assetPrefix: js.UndefOr[String] = js.undefined
    
    var buildId: String
    
    var dataManager: String
    
    var dynamicIds: js.UndefOr[js.Array[String]] = js.undefined
    
    var err: js.UndefOr[ErrorstatusCodenumberunde] = js.undefined
    
    var nextExport: js.UndefOr[Boolean] = js.undefined
    
    var page: String
    
    var props: js.Any
    
    var query: ParsedUrlQuery
    
    var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var skeleton: js.UndefOr[Boolean] = js.undefined
  }
  object NEXT_DATA {
    
    @scala.inline
    def apply(buildId: String, dataManager: String, page: String, props: js.Any, query: ParsedUrlQuery): NEXT_DATA = {
      val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], dataManager = dataManager.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[NEXT_DATA]
    }
    
    @scala.inline
    implicit class NEXT_DATAMutableBuilder[Self <: NEXT_DATA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
      
      @scala.inline
      def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataManager(value: String): Self = StObject.set(x, "dataManager", value.asInstanceOf[js.Any])
      
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
      def setNextExport(value: Boolean): Self = StObject.set(x, "nextExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextExportUndefined: Self = StObject.set(x, "nextExport", js.undefined)
      
      @scala.inline
      def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeConfigUndefined: Self = StObject.set(x, "runtimeConfig", js.undefined)
      
      @scala.inline
      def setSkeleton(value: Boolean): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkeletonUndefined: Self = StObject.set(x, "skeleton", js.undefined)
    }
  }
  
  @js.native
  trait NextApiRequest extends IncomingMessage {
    
    var body: js.Any = js.native
    
    /**
      * Object of `cookies` from header
      */
    var cookies: StringDictionary[String] = js.native
    
    /**
      * Object of `query` values from url
      */
    var query: StringDictionary[String | js.Array[String]] = js.native
  }
  
  @js.native
  trait NextApiResponse[T] extends ServerResponse {
    
    /**
      * Send data `json` data in response
      */
    var json: Send[T] = js.native
    
    /**
      * Send data `any` data in response
      */
    var send: Send[T] = js.native
    
    def status(statusCode: Double): NextApiResponse[T] = js.native
  }
  
  type NextComponentType[C /* <: BaseContext */, IP, P] = ComponentType[P] & (GetInitialProps[C, IP])
  
  trait NextPageContext extends StObject {
    
    /**
      * `Component` the tree of the App to use if needing to render separately
      */
    var AppTree: AppType
    
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
    def apply(AppTree: AppType, pathname: String, query: ParsedUrlQuery): NextPageContext = {
      val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextPageContext]
    }
    
    @scala.inline
    implicit class NextPageContextMutableBuilder[Self <: NextPageContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppTree(value: AppType): Self = StObject.set(x, "AppTree", value.asInstanceOf[js.Any])
      
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
  
  type RenderPage = js.Function1[
    /* options */ js.UndefOr[ComponentsEnhancer], 
    RenderPageResult | js.Promise[RenderPageResult]
  ]
  
  trait RenderPageResult extends StObject {
    
    var dataOnly: js.UndefOr[`true`] = js.undefined
    
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
      def setDataOnly(value: `true`): Self = StObject.set(x, "dataOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataOnlyUndefined: Self = StObject.set(x, "dataOnly", js.undefined)
      
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
