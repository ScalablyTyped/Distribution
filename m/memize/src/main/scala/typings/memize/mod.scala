package typings.memize

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[F /* <: js.Function1[/* repeated */ Any, Any] */](fn: F): (js.Function1[/* args */ Parameters[F], ReturnType[F]]) & MemizeMemoizedFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[/* args */ Parameters[F], ReturnType[F]]) & MemizeMemoizedFunction]
  inline def default[F /* <: js.Function1[/* repeated */ Any, Any] */](fn: F, options: MemizeOptions): (js.Function1[/* args */ Parameters[F], ReturnType[F]]) & MemizeMemoizedFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(js.Function1[/* args */ Parameters[F], ReturnType[F]]) & MemizeMemoizedFunction]
  
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
