package typings
package objectDashHashLib.objectDashHashMod.ObjectHashNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var excludeKeys: js.UndefOr[js.Function1[/* key */ java.lang.String, scala.Boolean]] = js.undefined
  var excludeValues: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreUnknown: js.UndefOr[scala.Boolean] = js.undefined
  var replacer: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  var respectFunctionNames: js.UndefOr[scala.Boolean] = js.undefined
  var respectFunctionProperties: js.UndefOr[scala.Boolean] = js.undefined
  var unorderedArrays: js.UndefOr[scala.Boolean] = js.undefined
  var unorderedSets: js.UndefOr[scala.Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    algorithm: java.lang.String = null,
    encoding: java.lang.String = null,
    excludeKeys: /* key */ java.lang.String => scala.Boolean = null,
    excludeValues: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreUnknown: js.UndefOr[scala.Boolean] = js.undefined,
    replacer: /* value */ js.Any => _ = null,
    respectFunctionNames: js.UndefOr[scala.Boolean] = js.undefined,
    respectFunctionProperties: js.UndefOr[scala.Boolean] = js.undefined,
    unorderedArrays: js.UndefOr[scala.Boolean] = js.undefined,
    unorderedSets: js.UndefOr[scala.Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (excludeKeys != null) __obj.updateDynamic("excludeKeys")(js.Any.fromFunction1(excludeKeys))
    if (!js.isUndefined(excludeValues)) __obj.updateDynamic("excludeValues")(excludeValues)
    if (!js.isUndefined(ignoreUnknown)) __obj.updateDynamic("ignoreUnknown")(ignoreUnknown)
    if (replacer != null) __obj.updateDynamic("replacer")(js.Any.fromFunction1(replacer))
    if (!js.isUndefined(respectFunctionNames)) __obj.updateDynamic("respectFunctionNames")(respectFunctionNames)
    if (!js.isUndefined(respectFunctionProperties)) __obj.updateDynamic("respectFunctionProperties")(respectFunctionProperties)
    if (!js.isUndefined(unorderedArrays)) __obj.updateDynamic("unorderedArrays")(unorderedArrays)
    if (!js.isUndefined(unorderedSets)) __obj.updateDynamic("unorderedSets")(unorderedSets)
    __obj.asInstanceOf[IOptions]
  }
}

