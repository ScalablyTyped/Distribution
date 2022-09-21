package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityGroundOffsetComponent")
@js.native
/* protected */ open class EntityGroundOffsetComponent () extends IEntityComponent {
  
  /**
    * The value of the entity's offset from the terrain, in
    * blocks.
    */
  var value: Double = js.native
}
/* static members */
object EntityGroundOffsetComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:ground_offset.
    */
  @JSImport("mojang-minecraft", "EntityGroundOffsetComponent.id")
  @js.native
  val id: /* "minecraft:ground_offset" */ String = js.native
}
