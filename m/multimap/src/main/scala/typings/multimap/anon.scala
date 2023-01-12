package typings.multimap

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Done[K] extends StObject {
    
    var done: Boolean
    
    var value: K
  }
  object Done {
    
    inline def apply[K](done: Boolean, value: K): Done[K] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done[K]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Done[?], K] (val x: Self & Done[K]) extends AnyVal {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: K): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Iterator[K] extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[K]] = js.native
    
    def next(): Done[K] = js.native
  }
  
  @js.native
  trait Next[V] extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[V]] = js.native
    
    def next(): Value[V] = js.native
  }
  
  trait Value[V] extends StObject {
    
    var done: Boolean
    
    var value: V
  }
  object Value {
    
    inline def apply[V](done: Boolean, value: V): Value[V] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value[?], V] (val x: Self & Value[V]) extends AnyVal {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
