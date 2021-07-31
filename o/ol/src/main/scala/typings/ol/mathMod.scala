package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("ol/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clamp(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def cosh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def lerp(a: Double, b: Double, x: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def log2(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def modulo(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("modulo")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def solveLinearSystem(mat: js.Array[js.Array[Double]]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("solveLinearSystem")(mat.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def squaredDistance(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDistance")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def squaredSegmentDistance(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredSegmentDistance")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def toDegrees(angleInRadians: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDegrees")(angleInRadians.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def toRadians(angleInDegrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toRadians")(angleInDegrees.asInstanceOf[js.Any]).asInstanceOf[Double]
}
