package typings.mnemonist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultWeakMapMod {
  
  @JSImport("mnemonist/default-weak-map", JSImport.Default)
  @js.native
  open class default[K /* <: js.Object */, V] protected ()
    extends StObject
       with DefaultWeakMap[K, V] {
    // Constructor
    def this(factory: js.Function1[/* key */ K, V]) = this()
    
    // Methods
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def delete(key: K): Boolean = js.native
    
    /* CompleteClass */
    override def get(key: K): V = js.native
    
    /* CompleteClass */
    override def has(key: K): Boolean = js.native
    
    /* CompleteClass */
    override def inspect(): Any = js.native
    
    /* CompleteClass */
    override def peek(key: K): js.UndefOr[V] = js.native
    
    /* CompleteClass */
    override def set(key: K, value: V): this.type = js.native
  }
  
  trait DefaultWeakMap[K /* <: js.Object */, V] extends StObject {
    
    // Methods
    def clear(): Unit
    
    def delete(key: K): Boolean
    
    def get(key: K): V
    
    def has(key: K): Boolean
    
    def inspect(): Any
    
    def peek(key: K): js.UndefOr[V]
    
    def set(key: K, value: V): this.type
  }
  object DefaultWeakMap {
    
    inline def apply[K /* <: js.Object */, V](
      clear: () => Unit,
      delete: K => Boolean,
      get: K => V,
      has: K => Boolean,
      inspect: () => Any,
      peek: K => js.UndefOr[V],
      set: (K, V) => DefaultWeakMap[K, V]
    ): DefaultWeakMap[K, V] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), inspect = js.Any.fromFunction0(inspect), peek = js.Any.fromFunction1(peek), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[DefaultWeakMap[K, V]]
    }
    
    extension [Self <: DefaultWeakMap[?, ?], K /* <: js.Object */, V](x: Self & (DefaultWeakMap[K, V])) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setDelete(value: K => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: K => V): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: K => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setInspect(value: () => Any): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      inline def setPeek(value: K => js.UndefOr[V]): Self = StObject.set(x, "peek", js.Any.fromFunction1(value))
      
      inline def setSet(value: (K, V) => DefaultWeakMap[K, V]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
