package typings.phaser.Phaser.Physics.Arcade

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Graphics
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Types.Physics.Arcade.ArcadeBodyBounds
import typings.phaser.Phaser.Types.Physics.Arcade.ArcadeBodyCollision
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Dynamic Arcade Body.
  * 
  * Its static counterpart is {@link Phaser.Physics.Arcade.StaticBody}.
  */
@js.native
trait Body extends js.Object {
  /**
    * The Body's change in velocity, in pixels per second squared.
    */
  var acceleration: Vector2 = js.native
  /**
    * Whether this Body's velocity is affected by its `drag`.
    */
  var allowDrag: Boolean = js.native
  /**
    * Whether this Body's position is affected by gravity (local or world).
    */
  var allowGravity: Boolean = js.native
  /**
    * Whether this Body's `rotation` is affected by its angular acceleration and angular velocity.
    */
  var allowRotation: Boolean = js.native
  /**
    * The calculated angle of this Body's velocity vector, in radians, during the last step.
    */
  var angle: Double = js.native
  /**
    * The Body's angular acceleration (change in angular velocity), in degrees per second squared.
    */
  var angularAcceleration: Double = js.native
  /**
    * Loss of angular velocity due to angular movement, in degrees per second.
    * 
    * Angular drag is applied only when angular acceleration is zero.
    */
  var angularDrag: Double = js.native
  /**
    * The rate of change of this Body's `rotation`, in degrees per second.
    */
  var angularVelocity: Double = js.native
  /**
    * Whether this Body is colliding with a Static Body, a tile, or the world boundary.
    * In a collision with a Static Body, if this Body has zero velocity then `embedded` will be set instead.
    */
  var blocked: ArcadeBodyCollision = js.native
  /**
    * The bottom edge of this Body's boundary.
    */
  val bottom: Double = js.native
  /**
    * Rebound following a collision, relative to 1.
    */
  var bounce: Vector2 = js.native
  /**
    * The center of the Body's boundary.
    * The midpoint of its `position` (top-left corner) and its bottom-right corner.
    */
  var center: Vector2 = js.native
  /**
    * Whether this Body is checked for collisions and for which directions.
    * You can set `checkCollision.none = true` to disable collision checks.
    */
  var checkCollision: ArcadeBodyCollision = js.native
  /**
    * Whether this Body interacts with the world boundary.
    */
  var collideWorldBounds: Boolean = js.native
  /**
    * The rectangle used for world boundary collisions.
    * 
    * By default it is set to the world boundary rectangle. Or, if this Body was
    * created by a Physics Group, then whatever rectangle that Group defined.
    * 
    * You can also change it by using the `Body.setBoundsRectangle` method.
    */
  var customBoundsRectangle: Rectangle = js.native
  /**
    * A flag disabling the default horizontal separation of colliding bodies.
    * Pass your own `collideCallback` to the collider.
    */
  var customSeparateX: Boolean = js.native
  /**
    * A flag disabling the default vertical separation of colliding bodies.
    * Pass your own `collideCallback` to the collider.
    */
  var customSeparateY: Boolean = js.native
  /**
    * The color of this Body on the debug display.
    */
  var debugBodyColor: integer = js.native
  /**
    * Whether the Body's boundary is drawn to the debug display.
    */
  var debugShowBody: Boolean = js.native
  /**
    * Whether the Body's velocity is drawn to the debug display.
    */
  var debugShowVelocity: Boolean = js.native
  /**
    * The Body's absolute maximum change in position, in pixels per step.
    */
  var deltaMax: Vector2 = js.native
  /**
    * When `useDamping` is false (the default), this is absolute loss of velocity due to movement, in pixels per second squared (a vector).
    * The x and y components are applied separately.
    * 
    * When `useDamping` is true, this is 1 minus the damping factor (a number).
    * A value of 1 means the Body loses no velocity.
    * A value of 0.95 means the Body loses 5% of its velocity per step.
    * A value of 0.5 means the Body loses 50% of its velocity per step.
    * 
    * Drag is applied only when `acceleration` is zero.
    */
  var drag: Vector2 | Double = js.native
  /**
    * Whether this Body is overlapped with another and both are not moving, on at least one axis.
    */
  var embedded: Boolean = js.native
  /**
    * Whether this Body is updated by the physics simulation.
    */
  var enable: Boolean = js.native
  /**
    * The direction of the Body's velocity, as calculated during the last step.
    * If the Body is moving on both axes (diagonally), this describes motion on the vertical axis only.
    */
  var facing: integer = js.native
  /**
    * If this Body is `immovable` and in motion, `friction` is the proportion of this Body's motion received by the riding Body on each axis, relative to 1.
    * The horizontal component (x) is applied only when two colliding Bodies are separated vertically.
    * The vertical component (y) is applied only when two colliding Bodies are separated horizontally.
    * The default value (1, 0) moves the riding Body horizontally in equal proportion to this Body and vertically not at all.
    */
  var friction: Vector2 = js.native
  /**
    * The Game Object this Body belongs to.
    */
  var gameObject: GameObject = js.native
  /**
    * Acceleration due to gravity (specific to this Body), in pixels per second squared.
    * Total gravity is the sum of this vector and the simulation's `gravity`.
    */
  var gravity: Vector2 = js.native
  /**
    * Half the Body's height, in pixels.
    */
  var halfHeight: Double = js.native
  /**
    * Half the Body's width, in pixels.
    */
  var halfWidth: Double = js.native
  /**
    * The height of the Body boundary, in pixels.
    * If the Body is circular, this is also the diameter.
    * If you wish to change the height use the `Body.setSize` method.
    */
  val height: Double = js.native
  /**
    * Whether this Body can be moved by collisions with another Body.
    */
  var immovable: Boolean = js.native
  /**
    * Whether this Body's boundary is circular (true) or rectangular (false).
    */
  var isCircle: Boolean = js.native
  /**
    * The left edge of the Body's boundary. Identical to x.
    */
  val left: Double = js.native
  /**
    * The Body's inertia, relative to a default unit (1).
    * With `bounce`, this affects the exchange of momentum (velocities) during collisions.
    */
  var mass: Double = js.native
  /**
    * The Body's maximum angular velocity, in degrees per second.
    */
  var maxAngular: Double = js.native
  /**
    * The maximum speed this Body is allowed to reach, in pixels per second.
    * 
    * If not negative it limits the scalar value of speed.
    * 
    * Any negative value means no maximum is being applied (the default).
    */
  var maxSpeed: Double = js.native
  /**
    * The Body's absolute maximum velocity, in pixels per second.
    * The horizontal and vertical components are applied separately.
    */
  var maxVelocity: Vector2 = js.native
  /**
    * Whether the Body's position and rotation are affected by its velocity, acceleration, drag, and gravity.
    */
  var moves: Boolean = js.native
  /**
    * The Body's change in position (due to velocity) at the last step, in pixels.
    * 
    * The size of this value depends on the simulation's step rate.
    */
  val newVelocity: Vector2 = js.native
  /**
    * The offset of this Body's position from its Game Object's position, in source pixels.
    */
  var offset: Vector2 = js.native
  /**
    * Whether the simulation emits a `collide` event when this Body collides with another.
    */
  var onCollide: Boolean = js.native
  /**
    * Whether the simulation emits an `overlap` event when this Body overlaps with another.
    */
  var onOverlap: Boolean = js.native
  /**
    * Whether the simulation emits a `worldbounds` event when this Body collides with the world boundary (and `collideWorldBounds` is also true).
    */
  var onWorldBounds: Boolean = js.native
  /**
    * The amount of overlap (before separation), if this Body is circular and colliding with another circular body.
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
    * The Body's physics type (dynamic or static).
    */
  val physicsType: integer = js.native
  /**
    * The position of this Body within the simulation.
    */
  var position: Vector2 = js.native
  /**
    * The Body rotation, in degrees, during the previous step.
    */
  var preRotation: Double = js.native
  /**
    * The position of this Body during the previous step.
    */
  var prev: Vector2 = js.native
  /**
    * The position of this Body during the previous frame.
    */
  var prevFrame: Vector2 = js.native
  /**
    * If this Body is circular, this is the unscaled radius of the Body's boundary, as set by setCircle(), in source pixels.
    * The true radius is equal to `halfWidth`.
    */
  var radius: Double = js.native
  /**
    * The right edge of the Body's boundary.
    */
  val right: Double = js.native
  /**
    * This body's rotation, in degrees, based on its angular acceleration and angular velocity.
    * The Body's rotation controls the `angle` of its Game Object.
    * It doesn't rotate the Body's boundary, which is always an axis-aligned rectangle or a circle.
    */
  var rotation: Double = js.native
  /**
    * The unscaled height of the Body, in source pixels, as set by setSize().
    * The default is the height of the Body's Game Object's texture frame.
    */
  var sourceHeight: Double = js.native
  /**
    * The unscaled width of the Body, in source pixels, as set by setSize().
    * The default is the width of the Body's Game Object's texture frame.
    */
  var sourceWidth: Double = js.native
  /**
    * The calculated magnitude of the Body's velocity, in pixels per second, during the last step.
    */
  var speed: Double = js.native
  /**
    * Whether to automatically synchronize this Body's dimensions to the dimensions of its Game Object's visual bounds.
    */
  var syncBounds: Boolean = js.native
  /**
    * The top edge of the Body's boundary. Identical to y.
    */
  val top: Double = js.native
  /**
    * Whether this Body is colliding with a Body or Static Body and in which direction.
    * In a collision where both bodies have zero velocity, `embedded` will be set instead.
    */
  var touching: ArcadeBodyCollision = js.native
  /**
    * Transformations applied to this Body.
    */
  var transform: js.Object = js.native
  /**
    * If this Body is using `drag` for deceleration this property controls how the drag is applied.
    * If set to `true` drag will use a damping effect rather than a linear approach. If you are
    * creating a game where the Body moves freely at any angle (i.e. like the way the ship moves in
    * the game Asteroids) then you will get a far smoother and more visually correct deceleration
    * by using damping, avoiding the axis-drift that is prone with linear deceleration.
    * 
    * If you enable this property then you should use far smaller `drag` values than with linear, as
    * they are used as a multiplier on the velocity. Values such as 0.95 will give a nice slow
    * deceleration, where-as smaller values, such as 0.5 will stop an object almost immediately.
    */
  var useDamping: Boolean = js.native
  /**
    * The Body's velocity, in pixels per second.
    */
  var velocity: Vector2 = js.native
  /**
    * This Body's `touching` value during the previous step.
    */
  var wasTouching: ArcadeBodyCollision = js.native
  /**
    * The width of the Body boundary, in pixels.
    * If the Body is circular, this is also the diameter.
    * If you wish to change the width use the `Body.setSize` method.
    */
  val width: Double = js.native
  /**
    * The Arcade Physics simulation this Body belongs to.
    */
  var world: World = js.native
  /**
    * Rebound following a collision with the world boundary, relative to 1.
    * If null, `bounce` is used instead.
    */
  var worldBounce: Vector2 = js.native
  /**
    * The Body's horizontal position (left edge).
    */
  var x: Double = js.native
  /**
    * The Body's vertical position (top edge).
    */
  var y: Double = js.native
  /**
    * Checks for collisions between this Body and the world boundary and separates them.
    */
  def checkWorldBounds(): Boolean = js.native
  /**
    * The absolute (non-negative) change in this Body's horizontal position from the previous step.
    */
  def deltaAbsX(): Double = js.native
  /**
    * The absolute (non-negative) change in this Body's vertical position from the previous step.
    */
  def deltaAbsY(): Double = js.native
  /**
    * The change in this Body's horizontal position from the previous step.
    * This value is set during the Body's update phase.
    * 
    * As a Body can update multiple times per step this may not hold the final
    * delta value for the Body. In this case, please see the `deltaXFinal` method.
    */
  def deltaX(): Double = js.native
  /**
    * The change in this Body's horizontal position from the previous game update.
    * 
    * This value is set during the `postUpdate` phase and takes into account the
    * `deltaMax` and final position of the Body.
    * 
    * Because this value is not calculated until `postUpdate`, you must listen for it
    * during a Scene `POST_UPDATE` or `RENDER` event, and not in `update`, as it will
    * not be calculated by that point. If you _do_ use these values in `update` they
    * will represent the delta from the _previous_ game frame.
    */
  def deltaXFinal(): Double = js.native
  /**
    * The change in this Body's vertical position from the previous step.
    * This value is set during the Body's update phase.
    * 
    * As a Body can update multiple times per step this may not hold the final
    * delta value for the Body. In this case, please see the `deltaYFinal` method.
    */
  def deltaY(): Double = js.native
  /**
    * The change in this Body's vertical position from the previous game update.
    * 
    * This value is set during the `postUpdate` phase and takes into account the
    * `deltaMax` and final position of the Body.
    * 
    * Because this value is not calculated until `postUpdate`, you must listen for it
    * during a Scene `POST_UPDATE` or `RENDER` event, and not in `update`, as it will
    * not be calculated by that point. If you _do_ use these values in `update` they
    * will represent the delta from the _previous_ game frame.
    */
  def deltaYFinal(): Double = js.native
  /**
    * The change in this Body's rotation from the previous step, in degrees.
    */
  def deltaZ(): Double = js.native
  /**
    * Disables this Body and marks it for deletion by the simulation.
    */
  def destroy(): Unit = js.native
  /**
    * Draws this Body's boundary and velocity, if enabled.
    * @param graphic The Graphics object to draw on.
    */
  def drawDebug(graphic: Graphics): Unit = js.native
  /**
    * Copies the coordinates of this Body's edges into an object.
    * @param obj An object to copy the values into.
    */
  def getBounds(obj: ArcadeBodyBounds): ArcadeBodyBounds = js.native
  /**
    * Tests if the coordinates are within this Body's boundary.
    * @param x The horizontal coordinate.
    * @param y The vertical coordinate.
    */
  def hitTest(x: Double, y: Double): Boolean = js.native
  /**
    * Whether this Body is touching a tile or the world boundary while moving up.
    */
  def onCeiling(): Boolean = js.native
  /**
    * Whether this Body is touching a tile or the world boundary while moving down.
    */
  def onFloor(): Boolean = js.native
  /**
    * Whether this Body is touching a tile or the world boundary while moving left or right.
    */
  def onWall(): Boolean = js.native
  /**
    * Feeds the Body results back into the parent Game Object.
    * 
    * This method is called every game frame, regardless if the world steps or not.
    */
  def postUpdate(): Unit = js.native
  /**
    * Syncs the position body position with the parent Game Object.
    * 
    * This method is called every game frame, regardless if the world steps or not.
    * @param willStep Will this Body run an update as well?
    * @param delta The delta time, in seconds, elapsed since the last frame.
    */
  def preUpdate(willStep: Boolean, delta: Double): Unit = js.native
  /**
    * Resets this Body to the given coordinates. Also positions its parent Game Object to the same coordinates.
    * If the Body had any velocity or acceleration it is lost as a result of calling this.
    * @param x The horizontal position to place the Game Object and Body.
    * @param y The vertical position to place the Game Object and Body.
    */
  def reset(x: Double, y: Double): Unit = js.native
  /**
    * Prepares the Body for a physics step by resetting the `wasTouching`, `touching` and `blocked` states.
    * 
    * This method is only called if the physics world is going to run a step this frame.
    */
  def resetFlags(): Unit = js.native
  /**
    * Sets the Body's acceleration.
    * @param x The horizontal component, in pixels per second squared.
    * @param y The vertical component, in pixels per second squared.
    */
  def setAcceleration(x: Double, y: Double): Body = js.native
  /**
    * Sets the Body's horizontal acceleration.
    * @param value The acceleration, in pixels per second squared.
    */
  def setAccelerationX(value: Double): Body = js.native
  /**
    * Sets the Body's vertical acceleration.
    * @param value The acceleration, in pixels per second squared.
    */
  def setAccelerationY(value: Double): Body = js.native
  /**
    * Enables or disables drag.
    * @param value `true` to allow drag on this body, or `false` to disable it. Default true.
    */
  def setAllowDrag(): Body = js.native
  def setAllowDrag(value: Boolean): Body = js.native
  /**
    * Enables or disables gravity's effect on this Body.
    * @param value `true` to allow gravity on this body, or `false` to disable it. Default true.
    */
  def setAllowGravity(): Body = js.native
  def setAllowGravity(value: Boolean): Body = js.native
  /**
    * Enables or disables rotation.
    * @param value `true` to allow rotation on this body, or `false` to disable it. Default true.
    */
  def setAllowRotation(): Body = js.native
  def setAllowRotation(value: Boolean): Body = js.native
  /**
    * Sets the Body's angular acceleration.
    * @param value The acceleration, in degrees per second squared.
    */
  def setAngularAcceleration(value: Double): Body = js.native
  /**
    * Sets the Body's angular drag.
    * @param value The drag, in degrees per second squared.
    */
  def setAngularDrag(value: Double): Body = js.native
  /**
    * Sets the Body's angular velocity.
    * @param value The velocity, in degrees per second.
    */
  def setAngularVelocity(value: Double): Body = js.native
  /**
    * Sets the Body's bounce.
    * @param x The horizontal bounce, relative to 1.
    * @param y The vertical bounce, relative to 1.
    */
  def setBounce(x: Double, y: Double): Body = js.native
  /**
    * Sets the Body's horizontal bounce.
    * @param value The bounce, relative to 1.
    */
  def setBounceX(value: Double): Body = js.native
  /**
    * Sets the Body's vertical bounce.
    * @param value The bounce, relative to 1.
    */
  def setBounceY(value: Double): Body = js.native
  /**
    * Sets a custom collision boundary rectangle. Use if you want to have a custom
    * boundary instead of the world boundaries.
    * @param bounds The new boundary rectangle. Pass `null` to use the World bounds.
    */
  def setBoundsRectangle(): this.type = js.native
  def setBoundsRectangle(bounds: Rectangle): this.type = js.native
  /**
    * Sizes and positions this Body's boundary, as a circle.
    * @param radius The radius of the Body, in source pixels.
    * @param offsetX The horizontal offset of the Body from its Game Object, in source pixels.
    * @param offsetY The vertical offset of the Body from its Game Object, in source pixels.
    */
  def setCircle(radius: Double): Body = js.native
  def setCircle(radius: Double, offsetX: Double): Body = js.native
  def setCircle(radius: Double, offsetX: Double, offsetY: Double): Body = js.native
  /**
    * Sets whether this Body collides with the world boundary.
    * 
    * Optionally also sets the World Bounce values. If the `Body.worldBounce` is null, it's set to a new Phaser.Math.Vector2 first.
    * @param value `true` if this body should collide with the world bounds, otherwise `false`. Default true.
    * @param bounceX If given this will be replace the `worldBounce.x` value.
    * @param bounceY If given this will be replace the `worldBounce.y` value.
    */
  def setCollideWorldBounds(): Body = js.native
  def setCollideWorldBounds(value: Boolean): Body = js.native
  def setCollideWorldBounds(value: Boolean, bounceX: Double): Body = js.native
  def setCollideWorldBounds(value: Boolean, bounceX: Double, bounceY: Double): Body = js.native
  /**
    * Sets the Body's drag.
    * @param x The horizontal component, in pixels per second squared.
    * @param y The vertical component, in pixels per second squared.
    */
  def setDrag(x: Double, y: Double): Body = js.native
  /**
    * Sets the Body's horizontal drag.
    * @param value The drag, in pixels per second squared.
    */
  def setDragX(value: Double): Body = js.native
  /**
    * Sets the Body's vertical drag.
    * @param value The drag, in pixels per second squared.
    */
  def setDragY(value: Double): Body = js.native
  /**
    * Sets the Body's `enable` property.
    * @param value The value to assign to `enable`. Default true.
    */
  def setEnable(): Body = js.native
  def setEnable(value: Boolean): Body = js.native
  /**
    * Sets the Body's friction.
    * @param x The horizontal component, relative to 1.
    * @param y The vertical component, relative to 1.
    */
  def setFriction(x: Double, y: Double): Body = js.native
  /**
    * Sets the Body's horizontal friction.
    * @param value The friction value, relative to 1.
    */
  def setFrictionX(value: Double): Body = js.native
  /**
    * Sets the Body's vertical friction.
    * @param value The friction value, relative to 1.
    */
  def setFrictionY(value: Double): Body = js.native
  /**
    * Sets the Body's gravity.
    * @param x The horizontal component, in pixels per second squared.
    * @param y The vertical component, in pixels per second squared.
    */
  def setGravity(x: Double, y: Double): Body = js.native
  /**
    * Sets the Body's horizontal gravity.
    * @param value The gravity, in pixels per second squared.
    */
  def setGravityX(value: Double): Body = js.native
  /**
    * Sets the Body's vertical gravity.
    * @param value The gravity, in pixels per second squared.
    */
  def setGravityY(value: Double): Body = js.native
  /**
    * Sets the Body's `immovable` property.
    * @param value The value to assign to `immovable`. Default true.
    */
  def setImmovable(): Body = js.native
  def setImmovable(value: Boolean): Body = js.native
  /**
    * Sets the Body's mass.
    * @param value The mass value, relative to 1.
    */
  def setMass(value: Double): Body = js.native
  /**
    * Sets the maximum speed the Body can move.
    * @param value The maximum speed value, in pixels per second. Set to a negative value to disable.
    */
  def setMaxSpeed(value: Double): Body = js.native
  /**
    * Sets the Body's maximum velocity.
    * @param x The horizontal velocity, in pixels per second.
    * @param y The vertical velocity, in pixels per second. Default x.
    */
  def setMaxVelocity(x: Double): Body = js.native
  def setMaxVelocity(x: Double, y: Double): Body = js.native
  /**
    * Sets the offset of the Body's position from its Game Object's position.
    * @param x The horizontal offset, in source pixels.
    * @param y The vertical offset, in source pixels. Default x.
    */
  def setOffset(x: Double): Body = js.native
  def setOffset(x: Double, y: Double): Body = js.native
  /**
    * Sizes and positions this Body's boundary, as a rectangle.
    * Modifies the Body `offset` if `center` is true (the default).
    * Resets the width and height to match current frame, if no width and height provided and a frame is found.
    * @param width The width of the Body in pixels. Cannot be zero. If not given, and the parent Game Object has a frame, it will use the frame width.
    * @param height The height of the Body in pixels. Cannot be zero. If not given, and the parent Game Object has a frame, it will use the frame height.
    * @param center Modify the Body's `offset`, placing the Body's center on its Game Object's center. Only works if the Game Object has the `getCenter` method. Default true.
    */
  def setSize(): Body = js.native
  def setSize(width: integer): Body = js.native
  def setSize(width: integer, height: integer): Body = js.native
  def setSize(width: integer, height: integer, center: Boolean): Body = js.native
  /**
    * Sets the Body's velocity.
    * @param x The horizontal velocity, in pixels per second.
    * @param y The vertical velocity, in pixels per second. Default x.
    */
  def setVelocity(x: Double): Body = js.native
  def setVelocity(x: Double, y: Double): Body = js.native
  /**
    * Sets the Body's horizontal velocity.
    * @param value The velocity, in pixels per second.
    */
  def setVelocityX(value: Double): Body = js.native
  /**
    * Sets the Body's vertical velocity.
    * @param value The velocity, in pixels per second.
    */
  def setVelocityY(value: Double): Body = js.native
  /**
    * Sets acceleration, velocity, and speed to zero.
    */
  def stop(): Body = js.native
  /**
    * Performs a single physics step and updates the body velocity, angle, speed and other properties.
    * 
    * This method can be called multiple times per game frame, depending on the physics step rate.
    * 
    * The results are synced back to the Game Object in `postUpdate`.
    * @param delta The delta time, in seconds, elapsed since the last frame.
    */
  def update(delta: Double): Unit = js.native
  /**
    * Updates the Body's `transform`, `width`, `height`, and `center` from its Game Object.
    * The Body's `position` isn't changed.
    */
  def updateBounds(): Unit = js.native
  /**
    * Updates the Body's `center` from its `position`, `width`, and `height`.
    */
  def updateCenter(): Unit = js.native
  /**
    * Whether this Body will be drawn to the debug display.
    */
  def willDrawDebug(): Boolean = js.native
}

