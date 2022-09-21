package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.fixedStackMod.default
import typings.mnemonist.typesMod.IArrayLikeConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "FixedStack")
@js.native
open class FixedStack[T] protected () extends default[T] {
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
}
/* static members */
object FixedStack {
  
  @JSImport("mnemonist", "FixedStack")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor): typings.mnemonist.fixedStackMod.FixedStack[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fixedStackMod.FixedStack[I]]
  inline def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typings.mnemonist.fixedStackMod.FixedStack[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fixedStackMod.FixedStack[I]]
  inline def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor): typings.mnemonist.fixedStackMod.FixedStack[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fixedStackMod.FixedStack[I]]
  inline def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typings.mnemonist.fixedStackMod.FixedStack[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fixedStackMod.FixedStack[I]]
}
