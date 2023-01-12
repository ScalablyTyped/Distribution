package typings.mem

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[FunctionToMemoize /* <: AnyFunction */, CacheKeyType](fn: FunctionToMemoize): FunctionToMemoize = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[FunctionToMemoize]
  inline def default[FunctionToMemoize /* <: AnyFunction */, CacheKeyType](fn: FunctionToMemoize, param1: Options[FunctionToMemoize, CacheKeyType]): FunctionToMemoize = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[FunctionToMemoize]
  
  inline def memClear(fn: AnyFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("memClear")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def memDecorator[FunctionToMemoize /* <: AnyFunction */, CacheKeyType](): js.Function3[
    /* target */ Any, 
    /* propertyKey */ String, 
    /* descriptor */ js.PropertyDescriptor, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("memDecorator")().asInstanceOf[js.Function3[
    /* target */ Any, 
    /* propertyKey */ String, 
    /* descriptor */ js.PropertyDescriptor, 
    Unit
  ]]
  inline def memDecorator[FunctionToMemoize /* <: AnyFunction */, CacheKeyType](options: Options[FunctionToMemoize, CacheKeyType]): js.Function3[
    /* target */ Any, 
    /* propertyKey */ String, 
    /* descriptor */ js.PropertyDescriptor, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("memDecorator")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ Any, 
    /* propertyKey */ String, 
    /* descriptor */ js.PropertyDescriptor, 
    Unit
  ]]
  
  type AnyFunction = js.Function1[/* arguments_ */ Any, Any]
  
  trait CacheStorage[KeyType, ValueType] extends StObject {
    
    var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def delete(key: KeyType): Unit
    
    def get(key: KeyType): js.UndefOr[CacheStorageContent[ValueType]]
    
    def has(key: KeyType): Boolean
    
    def set(key: KeyType, value: CacheStorageContent[ValueType]): Unit
  }
  object CacheStorage {
    
    inline def apply[KeyType, ValueType](
      delete: KeyType => Unit,
      get: KeyType => js.UndefOr[CacheStorageContent[ValueType]],
      has: KeyType => Boolean,
      set: (KeyType, CacheStorageContent[ValueType]) => Unit
    ): CacheStorage[KeyType, ValueType] = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[CacheStorage[KeyType, ValueType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheStorage[?, ?], KeyType, ValueType] (val x: Self & (CacheStorage[KeyType, ValueType])) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setDelete(value: KeyType => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: KeyType => js.UndefOr[CacheStorageContent[ValueType]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: KeyType => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setSet(value: (KeyType, CacheStorageContent[ValueType]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait CacheStorageContent[ValueType] extends StObject {
    
    var data: ValueType
    
    var maxAge: Double
  }
  object CacheStorageContent {
    
    inline def apply[ValueType](data: ValueType, maxAge: Double): CacheStorageContent[ValueType] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheStorageContent[ValueType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheStorageContent[?], ValueType] (val x: Self & CacheStorageContent[ValueType]) extends AnyVal {
      
      inline def setData(value: ValueType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options[FunctionToMemoize /* <: AnyFunction */, CacheKeyType] extends StObject {
    
    /**
      Use a different cache storage. Must implement the following methods: `.has(key)`, `.get(key)`, `.set(key, value)`, `.delete(key)`, and optionally `.clear()`. You could for example use a `WeakMap` instead or [`quick-lru`](https://github.com/sindresorhus/quick-lru) for a LRU cache.
      @default new Map()
      @example new WeakMap()
      */
    val cache: js.UndefOr[CacheStorage[CacheKeyType, ReturnType[FunctionToMemoize]]] = js.undefined
    
    /**
      Determines the cache key for storing the result based on the function arguments. By default, __only the first argument is considered__ and it only works with [primitives](https://developer.mozilla.org/en-US/docs/Glossary/Primitive).
      A `cacheKey` function can return any type supported by `Map` (or whatever structure you use in the `cache` option).
      You can have it cache **all** the arguments by value with `JSON.stringify`, if they are compatible:
      ```
      import mem from 'mem';
      mem(function_, {cacheKey: JSON.stringify});
      ```
      Or you can use a more full-featured serializer like [serialize-javascript](https://github.com/yahoo/serialize-javascript) to add support for `RegExp`, `Date` and so on.
      ```
      import mem from 'mem';
      import serializeJavascript from 'serialize-javascript';
      mem(function_, {cacheKey: serializeJavascript});
      ```
      @default arguments_ => arguments_[0]
      @example arguments_ => JSON.stringify(arguments_)
      */
    val cacheKey: js.UndefOr[js.Function1[/* arguments_ */ Parameters[FunctionToMemoize], CacheKeyType]] = js.undefined
    
    /**
      Milliseconds until the cache expires.
      @default Infinity
      */
    val maxAge: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply[FunctionToMemoize /* <: AnyFunction */, CacheKeyType](): Options[FunctionToMemoize, CacheKeyType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[FunctionToMemoize, CacheKeyType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?, ?], FunctionToMemoize /* <: AnyFunction */, CacheKeyType] (val x: Self & (Options[FunctionToMemoize, CacheKeyType])) extends AnyVal {
      
      inline def setCache(value: CacheStorage[CacheKeyType, ReturnType[FunctionToMemoize]]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheKey(value: /* arguments_ */ Parameters[FunctionToMemoize] => CacheKeyType): Self = StObject.set(x, "cacheKey", js.Any.fromFunction1(value))
      
      inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
}
