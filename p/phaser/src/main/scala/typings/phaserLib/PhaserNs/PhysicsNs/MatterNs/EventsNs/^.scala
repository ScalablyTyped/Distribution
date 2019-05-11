package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Physics.Matter.Events")
@js.native
object ^ extends js.Object {
  /**
    * The Matter Physics After Update Event.
    * 
    * This event is dispatched by a Matter Physics World instance after the engine has updated and all collision events have resolved.
    * 
    * Listen to it from a Scene using: `this.matter.world.on('afterupdate', listener)`.
    */
  val AFTER_UPDATE: js.Any = js.native
  /**
    * The Matter Physics Before Update Event.
    * 
    * This event is dispatched by a Matter Physics World instance right before all the collision processing takes place.
    * 
    * Listen to it from a Scene using: `this.matter.world.on('beforeupdate', listener)`.
    */
  val BEFORE_UPDATE: js.Any = js.native
  /**
    * The Matter Physics Collision Active Event.
    * 
    * This event is dispatched by a Matter Physics World instance after the engine has updated.
    * It provides a list of all pairs that are colliding in the current tick (if any).
    * 
    * Listen to it from a Scene using: `this.matter.world.on('collisionactive', listener)`.
    */
  val COLLISION_ACTIVE: js.Any = js.native
  /**
    * The Matter Physics Collision End Event.
    * 
    * This event is dispatched by a Matter Physics World instance after the engine has updated.
    * It provides a list of all pairs that have finished colliding in the current tick (if any).
    * 
    * Listen to it from a Scene using: `this.matter.world.on('collisionend', listener)`.
    */
  val COLLISION_END: js.Any = js.native
  /**
    * The Matter Physics Collision Start Event.
    * 
    * This event is dispatched by a Matter Physics World instance after the engine has updated.
    * It provides a list of all pairs that have started to collide in the current tick (if any).
    * 
    * Listen to it from a Scene using: `this.matter.world.on('collisionstart', listener)`.
    */
  val COLLISION_START: js.Any = js.native
  /**
    * The Matter Physics Drag Event.
    * 
    * This event is dispatched by a Matter Physics World instance when a Pointer Constraint
    * is actively dragging a body. It is emitted each time the pointer moves.
    * 
    * Listen to it from a Scene using: `this.matter.world.on('drag', listener)`.
    */
  val DRAG: js.Any = js.native
  /**
    * The Matter Physics Drag End Event.
    * 
    * This event is dispatched by a Matter Physics World instance when a Pointer Constraint
    * stops dragging a body.
    * 
    * Listen to it from a Scene using: `this.matter.world.on('dragend', listener)`.
    */
  val DRAG_END: js.Any = js.native
  /**
    * The Matter Physics Drag Start Event.
    * 
    * This event is dispatched by a Matter Physics World instance when a Pointer Constraint
    * starts dragging a body.
    * 
    * Listen to it from a Scene using: `this.matter.world.on('dragstart', listener)`.
    */
  val DRAG_START: js.Any = js.native
  /**
    * The Matter Physics World Pause Event.
    * 
    * This event is dispatched by an Matter Physics World instance when it is paused.
    * 
    * Listen to it from a Scene using: `this.matter.world.on('pause', listener)`.
    */
  val PAUSE: js.Any = js.native
  /**
    * The Matter Physics World Resume Event.
    * 
    * This event is dispatched by an Matter Physics World instance when it resumes from a paused state.
    * 
    * Listen to it from a Scene using: `this.matter.world.on('resume', listener)`.
    */
  val RESUME: js.Any = js.native
  /**
    * The Matter Physics Sleep End Event.
    * 
    * This event is dispatched by a Matter Physics World instance when a Body stop sleeping.
    * 
    * Listen to it from a Scene using: `this.matter.world.on('sleepend', listener)`.
    */
  val SLEEP_END: js.Any = js.native
  /**
    * The Matter Physics Sleep Start Event.
    * 
    * This event is dispatched by a Matter Physics World instance when a Body goes to sleep.
    * 
    * Listen to it from a Scene using: `this.matter.world.on('sleepstart', listener)`.
    */
  val SLEEP_START: js.Any = js.native
}

