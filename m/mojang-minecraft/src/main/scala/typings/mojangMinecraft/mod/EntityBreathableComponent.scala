package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityBreathableComponent")
@js.native
/* protected */ open class EntityBreathableComponent () extends IEntityComponent {
  
  /**
    * List of blocks this entity can breathe in, in addition to
    * the separate properties for classes of blocks.
    * @throws This property can throw when used.
    */
  val breatheBlocks: js.Array[BlockPermutation] = js.native
  
  /**
    * If true, this entity can breathe in air.
    * @throws This property can throw when used.
    */
  val breathesAir: Boolean = js.native
  
  /**
    * If true, this entity can breathe in lava.
    * @throws This property can throw when used.
    */
  val breathesLava: Boolean = js.native
  
  /**
    * If true, this entity can breathe in solid blocks.
    * @throws This property can throw when used.
    */
  val breathesSolids: Boolean = js.native
  
  /**
    * If true, this entity can breathe in water.
    * @throws This property can throw when used.
    */
  val breathesWater: Boolean = js.native
  
  /**
    * If true, this entity will have visible bubbles while in
    * water.
    * @throws This property can throw when used.
    */
  val generatesBubbles: Boolean = js.native
  
  /**
    * Time in seconds to recover breath to maximum.
    * @throws This property can throw when used.
    */
  val inhaleTime: Double = js.native
  
  /**
    * List of blocks this entity can't breathe in.
    * @throws This property can throw when used.
    */
  val nonBreatheBlocks: js.Array[BlockPermutation] = js.native
  
  /**
    * @remarks
    * Sets the current air supply of the entity.
    * @param value
    * New air supply for the entity.
    * @throws This function can throw errors.
    */
  def setAirSupply(value: Double): Unit = js.native
  
  /**
    * Time in seconds between suffocation damage.
    * @throws This property can throw when used.
    */
  val suffocateTime: Double = js.native
  
  /**
    * Time in seconds the entity can hold its breath.
    * @throws This property can throw when used.
    */
  val totalSupply: Double = js.native
}
/* static members */
object EntityBreathableComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:breathable.
    */
  @JSImport("mojang-minecraft", "EntityBreathableComponent.id")
  @js.native
  val id: /* "minecraft:breathable" */ String = js.native
}
