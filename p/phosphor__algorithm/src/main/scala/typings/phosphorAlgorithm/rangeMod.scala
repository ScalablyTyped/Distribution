package typings.phosphorAlgorithm

import typings.phosphorAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/range", JSImport.Namespace)
@js.native
object rangeMod extends js.Object {
  @js.native
  class RangeIterator protected () extends IIterator[Double] {
    /**
      * Construct a new range iterator.
      *
      * @param start - The starting value for the range, inclusive.
      *
      * @param stop - The stopping value for the range, exclusive.
      *
      * @param step - The distance between each value.
      */
    def this(start: Double, stop: Double, step: Double) = this()
    var _index: js.Any = js.native
    var _length: js.Any = js.native
    var _start: js.Any = js.native
    var _step: js.Any = js.native
    var _stop: js.Any = js.native
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
    override def iter(): IIterator[Double] = js.native
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
    override def next(): js.UndefOr[Double] = js.native
  }
  
  def range(start: Double): IIterator[Double] = js.native
  def range(start: Double, stop: Double): IIterator[Double] = js.native
  def range(start: Double, stop: Double, step: Double): IIterator[Double] = js.native
}

