package typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod

import typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod.nextReduxWrapperNs.NextReduxWrappedComponent
import typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod.nextReduxWrapperNs.NextStoreCreator
import typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod.nextReduxWrapperNs.Options
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-redux-wrapper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps](makeStore: NextStoreCreator[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps]): js.Function1[
    /* ComponentType */ ComponentType[TOwnProps with TMergedProps], 
    NextReduxWrappedComponent[TOwnProps]
  ] = js.native
  def default[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps](
    makeStore: NextStoreCreator[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps],
    config: Options
  ): js.Function1[
    /* ComponentType */ ComponentType[TOwnProps with TMergedProps], 
    NextReduxWrappedComponent[TOwnProps]
  ] = js.native
}

