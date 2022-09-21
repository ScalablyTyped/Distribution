package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityVariantComponent")
@js.native
/* protected */ open class EntityVariantComponent () extends IEntityComponent {
  
  /**
    * The identifier of the variant. By convention, 0 is the
    * identifier of the base entity.
    * @throws This property can throw when used.
    */
  val value: Double = js.native
}
/* static members */
object EntityVariantComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:variant.
    */
  @JSImport("mojang-minecraft", "EntityVariantComponent.id")
  @js.native
  val id: /* "minecraft:variant" */ String = js.native
}
