package typings.mnemonist.mod

import typings.mnemonist.fixedReverseHeapMod.HeapComparator
import typings.mnemonist.fixedReverseHeapMod.default
import typings.mnemonist.utilsTypesMod.IArrayLikeConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "FixedReverseHeap")
@js.native
open class FixedReverseHeap[T] protected () extends default[T] {
  def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, comparator: HeapComparator[T], capacity: Double) = this()
}
