package typings.next.distNextDashServerServerRenderMod

import org.scalablytyped.runtime.StringDictionary
import typings.next.Anon_Error
import typings.next.Anon_Params
import typings.next.Anon_Props
import typings.next.distNextDashServerLibUtilsMod.AppType
import typings.next.distNextDashServerLibUtilsMod.DocumentType
import typings.next.distNextDashServerLibUtilsMod.NextPageContext
import typings.next.distNextDashServerServerGetDashPageDashFilesMod.BuildManifest
import typings.react.reactMod.ComponentType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOpts extends js.Object {
  var App: AppType
  var Component: ComponentType[js.Object]
  var Document: DocumentType
  var ErrorDebug: js.UndefOr[ComponentType[Anon_Error]] = js.undefined
  var ampBindInitData: Boolean
  var ampMode: js.UndefOr[js.Any] = js.undefined
  var ampPath: js.UndefOr[String] = js.undefined
  var ampValidator: js.UndefOr[js.Function2[/* html */ String, /* pathname */ String, js.Promise[Unit]]] = js.undefined
  var assetPrefix: js.UndefOr[String] = js.undefined
  var autoExport: js.UndefOr[Boolean] = js.undefined
  var buildId: String
  var buildManifest: BuildManifest
  var canonicalBase: String
  var dangerousAsPath: String
  var dataOnly: js.UndefOr[Boolean] = js.undefined
  var dev: js.UndefOr[Boolean] = js.undefined
  var documentMiddlewareEnabled: Boolean
  var err: js.UndefOr[Error | Null] = js.undefined
  var hasCssMode: Boolean
  var hybridAmp: js.UndefOr[Boolean] = js.undefined
  var inAmpMode: js.UndefOr[Boolean] = js.undefined
  var nextExport: js.UndefOr[Boolean] = js.undefined
  var pageConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PageConfig */ js.Any
  var reactLoadableManifest: ReactLoadableManifest
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var staticMarkup: Boolean
  var unstable_getStaticPaths: js.UndefOr[js.Function0[Unit]] = js.undefined
  var unstable_getStaticProps: js.UndefOr[js.Function1[/* params */ Anon_Params, Anon_Props]] = js.undefined
  def DocumentMiddleware(ctx: NextPageContext): Unit
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
    hasCssMode: Boolean,
    pageConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PageConfig */ js.Any,
    reactLoadableManifest: ReactLoadableManifest,
    staticMarkup: Boolean,
    ErrorDebug: ComponentType[Anon_Error] = null,
    ampMode: js.Any = null,
    ampPath: String = null,
    ampValidator: (/* html */ String, /* pathname */ String) => js.Promise[Unit] = null,
    assetPrefix: String = null,
    autoExport: js.UndefOr[Boolean] = js.undefined,
    dataOnly: js.UndefOr[Boolean] = js.undefined,
    dev: js.UndefOr[Boolean] = js.undefined,
    err: Error = null,
    hybridAmp: js.UndefOr[Boolean] = js.undefined,
    inAmpMode: js.UndefOr[Boolean] = js.undefined,
    nextExport: js.UndefOr[Boolean] = js.undefined,
    runtimeConfig: StringDictionary[js.Any] = null,
    unstable_getStaticPaths: () => Unit = null,
    unstable_getStaticProps: /* params */ Anon_Params => Anon_Props = null
  ): RenderOpts = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], DocumentMiddleware = js.Any.fromFunction1(DocumentMiddleware), ampBindInitData = ampBindInitData.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], dangerousAsPath = dangerousAsPath.asInstanceOf[js.Any], documentMiddlewareEnabled = documentMiddlewareEnabled.asInstanceOf[js.Any], hasCssMode = hasCssMode.asInstanceOf[js.Any], pageConfig = pageConfig.asInstanceOf[js.Any], reactLoadableManifest = reactLoadableManifest.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
    if (ErrorDebug != null) __obj.updateDynamic("ErrorDebug")(ErrorDebug.asInstanceOf[js.Any])
    if (ampMode != null) __obj.updateDynamic("ampMode")(ampMode.asInstanceOf[js.Any])
    if (ampPath != null) __obj.updateDynamic("ampPath")(ampPath.asInstanceOf[js.Any])
    if (ampValidator != null) __obj.updateDynamic("ampValidator")(js.Any.fromFunction2(ampValidator))
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(autoExport)) __obj.updateDynamic("autoExport")(autoExport.asInstanceOf[js.Any])
    if (!js.isUndefined(dataOnly)) __obj.updateDynamic("dataOnly")(dataOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    if (!js.isUndefined(hybridAmp)) __obj.updateDynamic("hybridAmp")(hybridAmp.asInstanceOf[js.Any])
    if (!js.isUndefined(inAmpMode)) __obj.updateDynamic("inAmpMode")(inAmpMode.asInstanceOf[js.Any])
    if (!js.isUndefined(nextExport)) __obj.updateDynamic("nextExport")(nextExport.asInstanceOf[js.Any])
    if (runtimeConfig != null) __obj.updateDynamic("runtimeConfig")(runtimeConfig.asInstanceOf[js.Any])
    if (unstable_getStaticPaths != null) __obj.updateDynamic("unstable_getStaticPaths")(js.Any.fromFunction0(unstable_getStaticPaths))
    if (unstable_getStaticProps != null) __obj.updateDynamic("unstable_getStaticProps")(js.Any.fromFunction1(unstable_getStaticProps))
    __obj.asInstanceOf[RenderOpts]
  }
}

