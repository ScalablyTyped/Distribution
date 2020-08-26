package typings.nodeSass.mod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends Value {
  /**
    * Get the alpha transparency component of the color.
    * @returns number between 0 and 1 inclusive;
    */
  def getA(): Double = js.native
  /**
    * Get the blue component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def getB(): Double = js.native
  /**
    * Get the green component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def getG(): Double = js.native
  /**
    * Get the red component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def getR(): Double = js.native
  /**
    * Set the alpha component of the color.
    * @param a number between 0 and 1 inclusive;
    */
  def setA(a: Double): Unit = js.native
  /**
    * Set the blue component of the color.
    * @param b integer between 0 and 255 inclusive;
    */
  def setB(b: Double): Unit = js.native
  /**
    * Set the green component of the color.
    * @param g integer between 0 and 255 inclusive;
    */
  def setG(g: Double): Unit = js.native
  /**
    * Set the red component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def setR(r: Double): Unit = js.native
}

@JSImport("node-sass", "types.Color")
@js.native
object Color extends TopLevel[ColorConstructor]

