package typings.phaser.Phaser.Physics.Impact

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[COLLIDES with Double] = js.native
  /* 3 */ @js.native
  object ACTIVE extends TopLevel[ACTIVE with Double]
  
  /* 4 */ @js.native
  object FIXED extends TopLevel[FIXED with Double]
  
  /* 1 */ @js.native
  object LITE extends TopLevel[LITE with Double]
  
  /* 0 */ @js.native
  object NEVER extends TopLevel[NEVER with Double]
  
  /* 2 */ @js.native
  object PASSIVE extends TopLevel[PASSIVE with Double]
  
}

