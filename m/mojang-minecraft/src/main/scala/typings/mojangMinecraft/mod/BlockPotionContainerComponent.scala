package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockPotionContainerComponent")
@js.native
/* protected */ open class BlockPotionContainerComponent () extends BlockComponent {
  
  /**
    * Relative level of potion liquid within this block. Valid
    * values are between FluidContainer.minFillLevel (0) and
    * FluidContainer.maxFillLevel (6).
    */
  var fillLevel: Double = js.native
  
  /**
    * Source location of the block.
    */
  val location: BlockLocation = js.native
  
  /**
    * @remarks
    * Sets the potion type based on an item stack.
    * @param item
    * Potion to use as the type of potion for this potion
    * container.
    * @throws This function can throw errors.
    */
  def setPotionType(item: ItemStack): Unit = js.native
}
/* static members */
object BlockPotionContainerComponent {
  
  @JSImport("mojang-minecraft", "BlockPotionContainerComponent.id")
  @js.native
  val id: /* "potionContainer" */ String = js.native
}
