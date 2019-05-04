package typings
package atPhosphorAlgorithmLib.libChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/chain", "ChainIterator")
@js.native
class ChainIterator[T] protected ()
  extends atPhosphorAlgorithmLib.libIterMod.IIterator[T] {
  /**
    * Construct a new chain iterator.
    *
    * @param source - The iterator of iterators of interest.
    */
  def this(source: atPhosphorAlgorithmLib.libIterMod.IIterator[atPhosphorAlgorithmLib.libIterMod.IIterator[T]]) = this()
  var _active: js.Any = js.native
  var _cloned: js.Any = js.native
  var _source: js.Any = js.native
  /**
    * Get an iterator over the object's values.
    *
    * @returns An iterator which yields the object's values.
    *
    * #### Notes
    * Depending on the iterable, the returned iterator may or may not be
    * a new object. A collection or other container-like object should
    * typically return a new iterator, while an iterator itself should
    * normally return `this`.
    */
  /* CompleteClass */
  override def iter(): atPhosphorAlgorithmLib.libIterMod.IIterator[T] = js.native
  /**
    * Get the next value from the iterator.
    *
    * @returns The next value from the iterator, or `undefined`.
    *
    * #### Notes
    * The `undefined` value is used to signal the end of iteration and
    * should therefore not be used as a value in a collection.
    *
    * The use of the `undefined` sentinel is an explicit design choice
    * which favors performance over purity. The ES6 iterator design of
    * returning a `{ value, done }` pair is suboptimal, as it requires
    * an object allocation on each iteration; and an `isDone()` method
    * would increase implementation and runtime complexity.
    */
  /* CompleteClass */
  override def next(): js.UndefOr[T] = js.native
}

