package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/arrayUtils", JSImport.Namespace)
@js.native
object buildSrcUtilsArrayUtilsMod extends js.Object {
  def add(aList: js.Array[scala.Double], bList: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def createFilledArray[T](value: T, count: scala.Double): js.Array[T] = js.native
  def createFilledArray[T](value: js.Function1[/* index */ js.UndefOr[scala.Double], T], count: scala.Double): js.Array[T] = js.native
  def flatten[T](a: js.Array[js.Array[T]]): js.Array[T] = js.native
  def uniq[T](arr: js.Array[T]): js.Array[T] = js.native
}

