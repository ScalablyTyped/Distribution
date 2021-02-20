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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("next-redux-wrapper", JSImport.Default)
  @js.native
  def default[S /* <: js.Object */, A /* <: Action[_] */](makeStore: MakeStore[S, A]): js.Function1[/* Component */ js.Any, FunctionComponentWrapperP] = js.native
  @JSImport("next-redux-wrapper", JSImport.Default)
  @js.native
  def default[S /* <: js.Object */, A /* <: Action[_] */](makeStore: MakeStore[S, A], config: Config[_]): js.Function1[/* Component */ js.Any, FunctionComponentWrapperP] = js.native
  
  @JSImport("next-redux-wrapper", "HYDRATE")
  @js.native
  val HYDRATE: /* "__NEXT_REDUX_WRAPPER_HYDRATE__" */ String = js.native
  
  @JSImport("next-redux-wrapper", "STOREKEY")
  @js.native
  val STOREKEY: /* "__NEXT_REDUX_WRAPPER_STORE__" */ String = js.native
  
  @JSImport("next-redux-wrapper", "createWrapper")
  @js.native
  def createWrapper[S /* <: js.Object */, A /* <: Action[_] */](makeStore: MakeStore[S, A]): GetServerSideProps[S, A] = js.native
  @JSImport("next-redux-wrapper", "createWrapper")
  @js.native
  def createWrapper[S /* <: js.Object */, A /* <: Action[_] */](makeStore: MakeStore[S, A], config: Config[S]): GetServerSideProps[S, A] = js.native
  
  @js.native
  trait Config[S /* <: js.Object */] extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var deserializeState: js.UndefOr[js.Function1[/* state */ js.Any, S]] = js.native
    
    var serializeState: js.UndefOr[js.Function1[/* state */ S, _]] = js.native
    
    var storeKey: js.UndefOr[String] = js.native
  }
  object Config {
    
    @scala.inline
    def apply[S /* <: js.Object */](): Config[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config[S]]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config[_], S /* <: js.Object */] (val x: Self with Config[S]) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDeserializeState(value: /* state */ js.Any => S): Self = StObject.set(x, "deserializeState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeserializeStateUndefined: Self = StObject.set(x, "deserializeState", js.undefined)
      
      @scala.inline
      def setSerializeState(value: /* state */ S => _): Self = StObject.set(x, "serializeState", js.Any.fromFunction1(value))
      
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
  
  @js.native
  trait GetServerSidePropsContext extends _Context {
    
    var params: js.UndefOr[ParsedUrlQuery] = js.native
    
    var preview: js.UndefOr[Boolean] = js.native
    
    var previewData: js.UndefOr[js.Any] = js.native
    
    var query: ParsedUrlQuery = js.native
    
    var req: IncomingMessage = js.native
    
    var res: ServerResponse = js.native
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
  
  @js.native
  trait GetStaticPropsContext extends _Context {
    
    var params: js.UndefOr[ParsedUrlQuery] = js.native
    
    var preview: js.UndefOr[Boolean] = js.native
    
    var previewData: js.UndefOr[js.Any] = js.native
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
  
  @js.native
  trait InitStoreOptions[S, A /* <: Action[_] */] extends StObject {
    
    var config: Config[S] = js.native
    
    var context: Context = js.native
    
    var makeStore: MakeStore[S, A] = js.native
  }
  object InitStoreOptions {
    
    @scala.inline
    def apply[S, A /* <: Action[_] */](config: Config[S], context: Context, makeStore: /* context */ Context => Store[S, A]): InitStoreOptions[S, A] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], makeStore = js.Any.fromFunction1(makeStore))
      __obj.asInstanceOf[InitStoreOptions[S, A]]
    }
    
    @scala.inline
    implicit class InitStoreOptionsMutableBuilder[Self <: InitStoreOptions[_, _], S, A /* <: Action[_] */] (val x: Self with (InitStoreOptions[S, A])) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Config[S]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMakeStore(value: /* context */ Context => Store[S, A]): Self = StObject.set(x, "makeStore", js.Any.fromFunction1(value))
    }
  }
  
  type MakeStore[S, A /* <: Action[_] */] = js.Function1[/* context */ Context, Store[S, A]]
  
  @js.native
  trait WrapperProps extends StObject {
    
    var initialProps: js.Any = js.native
    
    var initialState: js.Any = js.native
    
    var pageProps: js.UndefOr[js.Any] = js.native
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
    
    @js.native
    trait NextPageContext[S, A /* <: Action[_] */] extends StObject {
      
      /**
        * Provided by next-redux-wrapper: The redux store
        */
      var store: Store[S, A] = js.native
    }
    object NextPageContext {
      
      @scala.inline
      def apply[S, A /* <: Action[_] */](store: Store[S, A]): typings.nextReduxWrapper.mod.nextDistNextServerLibUtilsAugmentingMod.NextPageContext[S, A] = {
        val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.nextReduxWrapper.mod.nextDistNextServerLibUtilsAugmentingMod.NextPageContext[S, A]]
      }
      
      @scala.inline
      implicit class NextPageContextMutableBuilder[Self <: typings.nextReduxWrapper.mod.nextDistNextServerLibUtilsAugmentingMod.NextPageContext[_, _], S, A /* <: Action[_] */] (val x: Self with (typings.nextReduxWrapper.mod.nextDistNextServerLibUtilsAugmentingMod.NextPageContext[S, A])) extends AnyVal {
        
        @scala.inline
        def setStore(value: Store[S, A]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      }
    }
  }
}
