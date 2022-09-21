package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityScaleComponent")
@js.native
/* protected */ open class EntityScaleComponent () extends IEntityComponent {
  
  /**
    * The value of the scale. 1.0 means the entity will appear at
    * the scale they are defined in their model. Higher numbers
    * make the entity bigger.
    */
  var value: Double = js.native
}
/* static members */
object EntityScaleComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:scale.
    */
  @JSImport("mojang-minecraft", "EntityScaleComponent.id")
  @js.native
  val id: /* "minecraft:scale" */ String = js.native
}
