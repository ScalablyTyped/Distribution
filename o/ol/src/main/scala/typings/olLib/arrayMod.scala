package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/array", JSImport.Namespace)
@js.native
object arrayMod extends js.Object {
  def binarySearch(haystack: js.Array[_], needle: js.Any): scala.Double = js.native
  def binarySearch(haystack: js.Array[_], needle: js.Any, opt_comparator: js.Function0[scala.Unit]): scala.Double = js.native
  def equals(arr1: js.Array[_], arr2: js.Array[_]): scala.Boolean = js.native
  def equals(arr1: js.Array[_], arr2: stdLib.Uint8ClampedArray): scala.Boolean = js.native
  def equals(arr1: stdLib.Uint8ClampedArray, arr2: js.Array[_]): scala.Boolean = js.native
  def equals(arr1: stdLib.Uint8ClampedArray, arr2: stdLib.Uint8ClampedArray): scala.Boolean = js.native
  def extend[VALUE](arr: js.Array[VALUE], data: VALUE): scala.Unit = js.native
  def extend[VALUE](arr: js.Array[VALUE], data: js.Array[VALUE]): scala.Unit = js.native
  def find[VALUE](arr: js.Array[VALUE], func: js.Function0[scala.Unit]): VALUE = js.native
  def findIndex(arr: js.Array[_], func: js.Function0[scala.Unit]): scala.Double = js.native
  def includes(arr: js.Array[_], obj: js.Any): scala.Boolean = js.native
  def isSorted(arr: js.Array[_]): scala.Boolean = js.native
  def isSorted(arr: js.Array[_], opt_func: js.Function0[scala.Unit]): scala.Boolean = js.native
  def isSorted(arr: js.Array[_], opt_func: js.Function0[scala.Unit], opt_strict: scala.Boolean): scala.Boolean = js.native
  def linearFindNearest(arr: js.Array[scala.Double], target: scala.Double, direction: scala.Double): scala.Double = js.native
  def numberSafeCompareFunction(a: js.Any, b: js.Any): scala.Double = js.native
  def remove[VALUE](arr: js.Array[VALUE], obj: VALUE): scala.Boolean = js.native
  def reverseSubArray(arr: js.Array[_], begin: scala.Double, end: scala.Double): scala.Unit = js.native
  def stableSort(arr: js.Array[_], compareFnc: js.Function0[scala.Unit]): scala.Unit = js.native
}

