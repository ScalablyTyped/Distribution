package typings.memize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Memize options object.
    *
    * @typedef MemizeOptions
    *
    * @property {number} [maxSize] Maximum size of the cache.
    */
  /**
    * Internal cache entry.
    *
    * @typedef MemizeCacheNode
    *
    * @property {?MemizeCacheNode|undefined} [prev] Previous node.
    * @property {?MemizeCacheNode|undefined} [next] Next node.
    * @property {Array<*>}                   args   Function arguments for cache
    *                                               entry.
    * @property {*}                          val    Function result.
    */
  /**
    * Properties of the enhanced function for controlling cache.
    *
    * @typedef MemizeMemoizedFunction
    *
    * @property {()=>void} clear Clear the cache.
    */
  /**
    * Accepts a function to be memoized, and returns a new memoized function, with
    * optional options.
    *
    * @template {Function} F
    *
    * @param {F}             fn        Function to memoize.
    * @param {MemizeOptions} [options] Options object.
    *
    * @return {F & MemizeMemoizedFunction} Memoized function.
    */
  inline def apply[F /* <: js.Function */](fn: F): F & MemizeMemoizedFunction = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[F & MemizeMemoizedFunction]
  inline def apply[F /* <: js.Function */](fn: F, options: MemizeOptions): F & MemizeMemoizedFunction = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[F & MemizeMemoizedFunction]
  
  @JSImport("memize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Internal cache entry.
    */
  trait MemizeCacheNode extends StObject {
    
    /**
      * Function arguments for cache
      * entry.
      */
    var args: js.Array[Any]
    
    /**
      * Next node.
      */
    var next: js.UndefOr[MemizeCacheNode | Null] = js.undefined
    
    /**
      * Previous node.
      */
    var prev: js.UndefOr[MemizeCacheNode | Null] = js.undefined
    
    /**
      * Function result.
      */
    var `val`: Any
  }
  object MemizeCacheNode {
    
    inline def apply(args: js.Array[Any], `val`: Any): MemizeCacheNode = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemizeCacheNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemizeCacheNode] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setNext(value: MemizeCacheNode): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrev(value: MemizeCacheNode): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevNull: Self = StObject.set(x, "prev", null)
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      inline def setVal(value: Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Properties of the enhanced function for controlling cache.
    */
  trait MemizeMemoizedFunction extends StObject {
    
    /**
      * Clear the cache.
      */
    def clear(): Unit
  }
  object MemizeMemoizedFunction {
    
    inline def apply(clear: () => Unit): MemizeMemoizedFunction = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[MemizeMemoizedFunction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemizeMemoizedFunction] (val x: Self) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Memize options object.
    */
  trait MemizeOptions extends StObject {
    
    /**
      * Maximum size of the cache.
      */
    var maxSize: js.UndefOr[Double] = js.undefined
  }
  object MemizeOptions {
    
    inline def apply(): MemizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemizeOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    }
  }
}
