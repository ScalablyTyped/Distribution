package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemReleaseChargeEvent")
@js.native
/* protected */ open class ItemReleaseChargeEvent () extends StObject {
  
  /**
    * Returns the item stack that triggered this item event.
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
