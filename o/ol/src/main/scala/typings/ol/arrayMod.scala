package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("ol/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ascending(a: Any, b: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ascending")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def binarySearch(haystack: js.Array[Any], needle: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def binarySearch(haystack: js.Array[Any], needle: Any, comparator: js.Function): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def equals_(arr1: js.Array[Any], arr2: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(arr1: js.Array[Any], arr2: js.typedarray.Uint8ClampedArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(arr1: js.typedarray.Uint8ClampedArray, arr2: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(arr1: js.typedarray.Uint8ClampedArray, arr2: js.typedarray.Uint8ClampedArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def extend[VALUE](arr: js.Array[VALUE], data: VALUE): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(arr.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def extend[VALUE](arr: js.Array[VALUE], data: js.Array[VALUE]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(arr.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isSorted(arr: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSorted")(arr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSorted(arr: js.Array[Any], func: js.Function): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSorted")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSorted(arr: js.Array[Any], func: js.Function, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSorted")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSorted(arr: js.Array[Any], func: Unit, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSorted")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def linearFindNearest(arr: js.Array[Double], target: Double, direction: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("linearFindNearest")(arr.asInstanceOf[js.Any], target.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def linearFindNearest(arr: js.Array[Double], target: Double, direction: NearestDirectionFunction): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("linearFindNearest")(arr.asInstanceOf[js.Any], target.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def remove[VALUE](arr: js.Array[VALUE], obj: VALUE): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(arr.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def reverseSubArray(arr: js.Array[Any], begin: Double, end: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseSubArray")(arr.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stableSort(arr: js.Array[Any], compareFnc: js.Function2[/* arg0 */ Any, /* arg1 */ Any, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stableSort")(arr.asInstanceOf[js.Any], compareFnc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type NearestDirectionFunction = js.Function3[/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double, Double]
}
