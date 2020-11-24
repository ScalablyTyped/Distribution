package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/utils/arrayUtils", JSImport.Namespace)
@js.native
object arrayUtilsMod extends js.Object {
  
  def add(aList: js.Array[Double], bList: js.Array[Double]): js.Array[Double] = js.native
  
  def createFilledArray[T](value: T, count: Double): js.Array[T] = js.native
  def createFilledArray[T](value: js.Function1[/* index */ js.UndefOr[Double], T], count: Double): js.Array[T] = js.native
  
  def flatten[T](a: js.Array[js.Array[T]]): js.Array[T] = js.native
  
  def uniq[T](arr: js.Array[T]): js.Array[T] = js.native
}
