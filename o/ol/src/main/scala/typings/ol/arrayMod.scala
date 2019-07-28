package typings.ol

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/array", JSImport.Namespace)
@js.native
object arrayMod extends js.Object {
  def binarySearch(haystack: js.Array[_], needle: js.Any): Double = js.native
  def binarySearch(haystack: js.Array[_], needle: js.Any, opt_comparator: js.Function0[Unit]): Double = js.native
  def equals(arr1: js.Array[_], arr2: js.Array[_]): Boolean = js.native
  def equals(arr1: js.Array[_], arr2: Uint8ClampedArray): Boolean = js.native
  def equals(arr1: Uint8ClampedArray, arr2: js.Array[_]): Boolean = js.native
  def equals(arr1: Uint8ClampedArray, arr2: Uint8ClampedArray): Boolean = js.native
  def extend[VALUE](arr: js.Array[VALUE], data: VALUE): Unit = js.native
  def extend[VALUE](arr: js.Array[VALUE], data: js.Array[VALUE]): Unit = js.native
  def find[VALUE](
    arr: js.Array[VALUE],
    func: js.Function3[/* p0 */ VALUE, /* p1 */ Double, /* p2 */ js.Any, Boolean]
  ): VALUE = js.native
  def findIndex(arr: js.Array[_], func: js.Function0[Unit]): Double = js.native
  def includes(arr: js.Array[_], obj: js.Any): Boolean = js.native
  def isSorted(arr: js.Array[_]): Boolean = js.native
  def isSorted(arr: js.Array[_], opt_func: js.Function0[Unit]): Boolean = js.native
  def isSorted(arr: js.Array[_], opt_func: js.Function0[Unit], opt_strict: Boolean): Boolean = js.native
  def linearFindNearest(arr: js.Array[Double], target: Double, direction: Double): Double = js.native
  def numberSafeCompareFunction(a: js.Any, b: js.Any): Double = js.native
  def remove[VALUE](arr: js.Array[VALUE], obj: VALUE): Boolean = js.native
  def reverseSubArray(arr: js.Array[_], begin: Double, end: Double): Unit = js.native
  def stableSort(arr: js.Array[_], compareFnc: js.Function0[Unit]): Unit = js.native
}

