package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockPistonComponent")
@js.native
/* protected */ open class BlockPistonComponent () extends BlockComponent {
  
  /**
    * A set of locations for blocks that are impacted by the
    * activation of this piston.
    * @throws This property can throw when used.
    */
  val attachedBlocks: js.Array[BlockLocation] = js.native
  
  /**
    * Whether the piston is fully expanded.
    * @throws This property can throw when used.
    */
  val isExpanded: Boolean = js.native
  
  /**
    * Whether the piston is in the process of expanding.
    * @throws This property can throw when used.
    */
  val isExpanding: Boolean = js.native
  
  /**
    * Whether the piston is in the process of expanding or
    * retracting.
    * @throws This property can throw when used.
    */
  val isMoving: Boolean = js.native
  
  /**
    * Whether the piston is fully retracted.
    * @throws This property can throw when used.
    */
  val isRetracted: Boolean = js.native
  
  /**
    * Whether the piston is in the process of retracting.
    * @throws This property can throw when used.
    */
  val isRetracting: Boolean = js.native
  
  /**
    * Source location of the block.
    */
  val location: BlockLocation = js.native
}
/* static members */
object BlockPistonComponent {
  
  @JSImport("mojang-minecraft", "BlockPistonComponent.id")
  @js.native
  val id: /* "piston" */ String = js.native
}
