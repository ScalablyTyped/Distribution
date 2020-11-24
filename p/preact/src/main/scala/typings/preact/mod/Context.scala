package typings.preact.mod

import typings.preact.anon.Value
import typings.preact.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context[T] extends js.Object {
  
  def Consumer(props: RenderableProps[`0`[T], _]): VNode[_] | Null = js.native
  def Consumer(props: RenderableProps[`0`[T], _], context: js.Any): VNode[_] | Null = js.native
  @JSName("Consumer")
  var Consumer_Original: Consumer[T] = js.native
  
  def Provider(props: RenderableProps[Value[T], _]): VNode[_] | Null = js.native
  def Provider(props: RenderableProps[Value[T], _], context: js.Any): VNode[_] | Null = js.native
  @JSName("Provider")
  var Provider_Original: Provider[T] = js.native
  
  var displayName: js.UndefOr[String] = js.native
}
