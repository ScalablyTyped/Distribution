package typings.phaser.PhaserNs.PhysicsNs.ImpactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait COLLIDES extends js.Object

/**
  * Collision Types - Determine if and how entities collide with each other.
  * 
  * In ACTIVE vs. LITE or FIXED vs. ANY collisions, only the "weak" entity moves,
  * while the other one stays fixed. In ACTIVE vs. ACTIVE and ACTIVE vs. PASSIVE
  * collisions, both entities are moved. LITE or PASSIVE entities don't collide
  * with other LITE or PASSIVE entities at all. The behavior for FIXED vs.
  * FIXED collisions is undefined.
  */
@JSGlobal("Phaser.Physics.Impact.COLLIDES")
@js.native
object COLLIDES extends js.Object {
  /**
    * Active collision.
    */
  @js.native
  sealed trait ACTIVE extends COLLIDES
  
  /**
    * Fixed collision.
    */
  @js.native
  sealed trait FIXED extends COLLIDES
  
  /**
    * Lite collision.
    */
  @js.native
  sealed trait LITE extends COLLIDES
  
  /**
    * Never collides.
    */
  @js.native
  sealed trait NEVER extends COLLIDES
  
  /**
    * Passive collision.
    */
  @js.native
  sealed trait PASSIVE extends COLLIDES
  
  /* 3 */ val ACTIVE: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.COLLIDES.ACTIVE with Double = js.native
  /* 4 */ val FIXED: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.COLLIDES.FIXED with Double = js.native
  /* 1 */ val LITE: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.COLLIDES.LITE with Double = js.native
  /* 0 */ val NEVER: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.COLLIDES.NEVER with Double = js.native
  /* 2 */ val PASSIVE: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.COLLIDES.PASSIVE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[COLLIDES with Double] = js.native
}

