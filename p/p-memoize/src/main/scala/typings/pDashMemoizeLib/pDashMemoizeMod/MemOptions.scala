package typings
package pDashMemoizeLib.pDashMemoizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemOptions extends js.Object {
  /**
    * Use a different cache storage.
    * Must implement the following methods:
    * `.has(key)`, `.get(key)`, `.set(key, value)`, `.delete(key)`, and optionally `.clear()`
    * You could for example use a `WeakMap` instead or `quick-lru` for a LRU cache.
    *
    * @default new Map()
    */
  var cache: js.UndefOr[pDashMemoizeLib.pDashMemoizeMod.pMemoizeNs.Cache[java.lang.String, _]] = js.undefined
  /**
    * Determines the cache key for storing the result based on the
    * function arguments. By default, if there's only one argument and
    * it's a primitive, it's used directly as a key, otherwise it's all
    * the function arguments JSON stringified as an array.
    *
    * You could for example change it to only cache on the first argument
    * `x => JSON.stringify(x)`.
    */
  var cacheKey: js.UndefOr[js.Function1[/* repeated */ js.Any, java.lang.String]] = js.undefined
  /** Cache rejected promises. */
  var cachePromiseRejection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Milliseconds until the cache expires.
    * @default Infinity
    */
  var maxAge: js.UndefOr[scala.Double] = js.undefined
}

object MemOptions {
  @scala.inline
  def apply(
    cache: pDashMemoizeLib.pDashMemoizeMod.pMemoizeNs.Cache[java.lang.String, _] = null,
    cacheKey: /* repeated */ js.Any => java.lang.String = null,
    cachePromiseRejection: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: scala.Int | scala.Double = null
  ): MemOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(js.Any.fromFunction1(cacheKey))
    if (!js.isUndefined(cachePromiseRejection)) __obj.updateDynamic("cachePromiseRejection")(cachePromiseRejection)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemOptions]
  }
}

