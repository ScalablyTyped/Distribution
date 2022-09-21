package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "MolangVariableMap")
@js.native
open class MolangVariableMap () extends StObject {
  
  /**
    * @remarks
    * Sets a Molang rendering/animation variable with the value of
    * a Red/Green/Blue color.
    * @param variableName
    * @param color
    */
  def setColorRGB(variableName: String, color: Color): MolangVariableMap = js.native
  
  /**
    * @remarks
    * Sets a Molang rendering/animation variable with the value of
    * a Red/Green/Blue color + Alpha (transparency) value.
    * @param variableName
    * @param color
    */
  def setColorRGBA(variableName: String, color: Color): MolangVariableMap = js.native
  
  /**
    * @remarks
    * Sets the speed and direction for a Molang (rendering and
    * animation) variable.
    * @param variableName
    * @param speed
    * @param direction
    */
  def setSpeedAndDirection(variableName: String, speed: Double, direction: Vector): MolangVariableMap = js.native
  
  /**
    * @remarks
    * Sets a vector value for a Molang (rendering and animation)
    * variable.
    * @param variableName
    * @param vector
    */
  def setVector3(variableName: String, vector: Vector): MolangVariableMap = js.native
}
