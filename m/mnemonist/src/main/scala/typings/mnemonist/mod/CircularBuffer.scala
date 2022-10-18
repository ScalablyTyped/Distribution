package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.circularBufferMod.default
import typings.mnemonist.utilsTypesMod.IArrayLikeConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "CircularBuffer")
@js.native
open class CircularBuffer[T] protected () extends default[T] {
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
}
/* static members */
object CircularBuffer {
  
  @JSImport("mnemonist", "CircularBuffer")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor): typings.mnemonist.circularBufferMod.CircularBuffer[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.circularBufferMod.CircularBuffer[I]]
  inline def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typings.mnemonist.circularBufferMod.CircularBuffer[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.circularBufferMod.CircularBuffer[I]]
  inline def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor): typings.mnemonist.circularBufferMod.CircularBuffer[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.circularBufferMod.CircularBuffer[I]]
  inline def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typings.mnemonist.circularBufferMod.CircularBuffer[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.circularBufferMod.CircularBuffer[I]]
}
