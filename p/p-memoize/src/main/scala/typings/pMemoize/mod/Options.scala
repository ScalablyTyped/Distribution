package typings.pMemoize.mod

import typings.mem.anon.Data
import typings.mem.mod.CacheStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mem.mem.Options<ArgumentsType, CacheKeyType, ReturnType> & { readonly cachePromiseRejection ? :boolean} */
trait Options[ArgumentsType /* <: js.Array[_] */, CacheKeyType, ReturnType] extends js.Object {
  /**
  		Use a different cache storage. Must implement the following methods: `.has(key)`, `.get(key)`, `.set(key, value)`, `.delete(key)`, and optionally `.clear()`. You could for example use a `WeakMap` instead or [`quick-lru`](https://github.com/sindresorhus/quick-lru) for a LRU cache.
  		@default new Map()
  		@example new WeakMap()
  		*/
  val cache: js.UndefOr[CacheStorage[CacheKeyType, Data[ReturnType]]] = js.undefined
  /**
  		Determines the cache key for storing the result based on the function arguments. By default, __only the first argument is considered__ and it only works with [primitives](https://developer.mozilla.org/en-US/docs/Glossary/Primitive).
  		A `cacheKey` function can return any type supported by `Map` (or whatever structure you use in the `cache` option).
  		You can have it cache **all** the arguments by value with `JSON.stringify`, if they are compatible:
  		```
  		import mem = require('mem');
  		mem(function_, {cacheKey: JSON.stringify});
  		```
  		Or you can use a more full-featured serializer like [serialize-javascript](https://github.com/yahoo/serialize-javascript) to add support for `RegExp`, `Date` and so on.
  		```
  		import mem = require('mem');
  		import serializeJavascript = require('serialize-javascript');
  		mem(function_, {cacheKey: serializeJavascript});
  		```
  		@default arguments_ => arguments_[0]
  		@example arguments_ => JSON.stringify(arguments_)
  		*/
  val cacheKey: js.UndefOr[js.Function1[/* arguments */ ArgumentsType, CacheKeyType]] = js.undefined
  /**
  		Cache rejected promises.
  		@default false
  		*/
  val cachePromiseRejection: js.UndefOr[Boolean] = js.undefined
  /**
  		Milliseconds until the cache expires.
  		@default Infinity
  		*/
  val maxAge: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[ArgumentsType, CacheKeyType, ReturnType](
    cache: CacheStorage[CacheKeyType, Data[ReturnType]] = null,
    cacheKey: /* arguments */ ArgumentsType => CacheKeyType = null,
    cachePromiseRejection: js.UndefOr[Boolean] = js.undefined,
    maxAge: js.UndefOr[Double] = js.undefined
  ): Options[ArgumentsType, CacheKeyType, ReturnType] = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(js.Any.fromFunction1(cacheKey))
    if (!js.isUndefined(cachePromiseRejection)) __obj.updateDynamic("cachePromiseRejection")(cachePromiseRejection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[ArgumentsType, CacheKeyType, ReturnType]]
  }
}

