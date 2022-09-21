package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.heapMod.HeapComparator
import typings.mnemonist.heapMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "Heap")
@js.native
// Constructor
open class Heap[T] () extends default[T] {
  def this(comparator: HeapComparator[T]) = this()
}
/* static members */
object Heap {
  
  @JSImport("mnemonist", "Heap")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I]): typings.mnemonist.heapMod.Heap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.heapMod.Heap[I]]
  inline def from[I](iterable: js.Iterable[I], comparator: HeapComparator[I]): typings.mnemonist.heapMod.Heap[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.heapMod.Heap[I]]
  inline def from[I](iterable: StringDictionary[I]): typings.mnemonist.heapMod.Heap[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.heapMod.Heap[I]]
  inline def from[I](iterable: StringDictionary[I], comparator: HeapComparator[I]): typings.mnemonist.heapMod.Heap[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.heapMod.Heap[I]]
}
