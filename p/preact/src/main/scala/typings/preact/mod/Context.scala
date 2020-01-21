package typings.preact.mod

import typings.preact.AnonChildrenValue
import typings.preact.AnonChildrenValueComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context[T] extends js.Object {
  @JSName("Consumer")
  var Consumer_Original: Consumer[T] = js.native
  @JSName("Provider")
  var Provider_Original: Provider[T] = js.native
  def Consumer(props: RenderableProps[AnonChildrenValue[T], _]): VNode[_] | Null = js.native
  def Consumer(props: RenderableProps[AnonChildrenValue[T], _], context: js.Any): VNode[_] | Null = js.native
  def Provider(props: RenderableProps[AnonChildrenValueComponentChildren[T], _]): VNode[_] | Null = js.native
  def Provider(props: RenderableProps[AnonChildrenValueComponentChildren[T], _], context: js.Any): VNode[_] | Null = js.native
}

