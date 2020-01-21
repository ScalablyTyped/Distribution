package typings.phosphorAlgorithm

import org.scalablytyped.runtime.StringDictionary
import typings.phosphorAlgorithm.arrayMod.ArrayExt.MutableArrayLike
import typings.phosphorAlgorithm.arrayMod.ArrayExt.slice.IOptions
import typings.phosphorAlgorithm.iterMod.IIterator
import typings.phosphorAlgorithm.iterMod.IterableOrArrayLike
import typings.phosphorAlgorithm.retroMod.RetroableOrArrayLike
import typings.phosphorAlgorithm.stringMod.StringExt.IMatchResult
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ArrayIterator[T] protected ()
    extends typings.phosphorAlgorithm.iterMod.ArrayIterator[T] {
    /**
      * Construct a new array iterator.
      *
      * @param source - The array-like object of interest.
      */
    def this(source: ArrayLike[T]) = this()
  }
  
  @js.native
  class ChainIterator[T] protected ()
    extends typings.phosphorAlgorithm.chainMod.ChainIterator[T] {
    /**
      * Construct a new chain iterator.
      *
      * @param source - The iterator of iterators of interest.
      */
    def this(source: IIterator[IIterator[T]]) = this()
  }
  
  @js.native
  /**
    * Construct a new empty iterator.
    */
  class EmptyIterator[T] ()
    extends typings.phosphorAlgorithm.emptyMod.EmptyIterator[T]
  
  @js.native
  class EnumerateIterator[T] protected ()
    extends typings.phosphorAlgorithm.enumerateMod.EnumerateIterator[T] {
    /**
      * Construct a new enumerate iterator.
      *
      * @param source - The iterator of values of interest.
      *
      * @param start - The starting enum value.
      */
    def this(source: IIterator[T], start: Double) = this()
  }
  
  @js.native
  class FilterIterator[T] protected ()
    extends typings.phosphorAlgorithm.filterMod.FilterIterator[T] {
    /**
      * Construct a new filter iterator.
      *
      * @param source - The iterator of values of interest.
      *
      * @param fn - The predicate function to invoke for each value.
      */
    def this(source: IIterator[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]) = this()
  }
  
  @js.native
  class FnIterator[T] protected ()
    extends typings.phosphorAlgorithm.iterMod.FnIterator[T] {
    /**
      * Construct a new function iterator.
      *
      * @param fn - The iterator-like function of interest.
      */
    def this(fn: js.Function0[js.UndefOr[T]]) = this()
  }
  
  @js.native
  class ItemIterator[T] protected ()
    extends typings.phosphorAlgorithm.iterMod.ItemIterator[T] {
    /**
      * Construct a new item iterator.
      *
      * @param source - The object of interest.
      *
      * @param keys - The keys to iterate, if known.
      */
    def this(source: StringDictionary[T]) = this()
    def this(source: StringDictionary[T], keys: js.Array[String]) = this()
  }
  
  @js.native
  class KeyIterator protected ()
    extends typings.phosphorAlgorithm.iterMod.KeyIterator {
    /**
      * Construct a new key iterator.
      *
      * @param source - The object of interest.
      *
      * @param keys - The keys to iterate, if known.
      */
    def this(source: StringDictionary[js.Any]) = this()
    def this(source: StringDictionary[js.Any], keys: js.Array[String]) = this()
  }
  
  @js.native
  class MapIterator[T, U] protected ()
    extends typings.phosphorAlgorithm.mapMod.MapIterator[T, U] {
    /**
      * Construct a new map iterator.
      *
      * @param source - The iterator of values of interest.
      *
      * @param fn - The mapping function to invoke for each value.
      */
    def this(source: IIterator[T], fn: js.Function2[/* value */ T, /* index */ Double, U]) = this()
  }
  
  @js.native
  class RangeIterator protected ()
    extends typings.phosphorAlgorithm.rangeMod.RangeIterator {
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
  }
  
  @js.native
  class RepeatIterator[T] protected ()
    extends typings.phosphorAlgorithm.repeatMod.RepeatIterator[T] {
    /**
      * Construct a new repeat iterator.
      *
      * @param value - The value to repeat.
      *
      * @param count - The number of times to repeat the value.
      */
    def this(value: T, count: Double) = this()
  }
  
  @js.native
  class RetroArrayIterator[T] protected ()
    extends typings.phosphorAlgorithm.retroMod.RetroArrayIterator[T] {
    /**
      * Construct a new retro iterator.
      *
      * @param source - The array-like object of interest.
      */
    def this(source: ArrayLike[T]) = this()
  }
  
  @js.native
  class StrideIterator[T] protected ()
    extends typings.phosphorAlgorithm.strideMod.StrideIterator[T] {
    /**
      * Construct a new stride iterator.
      *
      * @param source - The iterator of values of interest.
      *
      * @param step - The distance to step on each iteration. A value
      *   of less than `1` will behave the same as a value of `1`.
      */
    def this(source: IIterator[T], step: Double) = this()
  }
  
  @js.native
  class TakeIterator[T] protected ()
    extends typings.phosphorAlgorithm.takeMod.TakeIterator[T] {
    /**
      * Construct a new take iterator.
      *
      * @param source - The iterator of interest.
      *
      * @param count - The number of items to take from the source.
      */
    def this(source: IIterator[T], count: Double) = this()
  }
  
  @js.native
  class ValueIterator[T] protected ()
    extends typings.phosphorAlgorithm.iterMod.ValueIterator[T] {
    /**
      * Construct a new value iterator.
      *
      * @param source - The object of interest.
      *
      * @param keys - The keys to iterate, if known.
      */
    def this(source: StringDictionary[T]) = this()
    def this(source: StringDictionary[T], keys: js.Array[String]) = this()
  }
  
  @js.native
  class ZipIterator[T] protected ()
    extends typings.phosphorAlgorithm.zipMod.ZipIterator[T] {
    /**
      * Construct a new zip iterator.
      *
      * @param source - The iterators of interest.
      */
    def this(source: js.Array[IIterator[T]]) = this()
  }
  
  def chain[T](objects: IterableOrArrayLike[T]*): IIterator[T] = js.native
  def each[T](
    `object`: IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ Double, Boolean | Unit]
  ): Unit = js.native
  def empty[T](): IIterator[T] = js.native
  def enumerate[T](`object`: IterableOrArrayLike[T]): IIterator[js.Tuple2[Double, T]] = js.native
  def enumerate[T](`object`: IterableOrArrayLike[T], start: Double): IIterator[js.Tuple2[Double, T]] = js.native
  def every[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Boolean = js.native
  def filter[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): IIterator[T] = js.native
  def find[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
  def findIndex[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Double = js.native
  def iter[T](`object`: IterableOrArrayLike[T]): IIterator[T] = js.native
  def iterFn[T](fn: js.Function0[js.UndefOr[T]]): IIterator[T] = js.native
  def iterItems[T](`object`: StringDictionary[T]): IIterator[js.Tuple2[String, T]] = js.native
  def iterKeys[T](`object`: StringDictionary[T]): IIterator[String] = js.native
  def iterValues[T](`object`: StringDictionary[T]): IIterator[T] = js.native
  def map[T, U](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, U]): IIterator[U] = js.native
  def max[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[T] = js.native
  def min[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[T] = js.native
  def minmax[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[js.Tuple2[T, T]] = js.native
  def once[T](value: T): IIterator[T] = js.native
  def range(start: Double): IIterator[Double] = js.native
  def range(start: Double, stop: Double): IIterator[Double] = js.native
  def range(start: Double, stop: Double, step: Double): IIterator[Double] = js.native
  def reduce[T](
    `object`: IterableOrArrayLike[T],
    fn: js.Function3[/* accumulator */ T, /* value */ T, /* index */ Double, T]
  ): T = js.native
  def reduce[T, U](
    `object`: IterableOrArrayLike[T],
    fn: js.Function3[/* accumulator */ U, /* value */ T, /* index */ Double, U],
    initial: U
  ): U = js.native
  def repeat[T](value: T, count: Double): IIterator[T] = js.native
  def retro[T](`object`: RetroableOrArrayLike[T]): IIterator[T] = js.native
  def some[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Boolean = js.native
  def stride[T](`object`: IterableOrArrayLike[T], step: Double): IIterator[T] = js.native
  def take[T](`object`: IterableOrArrayLike[T], count: Double): IIterator[T] = js.native
  def toArray[T](`object`: IterableOrArrayLike[T]): js.Array[T] = js.native
  def toObject[T](`object`: IterableOrArrayLike[js.Tuple2[String, T]]): StringDictionary[T] = js.native
  def topologicSort[T](edges: IterableOrArrayLike[js.Tuple2[T, T]]): js.Array[T] = js.native
  def zip[T](objects: IterableOrArrayLike[T]*): IIterator[js.Array[T]] = js.native
  @js.native
  object ArrayExt extends js.Object {
    /**
      * Fill an array with a static value.
      *
      * @param array - The mutable array-like object to fill.
      *
      * @param value - The static value to use to fill the array.
      *
      * @param start - The index of the first element in the range to be
      *   filled, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   filled, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * #### Notes
      * If `stop < start` the fill will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or `stop` which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * let data = ['one', 'two', 'three', 'four'];
      * ArrayExt.fill(data, 'r');        // ['r', 'r', 'r', 'r']
      * ArrayExt.fill(data, 'g', 1);     // ['r', 'g', 'g', 'g']
      * ArrayExt.fill(data, 'b', 2, 3);  // ['r', 'g', 'b', 'b']
      * ArrayExt.fill(data, 'z', 3, 1);  // ['z', 'z', 'b', 'z']
      * ```
      */
    def fill[T](array: MutableArrayLike[T], value: T): Unit = js.native
    def fill[T](array: MutableArrayLike[T], value: T, start: Double): Unit = js.native
    def fill[T](array: MutableArrayLike[T], value: T, start: Double, stop: Double): Unit = js.native
    /**
      * Find the index of the first value which matches a predicate.
      *
      * @param array - The array-like object to search.
      *
      * @param fn - The predicate function to apply to the values.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the first matching value, or `-1` if no
      *   matching value is found.
      *
      * #### Notes
      * If `stop < start` the search will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or `stop` which is non-integral.
      *
      * Modifying the length of the array while searching.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * function isEven(value: number): boolean {
      *   return value % 2 === 0;
      * }
      *
      * let data = [1, 2, 3, 4, 3, 2, 1];
      * ArrayExt.findFirstIndex(data, isEven);       // 1
      * ArrayExt.findFirstIndex(data, isEven, 4);    // 5
      * ArrayExt.findFirstIndex(data, isEven, 6);    // -1
      * ArrayExt.findFirstIndex(data, isEven, 6, 5); // 1
      * ```
      */
    def findFirstIndex[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Double = js.native
    def findFirstIndex[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): Double = js.native
    def findFirstIndex[T](
      array: ArrayLike[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Double,
      stop: Double
    ): Double = js.native
    /**
      * Find the first value which matches a predicate.
      *
      * @param array - The array-like object to search.
      *
      * @param fn - The predicate function to apply to the values.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The first matching value, or `undefined` if no matching
      *   value is found.
      *
      * #### Notes
      * If `stop < start` the search will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or `stop` which is non-integral.
      *
      * Modifying the length of the array while searching.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * function isEven(value: number): boolean {
      *   return value % 2 === 0;
      * }
      *
      * let data = [1, 2, 3, 4, 3, 2, 1];
      * ArrayExt.findFirstValue(data, isEven);       // 2
      * ArrayExt.findFirstValue(data, isEven, 2);    // 4
      * ArrayExt.findFirstValue(data, isEven, 6);    // undefined
      * ArrayExt.findFirstValue(data, isEven, 6, 5); // 2
      * ```
      */
    def findFirstValue[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
    def findFirstValue[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): js.UndefOr[T] = js.native
    def findFirstValue[T](
      array: ArrayLike[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Double,
      stop: Double
    ): js.UndefOr[T] = js.native
    /**
      * Find the index of the last value which matches a predicate.
      *
      * @param object - The array-like object to search.
      *
      * @param fn - The predicate function to apply to the values.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the last matching value, or `-1` if no
      *   matching value is found.
      *
      * #### Notes
      * If `start < stop` the search will wrap at the front of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or `stop` which is non-integral.
      *
      * Modifying the length of the array while searching.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * function isEven(value: number): boolean {
      *   return value % 2 === 0;
      * }
      *
      * let data = [1, 2, 3, 4, 3, 2, 1];
      * ArrayExt.findLastIndex(data, isEven);        // 5
      * ArrayExt.findLastIndex(data, isEven, 4);     // 3
      * ArrayExt.findLastIndex(data, isEven, 0);     // -1
      * ArrayExt.findLastIndex(data, isEven, 0, 1);  // 5
      * ```
      */
    def findLastIndex[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Double = js.native
    def findLastIndex[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): Double = js.native
    def findLastIndex[T](
      array: ArrayLike[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Double,
      stop: Double
    ): Double = js.native
    /**
      * Find the last value which matches a predicate.
      *
      * @param object - The array-like object to search.
      *
      * @param fn - The predicate function to apply to the values.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The last matching value, or `undefined` if no matching
      *   value is found.
      *
      * #### Notes
      * If `start < stop` the search will wrap at the front of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or `stop` which is non-integral.
      *
      * Modifying the length of the array while searching.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * function isEven(value: number): boolean {
      *   return value % 2 === 0;
      * }
      *
      * let data = [1, 2, 3, 4, 3, 2, 1];
      * ArrayExt.findLastValue(data, isEven);        // 2
      * ArrayExt.findLastValue(data, isEven, 4);     // 4
      * ArrayExt.findLastValue(data, isEven, 0);     // undefined
      * ArrayExt.findLastValue(data, isEven, 0, 1);  // 2
      * ```
      */
    def findLastValue[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
    def findLastValue[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): js.UndefOr[T] = js.native
    def findLastValue[T](
      array: ArrayLike[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Double,
      stop: Double
    ): js.UndefOr[T] = js.native
    /**
      * Find the index of the first occurrence of a value in an array.
      *
      * @param array - The array-like object to search.
      *
      * @param value - The value to locate in the array. Values are
      *   compared using strict `===` equality.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the first occurrence of the value, or `-1`
      *   if the value is not found.
      *
      * #### Notes
      * If `stop < start` the search will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or `stop` which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * let data = ['one', 'two', 'three', 'four', 'one'];
      * ArrayExt.firstIndexOf(data, 'red');        // -1
      * ArrayExt.firstIndexOf(data, 'one');        // 0
      * ArrayExt.firstIndexOf(data, 'one', 1);     // 4
      * ArrayExt.firstIndexOf(data, 'two', 2);     // -1
      * ArrayExt.firstIndexOf(data, 'two', 2, 1);  // 1
      * ```
      */
    def firstIndexOf[T](array: ArrayLike[T], value: T): Double = js.native
    def firstIndexOf[T](array: ArrayLike[T], value: T, start: Double): Double = js.native
    def firstIndexOf[T](array: ArrayLike[T], value: T, start: Double, stop: Double): Double = js.native
    /**
      * Insert a value into an array at a specific index.
      *
      * @param array - The array of interest.
      *
      * @param index - The index at which to insert the value. Negative
      *   values are taken as an offset from the end of the array.
      *
      * @param value - The value to set at the specified index.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * let data = [0, 1, 2];
      * ArrayExt.insert(data, 0, -1);  // [-1, 0, 1, 2]
      * ArrayExt.insert(data, 2, 12);  // [-1, 0, 12, 1, 2]
      * ArrayExt.insert(data, -1, 7);  // [-1, 0, 12, 1, 7, 2]
      * ArrayExt.insert(data, 6, 19);  // [-1, 0, 12, 1, 7, 2, 19]
      * ```
      */
    def insert[T](array: js.Array[T], index: Double, value: T): Unit = js.native
    /**
      * Find the index of the last occurrence of a value in an array.
      *
      * @param array - The array-like object to search.
      *
      * @param value - The value to locate in the array. Values are
      *   compared using strict `===` equality.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the last occurrence of the value, or `-1`
      *   if the value is not found.
      *
      * #### Notes
      * If `start < stop` the search will wrap at the front of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or `stop` which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * let data = ['one', 'two', 'three', 'four', 'one'];
      * ArrayExt.lastIndexOf(data, 'red');        // -1
      * ArrayExt.lastIndexOf(data, 'one');        // 4
      * ArrayExt.lastIndexOf(data, 'one', 1);     // 0
      * ArrayExt.lastIndexOf(data, 'two', 0);     // -1
      * ArrayExt.lastIndexOf(data, 'two', 0, 1);  // 1
      * ```
      */
    def lastIndexOf[T](array: ArrayLike[T], value: T): Double = js.native
    def lastIndexOf[T](array: ArrayLike[T], value: T, start: Double): Double = js.native
    def lastIndexOf[T](array: ArrayLike[T], value: T, start: Double, stop: Double): Double = js.native
    /**
      * Find the index of the first element which compares `>=` to a value.
      *
      * @param array - The sorted array-like object to search.
      *
      * @param value - The value to locate in the array.
      *
      * @param fn - The 3-way comparison function to apply to the values.
      *   It should return `< 0` if an element is less than a value, `0` if
      *   an element is equal to a value, or `> 0` if an element is greater
      *   than a value.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the first element which compares `>=` to the
      *   value, or `length` if there is no such element. If the computed
      *   index for `stop` is less than `start`, then the computed index
      *   for `start` is returned.
      *
      * #### Notes
      * The array must already be sorted in ascending order according to
      * the comparison function.
      *
      * #### Complexity
      * Logarithmic.
      *
      * #### Undefined Behavior
      * Searching a range which is not sorted in ascending order.
      *
      * A `start` or `stop` which is non-integral.
      *
      * Modifying the length of the array while searching.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * function numberCmp(a: number, b: number): number {
      *   return a - b;
      * }
      *
      * let data = [0, 3, 4, 7, 7, 9];
      * ArrayExt.lowerBound(data, 0, numberCmp);   // 0
      * ArrayExt.lowerBound(data, 6, numberCmp);   // 3
      * ArrayExt.lowerBound(data, 7, numberCmp);   // 3
      * ArrayExt.lowerBound(data, -1, numberCmp);  // 0
      * ArrayExt.lowerBound(data, 10, numberCmp);  // 6
      * ```
      */
    def lowerBound[T, U](array: ArrayLike[T], value: U, fn: js.Function2[/* element */ T, /* value */ U, Double]): Double = js.native
    def lowerBound[T, U](
      array: ArrayLike[T],
      value: U,
      fn: js.Function2[/* element */ T, /* value */ U, Double],
      start: Double
    ): Double = js.native
    def lowerBound[T, U](
      array: ArrayLike[T],
      value: U,
      fn: js.Function2[/* element */ T, /* value */ U, Double],
      start: Double,
      stop: Double
    ): Double = js.native
    /**
      * Move an element in an array from one index to another.
      *
      * @param array - The mutable array-like object of interest.
      *
      * @param fromIndex - The index of the element to move. Negative
      *   values are taken as an offset from the end of the array.
      *
      * @param toIndex - The target index of the element. Negative
      *   values are taken as an offset from the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `fromIndex` or `toIndex` which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from from '@phosphor/algorithm';
      *
      * let data = [0, 1, 2, 3, 4];
      * ArrayExt.move(data, 1, 2);  // [0, 2, 1, 3, 4]
      * ArrayExt.move(data, 4, 2);  // [0, 2, 4, 1, 3]
      * ```
      */
    def move[T](array: MutableArrayLike[T], fromIndex: Double, toIndex: Double): Unit = js.native
    /**
      * Remove all occurrences of a value from an array.
      *
      * @param array - The array of interest.
      *
      * @param value - The value to remove from the array. Values are
      *   compared using strict `===` equality.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The number of elements removed from the array.
      *
      * #### Notes
      * If `stop < start` the search will conceptually wrap at the end of
      * the array, however the array will be traversed front-to-back.
      *
      * #### Complexity
      * Linear.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * let data = [14, 12, 23, 39, 14, 12, 19, 14];
      * ArrayExt.removeAllOf(data, 12);        // 2
      * ArrayExt.removeAllOf(data, 17);        // 0
      * ArrayExt.removeAllOf(data, 14, 1, 4);  // 1
      * ```
      */
    def removeAllOf[T](array: js.Array[T], value: T): Double = js.native
    def removeAllOf[T](array: js.Array[T], value: T, start: Double): Double = js.native
    def removeAllOf[T](array: js.Array[T], value: T, start: Double, stop: Double): Double = js.native
    /**
      * Remove all occurrences of values which match a predicate.
      *
      * @param array - The array of interest.
      *
      * @param fn - The predicate function to apply to the values.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The number of elements removed from the array.
      *
      * #### Notes
      * If `stop < start` the search will conceptually wrap at the end of
      * the array, however the array will be traversed front-to-back.
      *
      * #### Complexity
      * Linear.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * function isEven(value: number): boolean {
      *   return value % 2 === 0;
      * }
      *
      * function isNegative(value: number): boolean {
      *   return value < 0;
      * }
      *
      * let data = [0, 12, -13, -9, 23, 39, 14, -15, 12, 75];
      * ArrayExt.removeAllWhere(data, isEven);            // 4
      * ArrayExt.removeAllWhere(data, isNegative, 0, 3);  // 2
      * ```
      */
    def removeAllWhere[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Double = js.native
    def removeAllWhere[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): Double = js.native
    def removeAllWhere[T](
      array: js.Array[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Double,
      stop: Double
    ): Double = js.native
    /**
      * Remove and return a value at a specific index in an array.
      *
      * @param array - The array of interest.
      *
      * @param index - The index of the value to remove. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The value at the specified index, or `undefined` if the
      *   index is out of range.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * let data = [0, 12, 23, 39, 14, 12, 75];
      * ArrayExt.removeAt(data, 2);   // 23
      * ArrayExt.removeAt(data, -2);  // 12
      * ArrayExt.removeAt(data, 10);  // undefined;
      * ```
      */
    def removeAt[T](array: js.Array[T], index: Double): js.UndefOr[T] = js.native
    /**
      * Remove the first occurrence of a value from an array.
      *
      * @param array - The array of interest.
      *
      * @param value - The value to remove from the array. Values are
      *   compared using strict `===` equality.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the removed value, or `-1` if the value
      *   is not contained in the array.
      *
      * #### Notes
      * If `stop < start` the search will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * let data = [0, 12, 23, 39, 14, 12, 75];
      * ArrayExt.removeFirstOf(data, 12);        // 1
      * ArrayExt.removeFirstOf(data, 17);        // -1
      * ArrayExt.removeFirstOf(data, 39, 3);     // -1
      * ArrayExt.removeFirstOf(data, 39, 3, 2);  // 2
      * ```
      */
    def removeFirstOf[T](array: js.Array[T], value: T): Double = js.native
    def removeFirstOf[T](array: js.Array[T], value: T, start: Double): Double = js.native
    def removeFirstOf[T](array: js.Array[T], value: T, start: Double, stop: Double): Double = js.native
    /**
      * Remove the first occurrence of a value which matches a predicate.
      *
      * @param array - The array of interest.
      *
      * @param fn - The predicate function to apply to the values.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The removed `{ index, value }`, which will be `-1` and
      *   `undefined` if the value is not contained in the array.
      *
      * #### Notes
      * If `stop < start` the search will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * function isEven(value: number): boolean {
      *   return value % 2 === 0;
      * }
      *
      * let data = [0, 12, 23, 39, 14, 12, 75];
      * ArrayExt.removeFirstWhere(data, isEven);     // { index: 0, value: 0 }
      * ArrayExt.removeFirstWhere(data, isEven, 2);  // { index: 3, value: 14 }
      * ArrayExt.removeFirstWhere(data, isEven, 4);  // { index: -1, value: undefined }
      * ```
      */
    def removeFirstWhere[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): AnonIndex[T] = js.native
    def removeFirstWhere[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): AnonIndex[T] = js.native
    def removeFirstWhere[T](
      array: js.Array[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Double,
      stop: Double
    ): AnonIndex[T] = js.native
    /**
      * Remove the last occurrence of a value from an array.
      *
      * @param array - The array of interest.
      *
      * @param value - The value to remove from the array. Values are
      *   compared using strict `===` equality.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the removed value, or `-1` if the value
      *   is not contained in the array.
      *
      * #### Notes
      * If `start < stop` the search will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * let data = [0, 12, 23, 39, 14, 12, 75];
      * ArrayExt.removeLastOf(data, 12);        // 5
      * ArrayExt.removeLastOf(data, 17);        // -1
      * ArrayExt.removeLastOf(data, 39, 2);     // -1
      * ArrayExt.removeLastOf(data, 39, 2, 3);  // 3
      * ```
      */
    def removeLastOf[T](array: js.Array[T], value: T): Double = js.native
    def removeLastOf[T](array: js.Array[T], value: T, start: Double): Double = js.native
    def removeLastOf[T](array: js.Array[T], value: T, start: Double, stop: Double): Double = js.native
    /**
      * Remove the last occurrence of a value which matches a predicate.
      *
      * @param array - The array of interest.
      *
      * @param fn - The predicate function to apply to the values.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The removed `{ index, value }`, which will be `-1` and
      *   `undefined` if the value is not contained in the array.
      *
      * #### Notes
      * If `start < stop` the search will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * function isEven(value: number): boolean {
      *   return value % 2 === 0;
      * }
      *
      * let data = [0, 12, 23, 39, 14, 12, 75];
      * ArrayExt.removeLastWhere(data, isEven);        // { index: 5, value: 12 }
      * ArrayExt.removeLastWhere(data, isEven, 2);     // { index: 1, value: 12 }
      * ArrayExt.removeLastWhere(data, isEven, 2, 1);  // { index: -1, value: undefined }
      * ```
      */
    def removeLastWhere[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): AnonIndex[T] = js.native
    def removeLastWhere[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): AnonIndex[T] = js.native
    def removeLastWhere[T](
      array: js.Array[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Double,
      stop: Double
    ): AnonIndex[T] = js.native
    /**
      * Reverse an array in-place.
      *
      * @param array - The mutable array-like object of interest.
      *
      * @param start - The index of the first element in the range to be
      *   reversed, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   reversed, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or  `stop` index which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * let data = [0, 1, 2, 3, 4];
      * ArrayExt.reverse(data, 1, 3);  // [0, 3, 2, 1, 4]
      * ArrayExt.reverse(data, 3);     // [0, 3, 2, 4, 1]
      * ArrayExt.reverse(data);        // [1, 4, 2, 3, 0]
      * ```
      */
    def reverse[T](array: MutableArrayLike[T]): Unit = js.native
    def reverse[T](array: MutableArrayLike[T], start: Double): Unit = js.native
    def reverse[T](array: MutableArrayLike[T], start: Double, stop: Double): Unit = js.native
    /**
      * Rotate the elements of an array in-place.
      *
      * @param array - The mutable array-like object of interest.
      *
      * @param delta - The amount of rotation to apply to the elements. A
      *   positive value will rotate the elements to the left. A negative
      *   value will rotate the elements to the right.
      *
      * @param start - The index of the first element in the range to be
      *   rotated, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   rotated, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `delta`, `start`, or `stop` which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * let data = [0, 1, 2, 3, 4];
      * ArrayExt.rotate(data, 2);        // [2, 3, 4, 0, 1]
      * ArrayExt.rotate(data, -2);       // [0, 1, 2, 3, 4]
      * ArrayExt.rotate(data, 10);       // [0, 1, 2, 3, 4]
      * ArrayExt.rotate(data, 9);        // [4, 0, 1, 2, 3]
      * ArrayExt.rotate(data, 2, 1, 3);  // [4, 2, 0, 1, 3]
      * ```
      */
    def rotate[T](array: MutableArrayLike[T], delta: Double): Unit = js.native
    def rotate[T](array: MutableArrayLike[T], delta: Double, start: Double): Unit = js.native
    def rotate[T](array: MutableArrayLike[T], delta: Double, start: Double, stop: Double): Unit = js.native
    /**
      * Test whether two arrays are shallowly equal.
      *
      * @param a - The first array-like object to compare.
      *
      * @param b - The second array-like object to compare.
      *
      * @param fn - The comparison function to apply to the elements. It
      *   should return `true` if the elements are "equal". The default
      *   compares elements using strict `===` equality.
      *
      * @returns Whether the two arrays are shallowly equal.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * Modifying the length of the arrays while comparing.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * let d1 = [0, 3, 4, 7, 7, 9];
      * let d2 = [0, 3, 4, 7, 7, 9];
      * let d3 = [42];
      * ArrayExt.shallowEqual(d1, d2);  // true
      * ArrayExt.shallowEqual(d2, d3);  // false
      * ```
      */
    def shallowEqual[T](a: ArrayLike[T], b: ArrayLike[T]): Boolean = js.native
    def shallowEqual[T](a: ArrayLike[T], b: ArrayLike[T], fn: js.Function2[/* a */ T, /* b */ T, Boolean]): Boolean = js.native
    /**
      * Find the index of the first element which compares `>` than a value.
      *
      * @param array - The sorted array-like object to search.
      *
      * @param value - The value to locate in the array.
      *
      * @param fn - The 3-way comparison function to apply to the values.
      *   It should return `< 0` if an element is less than a value, `0` if
      *   an element is equal to a value, or `> 0` if an element is greater
      *   than a value.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the first element which compares `>` than the
      *   value, or `length` if there is no such element. If the computed
      *   index for `stop` is less than `start`, then the computed index
      *   for `start` is returned.
      *
      * #### Notes
      * The array must already be sorted in ascending order according to
      * the comparison function.
      *
      * #### Complexity
      * Logarithmic.
      *
      * #### Undefined Behavior
      * Searching a range which is not sorted in ascending order.
      *
      * A `start` or `stop` which is non-integral.
      *
      * Modifying the length of the array while searching.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@phosphor/algorithm';
      *
      * function numberCmp(a: number, b: number): number {
      *   return a - b;
      * }
      *
      * let data = [0, 3, 4, 7, 7, 9];
      * ArrayExt.upperBound(data, 0, numberCmp);   // 1
      * ArrayExt.upperBound(data, 6, numberCmp);   // 3
      * ArrayExt.upperBound(data, 7, numberCmp);   // 5
      * ArrayExt.upperBound(data, -1, numberCmp);  // 0
      * ArrayExt.upperBound(data, 10, numberCmp);  // 6
      * ```
      */
    def upperBound[T, U](array: ArrayLike[T], value: U, fn: js.Function2[/* element */ T, /* value */ U, Double]): Double = js.native
    def upperBound[T, U](
      array: ArrayLike[T],
      value: U,
      fn: js.Function2[/* element */ T, /* value */ U, Double],
      start: Double
    ): Double = js.native
    def upperBound[T, U](
      array: ArrayLike[T],
      value: U,
      fn: js.Function2[/* element */ T, /* value */ U, Double],
      start: Double,
      stop: Double
    ): Double = js.native
    /**
      * The namespace for the `slice` function statics.
      */
    @js.native
    object slice extends js.Object {
      /**
        * Create a slice of an array subject to an optional step.
        *
        * @param array - The array-like object of interest.
        *
        * @param options - The options for configuring the slice.
        *
        * @returns A new array with the specified values.
        *
        * @throws An exception if the slice `step` is `0`.
        *
        * #### Complexity
        * Linear.
        *
        * #### Undefined Behavior
        * A `start`, `stop`, or `step` which is non-integral.
        *
        * #### Example
        * ```typescript
        * import { ArrayExt } from '@phosphor/algorithm';
        *
        * let data = [0, 3, 4, 7, 7, 9];
        * ArrayExt.slice(data);                         // [0, 3, 4, 7, 7, 9]
        * ArrayExt.slice(data, { start: 2 });           // [4, 7, 7, 9]
        * ArrayExt.slice(data, { start: 0, stop: 4 });  // [0, 3, 4, 7]
        * ArrayExt.slice(data, { step: 2 });            // [0, 4, 7]
        * ArrayExt.slice(data, { step: -1 });           // [9, 7, 7, 4, 3, 0]
        * ```
        */
      def apply[T](array: ArrayLike[T]): js.Array[T] = js.native
      def apply[T](array: ArrayLike[T], options: IOptions): js.Array[T] = js.native
    }
    
  }
  
  @js.native
  object StringExt extends js.Object {
    /**
      * A 3-way string comparison function.
      *
      * @param a - The first string of interest.
      *
      * @param b - The second string of interest.
      *
      * @returns `-1` if `a < b`, else `1` if `a > b`, else `0`.
      */
    def cmp(a: String, b: String): Double = js.native
    /**
      * Find the indices of characters in a source text.
      *
      * @param source - The source text which should be searched.
      *
      * @param query - The characters to locate in the source text.
      *
      * @param start - The index to start the search.
      *
      * @returns The matched indices, or `null` if there is no match.
      *
      * #### Complexity
      * Linear on `sourceText`.
      *
      * #### Notes
      * In order for there to be a match, all of the characters in `query`
      * **must** appear in `source` in the order given by `query`.
      *
      * Characters are matched using strict `===` equality.
      */
    def findIndices(source: String, query: String): js.Array[Double] | Null = js.native
    def findIndices(source: String, query: String, start: Double): js.Array[Double] | Null = js.native
    /**
      * Highlight the matched characters of a source text.
      *
      * @param source - The text which should be highlighted.
      *
      * @param indices - The indices of the matched characters. They must
      *   appear in increasing order and must be in bounds of the source.
      *
      * @param fn - The function to apply to the matched chunks.
      *
      * @returns An array of unmatched and highlighted chunks.
      */
    def highlight[T](source: String, indices: js.Array[Double], fn: js.Function1[/* chunk */ String, T]): js.Array[String | T] = js.native
    /**
      * A string matcher which uses a sum-of-deltas algorithm.
      *
      * @param source - The source text which should be searched.
      *
      * @param query - The characters to locate in the source text.
      *
      * @param start - The index to start the search.
      *
      * @returns The match result, or `null` if there is no match.
      *   A lower `score` represents a stronger match.
      *
      * #### Complexity
      * Linear on `sourceText`.
      *
      * #### Notes
      * This scoring algorithm uses a sum-of-deltas approach to determine
      * the score. In order for there to be a match, all of the characters
      * in `query` **must** appear in `source` in order. The delta between
      * the indices are summed to create the score. This means that groups
      * of matched characters are preferred, while fragmented matches are
      * penalized.
      */
    def matchSumOfDeltas(source: String, query: String): IMatchResult | Null = js.native
    def matchSumOfDeltas(source: String, query: String, start: Double): IMatchResult | Null = js.native
    /**
      * A string matcher which uses a sum-of-squares algorithm.
      *
      * @param source - The source text which should be searched.
      *
      * @param query - The characters to locate in the source text.
      *
      * @param start - The index to start the search.
      *
      * @returns The match result, or `null` if there is no match.
      *   A lower `score` represents a stronger match.
      *
      * #### Complexity
      * Linear on `sourceText`.
      *
      * #### Notes
      * This scoring algorithm uses a sum-of-squares approach to determine
      * the score. In order for there to be a match, all of the characters
      * in `query` **must** appear in `source` in order. The index of each
      * matching character is squared and added to the score. This means
      * that early and consecutive character matches are preferred, while
      * late matches are heavily penalized.
      */
    def matchSumOfSquares(source: String, query: String): IMatchResult | Null = js.native
    def matchSumOfSquares(source: String, query: String, start: Double): IMatchResult | Null = js.native
  }
  
}

