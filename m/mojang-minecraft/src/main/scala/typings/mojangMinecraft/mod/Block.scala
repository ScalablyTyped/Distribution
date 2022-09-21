package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "Block")
@js.native
/* protected */ open class Block () extends StObject {
  
  /**
    * Returns the dimension that the block is within.
    */
  val dimension: Dimension = js.native
  
  /**
    * @remarks
    * Gets additional configuration properties (a component) for
    * specific capabilities of particular blocks - for example, an
    * inventory component of a chest block.
    * @param componentName
    * Identifier of the component. If a namespace is not
    * specified, minecraft: is assumed.
    * @returns
    * Returns the component object if it is present on the
    * particular block.
    * @throws This function can throw errors.
    */
  def getComponent(componentName: String): Any = js.native
  
  /**
    * @returns
    * The list of tags that the block has.
    * @throws This function can throw errors.
    */
  def getTags(): js.Array[String] = js.native
  
  /**
    * @remarks
    * Checks to see if the permutation of this block has a
    * specific tag.
    * @param tag
    * Tag to check for.
    * @returns
    * Returns `true` if the permutation of this block has the tag,
    * else `false`.
    * @throws This function can throw errors.
    * @example check_block_tags.js
    * ```typescript
    *        import { world, BlockLocation } from "mojang-minecraft";
    *
    *        // Fetch the block
    *        const block = world.getDimension("overworld").getBlock(new BlockLocation(1, 2, 3));
    *
    *        console.log(`Block is dirt: ${block.hasTag("dirt")}`);
    *        console.log(`Block is wood: ${block.hasTag("wood")}`);
    *        console.log(`Block is stone: ${block.hasTag("stone")}`);
    *
    * ```
    */
  def hasTag(tag: String): Boolean = js.native
  
  /**
    * Identifier of the type of block for this block.
    * @throws This property can throw when used.
    */
  val id: String = js.native
  
  /**
    * Returns or sets whether this block has a liquid on it.
    */
  var isWaterlogged: Boolean = js.native
  
  /**
    * Coordinates of the specified block.
    */
  val location: BlockLocation = js.native
  
  /**
    * Additional block configuration data that describes the
    * block.
    * @throws This property can throw when used.
    */
  val permutation: BlockPermutation = js.native
  
  /**
    * @remarks
    * Sets the block in the dimension to the state of the
    * permutation.
    * @param permutation
    * Permutation that contains a set of property states for the
    * Block.
    * @throws This function can throw errors.
    */
  def setPermutation(permutation: BlockPermutation): Unit = js.native
  
  /**
    * @remarks
    * Sets the type of block.
    * @param blockType
    * Identifier of the type of block to apply - for example,
    * minecraft:powered_repeater.
    * @throws This function can throw errors.
    */
  def setType(blockType: BlockType): Unit = js.native
  
  /**
    * Gets the type of block.
    * @throws This property can throw when used.
    */
  val `type`: BlockType = js.native
  
  /**
    * X coordinate of the block.
    */
  val x: Double = js.native
  
  /**
    * Y coordinate of the block.
    */
  val y: Double = js.native
  
  /**
    * Z coordinate of the block.
    */
  val z: Double = js.native
}
