package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockSnowContainerComponent")
@js.native
/* protected */ open class BlockSnowContainerComponent () extends BlockComponent {
  
  /**
    * Relative level of snow within this block. Valid values are
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
object BlockSnowContainerComponent {
  
  @JSImport("mojang-minecraft", "BlockSnowContainerComponent.id")
  @js.native
  val id: /* "snowContainer" */ String = js.native
}
