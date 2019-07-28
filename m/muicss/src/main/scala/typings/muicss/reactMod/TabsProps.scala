package typings.muicss.reactMod

import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends HTMLAttributes[HTMLDivElement] {
  var defaultSelectedIndex: js.UndefOr[Double] = js.undefined
  var justified: js.UndefOr[Boolean] = js.undefined
  var selectedIndex: js.UndefOr[Double] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    defaultSelectedIndex: Int | Double = null,
    justified: js.UndefOr[Boolean] = js.undefined,
    selectedIndex: Int | Double = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (defaultSelectedIndex != null) __obj.updateDynamic("defaultSelectedIndex")(defaultSelectedIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(justified)) __obj.updateDynamic("justified")(justified)
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}

