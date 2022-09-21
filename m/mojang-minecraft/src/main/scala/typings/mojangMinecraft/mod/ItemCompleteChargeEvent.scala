package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemCompleteChargeEvent")
@js.native
/* protected */ open class ItemCompleteChargeEvent () extends StObject {
  
  /**
    * Returns the item stack that has completed charging.
    */
  val itemStack: ItemStack = js.native
  
  /**
    * Returns the source entity that triggered this item event.
    */
  val source: Entity = js.native
  
  /**
    * Returns the time, in ticks, for the remaining duration left
    * before the charge completes its cycle.
    */
  val useDuration: Double = js.native
}
