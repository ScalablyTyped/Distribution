package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object math {
  
  @JSImport("playcanvas", "math")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("playcanvas", "math.DEG_TO_RAD")
  @js.native
  val DEG_TO_RAD: Double = js.native
  
  @JSImport("playcanvas", "math.RAD_TO_DEG")
  @js.native
  val RAD_TO_DEG: Double = js.native
  
  inline def between(num: Double, a: Double, b: Double, inclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(num.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def bytesToInt24(r: Double, g: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bytesToInt24")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def bytesToInt32(r: Double, g: Double, b: Double, a: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bytesToInt32")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def clamp(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def intToBytes24(i: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("intToBytes24")(i.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def intToBytes32(i: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("intToBytes32")(i.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def lerp(a: Double, b: Double, alpha: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def lerpAngle(a: Double, b: Double, alpha: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerpAngle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def nextPowerOfTwo(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextPowerOfTwo")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def powerOfTwo(x: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("powerOfTwo")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def random(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def roundUp(numToRound: Double, multiple: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("roundUp")(numToRound.asInstanceOf[js.Any], multiple.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def smootherstep(min: Double, max: Double, x: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("smootherstep")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def smoothstep(min: Double, max: Double, x: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("smoothstep")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
}
