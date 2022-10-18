package typings.plottable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsArrayUtilsMod {
  
  @JSImport("plottable/build/src/utils/arrayUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(aList: js.Array[Double], bList: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(aList.asInstanceOf[js.Any], bList.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def createFilledArray[T](value: T, count: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilledArray")(value.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def createFilledArray[T](value: js.Function1[/* index */ js.UndefOr[Double], T], count: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilledArray")(value.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def flatten[T](a: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def uniq[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
