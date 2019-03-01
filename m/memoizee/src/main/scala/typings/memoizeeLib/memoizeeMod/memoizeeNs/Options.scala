package typings
package memoizeeLib.memoizeeMod.memoizeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var dispose: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  var length: js.UndefOr[scala.Double | memoizeeLib.memoizeeLibNumbers.`false`] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var normalizer: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  var preFetch: js.UndefOr[scala.Double | memoizeeLib.memoizeeLibNumbers.`true`] = js.undefined
  var primitive: js.UndefOr[scala.Boolean] = js.undefined
  var promise: js.UndefOr[scala.Boolean] = js.undefined
  var resolvers: js.UndefOr[js.Array[js.Function1[/* arg */ _, _]]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    dispose: js.Function1[/* value */ js.Any, scala.Unit] = null,
    length: scala.Double | memoizeeLib.memoizeeLibNumbers.`false` = null,
    max: scala.Int | scala.Double = null,
    maxAge: scala.Int | scala.Double = null,
    normalizer: js.Function1[/* value */ js.Any, scala.Unit] = null,
    preFetch: scala.Double | memoizeeLib.memoizeeLibNumbers.`true` = null,
    primitive: js.UndefOr[scala.Boolean] = js.undefined,
    promise: js.UndefOr[scala.Boolean] = js.undefined,
    resolvers: js.Array[js.Function1[/* arg */ _, _]] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (dispose != null) __obj.updateDynamic("dispose")(dispose)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (normalizer != null) __obj.updateDynamic("normalizer")(normalizer)
    if (preFetch != null) __obj.updateDynamic("preFetch")(preFetch.asInstanceOf[js.Any])
    if (!js.isUndefined(primitive)) __obj.updateDynamic("primitive")(primitive)
    if (!js.isUndefined(promise)) __obj.updateDynamic("promise")(promise)
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers)
    __obj.asInstanceOf[Options]
  }
}

