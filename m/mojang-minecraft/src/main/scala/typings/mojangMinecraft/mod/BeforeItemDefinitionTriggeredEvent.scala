package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BeforeItemDefinitionTriggeredEvent")
@js.native
/* protected */ open class BeforeItemDefinitionTriggeredEvent () extends StObject {
  
  /**
    * If set to true, will cancel the application of this item
    * definition change.
    */
  var cancel: Boolean = js.native
  
  /**
    * Name of the data-driven item event that is triggering this
    * change.
    */
  val eventName: String = js.native
  
  /**
    * The impacted item stack that is being used.
    */
  var item: ItemStack = js.native
  
  /**
    * Returns the source entity that triggered this item event.
    */
  val source: Entity = js.native
}
