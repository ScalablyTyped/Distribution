package typings.atPhosphorCollections.atPhosphorCollectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/collections", "BPlusTree")
@js.native
class BPlusTree[T] protected ()
  extends typings.atPhosphorCollections.libBplustreeMod.BPlusTree[T] {
  /**
    * Construct a new B+ tree.
    *
    * @param cmp - The item comparison function for the tree.
    */
  def this(cmp: js.Function2[/* a */ T, /* b */ T, Double]) = this()
}

