package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityFrictionModifierComponent")
@js.native
/* protected */ open class EntityFrictionModifierComponent () extends IEntityComponent {
  
  /**
    * The higher the number, the more the friction affects this
    * entity. A value of 1.0 means regular friction, while 2.0
    * means twice as much.
    */
  var value: Double = js.native
}
/* static members */
object EntityFrictionModifierComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:friction_modifier.
    */
  @JSImport("mojang-minecraft", "EntityFrictionModifierComponent.id")
  @js.native
  val id: /* "minecraft:friction_modifier" */ String = js.native
}
