package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("ol/math", "clamp")
  @js.native
  def clamp(value: Double, min: Double, max: Double): Double = js.native
  
  @JSImport("ol/math", "cosh")
  @js.native
  def cosh(x: Double): Double = js.native
  
  @JSImport("ol/math", "lerp")
  @js.native
  def lerp(a: Double, b: Double, x: Double): Double = js.native
  
  @JSImport("ol/math", "log2")
  @js.native
  def log2(x: Double): Double = js.native
  
  @JSImport("ol/math", "modulo")
  @js.native
  def modulo(a: Double, b: Double): Double = js.native
  
  @JSImport("ol/math", "solveLinearSystem")
  @js.native
  def solveLinearSystem(mat: js.Array[js.Array[Double]]): js.Array[Double] = js.native
  
  @JSImport("ol/math", "squaredDistance")
  @js.native
  def squaredDistance(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  
  @JSImport("ol/math", "squaredSegmentDistance")
  @js.native
  def squaredSegmentDistance(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  
  @JSImport("ol/math", "toDegrees")
  @js.native
  def toDegrees(angleInRadians: Double): Double = js.native
  
  @JSImport("ol/math", "toRadians")
  @js.native
  def toRadians(angleInDegrees: Double): Double = js.native
}
