package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockType")
@js.native
/* protected */ open class BlockType () extends StObject {
  
  /**
    * Represents whether this type of block can be waterlogged.
    */
  val canBeWaterlogged: Boolean = js.native
  
  /**
    * @remarks
    * Creates the default {@link mojang-minecraft.BlockPermutation} for
    * this type which uses the default values for all properties.
    * @returns
    * Returns created permutation.
    * @throws This function can throw errors.
    */
  def createDefaultBlockPermutation(): BlockPermutation = js.native
  
  /**
    * Block type name - for example, `minecraft:acacia_stairs`.
    */
  val id: String = js.native
}
