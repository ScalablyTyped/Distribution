package typings.miniDashCreateDashReactDashContext.miniDashCreateDashReactDashContextMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps[T] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var observedBits: js.UndefOr[js.Any] = js.undefined
  var value: T
}

object ProviderProps {
  @scala.inline
  def apply[T](value: T, children: ReactNode = null, observedBits: js.Any = null): ProviderProps[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (observedBits != null) __obj.updateDynamic("observedBits")(observedBits)
    __obj.asInstanceOf[ProviderProps[T]]
  }
}

