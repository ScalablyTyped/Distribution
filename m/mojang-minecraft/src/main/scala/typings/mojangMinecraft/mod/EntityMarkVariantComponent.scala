package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityMarkVariantComponent")
@js.native
/* protected */ open class EntityMarkVariantComponent () extends IEntityComponent {
  
  /**
    * The identifier of the variant. By convention, 0 is the
    * identifier of the base entity.
    */
  var value: Double = js.native
}
/* static members */
object EntityMarkVariantComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:mark_variant.
    */
  @JSImport("mojang-minecraft", "EntityMarkVariantComponent.id")
  @js.native
  val id: /* "minecraft:mark_variant" */ String = js.native
}
