package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemFoodComponent")
@js.native
/* protected */ open class ItemFoodComponent () extends StObject {
  
  /**
    * If true, the player can always eat this item (even when not
    * hungry).
    * @throws This property can throw when used.
    */
  val canAlwaysEat: Boolean = js.native
  
  /**
    * Represents how much nutrition this food item will give an
    * entity when eaten.
    * @throws This property can throw when used.
    */
  val nutrition: Double = js.native
  
  /**
    * When an item is eaten, this value is used according to this
    * formula (nutrition * saturation_modifier * 2) to apply a
    * saturation buff.
    * @throws This property can throw when used.
    */
  val saturationModifier: Double = js.native
  
  /**
    * When specified, converts the active item to the one
    * specified by this property.
    * @throws This property can throw when used.
    */
  val usingConvertsTo: String = js.native
}
/* static members */
object ItemFoodComponent {
  
  /**
    * Identifier of this component. Should always be
    * 'minecraft:food'.
    */
  @JSImport("mojang-minecraft", "ItemFoodComponent.id")
  @js.native
  val id: /* "minecraft:food" */ String = js.native
}
