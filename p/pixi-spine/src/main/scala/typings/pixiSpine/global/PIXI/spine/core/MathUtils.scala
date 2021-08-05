package typings.pixiSpine.global.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.MathUtils")
@js.native
class MathUtils ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.MathUtils
object MathUtils {
  
  @JSGlobal("PIXI.spine.core.MathUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.MathUtils.PI")
  @js.native
  def PI: Double = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.MathUtils.PI2")
  @js.native
  def PI2: Double = js.native
  inline def PI2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI2")(x.asInstanceOf[js.Any])
  
  inline def PI_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def cbrt(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cbrt")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def clamp(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def cosDeg(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cosDeg")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @JSGlobal("PIXI.spine.core.MathUtils.degRad")
  @js.native
  def degRad: Double = js.native
  inline def degRad_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("degRad")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.MathUtils.degreesToRadians")
  @js.native
  def degreesToRadians: Double = js.native
  inline def degreesToRadians_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("degreesToRadians")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.MathUtils.radDeg")
  @js.native
  def radDeg: Double = js.native
  inline def radDeg_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radDeg")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.MathUtils.radiansToDegrees")
  @js.native
  def radiansToDegrees: Double = js.native
  inline def radiansToDegrees_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radiansToDegrees")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def randomTriangular(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomTriangular")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def randomTriangularWith(min: Double, max: Double, mode: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomTriangularWith")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def signum(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("signum")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def sinDeg(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sinDeg")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def toInt(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toInt")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
}
