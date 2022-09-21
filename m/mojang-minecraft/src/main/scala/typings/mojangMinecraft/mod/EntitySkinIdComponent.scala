package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntitySkinIdComponent")
@js.native
/* protected */ open class EntitySkinIdComponent () extends IEntityComponent {
  
  /**
    * The identifier of the skin. By convention, 0 is the
    * identifier of the base skin.
    */
  var value: Double = js.native
}
/* static members */
object EntitySkinIdComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:skin_id.
    */
  @JSImport("mojang-minecraft", "EntitySkinIdComponent.id")
  @js.native
  val id: /* "minecraft:skin_id" */ String = js.native
}
