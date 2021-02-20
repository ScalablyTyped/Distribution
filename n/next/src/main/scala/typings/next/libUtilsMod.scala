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
import typings.next.nextStrings.close
import typings.next.nextStrings.drain
import typings.next.nextStrings.error
import typings.next.nextStrings.finish
import typings.next.nextStrings.pipe
import typings.next.nextStrings.unpipe
import typings.next.routerMod.NextRouter
import typings.nextEnv.mod.Env
import typings.node.BufferEncoding
import typings.node.NodeJS.WritableStream
import typings.node.anon.Chunk
import typings.node.anon.End
import typings.node.eventsMod.EventEmitterOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeader
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import typings.node.urlMod.UrlObject
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.global.JSX.Element
import typings.std.Error
import typings.std.Record
import typings.std.ReturnType
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("next/dist/next-server/lib/utils", "SP")
  @js.native
  val SP: Boolean = js.native
  
  @JSImport("next/dist/next-server/lib/utils", "ST")
  @js.native
  val ST: Boolean = js.native
  
  @JSImport("next/dist/next-server/lib/utils", "execOnce")
  @js.native
  def execOnce[T /* <: js.Function1[/* repeated */ js.Any, ReturnType[T]] */](fn: T): T = js.native
  
  @JSImport("next/dist/next-server/lib/utils", "formatWithValidation")
  @js.native
  def formatWithValidation(url: UrlObject): String = js.native
  
  @JSImport("next/dist/next-server/lib/utils", "getDisplayName")
  @js.native
  def getDisplayName[P](Component: ComponentType[P]): String = js.native
  
  @JSImport("next/dist/next-server/lib/utils", "getLocationOrigin")
  @js.native
  def getLocationOrigin(): String = js.native
  
  @JSImport("next/dist/next-server/lib/utils", "getURL")
  @js.native
  def getURL(): String = js.native
  
  @JSImport("next/dist/next-server/lib/utils", "isResSent")
  @js.native
  def isResSent(res: ServerResponse): Boolean = js.native
  
  @JSImport("next/dist/next-server/lib/utils", "loadGetInitialProps")
  @js.native
  def loadGetInitialProps[C /* <: BaseContext */, IP, P](App: NextComponentType[C, IP, P], ctx: C): js.Promise[IP] = js.native
  
  @JSImport("next/dist/next-server/lib/utils", "urlObjectKeys")
  @js.native
  val urlObjectKeys: js.Array[String] = js.native
  
  @js.native
  trait AppContextType[R /* <: NextRouter */] extends StObject {
    
    var AppTree: AppTreeType = js.native
    
    var Component: NextComponentType[NextPageContext, js.Object, js.Object] = js.native
    
    var ctx: NextPageContext = js.native
    
    var router: R = js.native
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
    implicit class AppContextTypeMutableBuilder[Self <: AppContextType[_], R /* <: NextRouter */] (val x: Self with AppContextType[R]) extends AnyVal {
      
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
  
  /* Inlined next.next/dist/next-server/lib/utils.AppInitialProps & {  Component :next.next/dist/next-server/lib/utils.NextComponentType<next.next/dist/next-server/lib/utils.NextPageContext, any, P>,   router :R,   __N_SSG :boolean | undefined,   __N_SSP :boolean | undefined} */
  @js.native
  trait AppPropsType[R /* <: NextRouter */, P] extends StObject {
    
    var Component: NextComponentType[NextPageContext, _, P] = js.native
    
    var __N_SSG: js.UndefOr[Boolean] = js.native
    
    var __N_SSP: js.UndefOr[Boolean] = js.native
    
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
  
  /* Inlined next.next/dist/next-server/lib/utils.NextPageContext & {  renderPage :next.next/dist/next-server/lib/utils.RenderPage} */
  @js.native
  trait DocumentContext extends StObject {
    
    /**
      * `Component` the tree of the App to use if needing to render separately
      */
    var AppTree: AppTreeType = js.native
    
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
  
  /* Inlined next.next/dist/next-server/lib/utils.RenderPageResult & {  styles :std.Array<react.react.ReactElement> | react.react.ReactFragment | undefined} */
  @js.native
  trait DocumentInitialProps extends StObject {
    
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
  
  /* Inlined next.next/dist/next-server/lib/utils.DocumentInitialProps & {  __NEXT_DATA__ :next.next/dist/next-server/lib/utils.NEXT_DATA,   dangerousAsPath :string,   docComponentsRendered :{  Html :boolean | undefined,   Main :boolean | undefined,   Head :boolean | undefined,   NextScript :boolean | undefined},   buildManifest :next.next/dist/next-server/server/get-page-files.BuildManifest,   ampPath :string,   inAmpMode :boolean,   hybridAmp :boolean,   isDevelopment :boolean,   dynamicImports :std.Array<next.next/dist/next-server/server/load-components.ManifestItem>,   assetPrefix :string | undefined,   canonicalBase :string,   headTags :std.Array<any>,   unstable_runtimeJS :false | undefined,   devOnlyCacheBusterQueryString :string,   locale :string | undefined} */
  @js.native
  trait DocumentProps extends StObject {
    
    var __NEXT_DATA__ : NEXT_DATA = js.native
    
    var ampPath: String = js.native
    
    var assetPrefix: js.UndefOr[String] = js.native
    
    var buildManifest: BuildManifest = js.native
    
    var canonicalBase: String = js.native
    
    var dangerousAsPath: String = js.native
    
    var devOnlyCacheBusterQueryString: String = js.native
    
    var docComponentsRendered: Head = js.native
    
    var dynamicImports: js.Array[ManifestItem] = js.native
    
    var head: js.UndefOr[js.Array[Element | Null]] = js.native
    
    var headTags: js.Array[_] = js.native
    
    var html: String = js.native
    
    var hybridAmp: Boolean = js.native
    
    var inAmpMode: Boolean = js.native
    
    var isDevelopment: Boolean = js.native
    
    var locale: js.UndefOr[String] = js.native
    
    var styles: js.UndefOr[js.Array[ReactElement] | ReactFragment] = js.native
    
    var unstable_runtimeJS: js.UndefOr[`false`] = js.native
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
      headTags: js.Array[_],
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
      def setHead(value: js.Array[Element | Null]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadTags(value: js.Array[_]): Self = StObject.set(x, "headTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadTagsVarargs(value: js.Any*): Self = StObject.set(x, "headTags", js.Array(value :_*))
      
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
      def setIsDevelopment(value: Boolean): Self = StObject.set(x, "isDevelopment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Array[ReactElement] | ReactFragment): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setStylesVarargs(value: ReactElement*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def setUnstable_runtimeJS(value: `false`): Self = StObject.set(x, "unstable_runtimeJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstable_runtimeJSUndefined: Self = StObject.set(x, "unstable_runtimeJS", js.undefined)
      
      @scala.inline
      def set__NEXT_DATA__(value: NEXT_DATA): Self = StObject.set(x, "__NEXT_DATA__", value.asInstanceOf[js.Any])
    }
  }
  
  type DocumentType = (NextComponentType[DocumentContext, DocumentInitialProps, DocumentProps]) with RenderDocument
  
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  
  @js.native
  trait NEXT_DATA extends StObject {
    
    var appGip: js.UndefOr[Boolean] = js.native
    
    var assetPrefix: js.UndefOr[String] = js.native
    
    var autoExport: js.UndefOr[Boolean] = js.native
    
    var buildId: String = js.native
    
    var customServer: js.UndefOr[Boolean] = js.native
    
    var defaultLocale: js.UndefOr[String] = js.native
    
    var dynamicIds: js.UndefOr[js.Array[String]] = js.native
    
    var err: js.UndefOr[ErrorstatusCodenumberunde] = js.native
    
    var gip: js.UndefOr[Boolean] = js.native
    
    var gsp: js.UndefOr[Boolean] = js.native
    
    var gssp: js.UndefOr[Boolean] = js.native
    
    var isFallback: js.UndefOr[Boolean] = js.native
    
    var locale: js.UndefOr[String] = js.native
    
    var locales: js.UndefOr[js.Array[String]] = js.native
    
    var nextExport: js.UndefOr[Boolean] = js.native
    
    var page: String = js.native
    
    var props: Record[String, _] = js.native
    
    var query: ParsedUrlQuery = js.native
    
    var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object NEXT_DATA {
    
    @scala.inline
    def apply(buildId: String, page: String, props: Record[String, _], query: ParsedUrlQuery): NEXT_DATA = {
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
      def setProps(value: Record[String, _]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined node.http.ServerResponse & {  send :next.next/dist/next-server/lib/utils.Send<T>,   json :next.next/dist/next-server/lib/utils.Send<T>, status (statusCode : number): next.next/dist/next-server/lib/utils.NextApiResponse<T>, redirect (url : string): next.next/dist/next-server/lib/utils.NextApiResponse<T>, redirect (status : number, url : string): next.next/dist/next-server/lib/utils.NextApiResponse<T>, setPreviewData (data : object | string, options : {  maxAge :number | undefined} | undefined): next.next/dist/next-server/lib/utils.NextApiResponse<T>, clearPreviewData (): next.next/dist/next-server/lib/utils.NextApiResponse<T>} */
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
    
    def clearPreviewData(): NextApiResponse[T] = js.native
    
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
    
    def redirect(status: Double, url: String): NextApiResponse[T] = js.native
    def redirect(url: String): NextApiResponse[T] = js.native
    
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
    
    def setPreviewData(data: String): NextApiResponse[T] = js.native
    def setPreviewData(data: String, options: MaxAge): NextApiResponse[T] = js.native
    /**
      * Set preview data for Next.js' prerender mode
      */
    def setPreviewData(data: js.Object): NextApiResponse[T] = js.native
    def setPreviewData(data: js.Object, options: MaxAge): NextApiResponse[T] = js.native
    
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
    var AppTree: AppTreeType = js.native
    
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
  
  @js.native
  trait NextWebVitalsMetric extends StObject {
    
    var id: String = js.native
    
    var label: String = js.native
    
    var name: String = js.native
    
    var startTime: Double = js.native
    
    var value: Double = js.native
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
  
  @js.native
  trait RenderPageResult extends StObject {
    
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
