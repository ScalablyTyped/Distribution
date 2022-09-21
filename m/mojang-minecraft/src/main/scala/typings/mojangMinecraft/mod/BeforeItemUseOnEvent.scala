package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BeforeItemUseOnEvent")
@js.native
/* protected */ open class BeforeItemUseOnEvent () extends StObject {
  
  /**
    * The face of the block that an item is being used on.
    */
  val blockFace: Direction = js.native
  
  /**
    * Location of the block being impacted.
    */
  val blockLocation: BlockLocation = js.native
  
  /**
    * If set to true, this will cancel the item use behavior.
    */
  var cancel: Boolean = js.native
  
  /**
    * X coordinate of the item-use impact location on the face of
    * the target block.
    */
  val faceLocationX: Double = js.native
  
  /**
    * Y coordinate of the item-use impact location on the face of
    * the target block.
    */
  val faceLocationY: Double = js.native
  
  /**
    * The impacted item stack that is being used on a block.
    */
  var item: ItemStack = js.native
  
  /**
    * Returns the source entity that triggered this item event.
    */
  val source: Entity = js.native
}
