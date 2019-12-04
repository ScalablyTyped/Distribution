package typings.nextDashServer.distServerLoadDashComponentsMod

import typings.nextDashServer.typesMod.PageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadComponentsReturnType extends js.Object {
  var App: js.UndefOr[js.Any] = js.undefined
  var Component: js.Any
  var Document: js.UndefOr[js.Any] = js.undefined
  var DocumentMiddleware: js.UndefOr[js.Any] = js.undefined
  var buildManifest: js.UndefOr[js.Any] = js.undefined
  var pageConfig: PageConfig
  var reactLoadableManifest: js.UndefOr[js.Any] = js.undefined
}

object LoadComponentsReturnType {
  @scala.inline
  def apply(
    Component: js.Any,
    pageConfig: PageConfig,
    App: js.Any = null,
    Document: js.Any = null,
    DocumentMiddleware: js.Any = null,
    buildManifest: js.Any = null,
    reactLoadableManifest: js.Any = null
  ): LoadComponentsReturnType = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], pageConfig = pageConfig.asInstanceOf[js.Any])
    if (App != null) __obj.updateDynamic("App")(App.asInstanceOf[js.Any])
    if (Document != null) __obj.updateDynamic("Document")(Document.asInstanceOf[js.Any])
    if (DocumentMiddleware != null) __obj.updateDynamic("DocumentMiddleware")(DocumentMiddleware.asInstanceOf[js.Any])
    if (buildManifest != null) __obj.updateDynamic("buildManifest")(buildManifest.asInstanceOf[js.Any])
    if (reactLoadableManifest != null) __obj.updateDynamic("reactLoadableManifest")(reactLoadableManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadComponentsReturnType]
  }
}

