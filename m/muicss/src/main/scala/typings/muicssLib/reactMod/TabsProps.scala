package typings
package muicssLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] {
  var defaultSelectedIndex: js.UndefOr[scala.Double] = js.undefined
  var justified: js.UndefOr[scala.Boolean] = js.undefined
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    defaultSelectedIndex: scala.Int | scala.Double = null,
    justified: js.UndefOr[scala.Boolean] = js.undefined,
    selectedIndex: scala.Int | scala.Double = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (defaultSelectedIndex != null) __obj.updateDynamic("defaultSelectedIndex")(defaultSelectedIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(justified)) __obj.updateDynamic("justified")(justified)
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}

