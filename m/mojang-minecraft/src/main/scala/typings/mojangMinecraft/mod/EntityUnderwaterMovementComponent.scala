package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityUnderwaterMovementComponent")
@js.native
/* protected */ open class EntityUnderwaterMovementComponent () extends IEntityComponent {
  
  /**
    * Read-only. Returns the current value of movement speed
    * underwater for the entity.
    * @throws This property can throw when used.
    */
  val current: Double = js.native
  
  /**
    * @remarks
    * Resets the current movement speed underwater for the entity
    * to the default value implied by the current component state
    * of the entity.
    * @throws This function can throw errors.
    */
  def resetToDefaultValue(): Unit = js.native
  
  /**
    * @remarks
    * Resets the movement speed underwater to the maximum value
    * for the entity, as determined by the set of components that
    * are on the entity.
    * @throws This function can throw errors.
    */
  def resetToMaxValue(): Unit = js.native
  
  /**
    * @remarks
    * Resets the movement speed underwater to the minimum value as
    * defined by the component state of this entity.
    * @throws This function can throw errors.
    */
  def resetToMinValue(): Unit = js.native
  
  /**
    * @remarks
    * Sets the current value of movement speed underwater for the
    * entity.
    * @param value
    * @throws This function can throw errors.
    */
  def setCurrent(value: Double): Unit = js.native
  
  /**
    * Value for movement speed underwater as defined through
    * entity components.
    * @throws This property can throw when used.
    */
  val value: Double = js.native
}
/* static members */
object EntityUnderwaterMovementComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:underwater_movement.
    */
  @JSImport("mojang-minecraft", "EntityUnderwaterMovementComponent.id")
  @js.native
  val id: /* "minecraft:underwater_movement" */ String = js.native
}
