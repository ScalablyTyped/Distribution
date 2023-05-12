package typings.metro

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibCountingSetMod {
  
  @JSImport("metro/src/lib/CountingSet", JSImport.Default)
  @js.native
  open class default[T] ()
    extends StObject
       with CountingSet[T] {
    def this(items: js.Iterable[T]) = this()
  }
  
  @js.native
  trait CountingSet[T]
    extends StObject
       with ReadOnlyCountingSet[T] {
    
    def add(item: T): Unit = js.native
    
    def clear(): Unit = js.native
    
    def delete(item: T): Unit = js.native
    
    def keys(): js.Iterator[T] = js.native
    
    @JSName("size")
    def size_MCountingSet: Double = js.native
    
    def toJSON(): Any = js.native
    
    def values(): js.Iterator[T] = js.native
  }
  
  @js.native
  trait ReadOnlyCountingSet[T]
    extends StObject
       with Iterable[T] {
    
    def count(item: T): Double = js.native
    
    def forEach[ThisT](
      callbackFn: js.ThisFunction3[/* this */ ThisT, /* value */ T, /* key */ T, /* set */ ReadOnlyCountingSet[T], Any],
      thisArg: ThisT
    ): Unit = js.native
    
    def has(item: T): Boolean = js.native
    
    val size: Double = js.native
  }
}
