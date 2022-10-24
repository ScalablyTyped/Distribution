package typings.nextReduxWrapper

import typings.next.appMod.default
import typings.next.distSharedLibUtilsMod.NextComponentType
import typings.next.typesMod.GetServerSideProps
import typings.next.typesMod.GetStaticProps
import typings.next.typesMod.PreviewData
import typings.nextReduxWrapper.mod.AppCallback
import typings.nextReduxWrapper.mod.GetServerSidePropsCallback
import typings.nextReduxWrapper.mod.GetStaticPropsCallback
import typings.nextReduxWrapper.mod.PageCallback
import typings.nextReduxWrapper.mod.nextAugmentingMod.NextPageContext
import typings.react.mod.global.JSX.Element
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(props: Any): Element = js.native
    
    var displayName: String = js.native
    
    var getInitialProps: Any = js.native
  }
  
  @js.native
  trait GetInitialAppProps[S /* <: Store[Any, AnyAction] */] extends StObject {
    
    def getInitialAppProps[P_2 /* <: js.Object */](callback: AppCallback[S, P_2]): typings.nextReduxWrapper.mod.GetInitialAppProps[P_2] = js.native
    
    def getInitialPageProps[P_3 /* <: js.Object */](callback: PageCallback[S, P_3]): js.UndefOr[js.Function1[/* context */ NextPageContext[Any], Any]] = js.native
    
    def getServerSideProps[P /* <: js.Object */](callback: GetServerSidePropsCallback[S, P]): GetServerSideProps[
        P, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_querystring.ParsedUrlQuery */ Any, 
        PreviewData
      ] = js.native
    
    def getStaticProps[P_1 /* <: js.Object */](callback: GetStaticPropsCallback[S, P_1]): GetStaticProps[
        P_1, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_querystring.ParsedUrlQuery */ Any, 
        PreviewData
      ] = js.native
    
    def useWrappedStore(param0: Any): Props[S] = js.native
    def useWrappedStore(param0: Any, displayName: String): Props[S] = js.native
    
    def withRedux(Component: Any): Call = js.native
    def withRedux(Component: default[js.Object, js.Object, js.Object]): Call = js.native
    def withRedux(
      Component: NextComponentType[typings.next.distSharedLibUtilsMod.NextPageContext, js.Object, js.Object]
    ): Call = js.native
  }
  
  trait PageProps[P] extends StObject {
    
    var pageProps: P
  }
  object PageProps {
    
    inline def apply[P](pageProps: P): PageProps[P] = {
      val __obj = js.Dynamic.literal(pageProps = pageProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageProps[P]]
    }
    
    extension [Self <: PageProps[?], P](x: Self & PageProps[P]) {
      
      inline def setPageProps(value: P): Self = StObject.set(x, "pageProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props[S /* <: Store[Any, AnyAction] */] extends StObject {
    
    var props: Any
    
    var store: S
  }
  object Props {
    
    inline def apply[S /* <: Store[Any, AnyAction] */](props: Any, store: S): Props[S] = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[S]]
    }
    
    extension [Self <: Props[?], S /* <: Store[Any, AnyAction] */](x: Self & Props[S]) {
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setStore(value: S): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
