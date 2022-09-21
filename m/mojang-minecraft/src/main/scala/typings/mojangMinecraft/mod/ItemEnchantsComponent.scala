package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemEnchantsComponent")
@js.native
/* protected */ open class ItemEnchantsComponent () extends StObject {
  
  /**
    * Returns a collection of the enchantments applied to this
    * item stack.
    */
  var enchantments: EnchantmentList = js.native
  
  /**
    * @remarks
    * Removes all enchantments applied to this item stack.
    * @throws This function can throw errors.
    */
  def removeAllEnchantments(): Unit = js.native
}
/* static members */
object ItemEnchantsComponent {
  
  /**
    * Identifier of this component.
    */
  @JSImport("mojang-minecraft", "ItemEnchantsComponent.id")
  @js.native
  val id: /* "minecraft:enchantments" */ String = js.native
}
