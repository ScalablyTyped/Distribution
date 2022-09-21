package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemStartUseOnEvent")
@js.native
/* protected */ open class ItemStartUseOnEvent () extends StObject {
  
  /**
    * The face of the block that an item is being used on.
    */
  val blockFace: Direction = js.native
  
  /**
    * Location of the block being impacted.
    */
  val blockLocation: BlockLocation = js.native
  
  /**
    * Location of the resulting build block position. Useful for
    * determining where a block was placed.
    */
  val buildBlockLocation: BlockLocation = js.native
  
  /**
    * The impacted item stack that is starting to be used.
    */
  var item: ItemStack = js.native
  
  /**
    * Returns the source entity that triggered this item event.
    */
  val source: Entity = js.native
}
