package typings.ol

import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("ol/array", "binarySearch")
  @js.native
  def binarySearch(haystack: js.Array[_], needle: js.Any): Double = js.native
  @JSImport("ol/array", "binarySearch")
  @js.native
  def binarySearch(haystack: js.Array[_], needle: js.Any, opt_comparator: js.Function0[Unit]): Double = js.native
  
  @JSImport("ol/array", "equals")
  @js.native
  def equals_(arr1: js.Array[_], arr2: js.Array[_]): Boolean = js.native
  @JSImport("ol/array", "equals")
  @js.native
  def equals_(arr1: js.Array[_], arr2: Uint8ClampedArray): Boolean = js.native
  @JSImport("ol/array", "equals")
  @js.native
  def equals_(arr1: Uint8ClampedArray, arr2: js.Array[_]): Boolean = js.native
  @JSImport("ol/array", "equals")
  @js.native
  def equals_(arr1: Uint8ClampedArray, arr2: Uint8ClampedArray): Boolean = js.native
  
  @JSImport("ol/array", "extend")
  @js.native
  def extend[VALUE](arr: js.Array[VALUE], data: VALUE): Unit = js.native
  @JSImport("ol/array", "extend")
  @js.native
  def extend[VALUE](arr: js.Array[VALUE], data: js.Array[VALUE]): Unit = js.native
  
  @JSImport("ol/array", "find")
  @js.native
  def find[VALUE](
    arr: js.Array[VALUE],
    func: js.Function3[/* p0 */ VALUE, /* p1 */ Double, /* p2 */ js.Any, Boolean]
  ): VALUE | Null = js.native
  
  @JSImport("ol/array", "findIndex")
  @js.native
  def findIndex(arr: js.Array[_], func: js.Function0[Unit]): Double = js.native
  
  @JSImport("ol/array", "includes")
  @js.native
  def includes(arr: js.Array[_], obj: js.Any): Boolean = js.native
  
  @JSImport("ol/array", "isSorted")
  @js.native
  def isSorted(arr: js.Array[_]): Boolean = js.native
  @JSImport("ol/array", "isSorted")
  @js.native
  def isSorted(arr: js.Array[_], opt_func: js.UndefOr[scala.Nothing], opt_strict: Boolean): Boolean = js.native
  @JSImport("ol/array", "isSorted")
  @js.native
  def isSorted(arr: js.Array[_], opt_func: js.Function0[Unit]): Boolean = js.native
  @JSImport("ol/array", "isSorted")
  @js.native
  def isSorted(arr: js.Array[_], opt_func: js.Function0[Unit], opt_strict: Boolean): Boolean = js.native
  
  @JSImport("ol/array", "linearFindNearest")
  @js.native
  def linearFindNearest(arr: js.Array[Double], target: Double, direction: Double): Double = js.native
  
  @JSImport("ol/array", "numberSafeCompareFunction")
  @js.native
  def numberSafeCompareFunction(a: js.Any, b: js.Any): Double = js.native
  
  @JSImport("ol/array", "remove")
  @js.native
  def remove[VALUE](arr: js.Array[VALUE], obj: VALUE): Boolean = js.native
  
  @JSImport("ol/array", "reverseSubArray")
  @js.native
  def reverseSubArray(arr: js.Array[_], begin: Double, end: Double): Unit = js.native
  
  @JSImport("ol/array", "stableSort")
  @js.native
  def stableSort(arr: js.Array[_], compareFnc: js.Function2[/* p0 */ js.Any, /* p1 */ js.Any, Double]): Unit = js.native
}
