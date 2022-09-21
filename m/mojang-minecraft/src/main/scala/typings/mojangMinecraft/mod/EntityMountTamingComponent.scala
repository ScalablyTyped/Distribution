package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityMountTamingComponent")
@js.native
/* protected */ open class EntityMountTamingComponent () extends IEntityComponent {
  
  /**
    * @remarks
    * Sets this rideable entity as tamed.
    * @param showParticles
    * Whether to show effect particles when this entity is tamed.
    * @throws This function can throw errors.
    */
  def setTamed(showParticles: Boolean): Unit = js.native
}
/* static members */
object EntityMountTamingComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:mount_taming.
    */
  @JSImport("mojang-minecraft", "EntityMountTamingComponent.id")
  @js.native
  val id: /* "minecraft:tamemount" */ String = js.native
}
