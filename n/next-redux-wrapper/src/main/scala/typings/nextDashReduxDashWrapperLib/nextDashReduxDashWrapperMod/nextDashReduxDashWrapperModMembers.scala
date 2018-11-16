package typings
package nextDashReduxDashWrapperLib.nextDashReduxDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-redux-wrapper", JSImport.Namespace)
@js.native
object nextDashReduxDashWrapperModMembers extends js.Object {
  def default[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps](
    makeStore: nextDashReduxDashWrapperLib.nextDashReduxDashWrapperMod.nextReduxWrapperNs.NextStoreCreator[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps]
  ): js.Function1[
    /* ComponentType */ reactLib.reactMod.ReactNs.ComponentType[TOwnProps with TMergedProps], 
    nextDashReduxDashWrapperLib.nextDashReduxDashWrapperMod.nextReduxWrapperNs.NextReduxWrappedComponent[TOwnProps]
  ] = js.native
  def default[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps](
    makeStore: nextDashReduxDashWrapperLib.nextDashReduxDashWrapperMod.nextReduxWrapperNs.NextStoreCreator[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps],
    config: nextDashReduxDashWrapperLib.nextDashReduxDashWrapperMod.nextReduxWrapperNs.Options
  ): js.Function1[
    /* ComponentType */ reactLib.reactMod.ReactNs.ComponentType[TOwnProps with TMergedProps], 
    nextDashReduxDashWrapperLib.nextDashReduxDashWrapperMod.nextReduxWrapperNs.NextReduxWrappedComponent[TOwnProps]
  ] = js.native
}

