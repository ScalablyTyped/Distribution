package typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nextReduxWrapperNs {
  import typings.react.reactMod.ComponentType
  import typings.redux.reduxMod.AnyAction
  import typings.redux.reduxMod.Store

  type NextReduxWrappedComponent[P] = ComponentType[P] with NextPageComponentMethods
  type NextStoreCreator[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps] = js.Function2[
    /* initialState */ TInitialState, 
    /* options */ StoreCreatorOptions[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps], 
    Store[TInitialState, AnyAction]
  ]
}
