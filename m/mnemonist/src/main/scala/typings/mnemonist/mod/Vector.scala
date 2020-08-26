package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.typesMod.IArrayLikeConstructor
import typings.mnemonist.vectorMod.VectorOptions
import typings.mnemonist.vectorMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "Vector")
@js.native
class Vector protected () extends default {
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, length: Double) = this()
  def this(ArrayClass: IArrayLikeConstructor, length: VectorOptions) = this()
}

/* static members */
@JSImport("mnemonist", "Vector")
@js.native
object Vector extends js.Object {
  def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor): typings.mnemonist.vectorMod.Vector = js.native
  def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typings.mnemonist.vectorMod.Vector = js.native
  // Statics
  def from[I](iterable: Iterable[I], ArrayClass: IArrayLikeConstructor): typings.mnemonist.vectorMod.Vector = js.native
  def from[I](iterable: Iterable[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typings.mnemonist.vectorMod.Vector = js.native
}

