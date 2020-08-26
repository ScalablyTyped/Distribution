package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.fixedStackMod.default
import typings.mnemonist.typesMod.IArrayLikeConstructor
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "FixedStack")
@js.native
class FixedStack[T] protected () extends default[T] {
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
}

/* static members */
@JSImport("mnemonist", "FixedStack")
@js.native
object FixedStack extends js.Object {
  def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor): typings.mnemonist.fixedStackMod.FixedStack[I] = js.native
  def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typings.mnemonist.fixedStackMod.FixedStack[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I], ArrayClass: IArrayLikeConstructor): typings.mnemonist.fixedStackMod.FixedStack[I] = js.native
  def from[I](iterable: Iterable[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typings.mnemonist.fixedStackMod.FixedStack[I] = js.native
}

