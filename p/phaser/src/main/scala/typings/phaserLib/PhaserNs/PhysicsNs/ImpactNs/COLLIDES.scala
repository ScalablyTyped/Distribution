package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs

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
  sealed trait ACTIVE
    extends phaserLib.PhaserNs.PhysicsNs.ImpactNs.COLLIDES
  
  /**
    * Fixed collision.
    */
  @js.native
  sealed trait FIXED
    extends phaserLib.PhaserNs.PhysicsNs.ImpactNs.COLLIDES
  
  /**
    * Lite collision.
    */
  @js.native
  sealed trait LITE
    extends phaserLib.PhaserNs.PhysicsNs.ImpactNs.COLLIDES
  
  /**
    * Never collides.
    */
  @js.native
  sealed trait NEVER
    extends phaserLib.PhaserNs.PhysicsNs.ImpactNs.COLLIDES
  
  /**
    * Passive collision.
    */
  @js.native
  sealed trait PASSIVE
    extends phaserLib.PhaserNs.PhysicsNs.ImpactNs.COLLIDES
  
  /* 3 */ val ACTIVE: ACTIVE with scala.Double = js.native
  /* 4 */ val FIXED: FIXED with scala.Double = js.native
  /* 1 */ val LITE: LITE with scala.Double = js.native
  /* 0 */ val NEVER: NEVER with scala.Double = js.native
  /* 2 */ val PASSIVE: PASSIVE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.PhaserNs.PhysicsNs.ImpactNs.COLLIDES with scala.Double] = js.native
}

