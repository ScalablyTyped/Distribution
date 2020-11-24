package typings.mem.mod

import typings.std.Parameters
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[FunctionToMemoize /* <: AnyFunction */, CacheKeyType] extends js.Object {
  
  /**
    Use a different cache storage. Must implement the following methods: `.has(key)`, `.get(key)`, `.set(key, value)`, `.delete(key)`, and optionally `.clear()`. You could for example use a `WeakMap` instead or [`quick-lru`](https://github.com/sindresorhus/quick-lru) for a LRU cache.
    @default new Map()
    @example new WeakMap()
    */
  val cache: js.UndefOr[CacheStorage[CacheKeyType, ReturnType[FunctionToMemoize]]] = js.native
  
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
  val cacheKey: js.UndefOr[js.Function1[/* arguments_ */ Parameters[FunctionToMemoize], CacheKeyType]] = js.native
  
  /**
    Milliseconds until the cache expires.
    @default Infinity
    */
  val maxAge: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply[FunctionToMemoize /* <: AnyFunction */, CacheKeyType](): Options[FunctionToMemoize, CacheKeyType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[FunctionToMemoize, CacheKeyType]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _], FunctionToMemoize /* <: AnyFunction */, CacheKeyType] (val x: Self with (Options[FunctionToMemoize, CacheKeyType])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCache(value: CacheStorage[CacheKeyType, ReturnType[FunctionToMemoize]]): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCacheKey(value: /* arguments_ */ Parameters[FunctionToMemoize] => CacheKeyType): Self = this.set("cacheKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCacheKey: Self = this.set("cacheKey", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
  }
}
