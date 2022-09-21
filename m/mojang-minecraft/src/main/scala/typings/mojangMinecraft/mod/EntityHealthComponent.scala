package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityHealthComponent")
@js.native
/* protected */ open class EntityHealthComponent () extends IEntityComponent {
  
  /**
    * Read-only. Returns the current value of health for the
    * entity.
    * @throws This property can throw when used.
    */
  val current: Double = js.native
  
  /**
    * @remarks
    * Resets the current health value of the entity to its default
    * value.
    * @throws This function can throw errors.
    */
  def resetToDefaultValue(): Unit = js.native
  
  /**
    * @remarks
    * Resets the current health of the entity to its maximum
    * value.
    * @throws This function can throw errors.
    */
  def resetToMaxValue(): Unit = js.native
  
  /**
    * @remarks
    * Resets the current health to the minimum value.
    * @throws This function can throw errors.
    */
  def resetToMinValue(): Unit = js.native
  
  /**
    * @remarks
    * Sets the current health of the entity.
    * @param value
    * @throws This function can throw errors.
    */
  def setCurrent(value: Double): Unit = js.native
  
  /**
    * Value for health as defined through entity components.
    * @throws This property can throw when used.
    */
  val value: Double = js.native
}
/* static members */
object EntityHealthComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:health.
    */
  @JSImport("mojang-minecraft", "EntityHealthComponent.id")
  @js.native
  val id: /* "minecraft:health" */ String = js.native
}
