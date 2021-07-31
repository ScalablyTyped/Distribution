package typings.multimap

import typings.multimap.anon.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multimap", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Multimap {
    def this(iterable: js.Any) = this()
  }
  
  @js.native
  trait Multimap extends StObject {
    
    def clear(): Unit = js.native
    
    /**
      * Number of keys
      */
    var count: Double = js.native
    
    /**
      * @param key
      * @param val
      * @return true if any thing changed
      */
    def delete(key: js.Any): Boolean = js.native
    def delete(key: js.Any, `val`: js.Any): Boolean = js.native
    
    /**
      * @param iter
      */
    def forEach(iter: js.Any): Unit = js.native
    
    /**
      * @param iter
      */
    def forEachEntry(iter: js.Any): Unit = js.native
    
    /**
      * @param key
      */
    def get(key: js.Any): js.Any = js.native
    
    /**
      * @param key
      * @param val
      * @return whether the map contains 'key' or 'key=>val' pair
      */
    def has(key: js.Any): Boolean = js.native
    def has(key: js.Any, `val`: js.Any): Boolean = js.native
    
    /**
      * @return all the keys in the map
      */
    def keys(): Iterator = js.native
    
    /**
      * @param key
      * @param val
      */
    def set(key: js.Any, `val`: js.Any, args: js.Any*): Unit = js.native
    
    /**
      * Number of values
      */
    var size: Double = js.native
    
    /**
      * @return all the values in the map
      */
    def values(): Iterator = js.native
  }
}
