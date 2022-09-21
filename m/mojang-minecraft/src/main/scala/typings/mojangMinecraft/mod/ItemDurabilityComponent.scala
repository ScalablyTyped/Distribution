package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemDurabilityComponent")
@js.native
/* protected */ open class ItemDurabilityComponent () extends StObject {
  
  /**
    * Returns the current damage level of this particular item.
    */
  var damage: Double = js.native
  
  /**
    * A range of numbers that describes the chance of the item
    * losing durability.
    * @throws This property can throw when used.
    */
  val damageRange: NumberRange = js.native
  
  /**
    * @remarks
    * Returns the maximum chance that this item would be damaged
    * using the damageRange property, given an unbreaking level.
    * @param unbreaking
    * Unbreaking factor to consider in factoring the damage
    * chance. Incoming unbreaking parameter must be greater than
    * 0.
    * @throws This function can throw errors.
    */
  def getDamageChance(): Double = js.native
  def getDamageChance(unbreaking: Double): Double = js.native
  
  /**
    * Represents the amount of damage that this item can take
    * before breaking.
    * @throws This property can throw when used.
    */
  val maxDurability: Double = js.native
}
/* static members */
object ItemDurabilityComponent {
  
  /**
    * Identifier of this component. Should always be
    * 'minecraft:durability'.
    */
  @JSImport("mojang-minecraft", "ItemDurabilityComponent.id")
  @js.native
  val id: /* "minecraft:durability" */ String = js.native
}
