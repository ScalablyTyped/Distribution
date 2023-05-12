package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.IPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MatterJS.SleepingFactory")
@js.native
open class SleepingFactory ()
  extends StObject
     with typings.phaser.MatterJS.SleepingFactory {
  
  /**
    * Given a set of colliding pairs, wakes the sleeping bodies involved.
    * @method afterCollisions
    * @param {pair[]} pairs
    */
  /* CompleteClass */
  override def afterCollisions(pairs: js.Array[IPair]): Unit = js.native
  
  /**
    * Set a body as sleeping or awake.
    * @method set
    * @param {body} body
    * @param {boolean} isSleeping
    */
  /* CompleteClass */
  override def set(body: BodyType, isSleeping: Boolean): Unit = js.native
  
  /**
    * Puts bodies to sleep or wakes them up depending on their motion.
    * @method update
    * @param {body[]} bodies
    * @param {number} delta
    */
  /* CompleteClass */
  override def update(bodies: js.Array[BodyType], delta: Double): Unit = js.native
}
