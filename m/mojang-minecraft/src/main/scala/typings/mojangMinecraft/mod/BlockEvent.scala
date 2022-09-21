package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockEvent")
@js.native
/* protected */ open class BlockEvent () extends StObject {
  
  /**
    * Block impacted by this event.
    */
  val block: Block = js.native
  
  /**
    * Dimension that contains the block that is the subject of
    * this event.
    */
  val dimension: Dimension = js.native
}
