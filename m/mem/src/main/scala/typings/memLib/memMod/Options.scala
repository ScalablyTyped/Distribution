package typings
package memLib.memMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[ArgumentsType /* <: js.Array[_] */, CacheKeyType, ReturnType] extends js.Object {
  /**
  		Use a different cache storage. You could for example use a `WeakMap` instead or [`quick-lru`](https://github.com/sindresorhus/quick-lru) for a LRU cache.
  		@default new Map()
  		*/
  val cache: js.UndefOr[CacheStorage[CacheKeyType, memLib.Anon_Data[ReturnType]]] = js.undefined
  /**
  		Determines the cache key for storing the result based on the function arguments. By default, if there's only one argument and it's a [primitive](https://developer.mozilla.org/en-US/docs/Glossary/Primitive), it's used directly as a key (if it's a `function`, its reference will be used as key), otherwise it's all the function arguments JSON stringified as an array.
  		You could for example change it to only cache on the first argument `x => JSON.stringify(x)`.
  		*/
  val cacheKey: js.UndefOr[js.Function1[/* arguments */ ArgumentsType, CacheKeyType]] = js.undefined
  /**
  		Cache rejected promises.
  		@default true
  		*/
  val cachePromiseRejection: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Milliseconds until the cache expires.
  		@default Infinity
  		*/
  val maxAge: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[ArgumentsType /* <: js.Array[_] */, CacheKeyType, ReturnType](
    cache: CacheStorage[CacheKeyType, memLib.Anon_Data[ReturnType]] = null,
    cacheKey: /* arguments */ ArgumentsType => CacheKeyType = null,
    cachePromiseRejection: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: scala.Int | scala.Double = null
  ): Options[ArgumentsType, CacheKeyType, ReturnType] = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(js.Any.fromFunction1(cacheKey))
    if (!js.isUndefined(cachePromiseRejection)) __obj.updateDynamic("cachePromiseRejection")(cachePromiseRejection)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[ArgumentsType, CacheKeyType, ReturnType]]
  }
}

