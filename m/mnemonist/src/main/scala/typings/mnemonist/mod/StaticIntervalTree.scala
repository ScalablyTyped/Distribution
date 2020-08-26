package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.staticIntervalTreeMod.StaticIntervalTreeGettersTuple
import typings.mnemonist.staticIntervalTreeMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "StaticIntervalTree")
@js.native
class StaticIntervalTree[T] protected () extends default[T] {
  // Constructor
  def this(intervals: js.Array[T]) = this()
  def this(intervals: js.Array[T], getters: StaticIntervalTreeGettersTuple[T]) = this()
}

/* static members */
@JSImport("mnemonist", "StaticIntervalTree")
@js.native
object StaticIntervalTree extends js.Object {
  def from[I](iterable: StringDictionary[I]): typings.mnemonist.staticIntervalTreeMod.StaticIntervalTree[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I]): typings.mnemonist.staticIntervalTreeMod.StaticIntervalTree[I] = js.native
}

