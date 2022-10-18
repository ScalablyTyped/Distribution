package typings.nextReduxWrapper

import typings.next.distPagesAppMod.AppContext
import typings.next.distSharedLibUtilsMod.AppInitialProps
import typings.next.typesMod.GetServerSideProps
import typings.next.typesMod.GetServerSidePropsContext
import typings.next.typesMod.GetStaticProps
import typings.next.typesMod.GetStaticPropsContext
import typings.next.typesMod.PreviewData
import typings.nextReduxWrapper.anon.Call
import typings.nextReduxWrapper.anon.PageProps
import typings.nextReduxWrapper.mod.nextAugmentingMod.NextPageContext
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("next-redux-wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S /* <: Store[Any, AnyAction] */](makeStore: MakeStore[S]): js.Function1[/* Component */ Any, Call] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(makeStore.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ Any, Call]]
  inline def default[S /* <: Store[Any, AnyAction] */](makeStore: MakeStore[S], config: Config[S]): js.Function1[/* Component */ Any, Call] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(makeStore.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* Component */ Any, Call]]
  
  @JSImport("next-redux-wrapper", "HYDRATE")
  @js.native
  val HYDRATE: /* "__NEXT_REDUX_WRAPPER_HYDRATE__" */ String = js.native
  
  inline def createWrapper[S /* <: Store[Any, AnyAction] */](makeStore: MakeStore[S]): typings.nextReduxWrapper.anon.GetInitialAppProps[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWrapper")(makeStore.asInstanceOf[js.Any]).asInstanceOf[typings.nextReduxWrapper.anon.GetInitialAppProps[S]]
  inline def createWrapper[S /* <: Store[Any, AnyAction] */](makeStore: MakeStore[S], config: Config[S]): typings.nextReduxWrapper.anon.GetInitialAppProps[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWrapper")(makeStore.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.nextReduxWrapper.anon.GetInitialAppProps[S]]
  
  type AppCallback[S /* <: Store[Any, AnyAction] */, P] = js.Function1[/* store */ S, GetInitialAppProps[P]]
  
  type Callback[S /* <: Store[Any, AnyAction] */, P] = (GetStaticPropsCallback[S, P]) | (GetServerSidePropsCallback[S, P]) | (PageCallback[S, P]) | (AppCallback[S, P])
  
  trait Config[S /* <: Store[Any, AnyAction] */] extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var deserializeState: js.UndefOr[
        js.Function1[
          /* state */ Any, 
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: S['getState'] */ js.Any
          ]
        ]
      ] = js.undefined
    
    var serializeState: js.UndefOr[
        js.Function1[
          /* state */ ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: S['getState'] */ js.Any
          ], 
          Any
        ]
      ] = js.undefined
  }
  object Config {
    
    inline def apply[S /* <: Store[Any, AnyAction] */](): Config[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config[S]]
    }
    
    extension [Self <: Config[?], S /* <: Store[Any, AnyAction] */](x: Self & Config[S]) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDeserializeState(
        value: /* state */ Any => ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: S['getState'] */ js.Any
            ]
      ): Self = StObject.set(x, "deserializeState", js.Any.fromFunction1(value))
      
      inline def setDeserializeStateUndefined: Self = StObject.set(x, "deserializeState", js.undefined)
      
      inline def setSerializeState(
        value: /* state */ ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: S['getState'] */ js.Any
            ] => Any
      ): Self = StObject.set(x, "serializeState", js.Any.fromFunction1(value))
      
      inline def setSerializeStateUndefined: Self = StObject.set(x, "serializeState", js.undefined)
    }
  }
  
  type Context = NextPageContext[Any] | AppContext | (GetStaticPropsContext[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any, 
    PreviewData
  ]) | (GetServerSidePropsContext[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any, 
    PreviewData
  ])
  
  type GetInitialAppProps[P] = js.Function1[/* hasComponentCtx */ AppContext, js.Promise[AppInitialProps[Any] & PageProps[P]]]
  
  type GetInitialPageProps[P] = /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/shared/lib/utils.NextComponentType<next-redux-wrapper.next-redux-wrapper.next.NextPageContext<any>, any, P>['getInitialProps'] */ js.Any
  
  type GetServerSidePropsCallback[S /* <: Store[Any, AnyAction] */, P] = js.Function1[
    /* store */ S, 
    GetServerSideProps[
      P, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any, 
      PreviewData
    ]
  ]
  
  type GetStaticPropsCallback[S /* <: Store[Any, AnyAction] */, P] = js.Function1[
    /* store */ S, 
    GetStaticProps[
      P, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any, 
      PreviewData
    ]
  ]
  
  trait InitStoreOptions[S /* <: Store[Any, AnyAction] */] extends StObject {
    
    var context: js.UndefOr[Context] = js.undefined
    
    var makeStore: MakeStore[S]
  }
  object InitStoreOptions {
    
    inline def apply[S /* <: Store[Any, AnyAction] */](makeStore: /* context */ Context => S): InitStoreOptions[S] = {
      val __obj = js.Dynamic.literal(makeStore = js.Any.fromFunction1(makeStore))
      __obj.asInstanceOf[InitStoreOptions[S]]
    }
    
    extension [Self <: InitStoreOptions[?], S /* <: Store[Any, AnyAction] */](x: Self & InitStoreOptions[S]) {
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setMakeStore(value: /* context */ Context => S): Self = StObject.set(x, "makeStore", js.Any.fromFunction1(value))
    }
  }
  
  type MakeStore[S /* <: Store[Any, AnyAction] */] = js.Function1[/* context */ Context, S]
  
  type PageCallback[S /* <: Store[Any, AnyAction] */, P] = js.Function1[/* store */ S, GetInitialPageProps[P]]
  
  trait WrapperProps extends StObject {
    
    var initialProps: Any
    
    var initialState: Any
  }
  object WrapperProps {
    
    inline def apply(initialProps: Any, initialState: Any): WrapperProps = {
      val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapperProps]
    }
    
    extension [Self <: WrapperProps](x: Self) {
      
      inline def setInitialProps(value: Any): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
      
      inline def setInitialState(value: Any): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object nextAugmentingMod {
    
    trait NextPageContext[S /* <: Store[Any, AnyAction] */] extends StObject {
      
      /**
        * Provided by next-redux-wrapper: The redux store
        */
      var store: S
    }
    object NextPageContext {
      
      inline def apply[S /* <: Store[Any, AnyAction] */](store: S): NextPageContext[S] = {
        val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
        __obj.asInstanceOf[NextPageContext[S]]
      }
      
      extension [Self <: NextPageContext[?], S /* <: Store[Any, AnyAction] */](x: Self & NextPageContext[S]) {
        
        inline def setStore(value: S): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      }
    }
  }
}
