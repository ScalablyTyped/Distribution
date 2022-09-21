package typings.mnemonist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Distance[T] extends StObject {
    
    var distance: Double
    
    var item: T
  }
  object Distance {
    
    inline def apply[T](distance: Double, item: T): Distance[T] = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[Distance[T]]
    }
    
    extension [Self <: Distance[?], T](x: Self & Distance[T]) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait Evicted[K, V] extends StObject {
    
    var evicted: Boolean
    
    var key: K
    
    var value: V
  }
  object Evicted {
    
    inline def apply[K, V](evicted: Boolean, key: K, value: V): Evicted[K, V] = {
      val __obj = js.Dynamic.literal(evicted = evicted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Evicted[K, V]]
    }
    
    extension [Self <: Evicted[?, ?], K, V](x: Self & (Evicted[K, V])) {
      
      inline def setEvicted(value: Boolean): Self = StObject.set(x, "evicted", value.asInstanceOf[js.Any])
      
      inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
