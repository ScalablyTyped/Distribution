package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.IPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Sleeping` module contains methods to manage the sleeping state of bodies.
  *
  * @class Sleeping
  */
@JSGlobal("MatterJS.Sleeping")
@js.native
open class Sleeping ()
  extends StObject
     with typings.phaser.MatterJS.Sleeping
object Sleeping {
  
  @JSGlobal("MatterJS.Sleeping")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Given a set of colliding pairs, wakes the sleeping bodies involved.
    * @method afterCollisions
    * @param {pair[]} pairs
    */
  /* static member */
  inline def afterCollisions(pairs: js.Array[IPair]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterCollisions")(pairs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Set a body as sleeping or awake.
    * @method set
    * @param {body} body
    * @param {boolean} isSleeping
    */
  /* static member */
  inline def set(body: BodyType, isSleeping: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(body.asInstanceOf[js.Any], isSleeping.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Puts bodies to sleep or wakes them up depending on their motion.
    * @method update
    * @param {body[]} bodies
    * @param {number} delta
    */
  /* static member */
  inline def update(bodies: js.Array[BodyType], delta: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(bodies.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
