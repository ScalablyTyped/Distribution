package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockPermutation")
@js.native
/* protected */ open class BlockPermutation () extends StObject {
  
  /**
    * @returns
    * Returns the list of all of the properties that the
    * permutation has.
    */
  def getAllProperties(): js.Array[IBlockProperty] = js.native
  
  /**
    * @remarks
    * Gets a property for the permutation.
    * @param propertyName
    * @returns
    * Returns the property if the permutation has it, else `null`.
    * @throws This function can throw errors.
    */
  def getProperty(propertyName: String): IBlockProperty = js.native
  
  /**
    * @remarks
    * Creates a copy of the permutation.
    */
  def getTags(): js.Array[String] = js.native
  
  /**
    * @remarks
    * Checks to see if the permutation has a specific tag.
    * @param tag
    * @returns
    * Returns `true` if the permutation has the tag, else `false`.
    * @example check_block_tags.js
    * ```typescript
    *        import { world, BlockLocation } from "mojang-minecraft";
    *
    *        // Fetch the block
    *        const block = world.getDimension("overworld").getBlock(new BlockLocation(1, 2, 3));
    *        const blockPerm = block.getPermutation();
    *
    *        console.log(`Block is dirt: ${blockPerm.hasTag("dirt")}`);
    *        console.log(`Block is wood: ${blockPerm.hasTag("wood")}`);
    *        console.log(`Block is stone: ${blockPerm.hasTag("stone")}`);
    *
    * ```
    */
  def hasTag(tag: String): Boolean = js.native
  
  /**
    * The {@link mojang-minecraft.BlockType} that the permutation has.
    */
  val `type`: BlockType = js.native
}
