package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockBreakEvent")
@js.native
/* protected */ open class BlockBreakEvent () extends BlockEvent {
  
  /**
    * Returns permutation information about this block before it
    * was broken.
    */
  val brokenBlockPermutation: BlockPermutation = js.native
  
  /**
    * Player that broke the block for this event.
    */
  val player: Player = js.native
}
