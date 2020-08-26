package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.linkedListMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "LinkedList")
@js.native
class LinkedList[T] () extends default[T]

/* static members */
@JSImport("mnemonist", "LinkedList")
@js.native
object LinkedList extends js.Object {
  def from[I](iterable: StringDictionary[I]): typings.mnemonist.linkedListMod.LinkedList[I] = js.native
  // Statics
  def from[I](iterable: Iterable[I]): typings.mnemonist.linkedListMod.LinkedList[I] = js.native
}

