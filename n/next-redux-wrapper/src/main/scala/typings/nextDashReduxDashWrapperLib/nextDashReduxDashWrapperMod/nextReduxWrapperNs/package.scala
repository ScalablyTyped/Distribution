package typings
package nextDashReduxDashWrapperLib.nextDashReduxDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nextReduxWrapperNs {
  type NextReduxWrappedComponent[P] = reactLib.reactMod.ComponentType[P] with NextPageComponentMethods
  type NextStoreCreator[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps] = js.Function2[
    /* initialState */ TInitialState, 
    /* options */ StoreCreatorOptions[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps], 
    reduxLib.reduxMod.Store[TInitialState, reduxLib.reduxMod.AnyAction]
  ]
}
