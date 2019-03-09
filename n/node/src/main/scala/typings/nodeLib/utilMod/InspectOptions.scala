package typings
package nodeLib.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InspectOptions
  extends nodeLib.NodeJSNs.InspectOptions

object InspectOptions {
  @scala.inline
  def apply(
    breakLength: scala.Int | scala.Double = null,
    colors: js.UndefOr[scala.Boolean] = js.undefined,
    compact: scala.Boolean | scala.Double = null,
    customInspect: js.UndefOr[scala.Boolean] = js.undefined,
    depth: scala.Int | scala.Double = null,
    getters: nodeLib.nodeLibStrings.get | nodeLib.nodeLibStrings.set | scala.Boolean = null,
    maxArrayLength: scala.Int | scala.Double = null,
    showHidden: js.UndefOr[scala.Boolean] = js.undefined,
    showProxy: js.UndefOr[scala.Boolean] = js.undefined,
    sorted: scala.Boolean | (js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Double]) = null
  ): InspectOptions = {
    val __obj = js.Dynamic.literal()
    if (breakLength != null) __obj.updateDynamic("breakLength")(breakLength.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors)
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(customInspect)) __obj.updateDynamic("customInspect")(customInspect)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (getters != null) __obj.updateDynamic("getters")(getters.asInstanceOf[js.Any])
    if (maxArrayLength != null) __obj.updateDynamic("maxArrayLength")(maxArrayLength.asInstanceOf[js.Any])
    if (!js.isUndefined(showHidden)) __obj.updateDynamic("showHidden")(showHidden)
    if (!js.isUndefined(showProxy)) __obj.updateDynamic("showProxy")(showProxy)
    if (sorted != null) __obj.updateDynamic("sorted")(sorted.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectOptions]
  }
}

