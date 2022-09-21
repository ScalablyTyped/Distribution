package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityLavaMovementComponent")
@js.native
/* protected */ open class EntityLavaMovementComponent () extends IEntityComponent {
  
  /**
    * Read-only. Returns the current value of movement speed on
    * lava for the entity.
    * @throws This property can throw when used.
    */
  val current: Double = js.native
  
  /**
    * @remarks
    * Resets the current movement speed on lava for the entity to
    * its default value.
    * @throws This function can throw errors.
    */
  def resetToDefaultValue(): Unit = js.native
  
  /**
    * @remarks
    * Resets the movement speed on lava to the maximum value for
    * the entity.
    * @throws This function can throw errors.
    */
  def resetToMaxValue(): Unit = js.native
  
  /**
    * @remarks
    * Resets the movement speed on lava speed to the minimum
    * value.
    * @throws This function can throw errors.
    */
  def resetToMinValue(): Unit = js.native
  
  /**
    * @remarks
    * Sets the current value of movement speed on lava for the
    * entity.
    * @param value
    * @throws This function can throw errors.
    */
  def setCurrent(value: Double): Unit = js.native
  
  /**
    * Value for movement speed on lava as defined through entity
    * components.
    * @throws This property can throw when used.
    */
  val value: Double = js.native
}
/* static members */
object EntityLavaMovementComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:lava_movement.
    */
  @JSImport("mojang-minecraft", "EntityLavaMovementComponent.id")
  @js.native
  val id: /* "minecraft:lava_movement" */ String = js.native
}
