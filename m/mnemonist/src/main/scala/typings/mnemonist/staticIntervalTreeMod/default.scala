package typings.mnemonist.staticIntervalTreeMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/static-interval-tree", JSImport.Default)
@js.native
class default[T] protected () extends StaticIntervalTree[T] {
  // Constructor
  def this(intervals: js.Array[T]) = this()
  def this(intervals: js.Array[T], getters: StaticIntervalTreeGettersTuple[T]) = this()
}

/* static members */
@JSImport("mnemonist/static-interval-tree", JSImport.Default)
@js.native
object default extends js.Object {
  def from[I](iterable: StringDictionary[I]): StaticIntervalTree[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I]): StaticIntervalTree[I] = js.native
}

