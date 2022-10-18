package typings.pMemoize

import typings.pMemoize.pMemoizeBooleans.`false`
import typings.std.Parameters
import typings.typeFest.sourceAsyncReturnTypeMod.AsyncReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-memoize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[FunctionToMemoize /* <: AnyAsyncFunction */, CacheKeyType](fn: FunctionToMemoize): FunctionToMemoize = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[FunctionToMemoize]
  inline def default[FunctionToMemoize /* <: AnyAsyncFunction */, CacheKeyType](fn: FunctionToMemoize, hasCacheKeyCache: Options[FunctionToMemoize, CacheKeyType]): FunctionToMemoize = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], hasCacheKeyCache.asInstanceOf[js.Any])).asInstanceOf[FunctionToMemoize]
  
  inline def pMemoizeClear(fn: AnyAsyncFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pMemoizeClear")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def pMemoizeDecorator[FunctionToMemoize /* <: AnyAsyncFunction */, CacheKeyType](): js.Function3[
    /* target */ Any, 
    /* propertyKey */ String, 
    /* descriptor */ js.PropertyDescriptor, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("pMemoizeDecorator")().asInstanceOf[js.Function3[
    /* target */ Any, 
    /* propertyKey */ String, 
    /* descriptor */ js.PropertyDescriptor, 
    Unit
  ]]
  inline def pMemoizeDecorator[FunctionToMemoize /* <: AnyAsyncFunction */, CacheKeyType](options: Options[FunctionToMemoize, CacheKeyType]): js.Function3[
    /* target */ Any, 
    /* propertyKey */ String, 
    /* descriptor */ js.PropertyDescriptor, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("pMemoizeDecorator")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ Any, 
    /* propertyKey */ String, 
    /* descriptor */ js.PropertyDescriptor, 
    Unit
  ]]
  
  @js.native
  trait AnyAsyncFunction extends StObject {
    
    def apply(arguments_ : Any*): js.Promise[Any | Unit] = js.native
  }
  
  trait CacheStorage[KeyType, ValueType] extends StObject {
    
    var clear: js.UndefOr[js.Function0[Any]] = js.undefined
    
    def delete(key: KeyType): Any
    
    def get(key: KeyType): js.UndefOr[js.Promise[js.UndefOr[ValueType]] | ValueType]
    
    def has(key: KeyType): js.Promise[Boolean] | Boolean
    
    def set(key: KeyType, value: ValueType): js.Promise[Any] | Any
  }
  object CacheStorage {
    
    inline def apply[KeyType, ValueType](
      delete: KeyType => Any,
      get: KeyType => js.UndefOr[js.Promise[js.UndefOr[ValueType]] | ValueType],
      has: KeyType => js.Promise[Boolean] | Boolean,
      set: (KeyType, ValueType) => js.Promise[Any] | Any
    ): CacheStorage[KeyType, ValueType] = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[CacheStorage[KeyType, ValueType]]
    }
    
    extension [Self <: CacheStorage[?, ?], KeyType, ValueType](x: Self & (CacheStorage[KeyType, ValueType])) {
      
      inline def setClear(value: () => Any): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setDelete(value: KeyType => Any): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: KeyType => js.UndefOr[js.Promise[js.UndefOr[ValueType]] | ValueType]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: KeyType => js.Promise[Boolean] | Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setSet(value: (KeyType, ValueType) => js.Promise[Any] | Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait Options[FunctionToMemoize /* <: AnyAsyncFunction */, CacheKeyType] extends StObject {
    
    /**
      Use a different cache storage. Must implement the following methods: `.has(key)`, `.get(key)`, `.set(key, value)`, `.delete(key)`, and optionally `.clear()`. You could for example use a `WeakMap` instead or [`quick-lru`](https://github.com/sindresorhus/quick-lru) for a LRU cache. To disable caching so that only concurrent executions resolve with the same value, pass `false`.
      @default new Map()
      @example new WeakMap()
      */
    val cache: js.UndefOr[(CacheStorage[CacheKeyType, AsyncReturnType[FunctionToMemoize]]) | `false`] = js.undefined
    
    /**
      Determines the cache key for storing the result based on the function arguments. By default, __only the first argument is considered__ and it only works with [primitives](https://developer.mozilla.org/en-US/docs/Glossary/Primitive).
      A `cacheKey` function can return any type supported by `Map` (or whatever structure you use in the `cache` option).
      You can have it cache **all** the arguments by value with `JSON.stringify`, if they are compatible:
      ```
      import pMemoize from 'p-memoize';
      pMemoize(function_, {cacheKey: JSON.stringify});
      ```
      Or you can use a more full-featured serializer like [serialize-javascript](https://github.com/yahoo/serialize-javascript) to add support for `RegExp`, `Date` and so on.
      ```
      import pMemoize from 'p-memoize';
      import serializeJavascript from 'serialize-javascript';
      pMemoize(function_, {cacheKey: serializeJavascript});
      ```
      @default arguments_ => arguments_[0]
      @example arguments_ => JSON.stringify(arguments_)
      */
    val cacheKey: js.UndefOr[js.Function1[/* arguments_ */ Parameters[FunctionToMemoize], CacheKeyType]] = js.undefined
  }
  object Options {
    
    inline def apply[FunctionToMemoize /* <: AnyAsyncFunction */, CacheKeyType](): Options[FunctionToMemoize, CacheKeyType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[FunctionToMemoize, CacheKeyType]]
    }
    
    extension [Self <: Options[?, ?], FunctionToMemoize /* <: AnyAsyncFunction */, CacheKeyType](x: Self & (Options[FunctionToMemoize, CacheKeyType])) {
      
      inline def setCache(value: (CacheStorage[CacheKeyType, AsyncReturnType[FunctionToMemoize]]) | `false`): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheKey(value: /* arguments_ */ Parameters[FunctionToMemoize] => CacheKeyType): Self = StObject.set(x, "cacheKey", js.Any.fromFunction1(value))
      
      inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
}
