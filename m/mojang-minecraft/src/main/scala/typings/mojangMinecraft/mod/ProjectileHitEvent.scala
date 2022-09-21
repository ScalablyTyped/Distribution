package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ProjectileHitEvent")
@js.native
/* protected */ open class ProjectileHitEvent () extends StObject {
  
  /**
    * Contains additional information about the block that was hit
    * by the projectile, or undefined if the projectile did not
    * hit a block.
    */
  val blockHit: js.UndefOr[BlockHitInformation] = js.native
  
  /**
    * Dimension where this projectile hit took place.
    */
  val dimension: Dimension = js.native
  
  /**
    * Contains additional information about a block that was hit.
    */
  val entityHit: js.UndefOr[EntityHitInformation] = js.native
  
  /**
    * Direction vector of the projectile as it hit a block/entity.
    */
  val hitVector: Vector = js.native
  
  /**
    * Location where the projectile hit occurred.
    */
  val location: Location = js.native
  
  /**
    * Entity for the projectile that hit a block/entity.
    */
  val projectile: Entity = js.native
  
  /**
    * Optional source entity that fired the projectile.
    */
  val source: Entity = js.native
}
