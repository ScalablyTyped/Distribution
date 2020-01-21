package typings.muicss.reactMod

import typings.muicss.tabMod.default
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends js.Object {
  var label: js.UndefOr[ReactNode] = js.undefined
  var onActive: js.UndefOr[js.Function1[/* tab */ default, Unit]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(label: ReactNode = null, onActive: /* tab */ default => Unit = null, value: js.Any = null): TabProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onActive != null) __obj.updateDynamic("onActive")(js.Any.fromFunction1(onActive))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

