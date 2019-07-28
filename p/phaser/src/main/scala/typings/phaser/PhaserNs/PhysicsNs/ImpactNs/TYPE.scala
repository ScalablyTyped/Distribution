package typings.phaser.PhaserNs.PhysicsNs.ImpactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TYPE extends js.Object

/**
  * Collision Types - Determine if and how entities collide with each other.
  * 
  * In ACTIVE vs. LITE or FIXED vs. ANY collisions, only the "weak" entity moves,
  * while the other one stays fixed. In ACTIVE vs. ACTIVE and ACTIVE vs. PASSIVE
  * collisions, both entities are moved. LITE or PASSIVE entities don't collide
  * with other LITE or PASSIVE entities at all. The behavior for FIXED vs.
  * FIXED collisions is undefined.
  */
@JSGlobal("Phaser.Physics.Impact.TYPE")
@js.native
object TYPE extends js.Object {
  /**
    * Type A. Collides with Type B.
    */
  @js.native
  sealed trait A extends TYPE
  
  /**
    * Type B. Collides with Type A.
    */
  @js.native
  sealed trait B extends TYPE
  
  /**
    * Collides with both types A and B.
    */
  @js.native
  sealed trait BOTH extends TYPE
  
  /**
    * Collides with nothing.
    */
  @js.native
  sealed trait NONE extends TYPE
  
  /* 1 */ val A: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.TYPE.A with Double = js.native
  /* 2 */ val B: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.TYPE.B with Double = js.native
  /* 3 */ val BOTH: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.TYPE.BOTH with Double = js.native
  /* 0 */ val NONE: typings.phaser.PhaserNs.PhysicsNs.ImpactNs.TYPE.NONE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPE with Double] = js.native
}

