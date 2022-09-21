package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockRaycastOptions")
@js.native
open class BlockRaycastOptions () extends StObject {
  
  /**
    * If true, liquid blocks will be considered as blocks that
    * 'stop' the raycast.
    */
  var includeLiquidBlocks: Boolean = js.native
  
  /**
    * If true, passable blocks like vines and flowers will be
    * considered as blocks that 'stop' the raycast.
    */
  var includePassableBlocks: Boolean = js.native
  
  /**
    * Maximum distance, in blocks, to process the raycast.
    */
  var maxDistance: Double = js.native
}
