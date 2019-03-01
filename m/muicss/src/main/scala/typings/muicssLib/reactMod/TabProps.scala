package typings
package muicssLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends js.Object {
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onActive: js.UndefOr[js.Function1[/* tab */ muicssLib.libReactTabMod.default, scala.Unit]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    onActive: js.Function1[/* tab */ muicssLib.libReactTabMod.default, scala.Unit] = null,
    value: js.Any = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onActive != null) __obj.updateDynamic("onActive")(onActive)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TabProps]
  }
}

