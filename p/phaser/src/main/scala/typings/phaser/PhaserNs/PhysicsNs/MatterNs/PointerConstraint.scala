package typings.phaser.PhaserNs.PhysicsNs.MatterNs

import typings.phaser.MatterJSNs.Body
import typings.phaser.PhaserNs.CamerasNs.Scene2DNs.Camera
import typings.phaser.PhaserNs.InputNs.Pointer
import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.PhaserNs.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Pointer Constraint is a special type of constraint that allows you to click
  * and drag bodies in a Matter World. It monitors the active Pointers in a Scene,
  * and when one is pressed down it checks to see if that hit any part of any active
  * body in the world. If it did, and the body has input enabled, it will begin to
  * drag it until either released, or you stop it via the `stopDrag` method.
  * 
  * You can adjust the stiffness, length and other properties of the constraint via
  * the `options` object on creation.
  */
@JSGlobal("Phaser.Physics.Matter.PointerConstraint")
@js.native
class PointerConstraint protected () extends js.Object {
  /**
    * 
    * @param scene A reference to the Scene to which this Pointer Constraint belongs.
    * @param world A reference to the Matter World instance to which this Constraint belongs.
    * @param options A Constraint configuration object.
    */
  def this(scene: Scene, world: World) = this()
  def this(scene: Scene, world: World, options: js.Object) = this()
  /**
    * Is this Constraint active or not?
    * 
    * An active constraint will be processed each update. An inactive one will be skipped.
    * Use this to toggle a Pointer Constraint on and off.
    */
  var active: Boolean = js.native
  /**
    * The body that is currently being dragged, if any.
    */
  var body: Body = js.native
  /**
    * The Camera the Pointer was interacting with when the input
    * down event was processed.
    */
  var camera: Camera = js.native
  /**
    * The native Matter Constraint that is used to attach to bodies.
    */
  var constraint: js.Object = js.native
  /**
    * The part of the body that was clicked on to start the drag.
    */
  var part: Body = js.native
  /**
    * A reference to the Input Pointer that activated this Constraint.
    * This is set in the `onDown` handler.
    */
  var pointer: Pointer = js.native
  /**
    * The internal transformed position.
    */
  var position: Vector2 = js.native
  /**
    * A reference to the Scene to which this Pointer Constraint belongs.
    * This is the same Scene as the Matter World instance.
    */
  var scene: Scene = js.native
  /**
    * A reference to the Matter World instance to which this Constraint belongs.
    */
  var world: World = js.native
  /**
    * Destroys this Pointer Constraint instance and all of its references.
    */
  def destroy(): Unit = js.native
  /**
    * Scans all active bodies in the current Matter World to see if any of them
    * are hit by the Pointer. The _first one_ found to hit is set as the active contraint
    * body.
    */
  def getBody(): Boolean = js.native
  /**
    * Scans the current body to determine if a part of it was clicked on.
    * If a part is found the body is set as the `constraint.bodyB` property,
    * as well as the `body` property of this class. The part is also set.
    * @param body The Matter Body to check.
    * @param position A translated hit test position.
    */
  def hitTestBody(body: Body, position: Vector2): Boolean = js.native
  /**
    * A Pointer has been pressed down onto the Scene.
    * 
    * If this Constraint doesn't have an active Pointer then a hit test is
    * run against all active bodies in the world. If one is found it is bound
    * to this constraint and the drag begins.
    * @param pointer A reference to the Pointer that was pressed.
    */
  def onDown(pointer: Pointer): Unit = js.native
  /**
    * Stops the Pointer Constraint from dragging the body any further.
    * 
    * This is called automatically if the Pointer is released while actively
    * dragging a body. Or, you can call it manually to release a body from a
    * constraint without having to first release the pointer.
    */
  def stopDrag(): Unit = js.native
  /**
    * Internal update handler. Called in the Matter BEFORE_UPDATE step.
    */
  def update(): Unit = js.native
}

