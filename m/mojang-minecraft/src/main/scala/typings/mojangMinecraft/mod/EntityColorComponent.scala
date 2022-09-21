package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityColorComponent")
@js.native
/* protected */ open class EntityColorComponent () extends IEntityComponent {
  
  /**
    * The palette color value of the entity.
    */
  var value: Double = js.native
}
/* static members */
object EntityColorComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:color.
    */
  @JSImport("mojang-minecraft", "EntityColorComponent.id")
  @js.native
  val id: /* "minecraft:color" */ String = js.native
}
