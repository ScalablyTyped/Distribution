package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityHurtEvent")
@js.native
/* protected */ open class EntityHurtEvent () extends StObject {
  
  /**
    * A summary of the reason that damage was caused.
    */
  val cause: EntityDamageCause = js.native
  
  /**
    * Describes the amount of damage caused.
    */
  val damage: Double = js.native
  
  /**
    * Optional entity that caused the damaging attack, or
    * undefined if the hurt reason was not because of another
    * entity.
    */
  val damagingEntity: Entity = js.native
  
  /**
    * Entity that was hurt.
    */
  val hurtEntity: Entity = js.native
  
  /**
    * Optional entity for a projectile that potentially hurt an
    * entity.
    */
  val projectile: Entity = js.native
}
