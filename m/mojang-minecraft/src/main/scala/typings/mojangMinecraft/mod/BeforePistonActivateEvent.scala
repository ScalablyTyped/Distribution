package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BeforePistonActivateEvent")
@js.native
/* protected */ open class BeforePistonActivateEvent () extends BlockEvent {
  
  /**
    * If this is set to true within an event handler, the piston
    * activation is canceled.
    */
  var cancel: Boolean = js.native
  
  /**
    * True if the piston is the process of expanding.
    */
  val isExpanding: Boolean = js.native
  
  /**
    * Contains additional properties and details of the piston.
    */
  val piston: BlockPistonComponent = js.native
}
