package typings.miniStore

import typings.miniStore.connectMod.ConnectOptions
import typings.miniStore.typesMod.ConnectedComponent
import typings.miniStore.typesMod.Store
import typings.miniStore.typesMod.StoreProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mini-store", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Provider ()
    extends typings.miniStore.providerMod.Provider
  
  def connect[TStateProps, TOwnProps, State](): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
  def connect[TStateProps, TOwnProps, State](mapStateToProps: js.UndefOr[scala.Nothing], options: ConnectOptions): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
  def connect[TStateProps, TOwnProps, State](mapStateToProps: js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps]): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
  def connect[TStateProps, TOwnProps, State](
    mapStateToProps: js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps],
    options: ConnectOptions
  ): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
  def create[S](initialState: S): Store[S] = js.native
}

