package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityTameableComponent")
@js.native
/* protected */ open class EntityTameableComponent () extends IEntityComponent {
  
  /**
    * The chance of taming the entity with each item use between
    * 0.0 and 1.0, where 1.0 is 100%
    * @throws This property can throw when used.
    */
  val probability: Double = js.native
  
  /**
    * @remarks
    * Tames this entity.
    * @returns
    * Returns true if the entity was tamed.
    * @throws This function can throw errors.
    */
  def tame(): Boolean = js.native
  
  /**
    * Event to run when this entity becomes tamed.
    * @throws This property can throw when used.
    */
  val tameEvent: Trigger = js.native
  
  /**
    * The list of items that can be used to tame this entity.
    * @throws This property can throw when used.
    */
  val tameItems: js.Array[String] = js.native
}
/* static members */
object EntityTameableComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:tameable.
    */
  @JSImport("mojang-minecraft", "EntityTameableComponent.id")
  @js.native
  val id: /* "minecraft:tameable" */ String = js.native
}
