package typings.next.loadComponentsMod

import org.scalablytyped.runtime.StringDictionary
import typings.next.AnonPaths
import typings.next.AnonPreview
import typings.next.AnonProps
import typings.next.AnonQuery
import typings.next.getPageFilesMod.BuildManifest
import typings.next.utilsMod.AppType
import typings.next.utilsMod.DocumentType
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadComponentsReturnType extends js.Object {
  var App: AppType
  var Component: ComponentType[js.Object]
  var Document: DocumentType
  var DocumentMiddleware: js.UndefOr[
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NextPageContext */ /* ctx */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var buildManifest: BuildManifest
  var pageConfig: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PageConfig */ js.Any
  ] = js.undefined
  var reactLoadableManifest: ReactLoadableManifest
  var unstable_getServerProps: js.UndefOr[UnstableGetServerProps] = js.undefined
  var unstable_getStaticPaths: js.UndefOr[UnstableGetStaticPaths] = js.undefined
  var unstable_getStaticProps: js.UndefOr[UnstableGetStaticProps] = js.undefined
}

object LoadComponentsReturnType {
  @scala.inline
  def apply(
    App: AppType,
    Component: ComponentType[js.Object],
    Document: DocumentType,
    buildManifest: BuildManifest,
    reactLoadableManifest: ReactLoadableManifest,
    DocumentMiddleware: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NextPageContext */ /* ctx */ js.Any => Unit = null,
    pageConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PageConfig */ js.Any = null,
    unstable_getServerProps: /* context */ AnonQuery => js.Promise[StringDictionary[js.Any]] = null,
    unstable_getStaticPaths: () => js.Promise[AnonPaths] = null,
    unstable_getStaticProps: /* ctx */ AnonPreview => js.Promise[AnonProps] = null
  ): LoadComponentsReturnType = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], reactLoadableManifest = reactLoadableManifest.asInstanceOf[js.Any])
    if (DocumentMiddleware != null) __obj.updateDynamic("DocumentMiddleware")(js.Any.fromFunction1(DocumentMiddleware))
    if (pageConfig != null) __obj.updateDynamic("pageConfig")(pageConfig.asInstanceOf[js.Any])
    if (unstable_getServerProps != null) __obj.updateDynamic("unstable_getServerProps")(js.Any.fromFunction1(unstable_getServerProps))
    if (unstable_getStaticPaths != null) __obj.updateDynamic("unstable_getStaticPaths")(js.Any.fromFunction0(unstable_getStaticPaths))
    if (unstable_getStaticProps != null) __obj.updateDynamic("unstable_getStaticProps")(js.Any.fromFunction1(unstable_getStaticProps))
    __obj.asInstanceOf[LoadComponentsReturnType]
  }
}

