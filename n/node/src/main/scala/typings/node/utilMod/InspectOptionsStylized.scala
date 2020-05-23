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
    breakLength: js.UndefOr[Double] = js.undefined,
    colors: js.UndefOr[Boolean] = js.undefined,
    compact: Boolean | Double = null,
    customInspect: js.UndefOr[Boolean] = js.undefined,
    depth: js.UndefOr[Null | Double] = js.undefined,
    getters: get | set | Boolean = null,
    maxArrayLength: js.UndefOr[Null | Double] = js.undefined,
    maxStringLength: js.UndefOr[Null | Double] = js.undefined,
    showHidden: js.UndefOr[Boolean] = js.undefined,
    showProxy: js.UndefOr[Boolean] = js.undefined,
    sorted: Boolean | (js.Function2[/* a */ String, /* b */ String, Double]) = null
  ): InspectOptionsStylized = {
    val __obj = js.Dynamic.literal(stylize = js.Any.fromFunction2(stylize))
    if (!js.isUndefined(breakLength)) __obj.updateDynamic("breakLength")(breakLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.get.asInstanceOf[js.Any])
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(customInspect)) __obj.updateDynamic("customInspect")(customInspect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (getters != null) __obj.updateDynamic("getters")(getters.asInstanceOf[js.Any])
    if (!js.isUndefined(maxArrayLength)) __obj.updateDynamic("maxArrayLength")(maxArrayLength.asInstanceOf[js.Any])
    if (!js.isUndefined(maxStringLength)) __obj.updateDynamic("maxStringLength")(maxStringLength.asInstanceOf[js.Any])
    if (!js.isUndefined(showHidden)) __obj.updateDynamic("showHidden")(showHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showProxy)) __obj.updateDynamic("showProxy")(showProxy.get.asInstanceOf[js.Any])
    if (sorted != null) __obj.updateDynamic("sorted")(sorted.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectOptionsStylized]
  }
}

