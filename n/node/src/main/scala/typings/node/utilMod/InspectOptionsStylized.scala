package typings.node.utilMod

import typings.node.nodeStrings.get
import typings.node.nodeStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InspectOptionsStylized
  extends typings.node.NodeJS.InspectOptions {
  def stylize(text: String, styleType: Style): String
}

object InspectOptionsStylized {
  @scala.inline
  def apply(
    stylize: (String, Style) => String,
    breakLength: Int | Double = null,
    colors: js.UndefOr[Boolean] = js.undefined,
    compact: Boolean | Double = null,
    customInspect: js.UndefOr[Boolean] = js.undefined,
    depth: Int | Double = null,
    getters: get | set | Boolean = null,
    maxArrayLength: Int | Double = null,
    showHidden: js.UndefOr[Boolean] = js.undefined,
    showProxy: js.UndefOr[Boolean] = js.undefined,
    sorted: Boolean | (js.Function2[/* a */ String, /* b */ String, Double]) = null
  ): InspectOptionsStylized = {
    val __obj = js.Dynamic.literal(stylize = js.Any.fromFunction2(stylize))
    if (breakLength != null) __obj.updateDynamic("breakLength")(breakLength.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(customInspect)) __obj.updateDynamic("customInspect")(customInspect.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (getters != null) __obj.updateDynamic("getters")(getters.asInstanceOf[js.Any])
    if (maxArrayLength != null) __obj.updateDynamic("maxArrayLength")(maxArrayLength.asInstanceOf[js.Any])
    if (!js.isUndefined(showHidden)) __obj.updateDynamic("showHidden")(showHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(showProxy)) __obj.updateDynamic("showProxy")(showProxy.asInstanceOf[js.Any])
    if (sorted != null) __obj.updateDynamic("sorted")(sorted.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectOptionsStylized]
  }
}

