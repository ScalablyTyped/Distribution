package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityHitEvent")
@js.native
/* protected */ open class EntityHitEvent () extends StObject {
  
  /**
    * Entity that made a hit/melee attack.
    */
  val entity: Entity = js.native
  
  /**
    * Block that was hit by the attack, or undefined if the hit
    * attack did not hit a block. If both hitEntity and hitBlock
    * are undefined, then the entity basically swiped into the
    * air.
    */
  val hitBlock: js.UndefOr[Block] = js.native
  
  /**
    * Entity that was hit by the attack, or undefined if the hit
    * attack did not hit an entity. If both hitEntity and hitBlock
    * are undefined, then the entity basically swiped into the
    * air.
    */
  val hitEntity: js.UndefOr[Entity] = js.native
}
