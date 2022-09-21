package typings.nivoRecompose

import typings.nivoRecompose.typesMod.InferableComponentEnhancerWithProps
import typings.nivoRecompose.typesMod.Mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withPropsMod {
  
  @JSImport("@nivo/recompose/dist/types/withProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withProps[TInner, TOuter](createProps: TInner): InferableComponentEnhancerWithProps[TInner & TOuter, TOuter] = ^.asInstanceOf[js.Dynamic].applyDynamic("withProps")(createProps.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOuter, TOuter]]
  inline def withProps[TInner, TOuter](createProps: Mapper[TOuter, TInner]): InferableComponentEnhancerWithProps[TInner & TOuter, TOuter] = ^.asInstanceOf[js.Dynamic].applyDynamic("withProps")(createProps.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOuter, TOuter]]
}
