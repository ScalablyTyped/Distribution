package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemCooldownComponent")
@js.native
/* protected */ open class ItemCooldownComponent () extends StObject {
  
  /**
    * Represents the cooldown category that this item is
    * associated with.
    * @throws This property can throw when used.
    */
  val cooldownCategory: String = js.native
  
  /**
    * Amount of time, in ticks, that remain for this item
    * cooldown.
    * @throws This property can throw when used.
    */
  val cooldownTicks: Double = js.native
  
  /**
    * @remarks
    * Starts a new cooldown period for this item.
    * @param player
    * @throws This function can throw errors.
    */
  def startCooldown(player: Player): Unit = js.native
}
/* static members */
object ItemCooldownComponent {
  
  /**
    * Identifier of this component. Should always be
    * 'minecraft:cooldown'.
    */
  @JSImport("mojang-minecraft", "ItemCooldownComponent.id")
  @js.native
  val id: /* "minecraft:cooldown" */ String = js.native
}
