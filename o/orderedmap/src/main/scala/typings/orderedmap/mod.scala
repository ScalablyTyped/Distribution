package typings.orderedmap

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("orderedmap", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with OrderedMap[T] {
    /* private */ def this(content: js.Array[String | T]) = this()
  }
  object default {
    
    @JSImport("orderedmap", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def from[T](map: MapLike[T]): OrderedMap[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(map.asInstanceOf[js.Any]).asInstanceOf[OrderedMap[T]]
  }
  
  type MapLike[T] = (Record[String, T]) | OrderedMap[T]
  
  @js.native
  trait OrderedMap[T] extends StObject {
    
    def addBefore(place: String, key: String, value: T): OrderedMap[T] = js.native
    
    def addToEnd(key: String, value: T): OrderedMap[T] = js.native
    
    def addToStart(key: String, value: T): OrderedMap[T] = js.native
    
    def append(map: MapLike[T]): OrderedMap[T] = js.native
    
    def forEach(fn: js.Function2[/* key */ String, /* value */ T, Any]): Unit = js.native
    
    def get(key: String): js.UndefOr[T] = js.native
    
    def prepend(map: MapLike[T]): OrderedMap[T] = js.native
    
    def remove(key: String): OrderedMap[T] = js.native
    
    val size: Double = js.native
    
    def subtract(map: MapLike[T]): OrderedMap[T] = js.native
    
    def update(key: String, value: T): OrderedMap[T] = js.native
    def update(key: String, value: T, newKey: String): OrderedMap[T] = js.native
  }
}
