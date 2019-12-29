package typings.phaser.Phaser.Physics.Impact

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPE with Double] = js.native
  /* 1 */ @js.native
  object A extends TopLevel[A with Double]
  
  /* 2 */ @js.native
  object B extends TopLevel[B with Double]
  
  /* 3 */ @js.native
  object BOTH extends TopLevel[BOTH with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
}

