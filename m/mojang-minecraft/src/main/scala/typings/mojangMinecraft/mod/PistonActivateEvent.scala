package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "PistonActivateEvent")
@js.native
/* protected */ open class PistonActivateEvent () extends BlockEvent {
  
  /**
    * True if the piston is the process of expanding.
    */
  val isExpanding: Boolean = js.native
  
  /**
    * Contains additional properties and details of the piston.
    */
  val piston: BlockPistonComponent = js.native
}
