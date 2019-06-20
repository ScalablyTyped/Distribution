package typings
package mobxDashReactDashLiteLib.distObserverComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObserverProps extends js.Object {
  var children: js.UndefOr[js.Function0[reactLib.reactMod.ReactElement]] = js.undefined
  var render: js.UndefOr[js.Function0[reactLib.reactMod.ReactElement]] = js.undefined
}

object IObserverProps {
  @scala.inline
  def apply(
    children: () => reactLib.reactMod.ReactElement = null,
    render: () => reactLib.reactMod.ReactElement = null
  ): IObserverProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction0(children))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    __obj.asInstanceOf[IObserverProps]
  }
}

