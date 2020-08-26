package typings.mnemonist.mod

import typings.mnemonist.hashedArrayTreeMod.HashedArrayTreeOptions
import typings.mnemonist.hashedArrayTreeMod.default
import typings.mnemonist.typesMod.IArrayLikeConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "HashedArrayTree")
@js.native
class HashedArrayTree[T] protected () extends default[T] {
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
  def this(ArrayClass: IArrayLikeConstructor, options: HashedArrayTreeOptions) = this()
}

