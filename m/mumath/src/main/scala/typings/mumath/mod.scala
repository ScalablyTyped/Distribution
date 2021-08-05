package typings.mumath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mumath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clamp(value: Double, left: Double, right: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def closest(value: Double, list: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(value.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isMultiple(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMultiple")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMultiple(a: Double, b: Double, eps: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMultiple")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], eps.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def len(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("len")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def lerp(x: Double, y: Double, ratio: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def mod(value: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def mod(value: Double, max: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def order(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("order")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def precision(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("precision")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def round(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def round(value: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def scale(value: Double, list: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(value.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def within(value: Double, left: Double, right: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(value.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
}
