package typings.phaser.Phaser.Physics.Matter.Events

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Matter Physics Collision Active Event.
  * 
  * This event is dispatched by a Matter Physics World instance after the engine has updated.
  * It provides a list of all pairs that are colliding in the current tick (if any).
  * 
  * Listen to it from a Scene using: `this.matter.world.on('collisionactive', listener)`.
  */
@JSGlobal("Phaser.Physics.Matter.Events.COLLISION_ACTIVE")
@js.native
object COLLISION_ACTIVE
  extends TopLevel[js.Any]

