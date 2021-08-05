package typings.nextReduxWrapper

import typings.next.libUtilsMod.NextPageContext
import typings.next.mod.GetStaticProps
import typings.nextReduxWrapper.mod.GetServerSidePropsContext
import typings.nextReduxWrapper.mod.GetStaticPropsContext
import typings.nextReduxWrapper.mod.WrapperProps
import typings.node.querystringMod.ParsedUrlQuery
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.react.mod.Validator
import typings.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined react.react.FunctionComponent<next-redux-wrapper.next-redux-wrapper.WrapperProps> & {  getInitialProps :(context : next.next.NextPageContext): next-redux-wrapper.next-redux-wrapper.WrapperProps | std.Promise<next-redux-wrapper.next-redux-wrapper.WrapperProps> | undefined} */
  @js.native
  trait FunctionComponentWrapperP extends StObject {
    
    def apply(props: PropsWithChildren[WrapperProps]): ReactElement | Null = js.native
    def apply(props: PropsWithChildren[WrapperProps], context: js.Any): ReactElement | Null = js.native
    
    var contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    
    var defaultProps: js.UndefOr[PartialWrapperProps] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var getInitialProps: js.UndefOr[
        js.Function1[/* context */ NextPageContext, WrapperProps | js.Promise[WrapperProps]]
      ] = js.native
    
    var propTypes: js.UndefOr[WeakValidationMapWrapperP] = js.native
  }
  
  trait GetServerSideProps[S /* <: js.Object */, A /* <: Action[js.Any] */] extends StObject {
    
    def getServerSideProps[P /* <: js.Object */](callback: js.Function1[/* context */ GetServerSidePropsContext & (Store[S, A]), Unit | P]): typings.next.mod.GetServerSideProps[P, ParsedUrlQuery]
    
    def getStaticProps[P_1 /* <: js.Object */](callback: js.Function1[/* context */ GetStaticPropsContext & (Store[S, A]), Unit | P_1]): GetStaticProps[P_1, ParsedUrlQuery]
    
    def withRedux(Component: js.Any): FunctionComponentWrapperP
  }
  object GetServerSideProps {
    
    inline def apply[S /* <: js.Object */, A /* <: Action[js.Any] */](
      getServerSideProps: js.Function1[/* context */ GetServerSidePropsContext & (Store[S, A]), Unit | js.Any] => typings.next.mod.GetServerSideProps[js.Any, ParsedUrlQuery],
      getStaticProps: js.Function1[/* context */ GetStaticPropsContext & (Store[S, A]), Unit | js.Any] => GetStaticProps[js.Any, ParsedUrlQuery],
      withRedux: js.Any => FunctionComponentWrapperP
    ): GetServerSideProps[S, A] = {
      val __obj = js.Dynamic.literal(getServerSideProps = js.Any.fromFunction1(getServerSideProps), getStaticProps = js.Any.fromFunction1(getStaticProps), withRedux = js.Any.fromFunction1(withRedux))
      __obj.asInstanceOf[GetServerSideProps[S, A]]
    }
    
    extension [Self <: GetServerSideProps[?, ?], S /* <: js.Object */, A /* <: Action[js.Any] */](x: Self & (GetServerSideProps[S, A])) {
      
      inline def setGetServerSideProps(
        value: js.Function1[/* context */ GetServerSidePropsContext & (Store[S, A]), Unit | js.Any] => typings.next.mod.GetServerSideProps[js.Any, ParsedUrlQuery]
      ): Self = StObject.set(x, "getServerSideProps", js.Any.fromFunction1(value))
      
      inline def setGetStaticProps(
        value: js.Function1[/* context */ GetStaticPropsContext & (Store[S, A]), Unit | js.Any] => GetStaticProps[js.Any, ParsedUrlQuery]
      ): Self = StObject.set(x, "getStaticProps", js.Any.fromFunction1(value))
      
      inline def setWithRedux(value: js.Any => FunctionComponentWrapperP): Self = StObject.set(x, "withRedux", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<next-redux-wrapper.next-redux-wrapper.WrapperProps> */
  trait PartialWrapperProps extends StObject {
    
    var initialProps: js.UndefOr[js.Any] = js.undefined
    
    var initialState: js.UndefOr[js.Any] = js.undefined
    
    var pageProps: js.UndefOr[js.Any] = js.undefined
  }
  object PartialWrapperProps {
    
    inline def apply(): PartialWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWrapperProps]
    }
    
    extension [Self <: PartialWrapperProps](x: Self) {
      
      inline def setInitialProps(value: js.Any): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
      
      inline def setInitialPropsUndefined: Self = StObject.set(x, "initialProps", js.undefined)
      
      inline def setInitialState(value: js.Any): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setPageProps(value: js.Any): Self = StObject.set(x, "pageProps", value.asInstanceOf[js.Any])
      
      inline def setPagePropsUndefined: Self = StObject.set(x, "pageProps", js.undefined)
    }
  }
  
  trait Store[S /* <: js.Object */, A /* <: Action[js.Any] */] extends StObject {
    
    var store: typings.redux.mod.Store[S, A]
  }
  object Store {
    
    inline def apply[S /* <: js.Object */, A /* <: Action[js.Any] */](store: typings.redux.mod.Store[S, A]): Store[S, A] = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Store[S, A]]
    }
    
    extension [Self <: Store[?, ?], S /* <: js.Object */, A /* <: Action[js.Any] */](x: Self & (Store[S, A])) {
      
      inline def setStore(value: typings.redux.mod.Store[S, A]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.WeakValidationMap<next-redux-wrapper.next-redux-wrapper.WrapperProps> */
  trait WeakValidationMapWrapperP extends StObject {
    
    var initialProps: js.UndefOr[Validator[js.UndefOr[js.Any | Null]]] = js.undefined
    
    var initialState: js.UndefOr[Validator[js.UndefOr[js.Any | Null]]] = js.undefined
    
    var pageProps: js.UndefOr[Validator[js.UndefOr[js.Any | Null]]] = js.undefined
  }
  object WeakValidationMapWrapperP {
    
    inline def apply(): WeakValidationMapWrapperP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WeakValidationMapWrapperP]
    }
    
    extension [Self <: WeakValidationMapWrapperP](x: Self) {
      
      inline def setInitialProps(value: Validator[js.UndefOr[js.Any | Null]]): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
      
      inline def setInitialPropsUndefined: Self = StObject.set(x, "initialProps", js.undefined)
      
      inline def setInitialState(value: Validator[js.UndefOr[js.Any | Null]]): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setPageProps(value: Validator[js.UndefOr[js.Any | Null]]): Self = StObject.set(x, "pageProps", value.asInstanceOf[js.Any])
      
      inline def setPagePropsUndefined: Self = StObject.set(x, "pageProps", js.undefined)
    }
  }
}
