package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemStopUseOnEvent")
@js.native
/* protected */ open class ItemStopUseOnEvent () extends StObject {
  
  /**
    * Location of the block being impacted.
    */
  val blockLocation: BlockLocation = js.native
  
  /**
    * The impacted item stack that is being used on a block.
    */
  var item: ItemStack = js.native
  
  /**
    * Returns the source entity that triggered this item event.
    */
  val source: Entity = js.native
}
