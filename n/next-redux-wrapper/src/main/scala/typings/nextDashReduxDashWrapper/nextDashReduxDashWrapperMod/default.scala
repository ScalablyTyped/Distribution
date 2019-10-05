package typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod

import typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod.nextReduxWrapper.NextReduxWrappedComponent
import typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod.nextReduxWrapper.NextStoreCreator
import typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod.nextReduxWrapper.Options
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-redux-wrapper", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps](makeStore: NextStoreCreator[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps]): js.Function1[
    /* ComponentType */ ComponentType[TOwnProps with TMergedProps], 
    NextReduxWrappedComponent[TOwnProps]
  ] = js.native
  def apply[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps](
    makeStore: NextStoreCreator[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps],
    config: Options
  ): js.Function1[
    /* ComponentType */ ComponentType[TOwnProps with TMergedProps], 
    NextReduxWrappedComponent[TOwnProps]
  ] = js.native
}

