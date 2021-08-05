package typings.miniStore

import typings.miniStore.connectMod.ConnectOptions
import typings.miniStore.providerMod.ProviderProps
import typings.miniStore.typesMod.ConnectedComponent
import typings.miniStore.typesMod.Store
import typings.miniStore.typesMod.StoreProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mini-store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mini-store", "Provider")
  @js.native
  class Provider protected ()
    extends typings.miniStore.providerMod.Provider {
    def this(props: ProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ProviderProps, context: js.Any) = this()
  }
  
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
  
  inline def create[S](initialState: S): Store[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialState.asInstanceOf[js.Any]).asInstanceOf[Store[S]]
}
