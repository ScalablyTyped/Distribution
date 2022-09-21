package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityMovementComponent")
@js.native
/* protected */ open class EntityMovementComponent () extends IEntityComponent {
  
  /**
    * Read-only. Returns the current value of default movement
    * speed for the entity.
    * @throws This property can throw when used.
    */
  val current: Double = js.native
  
  /**
    * @remarks
    * Resets the current default movement speed value for the
    * entity to the default value.
    * @throws This function can throw errors.
    */
  def resetToDefaultValue(): Unit = js.native
  
  /**
    * @remarks
    * Resets the default movement speed to the maximum value for
    * the entity.
    * @throws This function can throw errors.
    */
  def resetToMaxValue(): Unit = js.native
  
  /**
    * @remarks
    * Resets the default movement speed to the minimum value.
    * @throws This function can throw errors.
    */
  def resetToMinValue(): Unit = js.native
  
  /**
    * @remarks
    * Sets the current value of default movement speed for the
    * entity.
    * @param value
    * @throws This function can throw errors.
    */
  def setCurrent(value: Double): Unit = js.native
  
  /**
    * Value for default movement speed as defined through entity
    * components.
    * @throws This property can throw when used.
    */
  val value: Double = js.native
}
/* static members */
object EntityMovementComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:movement.
    */
  @JSImport("mojang-minecraft", "EntityMovementComponent.id")
  @js.native
  val id: /* "minecraft:movement" */ String = js.native
}
