package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.anon.EnhanceApp
import typings.nextServer.anon.ErrorstatusCodenumberunde
import typings.nextServer.anon.GetInitialProps
import typings.nextServer.nextServerBooleans.`true`
import typings.nextServer.nextServerStrings.close
import typings.nextServer.nextServerStrings.data
import typings.nextServer.nextServerStrings.drain
import typings.nextServer.nextServerStrings.end
import typings.nextServer.nextServerStrings.error
import typings.nextServer.nextServerStrings.finish
import typings.nextServer.nextServerStrings.pause
import typings.nextServer.nextServerStrings.pipe
import typings.nextServer.nextServerStrings.readable
import typings.nextServer.nextServerStrings.resume
import typings.nextServer.nextServerStrings.unpipe
import typings.nextServer.renderMod.ManifestItem
import typings.nextServer.routerMod.NextRouter
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.Dict
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.Chunk
import typings.node.anon.End
import typings.node.eventsMod.EventEmitterOptions
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeader
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import typings.node.urlMod.URLFormatOptions
import typings.node.urlMod.UrlObject
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.global.JSX.Element
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("next-server/dist/lib/utils", "SUPPORTS_PERFORMANCE")
  @js.native
  val SUPPORTS_PERFORMANCE: Boolean = js.native
  
  @JSImport("next-server/dist/lib/utils", "SUPPORTS_PERFORMANCE_USER_TIMING")
  @js.native
  val SUPPORTS_PERFORMANCE_USER_TIMING: Boolean = js.native
  
  @JSImport("next-server/dist/lib/utils", "execOnce")
  @js.native
  def execOnce(fn: js.Function1[/* args */ js.Any, _]): js.Function1[/* args */ js.Any, Unit] = js.native
  
  @JSImport("next-server/dist/lib/utils", "formatWithValidation")
  @js.native
  def formatWithValidation(url: UrlObject): String = js.native
  @JSImport("next-server/dist/lib/utils", "formatWithValidation")
  @js.native
  def formatWithValidation(url: UrlObject, options: URLFormatOptions): String = js.native
  
  @JSImport("next-server/dist/lib/utils", "getDisplayName")
  @js.native
  def getDisplayName(Component: ComponentType[_]): String = js.native
  
  @JSImport("next-server/dist/lib/utils", "getLocationOrigin")
  @js.native
  def getLocationOrigin(): String = js.native
  
  @JSImport("next-server/dist/lib/utils", "getURL")
  @js.native
  def getURL(): String = js.native
  
  @JSImport("next-server/dist/lib/utils", "isResSent")
  @js.native
  def isResSent(res: ServerResponse): Boolean = js.native
  
  @JSImport("next-server/dist/lib/utils", "loadGetInitialProps")
  @js.native
  def loadGetInitialProps[C /* <: BaseContext */, IP, P](Component: NextComponentType[C, IP, P], ctx: C): js.Promise[IP] = js.native
  
  @JSImport("next-server/dist/lib/utils", "urlObjectKeys")
  @js.native
  val urlObjectKeys: js.Array[String] = js.native
  
  @js.native
  trait AppContextType[R /* <: NextRouter */] extends StObject {
    
    var AppTree: AppType = js.native
    
    var Component: NextComponentType[NextPageContext, js.Object, js.Object] = js.native
    
    var ctx: NextPageContext = js.native
    
    var router: R = js.native
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
    implicit class AppContextTypeMutableBuilder[Self <: AppContextType[_], R /* <: NextRouter */] (val x: Self with AppContextType[R]) extends AnyVal {
      
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
  
  @js.native
  trait AppInitialProps extends StObject {
    
    var pageProps: js.Any = js.native
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
  
  /* Inlined next-server.next-server/dist/lib/utils.AppInitialProps & {  Component :next-server.next-server/dist/lib/utils.NextComponentType<next-server.next-server/dist/lib/utils.NextPageContext, any, P>,   router :R} */
  @js.native
  trait AppPropsType[R /* <: NextRouter */, P] extends StObject {
    
    var Component: NextComponentType[NextPageContext, _, P] = js.native
    
    var pageProps: js.Any = js.native
    
    var router: R = js.native
  }
  object AppPropsType {
    
    @scala.inline
    def apply[R /* <: NextRouter */, P](Component: NextComponentType[NextPageContext, _, P], pageProps: js.Any, router: R): AppPropsType[R, P] = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], pageProps = pageProps.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppPropsType[R, P]]
    }
    
    @scala.inline
    implicit class AppPropsTypeMutableBuilder[Self <: AppPropsType[_, _], R /* <: NextRouter */, P] (val x: Self with (AppPropsType[R, P])) extends AnyVal {
      
      @scala.inline
      def setComponent(value: NextComponentType[NextPageContext, _, P]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageProps(value: js.Any): Self = StObject.set(x, "pageProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouter(value: R): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
  
  type AppType = NextComponentType[AppContextType[NextRouter], AppInitialProps, AppPropsType[NextRouter, js.Object]]
  
  @js.native
  trait BaseContext
    extends /* k */ StringDictionary[js.Any] {
    
    var res: js.UndefOr[ServerResponse] = js.native
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
  
  /* Inlined next-server.next-server/dist/lib/utils.NextPageContext & {  renderPage :next-server.next-server/dist/lib/utils.RenderPage} */
  @js.native
  trait DocumentContext extends StObject {
    
    /**
      * `Component` the tree of the App to use if needing to render separately
      */
    var AppTree: AppType = js.native
    
    /**
      * `String` of the actual path including query.
      */
    var asPath: js.UndefOr[String] = js.native
    
    /**
      * Error object if encountered during rendering
      */
    var err: js.UndefOr[ErrorstatusCodenumberunde | Null] = js.native
    
    /**
      * Path section of `URL`.
      */
    var pathname: String = js.native
    
    /**
      * Query string section of `URL` parsed as an object.
      */
    var query: ParsedUrlQuery = js.native
    
    var renderPage: RenderPage = js.native
    
    /**
      * `HTTP` request object.
      */
    var req: js.UndefOr[IncomingMessage] = js.native
    
    /**
      * `HTTP` response object.
      */
    var res: js.UndefOr[ServerResponse] = js.native
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
      def setRenderPage(
        value: /* options */ js.UndefOr[ComponentsEnhancer] => RenderPageResult | js.Promise[RenderPageResult]
      ): Self = StObject.set(x, "renderPage", js.Any.fromFunction1(value))
      
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
  
  /* Inlined next-server.next-server/dist/lib/utils.RenderPageResult & {  styles :std.Array<react.react.ReactElement> | react.react.ReactFragment | undefined} */
  @js.native
  trait DocumentInitialProps extends StObject {
    
    var dataOnly: js.UndefOr[`true`] = js.native
    
    var head: js.UndefOr[js.Array[Element | Null]] = js.native
    
    var html: String = js.native
    
    var styles: js.UndefOr[js.Array[ReactElement] | ReactFragment] = js.native
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
      
      @scala.inline
      def setStyles(value: js.Array[ReactElement] | ReactFragment): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setStylesVarargs(value: ReactElement*): Self = StObject.set(x, "styles", js.Array(value :_*))
    }
  }
  
  /* Inlined next-server.next-server/dist/lib/utils.DocumentInitialProps & {  __NEXT_DATA__ :next-server.next-server/dist/lib/utils.NEXT_DATA,   dangerousAsPath :string,   ampPath :string,   inAmpMode :boolean,   hybridAmp :boolean,   staticMarkup :boolean,   devFiles :std.Array<string>,   files :std.Array<string>,   dynamicImports :std.Array<next-server.next-server/dist/server/render.ManifestItem>,   assetPrefix :string | undefined,   canonicalBase :string} */
  @js.native
  trait DocumentProps extends StObject {
    
    var __NEXT_DATA__ : NEXT_DATA = js.native
    
    var ampPath: String = js.native
    
    var assetPrefix: js.UndefOr[String] = js.native
    
    var canonicalBase: String = js.native
    
    var dangerousAsPath: String = js.native
    
    var dataOnly: js.UndefOr[`true`] = js.native
    
    var devFiles: js.Array[String] = js.native
    
    var dynamicImports: js.Array[ManifestItem] = js.native
    
    var files: js.Array[String] = js.native
    
    var head: js.UndefOr[js.Array[Element | Null]] = js.native
    
    var html: String = js.native
    
    var hybridAmp: Boolean = js.native
    
    var inAmpMode: Boolean = js.native
    
    var staticMarkup: Boolean = js.native
    
    var styles: js.UndefOr[js.Array[ReactElement] | ReactFragment] = js.native
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
      def setDataOnly(value: `true`): Self = StObject.set(x, "dataOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataOnlyUndefined: Self = StObject.set(x, "dataOnly", js.undefined)
      
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
      def setHead(value: js.Array[Element | Null]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      @scala.inline
      def setHeadVarargs(value: (Element | Null)*): Self = StObject.set(x, "head", js.Array(value :_*))
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHybridAmp(value: Boolean): Self = StObject.set(x, "hybridAmp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInAmpMode(value: Boolean): Self = StObject.set(x, "inAmpMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticMarkup(value: Boolean): Self = StObject.set(x, "staticMarkup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: js.Array[ReactElement] | ReactFragment): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setStylesVarargs(value: ReactElement*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def set__NEXT_DATA__(value: NEXT_DATA): Self = StObject.set(x, "__NEXT_DATA__", value.asInstanceOf[js.Any])
    }
  }
  
  type DocumentType = NextComponentType[DocumentContext, DocumentInitialProps, DocumentProps]
  
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  
  @js.native
  trait NEXT_DATA extends StObject {
    
    var assetPrefix: js.UndefOr[String] = js.native
    
    var buildId: String = js.native
    
    var dataManager: String = js.native
    
    var dynamicIds: js.UndefOr[js.Array[String]] = js.native
    
    var err: js.UndefOr[ErrorstatusCodenumberunde] = js.native
    
    var nextExport: js.UndefOr[Boolean] = js.native
    
    var page: String = js.native
    
    var props: js.Any = js.native
    
    var query: ParsedUrlQuery = js.native
    
    var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var skeleton: js.UndefOr[Boolean] = js.native
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
  
  /* Inlined node.http.IncomingMessage & {  query :{[key: string] : string | std.Array<string>},   cookies :{[key: string] : string},   body :any} */
  @js.native
  trait NextApiRequest extends StObject {
    
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _read(size: Double): Unit = js.native
    
    var aborted: Boolean = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. data
      * 3. end
      * 4. error
      * 5. pause
      * 6. readable
      * 7. resume
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    var body: js.Any = js.native
    
    var complete: Boolean = js.native
    
    /**
      * @deprecate Use `socket` instead.
      */
    var connection: Socket = js.native
    
    /**
      * Object of `cookies` from header
      */
    var cookies: StringDictionary[String] = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    def getMaxListeners(): Double = js.native
    
    var headers: IncomingHttpHeaders = js.native
    
    var httpVersion: String = js.native
    
    var httpVersionMajor: Double = js.native
    
    var httpVersionMinor: Double = js.native
    
    def isPaused(): Boolean = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    /**
      * Only valid for request obtained from http.Server.
      */
    var method: js.UndefOr[String] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def pause(): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    
    /**
      * Object of `query` values from url
      */
    var query: StringDictionary[String | js.Array[String]] = js.native
    
    var rawHeaders: js.Array[String] = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    var rawTrailers: js.Array[String] = js.native
    
    def read(): js.Any = js.native
    def read(size: Double): js.Any = js.native
    @JSName("read")
    def read_Union(): String | Buffer = js.native
    @JSName("read")
    def read_Union(size: Double): String | Buffer = js.native
    
    var readable: Boolean = js.native
    
    val readableEncoding: BufferEncoding | Null = js.native
    
    val readableEnded: Boolean = js.native
    
    val readableFlowing: Boolean | Null = js.native
    
    val readableHighWaterMark: Double = js.native
    
    val readableLength: Double = js.native
    
    val readableObjectMode: Boolean = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def resume(): this.type = js.native
    
    def setEncoding(encoding: BufferEncoding): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
    
    def setTimeout(msecs: Double): this.type = js.native
    def setTimeout(msecs: Double, callback: js.Function0[Unit]): this.type = js.native
    
    var socket: Socket = js.native
    
    /**
      * Only valid for response obtained from http.ClientRequest.
      */
    var statusCode: js.UndefOr[Double] = js.native
    
    /**
      * Only valid for response obtained from http.ClientRequest.
      */
    var statusMessage: js.UndefOr[String] = js.native
    
    var trailers: Dict[String] = js.native
    
    def unpipe(): this.type = js.native
    def unpipe(destination: WritableStream): this.type = js.native
    
    def unshift(chunk: String): Unit = js.native
    def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.Any): Unit = js.native
    def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: Uint8Array): Unit = js.native
    def unshift(chunk: Uint8Array, encoding: BufferEncoding): Unit = js.native
    
    /**
      * Only valid for request obtained from http.Server.
      */
    var url: js.UndefOr[String] = js.native
    
    def wrap(oldStream: ReadableStream): this.type = js.native
  }
  
  /* Inlined node.http.ServerResponse & {  send :next-server.next-server/dist/lib/utils.Send<T>,   json :next-server.next-server/dist/lib/utils.Send<T>, status (statusCode : number): next-server.next-server/dist/lib/utils.NextApiResponse<T>} */
  @js.native
  trait NextApiResponse[T] extends StObject {
    
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _write(
      chunk: js.Any,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    
    var _writev: js.UndefOr[
        js.Function2[
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. drain
      * 3. error
      * 4. finish
      * 5. pipe
      * 6. unpipe
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def addTrailers(headers: js.Array[js.Tuple2[String, String]]): Unit = js.native
    def addTrailers(headers: OutgoingHttpHeaders): Unit = js.native
    
    def assignSocket(socket: Socket): Unit = js.native
    
    var chunkedEncoding: Boolean = js.native
    
    /**
      * @deprecate Use `socket` instead.
      */
    var connection: Socket | Null = js.native
    
    def cork(): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def detachSocket(socket: Socket): Unit = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    def end(): Unit = js.native
    def end(cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any): Unit = js.native
    def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    def end(data: String): Unit = js.native
    def end(data: String, cb: js.Function0[Unit]): Unit = js.native
    def end(data: Uint8Array): Unit = js.native
    def end(data: Uint8Array, cb: js.Function0[Unit]): Unit = js.native
    def end(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
    def end(str: String, encoding: BufferEncoding): Unit = js.native
    def end(str: String, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    /**
      * @deprecated Use `writableEnded` instead.
      */
    var finished: Boolean = js.native
    
    def flushHeaders(): Unit = js.native
    
    def getHeader(name: String): js.UndefOr[Double | String | js.Array[String]] = js.native
    
    def getHeaderNames(): js.Array[String] = js.native
    
    def getHeaders(): OutgoingHttpHeaders = js.native
    
    def getMaxListeners(): Double = js.native
    
    def hasHeader(name: String): Boolean = js.native
    
    var headersSent: Boolean = js.native
    
    /**
      * Send data `json` data in response
      */
    var json: Send[T] = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeHeader(name: String): Unit = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    /**
      * Send data `any` data in response
      */
    var send: Send[T] = js.native
    
    var sendDate: Boolean = js.native
    
    def setDefaultEncoding(encoding: BufferEncoding): this.type = js.native
    
    def setHeader(name: String, value: String): Unit = js.native
    def setHeader(name: String, value: js.Array[String]): Unit = js.native
    def setHeader(name: String, value: Double): Unit = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
    
    def setTimeout(msecs: Double): this.type = js.native
    def setTimeout(msecs: Double, callback: js.Function0[Unit]): this.type = js.native
    
    var shouldKeepAlive: Boolean = js.native
    
    var socket: Socket | Null = js.native
    
    def status(statusCode: Double): NextApiResponse[T] = js.native
    
    var statusCode: Double = js.native
    
    var statusMessage: String = js.native
    
    def uncork(): Unit = js.native
    
    var upgrading: Boolean = js.native
    
    var useChunkedEncodingByDefault: Boolean = js.native
    
    val writable: Boolean = js.native
    
    val writableCorked: Double = js.native
    
    val writableEnded: Boolean = js.native
    
    val writableFinished: Boolean = js.native
    
    val writableHighWaterMark: Double = js.native
    
    val writableLength: Double = js.native
    
    val writableObjectMode: Boolean = js.native
    
    def write(buffer: String): Boolean = js.native
    def write(buffer: String, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(buffer: Uint8Array): Boolean = js.native
    def write(buffer: Uint8Array, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(chunk: js.Any): Boolean = js.native
    def write(chunk: js.Any, cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    def write(
      chunk: js.Any,
      encoding: BufferEncoding,
      cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(
      str: String,
      encoding: js.UndefOr[scala.Nothing],
      cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(str: String, encoding: BufferEncoding): Boolean = js.native
    def write(str: String, encoding: BufferEncoding, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    
    // https://github.com/nodejs/node/blob/master/test/parallel/test-http-write-callbacks.js#L53
    // no args in writeContinue callback
    def writeContinue(): Unit = js.native
    def writeContinue(callback: js.Function0[Unit]): Unit = js.native
    
    def writeHead(statusCode: Double): this.type = js.native
    def writeHead(statusCode: Double, headers: js.Array[OutgoingHttpHeader]): this.type = js.native
    def writeHead(statusCode: Double, headers: OutgoingHttpHeaders): this.type = js.native
    def writeHead(statusCode: Double, reasonPhrase: js.UndefOr[scala.Nothing], headers: js.Array[OutgoingHttpHeader]): this.type = js.native
    def writeHead(statusCode: Double, reasonPhrase: js.UndefOr[scala.Nothing], headers: OutgoingHttpHeaders): this.type = js.native
    def writeHead(statusCode: Double, reasonPhrase: String): this.type = js.native
    def writeHead(statusCode: Double, reasonPhrase: String, headers: js.Array[OutgoingHttpHeader]): this.type = js.native
    def writeHead(statusCode: Double, reasonPhrase: String, headers: OutgoingHttpHeaders): this.type = js.native
    
    def writeProcessing(): Unit = js.native
  }
  
  type NextComponentType[C /* <: BaseContext */, IP, P] = ComponentType[P] with (GetInitialProps[C, IP])
  
  @js.native
  trait NextPageContext extends StObject {
    
    /**
      * `Component` the tree of the App to use if needing to render separately
      */
    var AppTree: AppType = js.native
    
    /**
      * `String` of the actual path including query.
      */
    var asPath: js.UndefOr[String] = js.native
    
    /**
      * Error object if encountered during rendering
      */
    var err: js.UndefOr[ErrorstatusCodenumberunde | Null] = js.native
    
    /**
      * Path section of `URL`.
      */
    var pathname: String = js.native
    
    /**
      * Query string section of `URL` parsed as an object.
      */
    var query: ParsedUrlQuery = js.native
    
    /**
      * `HTTP` request object.
      */
    var req: js.UndefOr[IncomingMessage] = js.native
    
    /**
      * `HTTP` response object.
      */
    var res: js.UndefOr[ServerResponse] = js.native
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
  
  @js.native
  trait RenderPageResult extends StObject {
    
    var dataOnly: js.UndefOr[`true`] = js.native
    
    var head: js.UndefOr[js.Array[Element | Null]] = js.native
    
    var html: String = js.native
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
