package typings.atPhosphorCollections.libBplustreeMod

import typings.atPhosphorAlgorithm.libIterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/collections/lib/bplustree", "BPlusTree")
@js.native
object BPlusTreeNs extends js.Object {
  /**
    * Create a new B+ tree populated with the given items.
    *
    * @param items - The items to add to the tree.
    *
    * @param cmp - The item comparison function for the tree.
    *
    * @returns A new B+ tree populated with the given items.
    *
    * #### Complexity
    * `O(n log32 n)`
    */
  def from[T](items: IterableOrArrayLike[T], cmp: js.Function2[/* a */ T, /* b */ T, Double]): BPlusTree[T] = js.native
}

