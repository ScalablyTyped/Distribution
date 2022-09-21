package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityLeashableComponent")
@js.native
/* protected */ open class EntityLeashableComponent () extends IEntityComponent {
  
  /**
    * @remarks
    * Leashes this entity to another entity.
    * @param leashHolder
    * The entity to leash this entity to.
    * @throws This function can throw errors.
    */
  def leash(leashHolder: Entity): Unit = js.native
  
  /**
    * Distance in blocks at which the 'spring' effect starts
    * acting to keep this entity close to the entity that leashed
    * it.
    * @throws This property can throw when used.
    */
  val softDistance: Double = js.native
  
  /**
    * @remarks
    * Unleashes this entity if it is leashed to another entity.
    * @throws This function can throw errors.
    */
  def unleash(): Unit = js.native
}
/* static members */
object EntityLeashableComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:leashable.
    */
  @JSImport("mojang-minecraft", "EntityLeashableComponent.id")
  @js.native
  val id: /* "minecraft:leashable" */ String = js.native
}
