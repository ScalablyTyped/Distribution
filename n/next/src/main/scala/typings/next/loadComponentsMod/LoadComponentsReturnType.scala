package typings.next.loadComponentsMod

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.Paths
import typings.next.anon.Props
import typings.next.anon.PropsP
import typings.next.getPageFilesMod.BuildManifest
import typings.next.mod.GetServerSideProps
import typings.next.mod.GetServerSidePropsContext
import typings.next.mod.GetStaticPaths
import typings.next.mod.GetStaticProps
import typings.next.mod.GetStaticPropsContext
import typings.next.mod.PageConfig
import typings.next.utilsMod.AppType
import typings.next.utilsMod.DocumentType
import typings.node.querystringMod.ParsedUrlQuery
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadComponentsReturnType extends js.Object {
  var App: AppType
  var Component: ComponentType[js.Object]
  var Document: DocumentType
  var buildManifest: BuildManifest
  var getServerSideProps: js.UndefOr[GetServerSideProps[StringDictionary[_], ParsedUrlQuery]] = js.undefined
  var getStaticPaths: js.UndefOr[GetStaticPaths[ParsedUrlQuery]] = js.undefined
  var getStaticProps: js.UndefOr[GetStaticProps[StringDictionary[_], ParsedUrlQuery]] = js.undefined
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
    getServerSideProps: /* context */ GetServerSidePropsContext[ParsedUrlQuery] => js.Promise[PropsP[StringDictionary[_]]] = null,
    getStaticPaths: () => js.Promise[Paths[ParsedUrlQuery]] = null,
    getStaticProps: /* ctx */ GetStaticPropsContext[ParsedUrlQuery] => js.Promise[Props[StringDictionary[_]]] = null,
    pageConfig: PageConfig = null
  ): LoadComponentsReturnType = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], reactLoadableManifest = reactLoadableManifest.asInstanceOf[js.Any])
    if (getServerSideProps != null) __obj.updateDynamic("getServerSideProps")(js.Any.fromFunction1(getServerSideProps))
    if (getStaticPaths != null) __obj.updateDynamic("getStaticPaths")(js.Any.fromFunction0(getStaticPaths))
    if (getStaticProps != null) __obj.updateDynamic("getStaticProps")(js.Any.fromFunction1(getStaticProps))
    if (pageConfig != null) __obj.updateDynamic("pageConfig")(pageConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadComponentsReturnType]
  }
}

