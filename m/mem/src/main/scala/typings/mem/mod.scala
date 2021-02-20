package typings.mem

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
[Memoize](https://en.wikipedia.org/wiki/Memoization) functions - An optimization used to speed up consecutive function calls by caching the result of calls with identical input.
@param fn - Function to be memoized.
@example
```
import mem = require('mem');
let i = 0;
const counter = () => ++i;
const memoized = mem(counter);
memoized('foo');
//=> 1
// Cached as it's the same arguments
memoized('foo');
//=> 1
// Not cached anymore as the arguments changed
memoized('bar');
//=> 2
memoized('bar');
//=> 2
```
*/
object mod {
  
  @JSImport("mem", JSImport.Namespace)
  @js.native
  def apply[FunctionToMemoize /* <: AnyFunction */, CacheKeyType](fn: FunctionToMemoize): FunctionToMemoize = js.native
  @JSImport("mem", JSImport.Namespace)
  @js.native
  def apply[FunctionToMemoize /* <: AnyFunction */, CacheKeyType](fn: FunctionToMemoize, hasCacheKeyCacheMaxAge: Options[FunctionToMemoize, CacheKeyType]): FunctionToMemoize = js.native
  
  /**
    Clear all cached data of a memoized function.
    
    @param fn - Memoized function.
    */
  @JSImport("mem", "clear")
  @js.native
  def clear(fn: AnyFunction): Unit = js.native
  
  type AnyFunction = js.Function1[/* arguments_ */ js.Any, js.Any]
  
  @js.native
  trait CacheStorage[KeyType, ValueType] extends StObject {
    
    var clear: js.UndefOr[js.Function0[Unit]] = js.native
    
    def delete(key: KeyType): Unit = js.native
    
    def get(key: KeyType): js.UndefOr[CacheStorageContent[ValueType]] = js.native
    
    def has(key: KeyType): Boolean = js.native
    
    def set(key: KeyType, value: CacheStorageContent[ValueType]): Unit = js.native
  }
  object CacheStorage {
    
    @scala.inline
    def apply[KeyType, ValueType](
      delete: KeyType => Unit,
      get: KeyType => js.UndefOr[CacheStorageContent[ValueType]],
      has: KeyType => Boolean,
      set: (KeyType, CacheStorageContent[ValueType]) => Unit
    ): CacheStorage[KeyType, ValueType] = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[CacheStorage[KeyType, ValueType]]
    }
    
    @scala.inline
    implicit class CacheStorageMutableBuilder[Self <: CacheStorage[_, _], KeyType, ValueType] (val x: Self with (CacheStorage[KeyType, ValueType])) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setDelete(value: KeyType => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: KeyType => js.UndefOr[CacheStorageContent[ValueType]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: KeyType => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (KeyType, CacheStorageContent[ValueType]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait CacheStorageContent[ValueType] extends StObject {
    
    var data: ValueType = js.native
    
    var maxAge: Double = js.native
  }
  object CacheStorageContent {
    
    @scala.inline
    def apply[ValueType](data: ValueType, maxAge: Double): CacheStorageContent[ValueType] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheStorageContent[ValueType]]
    }
    
    @scala.inline
    implicit class CacheStorageContentMutableBuilder[Self <: CacheStorageContent[_], ValueType] (val x: Self with CacheStorageContent[ValueType]) extends AnyVal {
      
      @scala.inline
      def setData(value: ValueType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options[FunctionToMemoize /* <: AnyFunction */, CacheKeyType] extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options[_, _], FunctionToMemoize /* <: AnyFunction */, CacheKeyType] (val x: Self with (Options[FunctionToMemoize, CacheKeyType])) extends AnyVal {
      
      @scala.inline
      def setCache(value: CacheStorage[CacheKeyType, ReturnType[FunctionToMemoize]]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheKey(value: /* arguments_ */ Parameters[FunctionToMemoize] => CacheKeyType): Self = StObject.set(x, "cacheKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
}
