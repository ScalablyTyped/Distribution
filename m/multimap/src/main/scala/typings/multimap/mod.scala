package typings.multimap

import typings.multimap.anon.Iterator
import typings.multimap.anon.Next
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multimap", JSImport.Namespace)
  @js.native
  open class ^[K, V] ()
    extends StObject
       with Multimap[K, V] {
    def this(iterable: js.Array[js.Tuple2[K, V]]) = this()
    def this(iterable: ReadonlySet[js.Tuple2[K, V]]) = this()
  }
  
  @js.native
  trait Multimap[K, V] extends StObject {
    
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
    def delete(key: K): Boolean = js.native
    def delete(key: K, `val`: V): Boolean = js.native
    
    /**
      * @param iter
      */
    def forEach(iter: js.Function3[/* value */ V, /* key */ K, /* map */ Multimap[K, V], Unit]): Unit = js.native
    
    /**
      * @param iter
      */
    def forEachEntry(iter: js.Function3[/* value */ js.Array[V], /* key */ K, /* map */ Multimap[K, V], Unit]): Unit = js.native
    
    /**
      * @param key
      */
    def get(key: K): js.Array[V] = js.native
    
    /**
      * @param key
      * @param val
      * @return whether the map contains 'key' or 'key=>val' pair
      */
    def has(key: K): Boolean = js.native
    def has(key: K, `val`: V): Boolean = js.native
    
    /**
      * @return all the keys in the map
      */
    def keys(): Iterator[K] = js.native
    
    /**
      * @param key
      * @param val
      */
    def set(key: K, `val`: V, args: V*): this.type = js.native
    
    /**
      * Number of values
      */
    var size: Double = js.native
    
    /**
      * @return all the values in the map
      */
    def values(): Next[V] = js.native
  }
}
