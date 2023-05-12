package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcArrayCreateMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/array/create", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def array[T](n: Double): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def array[T](n: Double, sample: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(n.asInstanceOf[js.Any], sample.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def arrayRangePartition[T](input: js.Array[T], length: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRangePartition")(input.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  inline def arrayRangePartition[T](input: js.Array[T], length: Double, fillRestWith: T): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRangePartition")(input.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fillRestWith.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  
  inline def asArray[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def asArray[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def fill[T](a: js.Array[T], length: Double, fillWith: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fillWith.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def fill[T](a: js.Array[T], length: Double, fillWith: T, before: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fillWith.asInstanceOf[js.Any], before.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def randomItems[T](a: js.Array[T], amount: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomItems")(a.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def seq(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("seq")().asInstanceOf[js.Array[Double]]
  inline def seq(start: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def seq(start: Double, step: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def seq(start: Double, step: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def seq(start: Double, step: Unit, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def seq(start: Unit, step: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def seq(start: Unit, step: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def seq(start: Unit, step: Unit, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(start.asInstanceOf[js.Any], step.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def shuffle[T](a: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
