package typings.mnemonist.hashedArrayTreeMod

import typings.mnemonist.typesMod.IArrayLikeConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/hashed-array-tree", JSImport.Default)
@js.native
class default[T] protected () extends HashedArrayTree[T] {
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
  def this(ArrayClass: IArrayLikeConstructor, options: HashedArrayTreeOptions) = this()
}

