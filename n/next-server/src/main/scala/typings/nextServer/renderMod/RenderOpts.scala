package typings.nextServer.renderMod

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.anon.ErrorError
import typings.nextServer.getPageFilesMod.BuildManifest
import typings.nextServer.libUtilsMod.AppType
import typings.nextServer.libUtilsMod.DocumentType
import typings.nextServer.libUtilsMod.NextPageContext
import typings.nextServer.typesMod.PageConfig
import typings.react.mod.ComponentType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderOpts extends js.Object {
  var App: AppType = js.native
  var Component: ComponentType[js.Object] = js.native
  var Document: DocumentType = js.native
  var ErrorDebug: js.UndefOr[ComponentType[ErrorError]] = js.native
  var ampBindInitData: Boolean = js.native
  var ampMode: js.UndefOr[js.Any] = js.native
  var ampPath: js.UndefOr[String] = js.native
  var ampValidator: js.UndefOr[js.Function2[/* html */ String, /* pathname */ String, js.Promise[Unit]]] = js.native
  var assetPrefix: js.UndefOr[String] = js.native
  var buildId: String = js.native
  var buildManifest: BuildManifest = js.native
  var canonicalBase: String = js.native
  var dangerousAsPath: String = js.native
  var dataOnly: js.UndefOr[Boolean] = js.native
  var dev: js.UndefOr[Boolean] = js.native
  var documentMiddlewareEnabled: Boolean = js.native
  var err: js.UndefOr[Error | Null] = js.native
  var hybridAmp: js.UndefOr[Boolean] = js.native
  var inAmpMode: js.UndefOr[Boolean] = js.native
  var nextExport: js.UndefOr[Boolean] = js.native
  var pageConfig: PageConfig = js.native
  var reactLoadableManifest: ReactLoadableManifest = js.native
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
  var skeleton: js.UndefOr[Boolean] = js.native
  var staticMarkup: Boolean = js.native
  def DocumentMiddleware(ctx: NextPageContext): Unit = js.native
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
  implicit class RenderOptsOps[Self <: RenderOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApp(value: AppType): Self = this.set("App", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: ComponentType[js.Object]): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocument(value: DocumentType): Self = this.set("Document", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentMiddleware(value: NextPageContext => Unit): Self = this.set("DocumentMiddleware", js.Any.fromFunction1(value))
    @scala.inline
    def setAmpBindInitData(value: Boolean): Self = this.set("ampBindInitData", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildId(value: String): Self = this.set("buildId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildManifest(value: BuildManifest): Self = this.set("buildManifest", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanonicalBase(value: String): Self = this.set("canonicalBase", value.asInstanceOf[js.Any])
    @scala.inline
    def setDangerousAsPath(value: String): Self = this.set("dangerousAsPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentMiddlewareEnabled(value: Boolean): Self = this.set("documentMiddlewareEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageConfig(value: PageConfig): Self = this.set("pageConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setReactLoadableManifest(value: ReactLoadableManifest): Self = this.set("reactLoadableManifest", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaticMarkup(value: Boolean): Self = this.set("staticMarkup", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorDebug(value: ComponentType[ErrorError]): Self = this.set("ErrorDebug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDebug: Self = this.set("ErrorDebug", js.undefined)
    @scala.inline
    def setAmpMode(value: js.Any): Self = this.set("ampMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmpMode: Self = this.set("ampMode", js.undefined)
    @scala.inline
    def setAmpPath(value: String): Self = this.set("ampPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmpPath: Self = this.set("ampPath", js.undefined)
    @scala.inline
    def setAmpValidator(value: (/* html */ String, /* pathname */ String) => js.Promise[Unit]): Self = this.set("ampValidator", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAmpValidator: Self = this.set("ampValidator", js.undefined)
    @scala.inline
    def setAssetPrefix(value: String): Self = this.set("assetPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetPrefix: Self = this.set("assetPrefix", js.undefined)
    @scala.inline
    def setDataOnly(value: Boolean): Self = this.set("dataOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataOnly: Self = this.set("dataOnly", js.undefined)
    @scala.inline
    def setDev(value: Boolean): Self = this.set("dev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDev: Self = this.set("dev", js.undefined)
    @scala.inline
    def setErr(value: Error): Self = this.set("err", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
    @scala.inline
    def setErrNull: Self = this.set("err", null)
    @scala.inline
    def setHybridAmp(value: Boolean): Self = this.set("hybridAmp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHybridAmp: Self = this.set("hybridAmp", js.undefined)
    @scala.inline
    def setInAmpMode(value: Boolean): Self = this.set("inAmpMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInAmpMode: Self = this.set("inAmpMode", js.undefined)
    @scala.inline
    def setNextExport(value: Boolean): Self = this.set("nextExport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextExport: Self = this.set("nextExport", js.undefined)
    @scala.inline
    def setRuntimeConfig(value: StringDictionary[js.Any]): Self = this.set("runtimeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeConfig: Self = this.set("runtimeConfig", js.undefined)
    @scala.inline
    def setSkeleton(value: Boolean): Self = this.set("skeleton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkeleton: Self = this.set("skeleton", js.undefined)
  }
  
}

