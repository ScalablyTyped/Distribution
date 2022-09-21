package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "Location")
@js.native
open class Location protected () extends StObject {
  /**
    * @remarks
    * Creates a new instance of an abstract location.
    * @param x
    * X position of the location.
    * @param y
    * Y position of the location.
    * @param z
    * Z position of the location.
    */
  def this(x: Double, y: Double, z: Double) = this()
  
  /**
    * @remarks
    * Compares this Location and another Location to one another.
    * @param other
    * Other location to compare this Location to.
    * @returns
    * True if the two locations are equal.
    */
  def equals(other: Location): Boolean = js.native
  
  /**
    * @remarks
    * Determines whether or not two Locations are considered to be
    * near each other.
    * @param other
    * Other Location to compare this Location to.
    * @param epsilon
    * Maximum distance that the Locations can be from each other
    * to be considered nearby.
    * @returns
    * True if the two Locations are within epsilon distance of
    * each other.
    */
  def isNear(other: Location, epsilon: Double): Boolean = js.native
  
  /**
    * X component of this location.
    */
  var x: Double = js.native
  
  /**
    * Y component of this location.
    */
  var y: Double = js.native
  
  /**
    * Z component of this location.
    */
  var z: Double = js.native
}
