package typings.next.loadComponentsMod

import org.scalablytyped.runtime.StringDictionary
import typings.next.AnonParams
import typings.next.AnonPaths
import typings.next.AnonPreview
import typings.next.AnonProps
import typings.next.AnonPropsP
import typings.next.getPageFilesMod.BuildManifest
import typings.next.mod.GetServerSideProps
import typings.next.mod.GetStaticPaths
import typings.next.mod.GetStaticProps
import typings.next.mod.PageConfig
import typings.next.utilsMod.AppType
import typings.next.utilsMod.DocumentType
import typings.next.utilsMod.NextPageContext
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadComponentsReturnType extends js.Object {
  var App: AppType
  var Component: ComponentType[js.Object]
  var Document: DocumentType
  var DocumentMiddleware: js.UndefOr[js.Function1[/* ctx */ NextPageContext, Unit]] = js.undefined
  var buildManifest: BuildManifest
  var getServerSideProps: js.UndefOr[GetServerSideProps[StringDictionary[_]]] = js.undefined
  var getStaticPaths: js.UndefOr[GetStaticPaths] = js.undefined
  var getStaticProps: js.UndefOr[GetStaticProps[StringDictionary[_]]] = js.undefined
  var pageConfig: js.UndefOr[PageConfig] = js.undefined
  var reactLoadableManifest: ReactLoadableManifest
}

object LoadComponentsReturnType {
  @scala.inline
  def apply(
    App: AppType,
    Component: ComponentType[js.Object],
    Document: DocumentType,
    buildManifest: BuildManifest,
    reactLoadableManifest: ReactLoadableManifest,
    DocumentMiddleware: /* ctx */ NextPageContext => Unit = null,
    getServerSideProps: /* context */ AnonPreview => js.Promise[AnonPropsP[StringDictionary[_]]] = null,
    getStaticPaths: () => js.Promise[AnonPaths] = null,
    getStaticProps: /* ctx */ AnonParams => js.Promise[AnonProps[StringDictionary[_]]] = null,
    pageConfig: PageConfig = null
  ): LoadComponentsReturnType = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], reactLoadableManifest = reactLoadableManifest.asInstanceOf[js.Any])
    if (DocumentMiddleware != null) __obj.updateDynamic("DocumentMiddleware")(js.Any.fromFunction1(DocumentMiddleware))
    if (getServerSideProps != null) __obj.updateDynamic("getServerSideProps")(js.Any.fromFunction1(getServerSideProps))
    if (getStaticPaths != null) __obj.updateDynamic("getStaticPaths")(js.Any.fromFunction0(getStaticPaths))
    if (getStaticProps != null) __obj.updateDynamic("getStaticProps")(js.Any.fromFunction1(getStaticProps))
    if (pageConfig != null) __obj.updateDynamic("pageConfig")(pageConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadComponentsReturnType]
  }
}

