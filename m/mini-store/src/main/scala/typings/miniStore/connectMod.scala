package typings.miniStore

import typings.miniStore.typesMod.ConnectedComponent
import typings.miniStore.typesMod.StoreProp
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectMod {
  
  @JSImport("mini-store/cjs/connect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect[TStateProps, TOwnProps, State](): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[js.Any, TStateProps & StoreProp[State], TOwnProps]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[js.Any, TStateProps & StoreProp[State], TOwnProps]
  ]]
  inline def connect[TStateProps, TOwnProps, State](mapStateToProps: js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps]): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[js.Any, TStateProps & StoreProp[State], TOwnProps]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[js.Any, TStateProps & StoreProp[State], TOwnProps]
  ]]
  inline def connect[TStateProps, TOwnProps, State](
    mapStateToProps: js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps],
    options: ConnectOptions
  ): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[js.Any, TStateProps & StoreProp[State], TOwnProps]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[js.Any, TStateProps & StoreProp[State], TOwnProps]
  ]]
  inline def connect[TStateProps, TOwnProps, State](mapStateToProps: Unit, options: ConnectOptions): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[js.Any, TStateProps & StoreProp[State], TOwnProps]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[js.Any, TStateProps & StoreProp[State], TOwnProps]
  ]]
  
  trait ConnectOptions extends StObject {
    
    /**
      * If true, use React's forwardRef to expose a ref of the wrapped component
      *
      * @default false
      */
    var forwardRef: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectOptions {
    
    inline def apply(): ConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOptions]
    }
    
    extension [Self <: ConnectOptions](x: Self) {
      
      inline def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      inline def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
    }
  }
  
  trait ConnectProps extends StObject {
    
    var miniStoreForwardedRef: Ref[js.Any]
  }
  object ConnectProps {
    
    inline def apply(): ConnectProps = {
      val __obj = js.Dynamic.literal(miniStoreForwardedRef = null)
      __obj.asInstanceOf[ConnectProps]
    }
    
    extension [Self <: ConnectProps](x: Self) {
      
      inline def setMiniStoreForwardedRef(value: Ref[js.Any]): Self = StObject.set(x, "miniStoreForwardedRef", value.asInstanceOf[js.Any])
      
      inline def setMiniStoreForwardedRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "miniStoreForwardedRef", js.Any.fromFunction1(value))
      
      inline def setMiniStoreForwardedRefNull: Self = StObject.set(x, "miniStoreForwardedRef", null)
    }
  }
  
  trait ConnectedState[TStateProps, Store, TOwnProps] extends StObject {
    
    var props: TOwnProps
    
    var store: Store
    
    var subscribed: TStateProps
  }
  object ConnectedState {
    
    inline def apply[TStateProps, Store, TOwnProps](props: TOwnProps, store: Store, subscribed: TStateProps): ConnectedState[TStateProps, Store, TOwnProps] = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectedState[TStateProps, Store, TOwnProps]]
    }
    
    extension [Self <: ConnectedState[?, ?, ?], TStateProps, Store, TOwnProps](x: Self & (ConnectedState[TStateProps, Store, TOwnProps])) {
      
      inline def setProps(value: TOwnProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setSubscribed(value: TStateProps): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
    }
  }
}
