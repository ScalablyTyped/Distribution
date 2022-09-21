package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockLavaContainerComponent")
@js.native
/* protected */ open class BlockLavaContainerComponent () extends BlockComponent {
  
  /**
    * Relative level of lava within this block. Valid values are
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
object BlockLavaContainerComponent {
  
  @JSImport("mojang-minecraft", "BlockLavaContainerComponent.id")
  @js.native
  val id: /* "lavaContainer" */ String = js.native
}
