package typings.miniDashCreateDashReactDashContext.miniDashCreateDashReactDashContextMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[T] extends js.Object {
  var Consumer: ComponentClass[ConsumerProps[T], ComponentState]
  var Provider: ComponentClass[ProviderProps[T], ComponentState]
}

object Context {
  @scala.inline
  def apply[T](
    Consumer: ComponentClass[ConsumerProps[T], ComponentState],
    Provider: ComponentClass[ProviderProps[T], ComponentState]
  ): Context[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer, Provider = Provider)
  
    __obj.asInstanceOf[Context[T]]
  }
}

