package typings.nodeSass.mod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends Value {
  /**
    * Get the alpha transparency component of the color.
    * @returns number between 0 and 1 inclusive;
    */
  def getA(): Double
  /**
    * Get the blue component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def getB(): Double
  /**
    * Get the green component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def getG(): Double
  /**
    * Get the red component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def getR(): Double
  /**
    * Set the alpha component of the color.
    * @param a number between 0 and 1 inclusive;
    */
  def setA(a: Double): Unit
  /**
    * Set the blue component of the color.
    * @param b integer between 0 and 255 inclusive;
    */
  def setB(b: Double): Unit
  /**
    * Set the green component of the color.
    * @param g integer between 0 and 255 inclusive;
    */
  def setG(g: Double): Unit
  /**
    * Set the red component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def setR(r: Double): Unit
}

@JSImport("node-sass", "types.Color")
@js.native
object Color extends TopLevel[ColorConstructor]

