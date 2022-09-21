package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockWaterContainerComponent")
@js.native
/* protected */ open class BlockWaterContainerComponent () extends BlockComponent {
  
  /**
    * @remarks
    * Adds an item and colors the water based on a dye item type.
    * @param itemType
    * @throws This function can throw errors.
    */
  def addDye(itemType: ItemType): Unit = js.native
  
  /**
    * Represents a color facet of the water.
    */
  var customColor: Color = js.native
  
  /**
    * Relative level of water within this block. Valid values are
    * between FluidContainer.minFillLevel (0) and
    * FluidContainer.maxFillLevel (6).
    */
  var fillLevel: Double = js.native
  
  /**
    * Source location of the block.
    */
  val location: BlockLocation = js.native
}
/* static members */
object BlockWaterContainerComponent {
  
  @JSImport("mojang-minecraft", "BlockWaterContainerComponent.id")
  @js.native
  val id: /* "waterContainer" */ String = js.native
}
