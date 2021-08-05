package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.getPageFilesMod.BuildManifest
import typings.next.libUtilsMod.AppType
import typings.next.libUtilsMod.DocumentType
import typings.next.mod.GetServerSideProps
import typings.next.mod.GetServerSidePropsContext
import typings.next.mod.GetServerSidePropsResult
import typings.next.mod.GetStaticPaths
import typings.next.mod.GetStaticPathsContext
import typings.next.mod.GetStaticPathsResult
import typings.next.mod.GetStaticProps
import typings.next.mod.GetStaticPropsContext
import typings.next.mod.GetStaticPropsResult
import typings.next.mod.PageConfig
import typings.node.querystringMod.ParsedUrlQuery
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadComponentsMod {
  
  @JSImport("next/dist/next-server/server/load-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interopDefault(mod: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interopDefault")(mod.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def loadComponents(distDir: String, pathname: String, serverless: Boolean): js.Promise[LoadComponentsReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadComponents")(distDir.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LoadComponentsReturnType]]
  
  trait LoadComponentsReturnType extends StObject {
    
    var App: AppType
    
    var Component: ComponentType[js.Object]
    
    var Document: DocumentType
    
    var buildManifest: BuildManifest
    
    var getServerSideProps: js.UndefOr[GetServerSideProps[StringDictionary[js.Any], ParsedUrlQuery]] = js.undefined
    
    var getStaticPaths: js.UndefOr[GetStaticPaths[ParsedUrlQuery]] = js.undefined
    
    var getStaticProps: js.UndefOr[GetStaticProps[StringDictionary[js.Any], ParsedUrlQuery]] = js.undefined
    
    var pageConfig: js.UndefOr[PageConfig] = js.undefined
    
    var reactLoadableManifest: ReactLoadableManifest
  }
  object LoadComponentsReturnType {
    
    inline def apply(
      App: AppType,
      Component: ComponentType[js.Object],
      Document: DocumentType,
      buildManifest: BuildManifest,
      reactLoadableManifest: ReactLoadableManifest
    ): LoadComponentsReturnType = {
      val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], reactLoadableManifest = reactLoadableManifest.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadComponentsReturnType]
    }
    
    extension [Self <: LoadComponentsReturnType](x: Self) {
      
      inline def setApp(value: AppType): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
      
      inline def setBuildManifest(value: BuildManifest): Self = StObject.set(x, "buildManifest", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setDocument(value: DocumentType): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
      
      inline def setGetServerSideProps(
        value: /* context */ GetServerSidePropsContext[ParsedUrlQuery] => js.Promise[GetServerSidePropsResult[StringDictionary[js.Any]]]
      ): Self = StObject.set(x, "getServerSideProps", js.Any.fromFunction1(value))
      
      inline def setGetServerSidePropsUndefined: Self = StObject.set(x, "getServerSideProps", js.undefined)
      
      inline def setGetStaticPaths(value: /* context */ GetStaticPathsContext => js.Promise[GetStaticPathsResult[ParsedUrlQuery]]): Self = StObject.set(x, "getStaticPaths", js.Any.fromFunction1(value))
      
      inline def setGetStaticPathsUndefined: Self = StObject.set(x, "getStaticPaths", js.undefined)
      
      inline def setGetStaticProps(
        value: /* context */ GetStaticPropsContext[ParsedUrlQuery] => js.Promise[GetStaticPropsResult[StringDictionary[js.Any]]]
      ): Self = StObject.set(x, "getStaticProps", js.Any.fromFunction1(value))
      
      inline def setGetStaticPropsUndefined: Self = StObject.set(x, "getStaticProps", js.undefined)
      
      inline def setPageConfig(value: PageConfig): Self = StObject.set(x, "pageConfig", value.asInstanceOf[js.Any])
      
      inline def setPageConfigUndefined: Self = StObject.set(x, "pageConfig", js.undefined)
      
      inline def setReactLoadableManifest(value: ReactLoadableManifest): Self = StObject.set(x, "reactLoadableManifest", value.asInstanceOf[js.Any])
    }
  }
  
  trait ManifestItem extends StObject {
    
    var file: String
    
    var id: Double | String
    
    var name: String
  }
  object ManifestItem {
    
    inline def apply(file: String, id: Double | String, name: String): ManifestItem = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManifestItem]
    }
    
    extension [Self <: ManifestItem](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactLoadableManifest = StringDictionary[js.Array[ManifestItem]]
}
