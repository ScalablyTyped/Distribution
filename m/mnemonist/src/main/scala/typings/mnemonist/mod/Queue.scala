package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.queueMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "Queue")
@js.native
class Queue[T] () extends default[T]

/* static members */
@JSImport("mnemonist", "Queue")
@js.native
object Queue extends js.Object {
  def from[I](iterable: StringDictionary[I]): typings.mnemonist.queueMod.Queue[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I]): typings.mnemonist.queueMod.Queue[I] = js.native
  def of[I](items: I*): typings.mnemonist.queueMod.Queue[I] = js.native
}

