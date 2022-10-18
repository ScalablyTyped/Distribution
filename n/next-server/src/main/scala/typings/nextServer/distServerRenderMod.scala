package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.anon.ErrorError
import typings.nextServer.distLibUtilsMod.AppType
import typings.nextServer.distLibUtilsMod.DocumentType
import typings.nextServer.distLibUtilsMod.NextPageContext
import typings.nextServer.distServerGetPageFilesMod.BuildManifest
import typings.nextServer.typesMod.PageConfig
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerRenderMod {
  
  @JSImport("next-server/dist/server/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderToHTML(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    pathname: String,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
    renderOpts: RenderOpts
  ): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToHTML")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any], query.asInstanceOf[js.Any], renderOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  
  trait ManifestItem extends StObject {
    
    var file: String
    
    var id: Double | String
    
    var name: String
    
    var publicPath: String
  }
  object ManifestItem {
    
    inline def apply(file: String, id: Double | String, name: String, publicPath: String): ManifestItem = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManifestItem]
    }
    
    extension [Self <: ManifestItem](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
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
    
    var ampMode: js.UndefOr[Any] = js.undefined
    
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
    
    var err: js.UndefOr[js.Error | Null] = js.undefined
    
    var hybridAmp: js.UndefOr[Boolean] = js.undefined
    
    var inAmpMode: js.UndefOr[Boolean] = js.undefined
    
    var nextExport: js.UndefOr[Boolean] = js.undefined
    
    var pageConfig: PageConfig
    
    var reactLoadableManifest: ReactLoadableManifest
    
    var runtimeConfig: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var skeleton: js.UndefOr[Boolean] = js.undefined
    
    var staticMarkup: Boolean
  }
  object RenderOpts {
    
    inline def apply(
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
    
    extension [Self <: RenderOpts](x: Self) {
      
      inline def setAmpBindInitData(value: Boolean): Self = StObject.set(x, "ampBindInitData", value.asInstanceOf[js.Any])
      
      inline def setAmpMode(value: Any): Self = StObject.set(x, "ampMode", value.asInstanceOf[js.Any])
      
      inline def setAmpModeUndefined: Self = StObject.set(x, "ampMode", js.undefined)
      
      inline def setAmpPath(value: String): Self = StObject.set(x, "ampPath", value.asInstanceOf[js.Any])
      
      inline def setAmpPathUndefined: Self = StObject.set(x, "ampPath", js.undefined)
      
      inline def setAmpValidator(value: (/* html */ String, /* pathname */ String) => js.Promise[Unit]): Self = StObject.set(x, "ampValidator", js.Any.fromFunction2(value))
      
      inline def setAmpValidatorUndefined: Self = StObject.set(x, "ampValidator", js.undefined)
      
      inline def setApp(value: AppType): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
      
      inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
      
      inline def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
      
      inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setBuildManifest(value: BuildManifest): Self = StObject.set(x, "buildManifest", value.asInstanceOf[js.Any])
      
      inline def setCanonicalBase(value: String): Self = StObject.set(x, "canonicalBase", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setDangerousAsPath(value: String): Self = StObject.set(x, "dangerousAsPath", value.asInstanceOf[js.Any])
      
      inline def setDataOnly(value: Boolean): Self = StObject.set(x, "dataOnly", value.asInstanceOf[js.Any])
      
      inline def setDataOnlyUndefined: Self = StObject.set(x, "dataOnly", js.undefined)
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setDocument(value: DocumentType): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
      
      inline def setDocumentMiddleware(value: NextPageContext => Unit): Self = StObject.set(x, "DocumentMiddleware", js.Any.fromFunction1(value))
      
      inline def setDocumentMiddlewareEnabled(value: Boolean): Self = StObject.set(x, "documentMiddlewareEnabled", value.asInstanceOf[js.Any])
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrNull: Self = StObject.set(x, "err", null)
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setErrorDebug(value: ComponentType[ErrorError]): Self = StObject.set(x, "ErrorDebug", value.asInstanceOf[js.Any])
      
      inline def setErrorDebugUndefined: Self = StObject.set(x, "ErrorDebug", js.undefined)
      
      inline def setHybridAmp(value: Boolean): Self = StObject.set(x, "hybridAmp", value.asInstanceOf[js.Any])
      
      inline def setHybridAmpUndefined: Self = StObject.set(x, "hybridAmp", js.undefined)
      
      inline def setInAmpMode(value: Boolean): Self = StObject.set(x, "inAmpMode", value.asInstanceOf[js.Any])
      
      inline def setInAmpModeUndefined: Self = StObject.set(x, "inAmpMode", js.undefined)
      
      inline def setNextExport(value: Boolean): Self = StObject.set(x, "nextExport", value.asInstanceOf[js.Any])
      
      inline def setNextExportUndefined: Self = StObject.set(x, "nextExport", js.undefined)
      
      inline def setPageConfig(value: PageConfig): Self = StObject.set(x, "pageConfig", value.asInstanceOf[js.Any])
      
      inline def setReactLoadableManifest(value: ReactLoadableManifest): Self = StObject.set(x, "reactLoadableManifest", value.asInstanceOf[js.Any])
      
      inline def setRuntimeConfig(value: StringDictionary[Any]): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
      
      inline def setRuntimeConfigUndefined: Self = StObject.set(x, "runtimeConfig", js.undefined)
      
      inline def setSkeleton(value: Boolean): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
      
      inline def setSkeletonUndefined: Self = StObject.set(x, "skeleton", js.undefined)
      
      inline def setStaticMarkup(value: Boolean): Self = StObject.set(x, "staticMarkup", value.asInstanceOf[js.Any])
    }
  }
}
