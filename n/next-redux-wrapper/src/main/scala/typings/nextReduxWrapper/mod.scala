package typings.nextReduxWrapper

import typings.next.libUtilsMod.NextPageContext
import typings.nextReduxWrapper.anon.FunctionComponentWrapperP
import typings.nextReduxWrapper.anon.GetServerSideProps
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import typings.redux.mod.Action
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("next-redux-wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[S /* <: js.Object */, A /* <: Action[js.Any] */](makeStore: MakeStore[S, A]): js.Function1[/* Component */ js.Any, FunctionComponentWrapperP] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(makeStore.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ js.Any, FunctionComponentWrapperP]]
  @scala.inline
  def default[S /* <: js.Object */, A /* <: Action[js.Any] */](makeStore: MakeStore[S, A], config: Config[js.Any]): js.Function1[/* Component */ js.Any, FunctionComponentWrapperP] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(makeStore.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* Component */ js.Any, FunctionComponentWrapperP]]
  
  @JSImport("next-redux-wrapper", "HYDRATE")
  @js.native
  val HYDRATE: /* "__NEXT_REDUX_WRAPPER_HYDRATE__" */ String = js.native
  
  @JSImport("next-redux-wrapper", "STOREKEY")
  @js.native
  val STOREKEY: /* "__NEXT_REDUX_WRAPPER_STORE__" */ String = js.native
  
  @scala.inline
  def createWrapper[S /* <: js.Object */, A /* <: Action[js.Any] */](makeStore: MakeStore[S, A]): GetServerSideProps[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWrapper")(makeStore.asInstanceOf[js.Any]).asInstanceOf[GetServerSideProps[S, A]]
  @scala.inline
  def createWrapper[S /* <: js.Object */, A /* <: Action[js.Any] */](makeStore: MakeStore[S, A], config: Config[S]): GetServerSideProps[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWrapper")(makeStore.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[GetServerSideProps[S, A]]
  
  trait Config[S /* <: js.Object */] extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var deserializeState: js.UndefOr[js.Function1[/* state */ js.Any, S]] = js.undefined
    
    var serializeState: js.UndefOr[js.Function1[/* state */ S, js.Any]] = js.undefined
    
    var storeKey: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply[S /* <: js.Object */](): Config[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config[S]]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config[?], S /* <: js.Object */] (val x: Self & Config[S]) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDeserializeState(value: /* state */ js.Any => S): Self = StObject.set(x, "deserializeState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeserializeStateUndefined: Self = StObject.set(x, "deserializeState", js.undefined)
      
      @scala.inline
      def setSerializeState(value: /* state */ S => js.Any): Self = StObject.set(x, "serializeState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializeStateUndefined: Self = StObject.set(x, "serializeState", js.undefined)
      
      @scala.inline
      def setStoreKey(value: String): Self = StObject.set(x, "storeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreKeyUndefined: Self = StObject.set(x, "storeKey", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.libUtilsMod.NextPageContext
    - / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppContext * / js.Any
    - typings.nextReduxWrapper.mod.GetStaticPropsContext
    - typings.nextReduxWrapper.mod.GetServerSidePropsContext
  */
  type Context = _Context | NextPageContext | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppContext */ js.Any)
  
  trait GetServerSidePropsContext
    extends StObject
       with _Context {
    
    var params: js.UndefOr[ParsedUrlQuery] = js.undefined
    
    var preview: js.UndefOr[Boolean] = js.undefined
    
    var previewData: js.UndefOr[js.Any] = js.undefined
    
    var query: ParsedUrlQuery
    
    var req: IncomingMessage
    
    var res: ServerResponse
  }
  object GetServerSidePropsContext {
    
    @scala.inline
    def apply(query: ParsedUrlQuery, req: IncomingMessage, res: ServerResponse): GetServerSidePropsContext = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServerSidePropsContext]
    }
    
    @scala.inline
    implicit class GetServerSidePropsContextMutableBuilder[Self <: GetServerSidePropsContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: ParsedUrlQuery): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewData(value: js.Any): Self = StObject.set(x, "previewData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewDataUndefined: Self = StObject.set(x, "previewData", js.undefined)
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      @scala.inline
      def setQuery(value: ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRes(value: ServerResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetStaticPropsContext
    extends StObject
       with _Context {
    
    var params: js.UndefOr[ParsedUrlQuery] = js.undefined
    
    var preview: js.UndefOr[Boolean] = js.undefined
    
    var previewData: js.UndefOr[js.Any] = js.undefined
  }
  object GetStaticPropsContext {
    
    @scala.inline
    def apply(): GetStaticPropsContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetStaticPropsContext]
    }
    
    @scala.inline
    implicit class GetStaticPropsContextMutableBuilder[Self <: GetStaticPropsContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: ParsedUrlQuery): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewData(value: js.Any): Self = StObject.set(x, "previewData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewDataUndefined: Self = StObject.set(x, "previewData", js.undefined)
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    }
  }
  
  trait InitStoreOptions[S, A /* <: Action[js.Any] */] extends StObject {
    
    var config: Config[S]
    
    var context: Context
    
    var makeStore: MakeStore[S, A]
  }
  object InitStoreOptions {
    
    @scala.inline
    def apply[S, A /* <: Action[js.Any] */](config: Config[S], context: Context, makeStore: /* context */ Context => Store[S, A]): InitStoreOptions[S, A] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], makeStore = js.Any.fromFunction1(makeStore))
      __obj.asInstanceOf[InitStoreOptions[S, A]]
    }
    
    @scala.inline
    implicit class InitStoreOptionsMutableBuilder[Self <: InitStoreOptions[?, ?], S, A /* <: Action[js.Any] */] (val x: Self & (InitStoreOptions[S, A])) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Config[S]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMakeStore(value: /* context */ Context => Store[S, A]): Self = StObject.set(x, "makeStore", js.Any.fromFunction1(value))
    }
  }
  
  type MakeStore[S, A /* <: Action[js.Any] */] = js.Function1[/* context */ Context, Store[S, A]]
  
  trait WrapperProps extends StObject {
    
    var initialProps: js.Any
    
    var initialState: js.Any
    
    var pageProps: js.UndefOr[js.Any] = js.undefined
  }
  object WrapperProps {
    
    @scala.inline
    def apply(initialProps: js.Any, initialState: js.Any): WrapperProps = {
      val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapperProps]
    }
    
    @scala.inline
    implicit class WrapperPropsMutableBuilder[Self <: WrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialProps(value: js.Any): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialState(value: js.Any): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageProps(value: js.Any): Self = StObject.set(x, "pageProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagePropsUndefined: Self = StObject.set(x, "pageProps", js.undefined)
    }
  }
  
  trait _Context extends StObject
  object _Context {
    
    @scala.inline
    def GetServerSidePropsContext(query: ParsedUrlQuery, req: IncomingMessage, res: ServerResponse): typings.nextReduxWrapper.mod.GetServerSidePropsContext = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nextReduxWrapper.mod.GetServerSidePropsContext]
    }
    
    @scala.inline
    def GetStaticPropsContext(): typings.nextReduxWrapper.mod.GetStaticPropsContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.nextReduxWrapper.mod.GetStaticPropsContext]
    }
  }
  
  object nextDistNextServerLibUtilsAugmentingMod {
    
    trait NextPageContext[S, A /* <: Action[js.Any] */] extends StObject {
      
      /**
        * Provided by next-redux-wrapper: The redux store
        */
      var store: Store[S, A]
    }
    object NextPageContext {
      
      @scala.inline
      def apply[S, A /* <: Action[js.Any] */](store: Store[S, A]): typings.nextReduxWrapper.mod.nextDistNextServerLibUtilsAugmentingMod.NextPageContext[S, A] = {
        val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.nextReduxWrapper.mod.nextDistNextServerLibUtilsAugmentingMod.NextPageContext[S, A]]
      }
      
      @scala.inline
      implicit class NextPageContextMutableBuilder[Self <: typings.nextReduxWrapper.mod.nextDistNextServerLibUtilsAugmentingMod.NextPageContext[?, ?], S, A /* <: Action[js.Any] */] (val x: Self & (typings.nextReduxWrapper.mod.nextDistNextServerLibUtilsAugmentingMod.NextPageContext[S, A])) extends AnyVal {
        
        @scala.inline
        def setStore(value: Store[S, A]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      }
    }
  }
}
