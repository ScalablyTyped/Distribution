package typings
package muicssLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement] {
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var useDefault: js.UndefOr[scala.Boolean] = js.undefined
}

object SelectProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement] = null,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    useDefault: js.UndefOr[scala.Boolean] = js.undefined
  ): SelectProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(useDefault)) __obj.updateDynamic("useDefault")(useDefault)
    __obj.asInstanceOf[SelectProps]
  }
}

