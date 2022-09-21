package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockAreaSize")
@js.native
open class BlockAreaSize protected () extends StObject {
  /**
    * @remarks
    * Creates a new BlockAreaSize object.
    * @param x
    * @param y
    * @param z
    */
  def this(x: Double, y: Double, z: Double) = this()
  
  /**
    * @remarks
    * Tests whether this block area size is equal to another
    * BlockAreaSize object.
    * @param other
    */
  def equals(other: BlockAreaSize): Boolean = js.native
  
  /**
    * X size (west to east) component of this block area.
    */
  var x: Double = js.native
  
  /**
    * Y size (down to up) of this block area size.
    */
  var y: Double = js.native
  
  /**
    * Z size (south to north) of this block area size.
    */
  var z: Double = js.native
}
