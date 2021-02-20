package typings.plottable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayUtilsMod {
  
  @JSImport("plottable/build/src/utils/arrayUtils", "add")
  @js.native
  def add(aList: js.Array[Double], bList: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("plottable/build/src/utils/arrayUtils", "createFilledArray")
  @js.native
  def createFilledArray[T](value: T, count: Double): js.Array[T] = js.native
  @JSImport("plottable/build/src/utils/arrayUtils", "createFilledArray")
  @js.native
  def createFilledArray[T](value: js.Function1[/* index */ js.UndefOr[Double], T], count: Double): js.Array[T] = js.native
  
  @JSImport("plottable/build/src/utils/arrayUtils", "flatten")
  @js.native
  def flatten[T](a: js.Array[js.Array[T]]): js.Array[T] = js.native
  
  @JSImport("plottable/build/src/utils/arrayUtils", "uniq")
  @js.native
  def uniq[T](arr: js.Array[T]): js.Array[T] = js.native
}
