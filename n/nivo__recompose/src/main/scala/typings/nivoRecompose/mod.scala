package typings.nivoRecompose

import typings.nivoRecompose.distTypesComposeMod.ComponentEnhancer
import typings.nivoRecompose.distTypesTypesMod.DefaultingInferableComponentEnhancer
import typings.nivoRecompose.distTypesTypesMod.InferableComponentEnhancer
import typings.nivoRecompose.distTypesTypesMod.InferableComponentEnhancerWithProps
import typings.nivoRecompose.distTypesTypesMod.Mapper
import typings.nivoRecompose.distTypesTypesMod.PredicateDiff
import typings.nivoRecompose.distTypesWithStateMod.StateProps
import typings.propTypes.mod.ValidationMap
import typings.react.mod.ComponentType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/recompose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compose[TInner, TOuter](funcs: js.Function*): ComponentEnhancer[TInner, TOuter] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ComponentEnhancer[TInner, TOuter]]
  
  inline def defaultProps[T](props: T): DefaultingInferableComponentEnhancer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultProps")(props.asInstanceOf[js.Any]).asInstanceOf[DefaultingInferableComponentEnhancer[T]]
  
  inline def getDisplayName(component: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(component.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def getDisplayName(component: ComponentType[Any]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(component.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def pure[TProps](component: ComponentType[TProps]): ComponentType[TProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("pure")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[TProps]]
  
  inline def setDisplayName(displayName: String): js.Function1[/* component */ ComponentType[Any], ComponentType[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayName")(displayName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]]
  
  inline def setPropTypes[P](propTypes: ValidationMap[P]): js.Function1[/* component */ ComponentType[P], ComponentType[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPropTypes")(propTypes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[P], ComponentType[P]]]
  
  inline def setStatic(key: String, value: Any): js.Function1[/* component */ ComponentType[Any], ComponentType[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatic")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]]
  
  inline def shallowEqual(objA: Record[String, Any], objB: Record[String, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shouldUpdate[TProps /* <: Record[String, Any] */](test: PredicateDiff[TProps]): InferableComponentEnhancer[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldUpdate")(test.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancer[js.Object]]
  
  inline def withProps[TInner, TOuter](createProps: TInner): InferableComponentEnhancerWithProps[TInner & TOuter, TOuter] = ^.asInstanceOf[js.Dynamic].applyDynamic("withProps")(createProps.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOuter, TOuter]]
  inline def withProps[TInner, TOuter](createProps: Mapper[TOuter, TInner]): InferableComponentEnhancerWithProps[TInner & TOuter, TOuter] = ^.asInstanceOf[js.Dynamic].applyDynamic("withProps")(createProps.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOuter, TOuter]]
  
  inline def withPropsOnChange[TInner, TOuter /* <: Record[String, Any] */](shouldMapOrKeys: js.Array[String], propsMapper: Mapper[TOuter, TInner]): InferableComponentEnhancerWithProps[TInner & TOuter, TOuter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withPropsOnChange")(shouldMapOrKeys.asInstanceOf[js.Any], propsMapper.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOuter, TOuter]]
  inline def withPropsOnChange[TInner, TOuter /* <: Record[String, Any] */](shouldMapOrKeys: PredicateDiff[TOuter], propsMapper: Mapper[TOuter, TInner]): InferableComponentEnhancerWithProps[TInner & TOuter, TOuter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withPropsOnChange")(shouldMapOrKeys.asInstanceOf[js.Any], propsMapper.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOuter, TOuter]]
  
  inline def withState[TOuter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: TState): InferableComponentEnhancerWithProps[StateProps[TState, TStateName, TStateUpdaterName], TOuter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withState")(stateName.asInstanceOf[js.Any], stateUpdaterName.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[StateProps[TState, TStateName, TStateUpdaterName], TOuter]]
  inline def withState[TOuter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: Mapper[TOuter, TState]): InferableComponentEnhancerWithProps[StateProps[TState, TStateName, TStateUpdaterName], TOuter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withState")(stateName.asInstanceOf[js.Any], stateUpdaterName.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[StateProps[TState, TStateName, TStateUpdaterName], TOuter]]
  
  inline def wrapDisplayName(BaseComponent: ComponentType[Any], hocName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapDisplayName")(BaseComponent.asInstanceOf[js.Any], hocName.asInstanceOf[js.Any])).asInstanceOf[String]
}
