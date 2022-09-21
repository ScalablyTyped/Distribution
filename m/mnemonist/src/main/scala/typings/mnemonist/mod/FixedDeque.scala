package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.fixedDequeMod.default
import typings.mnemonist.typesMod.IArrayLikeConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "FixedDeque")
@js.native
open class FixedDeque[T] protected () extends default[T] {
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
}
/* static members */
object FixedDeque {
  
  @JSImport("mnemonist", "FixedDeque")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor): typings.mnemonist.fixedDequeMod.FixedDeque[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fixedDequeMod.FixedDeque[I]]
  inline def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typings.mnemonist.fixedDequeMod.FixedDeque[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fixedDequeMod.FixedDeque[I]]
  inline def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor): typings.mnemonist.fixedDequeMod.FixedDeque[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fixedDequeMod.FixedDeque[I]]
  inline def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typings.mnemonist.fixedDequeMod.FixedDeque[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fixedDequeMod.FixedDeque[I]]
}
