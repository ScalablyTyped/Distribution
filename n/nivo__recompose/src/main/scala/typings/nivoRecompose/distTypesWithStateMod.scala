package typings.nivoRecompose

import typings.nivoRecompose.distTypesTypesMod.InferableComponentEnhancerWithProps
import typings.nivoRecompose.distTypesTypesMod.Mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWithStateMod {
  
  @JSImport("@nivo/recompose/dist/types/withState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withState[TOuter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: TState): InferableComponentEnhancerWithProps[StateProps[TState, TStateName, TStateUpdaterName], TOuter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withState")(stateName.asInstanceOf[js.Any], stateUpdaterName.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[StateProps[TState, TStateName, TStateUpdaterName], TOuter]]
  inline def withState[TOuter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: Mapper[TOuter, TState]): InferableComponentEnhancerWithProps[StateProps[TState, TStateName, TStateUpdaterName], TOuter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withState")(stateName.asInstanceOf[js.Any], stateUpdaterName.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[StateProps[TState, TStateName, TStateUpdaterName], TOuter]]
  
  @js.native
  trait StateProps[TState, TStateName /* <: String */, TStateUpdaterName /* <: String */] extends StObject
}
