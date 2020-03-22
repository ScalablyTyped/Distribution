package typings.next.loadComponentsMod

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
  var getServerSideProps: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GetServerSideProps */ js.Any
  ] = js.undefined
  var getStaticPaths: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GetStaticPaths */ js.Any
  ] = js.undefined
  var getStaticProps: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GetStaticProps */ js.Any
  ] = js.undefined
  var pageConfig: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PageConfig */ js.Any
  ] = js.undefined
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
    DocumentMiddleware: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NextPageContext */ /* ctx */ js.Any => Unit = null,
    getServerSideProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GetServerSideProps */ js.Any = null,
    getStaticPaths: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GetStaticPaths */ js.Any = null,
    getStaticProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GetStaticProps */ js.Any = null,
    pageConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PageConfig */ js.Any = null
  ): LoadComponentsReturnType = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], reactLoadableManifest = reactLoadableManifest.asInstanceOf[js.Any])
    if (DocumentMiddleware != null) __obj.updateDynamic("DocumentMiddleware")(js.Any.fromFunction1(DocumentMiddleware))
    if (getServerSideProps != null) __obj.updateDynamic("getServerSideProps")(getServerSideProps.asInstanceOf[js.Any])
    if (getStaticPaths != null) __obj.updateDynamic("getStaticPaths")(getStaticPaths.asInstanceOf[js.Any])
    if (getStaticProps != null) __obj.updateDynamic("getStaticProps")(getStaticProps.asInstanceOf[js.Any])
    if (pageConfig != null) __obj.updateDynamic("pageConfig")(pageConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadComponentsReturnType]
  }
}

