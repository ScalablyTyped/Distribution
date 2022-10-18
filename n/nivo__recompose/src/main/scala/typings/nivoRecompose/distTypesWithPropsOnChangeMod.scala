package typings.nivoRecompose

import typings.nivoRecompose.distTypesTypesMod.InferableComponentEnhancerWithProps
import typings.nivoRecompose.distTypesTypesMod.Mapper
import typings.nivoRecompose.distTypesTypesMod.PredicateDiff
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWithPropsOnChangeMod {
  
  @JSImport("@nivo/recompose/dist/types/withPropsOnChange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withPropsOnChange[TInner, TOuter /* <: Record[String, Any] */](shouldMapOrKeys: js.Array[String], propsMapper: Mapper[TOuter, TInner]): InferableComponentEnhancerWithProps[TInner & TOuter, TOuter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withPropsOnChange")(shouldMapOrKeys.asInstanceOf[js.Any], propsMapper.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOuter, TOuter]]
  inline def withPropsOnChange[TInner, TOuter /* <: Record[String, Any] */](shouldMapOrKeys: PredicateDiff[TOuter], propsMapper: Mapper[TOuter, TInner]): InferableComponentEnhancerWithProps[TInner & TOuter, TOuter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withPropsOnChange")(shouldMapOrKeys.asInstanceOf[js.Any], propsMapper.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOuter, TOuter]]
}
