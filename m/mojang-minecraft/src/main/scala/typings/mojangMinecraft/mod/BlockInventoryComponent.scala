package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockInventoryComponent")
@js.native
/* protected */ open class BlockInventoryComponent () extends BlockComponent {
  
  /**
    * The container which holds an {@link mojang-minecraft.ItemStack}.
    * @throws This property can throw when used.
    */
  val container: BlockInventoryComponentContainer = js.native
  
  /**
    * Coordinates of the specified block.
    */
  val location: BlockLocation = js.native
}
/* static members */
object BlockInventoryComponent {
  
  @JSImport("mojang-minecraft", "BlockInventoryComponent.id")
  @js.native
  val id: /* "inventory" */ String = js.native
}
