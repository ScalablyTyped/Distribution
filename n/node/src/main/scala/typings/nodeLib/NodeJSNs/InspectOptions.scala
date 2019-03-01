package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InspectOptions extends js.Object {
  var breakLength: js.UndefOr[scala.Double] = js.undefined
  var colors: js.UndefOr[scala.Boolean] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var customInspect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default 2
    */
  var depth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * If set to `true`, getters are going to be
    * inspected as well. If set to `'get'` only getters without setter are going
    * to be inspected. If set to `'set'` only getters having a corresponding
    * setter are going to be inspected. This might cause side effects depending on
    * the getter function.
    * @default `false`
    */
  var getters: js.UndefOr[nodeLib.nodeLibStrings.get | nodeLib.nodeLibStrings.set | scala.Boolean] = js.undefined
  var maxArrayLength: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var showHidden: js.UndefOr[scala.Boolean] = js.undefined
  var showProxy: js.UndefOr[scala.Boolean] = js.undefined
  var sorted: js.UndefOr[
    scala.Boolean | (js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Double])
  ] = js.undefined
}

object InspectOptions {
  @scala.inline
  def apply(
    breakLength: scala.Int | scala.Double = null,
    colors: js.UndefOr[scala.Boolean] = js.undefined,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
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
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
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

