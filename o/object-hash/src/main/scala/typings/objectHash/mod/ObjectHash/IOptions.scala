package typings.objectHash.mod.ObjectHash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var excludeKeys: js.UndefOr[js.Function1[/* key */ String, Boolean]] = js.undefined
  var excludeValues: js.UndefOr[Boolean] = js.undefined
  var ignoreUnknown: js.UndefOr[Boolean] = js.undefined
  var replacer: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  var respectFunctionNames: js.UndefOr[Boolean] = js.undefined
  var respectFunctionProperties: js.UndefOr[Boolean] = js.undefined
  var respectType: js.UndefOr[Boolean] = js.undefined
  var unorderedArrays: js.UndefOr[Boolean] = js.undefined
  var unorderedObjects: js.UndefOr[Boolean] = js.undefined
  var unorderedSets: js.UndefOr[Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    algorithm: String = null,
    encoding: String = null,
    excludeKeys: /* key */ String => Boolean = null,
    excludeValues: js.UndefOr[Boolean] = js.undefined,
    ignoreUnknown: js.UndefOr[Boolean] = js.undefined,
    replacer: /* value */ js.Any => _ = null,
    respectFunctionNames: js.UndefOr[Boolean] = js.undefined,
    respectFunctionProperties: js.UndefOr[Boolean] = js.undefined,
    respectType: js.UndefOr[Boolean] = js.undefined,
    unorderedArrays: js.UndefOr[Boolean] = js.undefined,
    unorderedObjects: js.UndefOr[Boolean] = js.undefined,
    unorderedSets: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (excludeKeys != null) __obj.updateDynamic("excludeKeys")(js.Any.fromFunction1(excludeKeys))
    if (!js.isUndefined(excludeValues)) __obj.updateDynamic("excludeValues")(excludeValues.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnknown)) __obj.updateDynamic("ignoreUnknown")(ignoreUnknown.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(js.Any.fromFunction1(replacer))
    if (!js.isUndefined(respectFunctionNames)) __obj.updateDynamic("respectFunctionNames")(respectFunctionNames.asInstanceOf[js.Any])
    if (!js.isUndefined(respectFunctionProperties)) __obj.updateDynamic("respectFunctionProperties")(respectFunctionProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(respectType)) __obj.updateDynamic("respectType")(respectType.asInstanceOf[js.Any])
    if (!js.isUndefined(unorderedArrays)) __obj.updateDynamic("unorderedArrays")(unorderedArrays.asInstanceOf[js.Any])
    if (!js.isUndefined(unorderedObjects)) __obj.updateDynamic("unorderedObjects")(unorderedObjects.asInstanceOf[js.Any])
    if (!js.isUndefined(unorderedSets)) __obj.updateDynamic("unorderedSets")(unorderedSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

