package typings.miniStore

import org.scalablytyped.runtime.TopLevel
import typings.hoistNonReactStatics.mod.NonReactStatics
import typings.miniStore.anon.WrappedComponent
import typings.react.mod.ComponentType
import typings.react.mod.NamedExoticComponent
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Omit
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ConnectedComponent[C /* <: ComponentType[js.Any] */, T, P] = (NamedExoticComponent[
    LibraryManagedAttributes[
      C, 
      (Omit[
        GetProps[C], 
        /* keyof mini-store.mini-store/cjs/types.Shared<T, mini-store.mini-store/cjs/types.GetProps<C>> */ String
      ]) & P
    ]
  ]) & (NonReactStatics[C, js.Object]) & WrappedComponent[C]
  
  trait DefaultRootState extends StObject
  
  type GetProps[C] = js.Any
  
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.miniStore.miniStoreStrings.Matching & TopLevel[js.Any]
  
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typings.miniStore.miniStoreStrings.Shared & TopLevel[js.Any]
  
  trait Store[S] extends StObject {
    
    def getState(): S
    
    def setState(state: Partial[S]): Unit
    
    def subscribe(listener: js.Function0[Unit]): js.Function0[Unit]
  }
  object Store {
    
    @scala.inline
    def apply[S](
      getState: () => S,
      setState: Partial[S] => Unit,
      subscribe: js.Function0[Unit] => js.Function0[Unit]
    ): Store[S] = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[Store[S]]
    }
    
    @scala.inline
    implicit class StoreMutableBuilder[Self <: Store[?], S] (val x: Self & Store[S]) extends AnyVal {
      
      @scala.inline
      def setGetState(value: () => S): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetState(value: Partial[S] => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubscribe(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  trait StoreProp[S] extends StObject {
    
    var store: Store[S]
  }
  object StoreProp {
    
    @scala.inline
    def apply[S](store: Store[S]): StoreProp[S] = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreProp[S]]
    }
    
    @scala.inline
    implicit class StorePropMutableBuilder[Self <: StoreProp[?], S] (val x: Self & StoreProp[S]) extends AnyVal {
      
      @scala.inline
      def setStore(value: Store[S]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
