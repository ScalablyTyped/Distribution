package typings
package atPhosphorAlgorithmLib.libIterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIterator[T] extends IIterable[T] {
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
  def next(): js.UndefOr[T]
}

object IIterator {
  @scala.inline
  def apply[T](clone: () => IIterator[T], iter: () => IIterator[T], next: () => js.UndefOr[T]): IIterator[T] = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), iter = js.Any.fromFunction0(iter), next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[IIterator[T]]
  }
}

