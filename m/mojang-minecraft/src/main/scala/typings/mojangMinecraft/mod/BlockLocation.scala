package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockLocation")
@js.native
open class BlockLocation protected () extends StObject {
  /**
    * @remarks
    * Creates a new instance of an abstract block location.
    * @param x
    * X position of the block location. This number should be an
    * integer.
    * @param y
    * Y position of the block location. This number should be an
    * integer.
    * @param z
    * Z position of the block location. This number should be an
    * integer.
    */
  def this(x: Double, y: Double, z: Double) = this()
  
  /**
    * @remarks
    * Returns a BlockLocation for a block above this BlockLocation
    * (that is, y + 1).
    */
  def above(): BlockLocation = js.native
  
  /**
    * @remarks
    * Returns an array of block locations representing all blocks
    * in the volume (cuboid) between this location and another
    * location.
    * @param other
    * Additional BlockLocation used to determine the set of
    * locations in between this location and another point.
    * @returns
    * Array of block locations representing the volume between
    * this location and another, inclusive of the start and end
    * points.
    */
  def blocksBetween(other: BlockLocation): js.Array[BlockLocation] = js.native
  
  /**
    * @remarks
    * Compares this BlockLocation and another BlockLocation to one
    * another.
    * @param other
    * Other block location to compare this BlockLocation to.
    * @returns
    * True if the two block locations are equal.
    */
  def equals(other: BlockLocation): Boolean = js.native
  
  /**
    * @remarks
    * Returns a block location using a position relative to this
    * block location
    * @param x
    * X offset relative to this BlockLocation.
    * @param y
    * Y offset relative to this BlockLocation.
    * @param z
    * Z offset relative to this BlockLocation.
    * @returns
    * BlockLocation that is positioned relative to this
    * BlockLocation.
    */
  def offset(x: Double, y: Double, z: Double): BlockLocation = js.native
  
  /**
    * The X coordinate.
    */
  var x: Double = js.native
  
  /**
    * The integer-based Y position.
    */
  var y: Double = js.native
  
  /**
    * The integer-based Z position.
    */
  var z: Double = js.native
}
