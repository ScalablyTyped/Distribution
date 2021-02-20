package typings.memize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("memize", JSImport.Namespace)
  @js.native
  def apply[F /* <: js.Function */](fn: F): F with MemizeMemoizedFunction = js.native
  @JSImport("memize", JSImport.Namespace)
  @js.native
  def apply[F /* <: js.Function */](fn: F, options: MemizeOptions): F with MemizeMemoizedFunction = js.native
  
  /**
    * Internal cache entry.
    */
  @js.native
  trait MemizeCacheNode extends StObject {
    
    /**
      * Function arguments for cache
      * entry.
      */
    var args: js.Array[_] = js.native
    
    /**
      * Next node.
      */
    var next: js.UndefOr[MemizeCacheNode | Null] = js.native
    
    /**
      * Previous node.
      */
    var prev: js.UndefOr[MemizeCacheNode | Null] = js.native
    
    /**
      * Function result.
      */
    var `val`: js.Any = js.native
  }
  object MemizeCacheNode {
    
    @scala.inline
    def apply(args: js.Array[_], `val`: js.Any): MemizeCacheNode = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemizeCacheNode]
    }
    
    @scala.inline
    implicit class MemizeCacheNodeMutableBuilder[Self <: MemizeCacheNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setNext(value: MemizeCacheNode): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextNull: Self = StObject.set(x, "next", null)
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPrev(value: MemizeCacheNode): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevNull: Self = StObject.set(x, "prev", null)
      
      @scala.inline
      def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      @scala.inline
      def setVal(value: js.Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Properties of the enhanced function for controlling cache.
    */
  @js.native
  trait MemizeMemoizedFunction extends StObject {
    
    /**
      * Clear the cache.
      */
    def clear(): Unit = js.native
  }
  object MemizeMemoizedFunction {
    
    @scala.inline
    def apply(clear: () => Unit): MemizeMemoizedFunction = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[MemizeMemoizedFunction]
    }
    
    @scala.inline
    implicit class MemizeMemoizedFunctionMutableBuilder[Self <: MemizeMemoizedFunction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Memize options object.
    */
  @js.native
  trait MemizeOptions extends StObject {
    
    /**
      * Maximum size of the cache.
      */
    var maxSize: js.UndefOr[Double] = js.native
  }
  object MemizeOptions {
    
    @scala.inline
    def apply(): MemizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemizeOptions]
    }
    
    @scala.inline
    implicit class MemizeOptionsMutableBuilder[Self <: MemizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    }
  }
}
