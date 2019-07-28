package typings.phaser.PhaserNs.PhysicsNs.ImpactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Physics.Impact.Events")
@js.native
object EventsNs extends js.Object {
  /**
    * The Impact Physics World Collide Event.
    * 
    * This event is dispatched by an Impact Physics World instance if two bodies collide.
    * 
    * Listen to it from a Scene using: `this.impact.world.on('collide', listener)`.
    */
  val COLLIDE: js.Any = js.native
  /**
    * The Impact Physics World Pause Event.
    * 
    * This event is dispatched by an Impact Physics World instance when it is paused.
    * 
    * Listen to it from a Scene using: `this.impact.world.on('pause', listener)`.
    */
  val PAUSE: js.Any = js.native
  /**
    * The Impact Physics World Resume Event.
    * 
    * This event is dispatched by an Impact Physics World instance when it resumes from a paused state.
    * 
    * Listen to it from a Scene using: `this.impact.world.on('resume', listener)`.
    */
  val RESUME: js.Any = js.native
}

