package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.stackMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "Stack")
@js.native
class Stack[T] () extends default[T]

/* static members */
@JSImport("mnemonist", "Stack")
@js.native
object Stack extends js.Object {
  def from[I](iterable: StringDictionary[I]): typings.mnemonist.stackMod.Stack[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I]): typings.mnemonist.stackMod.Stack[I] = js.native
  def of[I](items: I*): typings.mnemonist.stackMod.Stack[I] = js.native
}

