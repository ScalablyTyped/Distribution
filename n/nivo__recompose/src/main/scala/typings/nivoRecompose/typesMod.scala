package typings.nivoRecompose

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.std.Omit
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type DefaultingInferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, Partial[TInjectedProps]]
  
  type InferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ ComponentType[TInjectedProps], 
    ComponentClass[
      (Omit[TInjectedProps, /* keyof TInjectedProps */ String]) & TNeedsProps, 
      ComponentState
    ]
  ]
  
  type Mapper[TInner, TOuter] = js.Function1[/* input */ TInner, TOuter]
  
  type PredicateDiff[T] = js.Function2[/* current */ T, /* next */ T, Boolean]
}
