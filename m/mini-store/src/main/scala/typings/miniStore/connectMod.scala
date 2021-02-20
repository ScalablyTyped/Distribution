package typings.miniStore

import typings.miniStore.typesMod.ConnectedComponent
import typings.miniStore.typesMod.StoreProp
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectMod {
  
  @JSImport("mini-store/cjs/connect", "connect")
  @js.native
  def connect[TStateProps, TOwnProps, State](): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
  @JSImport("mini-store/cjs/connect", "connect")
  @js.native
  def connect[TStateProps, TOwnProps, State](mapStateToProps: js.UndefOr[scala.Nothing], options: ConnectOptions): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
  @JSImport("mini-store/cjs/connect", "connect")
  @js.native
  def connect[TStateProps, TOwnProps, State](mapStateToProps: js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps]): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
  @JSImport("mini-store/cjs/connect", "connect")
  @js.native
  def connect[TStateProps, TOwnProps, State](
    mapStateToProps: js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps],
    options: ConnectOptions
  ): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
  
  @js.native
  trait ConnectOptions extends StObject {
    
    /**
      * If true, use React's forwardRef to expose a ref of the wrapped component
      *
      * @default false
      */
    var forwardRef: js.UndefOr[Boolean] = js.native
  }
  object ConnectOptions {
    
    @scala.inline
    def apply(): ConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOptions]
    }
    
    @scala.inline
    implicit class ConnectOptionsMutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
    }
  }
  
  @js.native
  trait ConnectProps extends StObject {
    
    var miniStoreForwardedRef: Ref[_] = js.native
  }
  object ConnectProps {
    
    @scala.inline
    def apply(): ConnectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectProps]
    }
    
    @scala.inline
    implicit class ConnectPropsMutableBuilder[Self <: ConnectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMiniStoreForwardedRef(value: Ref[_]): Self = StObject.set(x, "miniStoreForwardedRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiniStoreForwardedRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "miniStoreForwardedRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMiniStoreForwardedRefNull: Self = StObject.set(x, "miniStoreForwardedRef", null)
    }
  }
  
  @js.native
  trait ConnectedState[TStateProps, Store, TOwnProps] extends StObject {
    
    var props: TOwnProps = js.native
    
    var store: Store = js.native
    
    var subscribed: TStateProps = js.native
  }
  object ConnectedState {
    
    @scala.inline
    def apply[TStateProps, Store, TOwnProps](props: TOwnProps, store: Store, subscribed: TStateProps): ConnectedState[TStateProps, Store, TOwnProps] = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectedState[TStateProps, Store, TOwnProps]]
    }
    
    @scala.inline
    implicit class ConnectedStateMutableBuilder[Self <: ConnectedState[_, _, _], TStateProps, Store, TOwnProps] (val x: Self with (ConnectedState[TStateProps, Store, TOwnProps])) extends AnyVal {
      
      @scala.inline
      def setProps(value: TOwnProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribed(value: TStateProps): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
    }
  }
}
