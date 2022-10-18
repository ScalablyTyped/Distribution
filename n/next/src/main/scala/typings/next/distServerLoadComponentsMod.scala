package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.BuildManifest
import typings.next.anon.Serverless
import typings.next.distSharedLibUtilsMod.AppType
import typings.next.distSharedLibUtilsMod.DocumentType
import typings.next.distSharedLibUtilsMod.NextComponentType
import typings.next.distSharedLibUtilsMod.NextPageContext
import typings.next.typesMod.GetServerSideProps
import typings.next.typesMod.GetServerSidePropsContext
import typings.next.typesMod.GetServerSidePropsResult
import typings.next.typesMod.GetStaticPaths
import typings.next.typesMod.GetStaticPathsContext
import typings.next.typesMod.GetStaticPathsResult
import typings.next.typesMod.GetStaticProps
import typings.next.typesMod.GetStaticPropsContext
import typings.next.typesMod.GetStaticPropsResult
import typings.next.typesMod.PageConfig
import typings.next.typesMod.PreviewData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLoadComponentsMod {
  
  @JSImport("next/dist/server/load-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadComponents(hasDistDirPathnameServerlessHasServerComponentsIsAppPath: Serverless): js.Promise[LoadComponentsReturnType] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadComponents")(hasDistDirPathnameServerlessHasServerComponentsIsAppPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LoadComponentsReturnType]]
  
  inline def loadDefaultErrorComponents(distDir: String): js.Promise[BuildManifest] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadDefaultErrorComponents")(distDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildManifest]]
  
  trait LoadComponentsReturnType extends StObject {
    
    var App: AppType[js.Object]
    
    var Component: NextComponentType[NextPageContext, js.Object, js.Object]
    
    var ComponentMod: Any
    
    var Document: DocumentType
    
    var buildManifest: typings.next.distServerGetPageFilesMod.BuildManifest
    
    var getServerSideProps: js.UndefOr[
        GetServerSideProps[
          StringDictionary[Any], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any, 
          PreviewData
        ]
      ] = js.undefined
    
    var getStaticPaths: js.UndefOr[
        GetStaticPaths[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
        ]
      ] = js.undefined
    
    var getStaticProps: js.UndefOr[
        GetStaticProps[
          StringDictionary[Any], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any, 
          PreviewData
        ]
      ] = js.undefined
    
    var isAppPath: js.UndefOr[Boolean] = js.undefined
    
    var pageConfig: PageConfig
    
    var pathname: String
    
    var reactLoadableManifest: ReactLoadableManifest
    
    var serverComponentManifest: js.UndefOr[Any] = js.undefined
    
    var subresourceIntegrityManifest: js.UndefOr[Record[String, String]] = js.undefined
  }
  object LoadComponentsReturnType {
    
    inline def apply(
      App: AppType[js.Object],
      Component: NextComponentType[NextPageContext, js.Object, js.Object],
      ComponentMod: Any,
      Document: DocumentType,
      buildManifest: typings.next.distServerGetPageFilesMod.BuildManifest,
      pageConfig: PageConfig,
      pathname: String,
      reactLoadableManifest: ReactLoadableManifest
    ): LoadComponentsReturnType = {
      val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], ComponentMod = ComponentMod.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], pageConfig = pageConfig.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], reactLoadableManifest = reactLoadableManifest.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadComponentsReturnType]
    }
    
    extension [Self <: LoadComponentsReturnType](x: Self) {
      
      inline def setApp(value: AppType[js.Object]): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
      
      inline def setBuildManifest(value: typings.next.distServerGetPageFilesMod.BuildManifest): Self = StObject.set(x, "buildManifest", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: NextComponentType[NextPageContext, js.Object, js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setComponentMod(value: Any): Self = StObject.set(x, "ComponentMod", value.asInstanceOf[js.Any])
      
      inline def setDocument(value: DocumentType): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
      
      inline def setGetServerSideProps(
        value: /* context */ GetServerSidePropsContext[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any, 
              PreviewData
            ] => js.Promise[GetServerSidePropsResult[StringDictionary[Any]]]
      ): Self = StObject.set(x, "getServerSideProps", js.Any.fromFunction1(value))
      
      inline def setGetServerSidePropsUndefined: Self = StObject.set(x, "getServerSideProps", js.undefined)
      
      inline def setGetStaticPaths(
        value: /* context */ GetStaticPathsContext => (js.Promise[
              GetStaticPathsResult[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
              ]
            ]) | (GetStaticPathsResult[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
            ])
      ): Self = StObject.set(x, "getStaticPaths", js.Any.fromFunction1(value))
      
      inline def setGetStaticPathsUndefined: Self = StObject.set(x, "getStaticPaths", js.undefined)
      
      inline def setGetStaticProps(
        value: /* context */ GetStaticPropsContext[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any, 
              PreviewData
            ] => js.Promise[GetStaticPropsResult[StringDictionary[Any]]] | GetStaticPropsResult[StringDictionary[Any]]
      ): Self = StObject.set(x, "getStaticProps", js.Any.fromFunction1(value))
      
      inline def setGetStaticPropsUndefined: Self = StObject.set(x, "getStaticProps", js.undefined)
      
      inline def setIsAppPath(value: Boolean): Self = StObject.set(x, "isAppPath", value.asInstanceOf[js.Any])
      
      inline def setIsAppPathUndefined: Self = StObject.set(x, "isAppPath", js.undefined)
      
      inline def setPageConfig(value: PageConfig): Self = StObject.set(x, "pageConfig", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setReactLoadableManifest(value: ReactLoadableManifest): Self = StObject.set(x, "reactLoadableManifest", value.asInstanceOf[js.Any])
      
      inline def setServerComponentManifest(value: Any): Self = StObject.set(x, "serverComponentManifest", value.asInstanceOf[js.Any])
      
      inline def setServerComponentManifestUndefined: Self = StObject.set(x, "serverComponentManifest", js.undefined)
      
      inline def setSubresourceIntegrityManifest(value: Record[String, String]): Self = StObject.set(x, "subresourceIntegrityManifest", value.asInstanceOf[js.Any])
      
      inline def setSubresourceIntegrityManifestUndefined: Self = StObject.set(x, "subresourceIntegrityManifest", js.undefined)
    }
  }
  
  trait ManifestItem extends StObject {
    
    var files: js.Array[String]
    
    var id: Double | String
  }
  object ManifestItem {
    
    inline def apply(files: js.Array[String], id: Double | String): ManifestItem = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManifestItem]
    }
    
    extension [Self <: ManifestItem](x: Self) {
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactLoadableManifest = StringDictionary[ManifestItem]
}
