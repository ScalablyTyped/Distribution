package typings.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ComponentChild = js.UndefOr[
    typings.preact.mod.VNode[js.Any] | js.Object | java.lang.String | scala.Double | scala.Boolean | scala.Null
  ]
  
  type ComponentChildren = js.Array[typings.preact.mod.ComponentChild] | typings.preact.mod.ComponentChild
  
  type ComponentConstructor[P, S] = typings.preact.mod.ComponentClass[P, S]
  
  type ComponentFactory[P] = typings.preact.mod.ComponentType[P]
  
  type ComponentProps[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any */] = /* import warning: importer.ImportType#apply Failed type conversion: preact.preact/src/jsx.JSXInternal.IntrinsicElements[C] */ js.Any
  
  type ComponentType[P] = (typings.preact.mod.ComponentClass[P, js.Object]) | typings.preact.mod.FunctionComponent[P]
  
  //
  // Context
  // -----------------------------------
  type Consumer[T] = typings.preact.mod.FunctionComponent[typings.preact.anon.`0`[T]]
  
  type FunctionalComponent[P] = typings.preact.mod.FunctionComponent[P]
  
  //
  // Preact Component interface
  // -----------------------------------
  type Key = java.lang.String | scala.Double | js.Any
  
  type PreactConsumer[T] = typings.preact.mod.Consumer[T]
  
  type PreactContext[T] = typings.preact.mod.Context[T]
  
  type PreactProvider[T] = typings.preact.mod.Provider[T]
  
  type Provider[T] = typings.preact.mod.FunctionComponent[typings.preact.anon.Value[T]]
  
  type Ref[T] = typings.preact.mod.RefObject[T] | typings.preact.mod.RefCallback[T]
  
  type RefCallback[T] = js.Function1[/* instance */ T | scala.Null, scala.Unit]
  
  type RenderableProps[P, RefType] = P with typings.preact.mod.Attributes with typings.preact.anon.Ref[RefType]
}
