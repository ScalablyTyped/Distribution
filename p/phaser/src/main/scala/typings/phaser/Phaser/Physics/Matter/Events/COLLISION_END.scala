package typings.phaser.Phaser.Physics.Matter.Events

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Matter Physics Collision End Event.
  * 
  * This event is dispatched by a Matter Physics World instance after the engine has updated.
  * It provides a list of all pairs that have finished colliding in the current tick (if any).
  * 
  * Listen to it from a Scene using: `this.matter.world.on('collisionend', listener)`.
  */
@JSGlobal("Phaser.Physics.Matter.Events.COLLISION_END")
@js.native
object COLLISION_END
  extends TopLevel[js.Any]

