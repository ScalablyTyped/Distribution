package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemDefinitionTriggeredEvent")
@js.native
/* protected */ open class ItemDefinitionTriggeredEvent () extends StObject {
  
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
