package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.anon.ErrorError
import typings.nextServer.getPageFilesMod.BuildManifest
import typings.nextServer.libUtilsMod.AppType
import typings.nextServer.libUtilsMod.DocumentType
import typings.nextServer.libUtilsMod.NextPageContext
import typings.nextServer.typesMod.PageConfig
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import typings.react.mod.ComponentType
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("next-server/dist/server/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def renderToHTML(
    req: IncomingMessage,
    res: ServerResponse,
    pathname: String,
    query: ParsedUrlQuery,
    renderOpts: RenderOpts
  ): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToHTML")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any], query.asInstanceOf[js.Any], renderOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  
  trait ManifestItem extends StObject {
    
    var file: String
    
    var id: Double | String
    
    var name: String
    
    var publicPath: String
  }
  object ManifestItem {
    
    @scala.inline
    def apply(file: String, id: Double | String, name: String, publicPath: String): ManifestItem = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManifestItem]
    }
    
    @scala.inline
    implicit class ManifestItemMutableBuilder[Self <: ManifestItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactLoadableManifest = StringDictionary[js.Array[ManifestItem]]
  
  trait RenderOpts extends StObject {
    
    var App: AppType
    
    var Component: ComponentType[js.Object]
    
    var Document: DocumentType
    
    def DocumentMiddleware(ctx: NextPageContext): Unit
    
    var ErrorDebug: js.UndefOr[ComponentType[ErrorError]] = js.undefined
    
    var ampBindInitData: Boolean
    
    var ampMode: js.UndefOr[js.Any] = js.undefined
    
    var ampPath: js.UndefOr[String] = js.undefined
    
    var ampValidator: js.UndefOr[js.Function2[/* html */ String, /* pathname */ String, js.Promise[Unit]]] = js.undefined
    
    var assetPrefix: js.UndefOr[String] = js.undefined
    
    var buildId: String
    
    var buildManifest: BuildManifest
    
    var canonicalBase: String
    
    var dangerousAsPath: String
    
    var dataOnly: js.UndefOr[Boolean] = js.undefined
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var documentMiddlewareEnabled: Boolean
    
    var err: js.UndefOr[Error | Null] = js.undefined
    
    var hybridAmp: js.UndefOr[Boolean] = js.undefined
    
    var inAmpMode: js.UndefOr[Boolean] = js.undefined
    
    var nextExport: js.UndefOr[Boolean] = js.undefined
    
    var pageConfig: PageConfig
    
    var reactLoadableManifest: ReactLoadableManifest
    
    var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var skeleton: js.UndefOr[Boolean] = js.undefined
    
    var staticMarkup: Boolean
  }
  object RenderOpts {
    
    @scala.inline
    def apply(
      App: AppType,
      Component: ComponentType[js.Object],
      Document: DocumentType,
      DocumentMiddleware: NextPageContext => Unit,
      ampBindInitData: Boolean,
      buildId: String,
      buildManifest: BuildManifest,
      canonicalBase: String,
      dangerousAsPath: String,
      documentMiddlewareEnabled: Boolean,
      pageConfig: PageConfig,
      reactLoadableManifest: ReactLoadableManifest,
      staticMarkup: Boolean
    ): RenderOpts = {
      val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], DocumentMiddleware = js.Any.fromFunction1(DocumentMiddleware), ampBindInitData = ampBindInitData.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], dangerousAsPath = dangerousAsPath.asInstanceOf[js.Any], documentMiddlewareEnabled = documentMiddlewareEnabled.asInstanceOf[js.Any], pageConfig = pageConfig.asInstanceOf[js.Any], reactLoadableManifest = reactLoadableManifest.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOpts]
    }
    
    @scala.inline
    implicit class RenderOptsMutableBuilder[Self <: RenderOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmpBindInitData(value: Boolean): Self = StObject.set(x, "ampBindInitData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpMode(value: js.Any): Self = StObject.set(x, "ampMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpModeUndefined: Self = StObject.set(x, "ampMode", js.undefined)
      
      @scala.inline
      def setAmpPath(value: String): Self = StObject.set(x, "ampPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpPathUndefined: Self = StObject.set(x, "ampPath", js.undefined)
      
      @scala.inline
      def setAmpValidator(value: (/* html */ String, /* pathname */ String) => js.Promise[Unit]): Self = StObject.set(x, "ampValidator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAmpValidatorUndefined: Self = StObject.set(x, "ampValidator", js.undefined)
      
      @scala.inline
      def setApp(value: AppType): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
      
      @scala.inline
      def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildManifest(value: BuildManifest): Self = StObject.set(x, "buildManifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanonicalBase(value: String): Self = StObject.set(x, "canonicalBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerousAsPath(value: String): Self = StObject.set(x, "dangerousAsPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataOnly(value: Boolean): Self = StObject.set(x, "dataOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataOnlyUndefined: Self = StObject.set(x, "dataOnly", js.undefined)
      
      @scala.inline
      def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      @scala.inline
      def setDocument(value: DocumentType): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentMiddleware(value: NextPageContext => Unit): Self = StObject.set(x, "DocumentMiddleware", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDocumentMiddlewareEnabled(value: Boolean): Self = StObject.set(x, "documentMiddlewareEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrNull: Self = StObject.set(x, "err", null)
      
      @scala.inline
      def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      @scala.inline
      def setErrorDebug(value: ComponentType[ErrorError]): Self = StObject.set(x, "ErrorDebug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorDebugUndefined: Self = StObject.set(x, "ErrorDebug", js.undefined)
      
      @scala.inline
      def setHybridAmp(value: Boolean): Self = StObject.set(x, "hybridAmp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHybridAmpUndefined: Self = StObject.set(x, "hybridAmp", js.undefined)
      
      @scala.inline
      def setInAmpMode(value: Boolean): Self = StObject.set(x, "inAmpMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInAmpModeUndefined: Self = StObject.set(x, "inAmpMode", js.undefined)
      
      @scala.inline
      def setNextExport(value: Boolean): Self = StObject.set(x, "nextExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextExportUndefined: Self = StObject.set(x, "nextExport", js.undefined)
      
      @scala.inline
      def setPageConfig(value: PageConfig): Self = StObject.set(x, "pageConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactLoadableManifest(value: ReactLoadableManifest): Self = StObject.set(x, "reactLoadableManifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeConfigUndefined: Self = StObject.set(x, "runtimeConfig", js.undefined)
      
      @scala.inline
      def setSkeleton(value: Boolean): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkeletonUndefined: Self = StObject.set(x, "skeleton", js.undefined)
      
      @scala.inline
      def setStaticMarkup(value: Boolean): Self = StObject.set(x, "staticMarkup", value.asInstanceOf[js.Any])
    }
  }
}
