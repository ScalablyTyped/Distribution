package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A light.
  *
  * @ignore
  */
@JSGlobal("pc.Light")
@js.native
open class Light protected ()
  extends typings.playcanvas.mod.Light {
  def this(graphicsDevice: Any) = this()
}
object Light {
  
  @JSGlobal("pc.Light")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get conversion factor for luminance -> light specific light unit.
    *
    * @param {number} type - The type of light.
    * @param {number} [outerAngle] - The outer angle of a spot light.
    * @param {number} [innerAngle] - The inner angle of a spot light.
    * @returns {number} The scaling factor to multiply with the luminance value.
    */
  /* static member */
  inline def getLightUnitConversion(`type`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLightUnitConversion")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getLightUnitConversion(`type`: Double, outerAngle: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLightUnitConversion")(`type`.asInstanceOf[js.Any], outerAngle.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getLightUnitConversion(`type`: Double, outerAngle: Double, innerAngle: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLightUnitConversion")(`type`.asInstanceOf[js.Any], outerAngle.asInstanceOf[js.Any], innerAngle.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getLightUnitConversion(`type`: Double, outerAngle: Unit, innerAngle: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLightUnitConversion")(`type`.asInstanceOf[js.Any], outerAngle.asInstanceOf[js.Any], innerAngle.asInstanceOf[js.Any])).asInstanceOf[Double]
}
