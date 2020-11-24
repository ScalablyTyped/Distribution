package typings.phaser.Phaser.Physics.Arcade

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Graphics
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Types.Physics.Arcade.ArcadeBodyBounds
import typings.phaser.Phaser.Types.Physics.Arcade.ArcadeBodyCollision
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Static Arcade Physics Body.
  * 
  * A Static Body never moves, and isn't automatically synchronized with its parent Game Object.
  * That means if you make any change to the parent's origin, position, or scale after creating or adding the body, you'll need to update the Static Body manually.
  * 
  * A Static Body can collide with other Bodies, but is never moved by collisions.
  * 
  * Its dynamic counterpart is {@link Phaser.Physics.Arcade.Body}.
  */
@js.native
trait StaticBody extends js.Object {
  
  /**
    * A constant `false` value expected by the Arcade Physics simulation.
    */
  val allowGravity: Boolean = js.native
  
  /**
    * Whether this StaticBody has ever collided with a tile or the world boundary.
    */
  var blocked: ArcadeBodyCollision = js.native
  
  /**
    * The lowest y coordinate of the area of the StaticBody. (y + height)
    */
  val bottom: Double = js.native
  
  /**
    * Rebound, or restitution, following a collision, relative to 1. Always zero for a Static Body.
    */
  val bounce: Vector2 = js.native
  
  /**
    * The center of the Static Body's boundary.
    * This is the midpoint of its `position` (top-left corner) and its bottom-right corner.
    */
  var center: Vector2 = js.native
  
  /**
    * Whether this StaticBody is checked for collisions and for which directions. You can set `checkCollision.none = false` to disable collision checks.
    */
  var checkCollision: ArcadeBodyCollision = js.native
  
  /**
    * Whether this StaticBody interacts with the world boundary.
    * Always false for a Static Body. (Static Bodies never collide with the world boundary.)
    */
  val collideWorldBounds: Boolean = js.native
  
  /**
    * A flag disabling the default horizontal separation of colliding bodies. Pass your own `collideHandler` to the collider.
    */
  var customSeparateX: Boolean = js.native
  
  /**
    * A flag disabling the default vertical separation of colliding bodies. Pass your own `collideHandler` to the collider.
    */
  var customSeparateY: Boolean = js.native
  
  /**
    * The color of this Static Body on the debug display.
    */
  var debugBodyColor: integer = js.native
  
  /**
    * Whether the Static Body's boundary is drawn to the debug display.
    */
  var debugShowBody: Boolean = js.native
  
  /**
    * The absolute (non-negative) change in this StaticBody's horizontal position from the previous step. Always zero.
    */
  def deltaAbsX(): Double = js.native
  
  /**
    * The absolute (non-negative) change in this StaticBody's vertical position from the previous step. Always zero.
    */
  def deltaAbsY(): Double = js.native
  
  /**
    * The change in this StaticBody's horizontal position from the previous step. Always zero.
    */
  def deltaX(): Double = js.native
  
  /**
    * The change in this StaticBody's vertical position from the previous step. Always zero.
    */
  def deltaY(): Double = js.native
  
  /**
    * The change in this StaticBody's rotation from the previous step. Always zero.
    */
  def deltaZ(): Double = js.native
  
  /**
    * Disables this Body and marks it for destruction during the next step.
    */
  def destroy(): Unit = js.native
  
  /**
    * Draws a graphical representation of the StaticBody for visual debugging purposes.
    * @param graphic The Graphics object to use for the debug drawing of the StaticBody.
    */
  def drawDebug(graphic: Graphics): Unit = js.native
  
  /**
    * Whether this StaticBody has ever overlapped with another while both were not moving.
    */
  var embedded: Boolean = js.native
  
  /**
    * Whether this Static Body is updated by the physics simulation.
    */
  var enable: Boolean = js.native
  
  /**
    * The Game Object this Static Body belongs to.
    */
  var gameObject: GameObject = js.native
  
  /**
    * Returns the x and y coordinates of the top left and bottom right points of the StaticBody.
    * @param obj The object which will hold the coordinates of the bounds.
    */
  def getBounds(obj: ArcadeBodyBounds): ArcadeBodyBounds = js.native
  
  /**
    * Gravitational force applied specifically to this Body. Values are in pixels per second squared. Always zero for a Static Body.
    */
  val gravity: Vector2 = js.native
  
  /**
    * Half the Static Body's height, in pixels.
    * If the Static Body is circular, this is also the Static Body's radius.
    */
  var halfHeight: Double = js.native
  
  /**
    * Half the Static Body's width, in pixels.
    * If the Static Body is circular, this is also the Static Body's radius.
    */
  var halfWidth: Double = js.native
  
  /**
    * The height of the Static Body's boundary, in pixels.
    * If the Static Body is circular, this is also the Static Body's diameter.
    */
  var height: Double = js.native
  
  /**
    * Checks to see if a given x,y coordinate is colliding with this Static Body.
    * @param x The x coordinate to check against this body.
    * @param y The y coordinate to check against this body.
    */
  def hitTest(x: Double, y: Double): Boolean = js.native
  
  /**
    * Whether this object can be moved by collisions with another body.
    */
  var immovable: Boolean = js.native
  
  /**
    * Whether this Static Body's boundary is circular (`true`) or rectangular (`false`).
    */
  var isCircle: Boolean = js.native
  
  /**
    * Returns the left-most x coordinate of the area of the StaticBody.
    */
  val left: Double = js.native
  
  /**
    * The StaticBody's inertia, relative to a default unit (1). With `bounce`, this affects the exchange of momentum (velocities) during collisions.
    */
  var mass: Double = js.native
  
  /**
    * The offset set by {@link Phaser.Physics.Arcade.StaticBody#setCircle} or {@link Phaser.Physics.Arcade.StaticBody#setSize}.
    * 
    * This doesn't affect the Static Body's position, because a Static Body does not follow its Game Object.
    */
  val offset: Vector2 = js.native
  
  /**
    * Whether the simulation emits a `collide` event when this StaticBody collides with another.
    */
  var onCollide: Boolean = js.native
  
  /**
    * Whether the simulation emits an `overlap` event when this StaticBody overlaps with another.
    */
  var onOverlap: Boolean = js.native
  
  /**
    * Whether the simulation emits a `worldbounds` event when this StaticBody collides with the world boundary.
    * Always false for a Static Body. (Static Bodies never collide with the world boundary and never trigger a `worldbounds` event.)
    */
  val onWorldBounds: Boolean = js.native
  
  /**
    * The amount of overlap (before separation), if this StaticBody is circular and colliding with another circular body.
    */
  var overlapR: Double = js.native
  
  /**
    * The amount of horizontal overlap (before separation), if this Body is colliding with another.
    */
  var overlapX: Double = js.native
  
  /**
    * The amount of vertical overlap (before separation), if this Body is colliding with another.
    */
  var overlapY: Double = js.native
  
  /**
    * The StaticBody's physics type (static by default).
    */
  var physicsType: integer = js.native
  
  /**
    * The position of this Static Body within the simulation.
    */
  var position: Vector2 = js.native
  
  /**
    * NOOP
    */
  def postUpdate(): Unit = js.native
  
  /**
    * If this Static Body is circular, this is the radius of the boundary, as set by {@link Phaser.Physics.Arcade.StaticBody#setCircle}, in pixels.
    * Equal to `halfWidth`.
    */
  var radius: Double = js.native
  
  /**
    * Resets this Body to the given coordinates. Also positions its parent Game Object to the same coordinates.
    * @param x The x coordinate to reset the body to. If not given will use the parent Game Object's coordinate.
    * @param y The y coordinate to reset the body to. If not given will use the parent Game Object's coordinate.
    */
  def reset(): Unit = js.native
  def reset(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def reset(x: Double): Unit = js.native
  def reset(x: Double, y: Double): Unit = js.native
  
  /**
    * The right-most x coordinate of the area of the StaticBody.
    */
  val right: Double = js.native
  
  /**
    * Sets this Static Body to have a circular body and sets its size and position.
    * @param radius The radius of the StaticBody, in pixels.
    * @param offsetX The horizontal offset of the StaticBody from its Game Object, in pixels.
    * @param offsetY The vertical offset of the StaticBody from its Game Object, in pixels.
    */
  def setCircle(radius: Double): StaticBody = js.native
  def setCircle(radius: Double, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): StaticBody = js.native
  def setCircle(radius: Double, offsetX: Double): StaticBody = js.native
  def setCircle(radius: Double, offsetX: Double, offsetY: Double): StaticBody = js.native
  
  /**
    * Changes the Game Object this Body is bound to.
    * First it removes its reference from the old Game Object, then sets the new one.
    * You can optionally update the position and dimensions of this Body to reflect that of the new Game Object.
    * @param gameObject The new Game Object that will own this Body.
    * @param update Reposition and resize this Body to match the new Game Object? Default true.
    */
  def setGameObject(gameObject: GameObject): StaticBody = js.native
  def setGameObject(gameObject: GameObject, update: Boolean): StaticBody = js.native
  
  /**
    * Sets the Mass of the StaticBody. Will set the Mass to 0.1 if the value passed is less than or equal to zero.
    * @param value The value to set the Mass to. Values of zero or less are changed to 0.1.
    */
  def setMass(value: Double): StaticBody = js.native
  
  /**
    * Positions the Static Body at an offset from its Game Object.
    * @param x The horizontal offset of the Static Body from the Game Object's `x`.
    * @param y The vertical offset of the Static Body from the Game Object's `y`.
    */
  def setOffset(x: Double, y: Double): StaticBody = js.native
  
  /**
    * Sets the size of the Static Body.
    * When `center` is true, also repositions it.
    * Resets the width and height to match current frame, if no width and height provided and a frame is found.
    * @param width The width of the Static Body in pixels. Cannot be zero. If not given, and the parent Game Object has a frame, it will use the frame width.
    * @param height The height of the Static Body in pixels. Cannot be zero. If not given, and the parent Game Object has a frame, it will use the frame height.
    * @param center Place the Static Body's center on its Game Object's center. Only works if the Game Object has the `getCenter` method. Default true.
    */
  def setSize(): StaticBody = js.native
  def setSize(width: js.UndefOr[scala.Nothing], height: js.UndefOr[scala.Nothing], center: Boolean): StaticBody = js.native
  def setSize(width: js.UndefOr[scala.Nothing], height: integer): StaticBody = js.native
  def setSize(width: js.UndefOr[scala.Nothing], height: integer, center: Boolean): StaticBody = js.native
  def setSize(width: integer): StaticBody = js.native
  def setSize(width: integer, height: js.UndefOr[scala.Nothing], center: Boolean): StaticBody = js.native
  def setSize(width: integer, height: integer): StaticBody = js.native
  def setSize(width: integer, height: integer, center: Boolean): StaticBody = js.native
  
  /**
    * NOOP function. A Static Body cannot be stopped.
    */
  def stop(): StaticBody = js.native
  
  /**
    * The highest y coordinate of the area of the StaticBody.
    */
  val top: Double = js.native
  
  /**
    * Whether this StaticBody has ever collided with another body and in which direction.
    */
  var touching: ArcadeBodyCollision = js.native
  
  /**
    * Updates the StaticBody's `center` from its `position` and dimensions.
    */
  def updateCenter(): Unit = js.native
  
  /**
    * Syncs the Static Body's position and size with its parent Game Object.
    */
  def updateFromGameObject(): StaticBody = js.native
  
  /**
    * A constant zero velocity used by the Arcade Physics simulation for calculations.
    */
  val velocity: Vector2 = js.native
  
  /**
    * Whether this StaticBody was colliding with another body during the last step or any previous step, and in which direction.
    */
  var wasTouching: ArcadeBodyCollision = js.native
  
  /**
    * The width of the Static Body's boundary, in pixels.
    * If the Static Body is circular, this is also the Static Body's diameter.
    */
  var width: Double = js.native
  
  /**
    * Indicates whether the StaticBody is going to be showing a debug visualization during postUpdate.
    */
  def willDrawDebug(): Boolean = js.native
  
  /**
    * The Arcade Physics simulation this Static Body belongs to.
    */
  var world: World = js.native
  
  /**
    * The x coordinate of the StaticBody.
    */
  var x: Double = js.native
  
  /**
    * The y coordinate of the StaticBody.
    */
  var y: Double = js.native
}
