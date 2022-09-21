package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityStrengthComponent")
@js.native
/* protected */ open class EntityStrengthComponent () extends IEntityComponent {
  
  /**
    * Maximum strength of this entity, as defined in the entity
    * type definition.
    * @throws This property can throw when used.
    */
  val max: Double = js.native
  
  /**
    * Current strength value of this entity, after any effects or
    * component updates are applied.
    * @throws This property can throw when used.
    */
  val value: Double = js.native
}
/* static members */
object EntityStrengthComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:strength.
    */
  @JSImport("mojang-minecraft", "EntityStrengthComponent.id")
  @js.native
  val id: /* "minecraft:strength" */ String = js.native
}
