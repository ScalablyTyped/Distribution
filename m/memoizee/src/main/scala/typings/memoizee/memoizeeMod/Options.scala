package typings.memoizee.memoizeeMod

import typings.memoizee.memoizeeNumbers.`false`
import typings.memoizee.memoizeeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var dispose: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  var length: js.UndefOr[Double | `false`] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var normalizer: js.UndefOr[js.Function1[/* args */ js.Array[_], String]] = js.undefined
  var preFetch: js.UndefOr[Double | `true`] = js.undefined
  var primitive: js.UndefOr[Boolean] = js.undefined
  var promise: js.UndefOr[Boolean] = js.undefined
  var resolvers: js.UndefOr[js.Array[js.Function1[/* arg */ _, _]]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    dispose: /* value */ js.Any => Unit = null,
    length: Double | `false` = null,
    max: Int | Double = null,
    maxAge: Int | Double = null,
    normalizer: /* args */ js.Array[_] => String = null,
    preFetch: Double | `true` = null,
    primitive: js.UndefOr[Boolean] = js.undefined,
    promise: js.UndefOr[Boolean] = js.undefined,
    resolvers: js.Array[js.Function1[/* arg */ _, _]] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction1(dispose))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (normalizer != null) __obj.updateDynamic("normalizer")(js.Any.fromFunction1(normalizer))
    if (preFetch != null) __obj.updateDynamic("preFetch")(preFetch.asInstanceOf[js.Any])
    if (!js.isUndefined(primitive)) __obj.updateDynamic("primitive")(primitive.asInstanceOf[js.Any])
    if (!js.isUndefined(promise)) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

