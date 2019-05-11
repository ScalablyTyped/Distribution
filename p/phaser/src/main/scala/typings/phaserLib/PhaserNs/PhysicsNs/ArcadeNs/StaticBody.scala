package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Static Arcade Physics Body.
  * 
  * A Static Body never moves, and isn't automatically synchronized with its parent Game Object.
  * That means if you make any change to the parent's origin, position, or scale after creating or adding the body, you'll need to update the Body manually.
  * 
  * A Static Body can collide with other Bodies, but is never moved by collisions.
  * 
  * Its dynamic counterpart is {@link Phaser.Physics.Arcade.Body}.
  */
@JSGlobal("Phaser.Physics.Arcade.StaticBody")
@js.native
class StaticBody protected () extends js.Object {
  /**
    * 
    * @param world The Arcade Physics simulation this Static Body belongs to.
    * @param gameObject The Game Object this Static Body belongs to.
    */
  def this(world: World, gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject) = this()
  /**
    * A constant `false` value expected by the Arcade Physics simulation.
    */
  val allowGravity: scala.Boolean = js.native
  /**
    * Whether this StaticBody has ever collided with a tile or the world boundary.
    */
  var blocked: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeBodyCollision = js.native
  /**
    * The lowest y coordinate of the area of the StaticBody. (y + height)
    */
  val bottom: scala.Double = js.native
  /**
    * Rebound, or restitution, following a collision, relative to 1. Always zero for a Static Body.
    */
  val bounce: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * The center of the Static Body's boundary.
    * This is the midpoint of its `position` (top-left corner) and its bottom-right corner.
    */
  var center: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * Whether this StaticBody is checked for collisions and for which directions. You can set `checkCollision.none = false` to disable collision checks.
    */
  var checkCollision: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeBodyCollision = js.native
  /**
    * Whether this StaticBody interacts with the world boundary.
    * Always false for a Static Body. (Static Bodies never collide with the world boundary.)
    */
  val collideWorldBounds: scala.Boolean = js.native
  /**
    * A flag disabling the default horizontal separation of colliding bodies. Pass your own `collideHandler` to the collider.
    */
  var customSeparateX: scala.Boolean = js.native
  /**
    * A flag disabling the default vertical separation of colliding bodies. Pass your own `collideHandler` to the collider.
    */
  var customSeparateY: scala.Boolean = js.native
  /**
    * The color of this Static Body on the debug display.
    */
  var debugBodyColor: phaserLib.integer = js.native
  /**
    * Whether the Static Body's boundary is drawn to the debug display.
    */
  var debugShowBody: scala.Boolean = js.native
  /**
    * Whether this StaticBody has ever overlapped with another while both were not moving.
    */
  var embedded: scala.Boolean = js.native
  /**
    * Whether this Static Body is updated by the physics simulation.
    */
  var enable: scala.Boolean = js.native
  /**
    * The Game Object this Static Body belongs to.
    */
  var gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Gravitational force applied specifically to this Body. Values are in pixels per second squared. Always zero for a Static Body.
    */
  val gravity: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * Half the Static Body's height, in pixels.
    * If the Static Body is circular, this is also the Static Body's radius.
    */
  var halfHeight: scala.Double = js.native
  /**
    * Half the Static Body's width, in pixels.
    * If the Static Body is circular, this is also the Static Body's radius.
    */
  var halfWidth: scala.Double = js.native
  /**
    * The height of the Static Body's boundary, in pixels.
    * If the Static Body is circular, this is also the Static Body's diameter.
    */
  var height: scala.Double = js.native
  /**
    * Whether this object can be moved by collisions with another body.
    */
  var immovable: scala.Boolean = js.native
  /**
    * Whether this Static Body's boundary is circular (`true`) or rectangular (`false`).
    */
  var isCircle: scala.Boolean = js.native
  /**
    * Returns the left-most x coordinate of the area of the StaticBody.
    */
  val left: scala.Double = js.native
  /**
    * The StaticBody's inertia, relative to a default unit (1). With `bounce`, this affects the exchange of momentum (velocities) during collisions.
    */
  var mass: scala.Double = js.native
  /**
    * The offset of this Static Body's actual position from any updated position.
    * 
    * Unlike a dynamic Body, a Static Body does not follow its Game Object. As such, this offset is only applied when resizing the Static Body.
    */
  var offset: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * Whether the simulation emits a `collide` event when this StaticBody collides with another.
    */
  var onCollide: scala.Boolean = js.native
  /**
    * Whether the simulation emits an `overlap` event when this StaticBody overlaps with another.
    */
  var onOverlap: scala.Boolean = js.native
  /**
    * Whether the simulation emits a `worldbounds` event when this StaticBody collides with the world boundary.
    * Always false for a Static Body. (Static Bodies never collide with the world boundary and never trigger a `worldbounds` event.)
    */
  val onWorldBounds: scala.Boolean = js.native
  /**
    * The amount of overlap (before separation), if this StaticBody is circular and colliding with another circular body.
    */
  var overlapR: scala.Double = js.native
  /**
    * The amount of horizontal overlap (before separation), if this Body is colliding with another.
    */
  var overlapX: scala.Double = js.native
  /**
    * The amount of vertical overlap (before separation), if this Body is colliding with another.
    */
  var overlapY: scala.Double = js.native
  /**
    * The StaticBody's physics type (static by default).
    */
  var physicsType: phaserLib.integer = js.native
  /**
    * The position of this Static Body within the simulation.
    */
  var position: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * If this Static Body is circular, this is the unscaled radius of the Static Body's boundary, as set by {@link #setCircle}, in source pixels.
    * The true radius is equal to `halfWidth`.
    */
  var radius: scala.Double = js.native
  /**
    * The right-most x coordinate of the area of the StaticBody.
    */
  val right: scala.Double = js.native
  /**
    * The highest y coordinate of the area of the StaticBody.
    */
  val top: scala.Double = js.native
  /**
    * Whether this StaticBody has ever collided with another body and in which direction.
    */
  var touching: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeBodyCollision = js.native
  /**
    * A constant zero velocity used by the Arcade Physics simulation for calculations.
    */
  val velocity: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * Whether this StaticBody was colliding with another body during the last step or any previous step, and in which direction.
    */
  var wasTouching: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeBodyCollision = js.native
  /**
    * The width of the Static Body's boundary, in pixels.
    * If the Static Body is circular, this is also the Static Body's diameter.
    */
  var width: scala.Double = js.native
  /**
    * The Arcade Physics simulation this Static Body belongs to.
    */
  var world: World = js.native
  /**
    * The x coordinate of the StaticBody.
    */
  var x: scala.Double = js.native
  /**
    * The y coordinate of the StaticBody.
    */
  var y: scala.Double = js.native
  /**
    * The absolute (non-negative) change in this StaticBody's horizontal position from the previous step. Always zero.
    */
  def deltaAbsX(): scala.Double = js.native
  /**
    * The absolute (non-negative) change in this StaticBody's vertical position from the previous step. Always zero.
    */
  def deltaAbsY(): scala.Double = js.native
  /**
    * The change in this StaticBody's horizontal position from the previous step. Always zero.
    */
  def deltaX(): scala.Double = js.native
  /**
    * The change in this StaticBody's vertical position from the previous step. Always zero.
    */
  def deltaY(): scala.Double = js.native
  /**
    * The change in this StaticBody's rotation from the previous step. Always zero.
    */
  def deltaZ(): scala.Double = js.native
  /**
    * Disables this Body and marks it for destruction during the next step.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Draws a graphical representation of the StaticBody for visual debugging purposes.
    * @param graphic The Graphics object to use for the debug drawing of the StaticBody.
    */
  def drawDebug(graphic: phaserLib.PhaserNs.GameObjectsNs.Graphics): scala.Unit = js.native
  /**
    * Returns the x and y coordinates of the top left and bottom right points of the StaticBody.
    * @param obj The object which will hold the coordinates of the bounds.
    */
  def getBounds(obj: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeBodyBounds): phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeBodyBounds = js.native
  /**
    * Checks to see if a given x,y coordinate is colliding with this Static Body.
    * @param x The x coordinate to check against this body.
    * @param y The y coordinate to check against this body.
    */
  def hitTest(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /**
    * NOOP
    */
  def postUpdate(): scala.Unit = js.native
  /**
    * Resets this Body to the given coordinates. Also positions its parent Game Object to the same coordinates.
    * Similar to `updateFromGameObject`, but doesn't modify the Body's dimensions.
    * @param x The x coordinate to reset the body to. If not given will use the parent Game Object's coordinate.
    * @param y The y coordinate to reset the body to. If not given will use the parent Game Object's coordinate.
    */
  def reset(): scala.Unit = js.native
  def reset(x: scala.Double): scala.Unit = js.native
  def reset(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Sets this Static Body to have a circular body and sets its sizes and position.
    * @param radius The radius of the StaticBody, in pixels.
    * @param offsetX The horizontal offset of the StaticBody from its Game Object, in pixels.
    * @param offsetY The vertical offset of the StaticBody from its Game Object, in pixels.
    */
  def setCircle(radius: scala.Double): StaticBody = js.native
  def setCircle(radius: scala.Double, offsetX: scala.Double): StaticBody = js.native
  def setCircle(radius: scala.Double, offsetX: scala.Double, offsetY: scala.Double): StaticBody = js.native
  /**
    * Changes the Game Object this Body is bound to.
    * First it removes its reference from the old Game Object, then sets the new one.
    * You can optionally update the position and dimensions of this Body to reflect that of the new Game Object.
    * @param gameObject The new Game Object that will own this Body.
    * @param update Reposition and resize this Body to match the new Game Object? Default true.
    */
  def setGameObject(gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject): StaticBody = js.native
  def setGameObject(gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject, update: scala.Boolean): StaticBody = js.native
  /**
    * Sets the Mass of the StaticBody. Will set the Mass to 0.1 if the value passed is less than or equal to zero.
    * @param value The value to set the Mass to. Values of zero or less are changed to 0.1.
    */
  def setMass(value: scala.Double): StaticBody = js.native
  /**
    * Sets the offset of the body.
    * @param x The horizontal offset of the Body from the Game Object's center.
    * @param y The vertical offset of the Body from the Game Object's center.
    */
  def setOffset(x: scala.Double, y: scala.Double): StaticBody = js.native
  /**
    * Sets the size of the body.
    * Resets the width and height to match current frame, if no width and height provided and a frame is found.
    * @param width The width of the Body in pixels. Cannot be zero. If not given, and the parent Game Object has a frame, it will use the frame width.
    * @param height The height of the Body in pixels. Cannot be zero. If not given, and the parent Game Object has a frame, it will use the frame height.
    * @param offsetX The horizontal offset of the Body from the Game Object's center.
    * @param offsetY The vertical offset of the Body from the Game Object's center.
    */
  def setSize(): StaticBody = js.native
  def setSize(width: phaserLib.integer): StaticBody = js.native
  def setSize(width: phaserLib.integer, height: phaserLib.integer): StaticBody = js.native
  def setSize(width: phaserLib.integer, height: phaserLib.integer, offsetX: scala.Double): StaticBody = js.native
  def setSize(width: phaserLib.integer, height: phaserLib.integer, offsetX: scala.Double, offsetY: scala.Double): StaticBody = js.native
  /**
    * NOOP function. A Static Body cannot be stopped.
    */
  def stop(): StaticBody = js.native
  /**
    * Updates the StaticBody's `center` from its `position` and dimensions.
    */
  def updateCenter(): scala.Unit = js.native
  /**
    * Updates this Static Body so that its position and dimensions are updated
    * based on the current Game Object it is bound to.
    */
  def updateFromGameObject(): StaticBody = js.native
  /**
    * Indicates whether the StaticBody is going to be showing a debug visualization during postUpdate.
    */
  def willDrawDebug(): scala.Boolean = js.native
}

