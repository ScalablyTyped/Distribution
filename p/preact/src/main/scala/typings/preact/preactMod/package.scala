package typings.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object preactMod {
  import typings.preact.Anon_ChildrenRef
  import typings.preact.Anon_ChildrenValue
  import typings.preact.Anon_ChildrenValueComponentChildren

  type ComponentChild = js.UndefOr[VNode[js.Any] | js.Object | String | Double | Boolean | Null]
  type ComponentChildren = js.Array[ComponentChild] | ComponentChild
  type ComponentConstructor[P, S] = ComponentClass[P, S]
  type ComponentFactory[P] = ComponentType[P]
  type ComponentType[P] = (ComponentClass[P, js.Object]) | FunctionComponent[P]
  //
  // Context
  // -----------------------------------
  type Consumer[T] = FunctionComponent[Anon_ChildrenValue[T]]
  type FunctionalComponent[P] = FunctionComponent[P]
  //
  // Preact Component interface
  // -----------------------------------
  type Key = String | Double | js.Any
  type PreactConsumer[T] = Consumer[T]
  type PreactContext[T] = Context[T]
  type PreactProvider[T] = Provider[T]
  type Provider[T] = FunctionComponent[Anon_ChildrenValueComponentChildren[T]]
  type Ref[T] = RefObject[T] | RefCallback[T]
  type RefCallback[T] = js.Function1[/* instance */ T | Null, Unit]
  type RenderableProps[P, RefType] = P with Attributes with Anon_ChildrenRef[RefType]
}
