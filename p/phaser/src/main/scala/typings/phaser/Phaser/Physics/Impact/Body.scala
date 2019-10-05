package typings.phaser.Phaser.Physics.Impact

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Graphics
import typings.phaser.Phaser.Types.Math.Vector2Like
import typings.phaser.Phaser.Types.Physics.Impact.BodyUpdateCallback
import typings.phaser.Phaser.Types.Physics.Impact.JSONImpactBody
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Impact.js compatible physics body.
  * This re-creates the properties you'd get on an Entity and the math needed to update them.
  */
@JSGlobal("Phaser.Physics.Impact.Body")
@js.native
class Body protected () extends js.Object {
  /**
    * 
    * @param world [description]
    * @param x [description]
    * @param y [description]
    * @param sx [description] Default 16.
    * @param sy [description] Default 16.
    */
  def this(world: World, x: Double, y: Double) = this()
  def this(world: World, x: Double, y: Double, sx: Double) = this()
  def this(world: World, x: Double, y: Double, sx: Double, sy: Double) = this()
  /**
    * [description]
    */
  var accel: Vector2Like = js.native
  /**
    * [description]
    */
  var accelAir: Double = js.native
  /**
    * [description]
    */
  var accelGround: Double = js.native
  /**
    * [description]
    */
  var bounciness: Double = js.native
  /**
    * [description]
    */
  var checkAgainst: TYPE = js.native
  /**
    * [description]
    */
  var collides: COLLIDES = js.native
  /**
    * [description]
    */
  var debugBodyColor: integer = js.native
  /**
    * [description]
    */
  var debugShowBody: Boolean = js.native
  /**
    * [description]
    */
  var debugShowVelocity: Boolean = js.native
  /**
    * [description]
    */
  var enabled: Boolean = js.native
  /**
    * [description]
    */
  var friction: Vector2Like = js.native
  /**
    * [description]
    */
  var gameObject: GameObject = js.native
  /**
    * [description]
    */
  var gravityFactor: Double = js.native
  /**
    * [description]
    */
  var id: integer = js.native
  /**
    * [description]
    */
  var jumpSpeed: Double = js.native
  /**
    * [description]
    */
  var last: Vector2Like = js.native
  /**
    * [description]
    */
  var maxVel: Vector2Like = js.native
  /**
    * [description]
    */
  var minBounceVelocity: Double = js.native
  /**
    * [description]
    */
  var name: String = js.native
  /**
    * [description]
    */
  var offset: Vector2Like = js.native
  /**
    * The ImpactBody, ImpactSprite or ImpactImage object that owns this Body, if any.
    */
  var parent: ImpactBody | ImpactImage | ImpactSprite = js.native
  /**
    * [description]
    */
  var pos: Vector2Like = js.native
  /**
    * [description]
    */
  var size: Vector2Like = js.native
  /**
    * min 44 deg, max 136 deg
    */
  var slopeStanding: js.Object = js.native
  /**
    * [description]
    */
  var standing: Boolean = js.native
  /**
    * [description]
    */
  var `type`: TYPE = js.native
  /**
    * [description]
    */
  @JSName("updateCallback")
  var updateCallback_Original: BodyUpdateCallback = js.native
  /**
    * [description]
    */
  var vel: Vector2Like = js.native
  /**
    * [description]
    */
  var world: World = js.native
  /**
    * Can be overridden by user code
    * @param other [description]
    */
  def check(other: Body): Unit = js.native
  /**
    * Can be overridden by user code
    * @param other [description]
    * @param axis [description]
    */
  def collideWith(other: Body, axis: String): Unit = js.native
  /**
    * [description]
    */
  def destroy(): Unit = js.native
  /**
    * [description]
    * @param graphic [description]
    */
  def drawDebug(graphic: Graphics): Unit = js.native
  /**
    * [description]
    * @param config [description]
    */
  def fromJSON(config: js.Object): Unit = js.native
  /**
    * Can be overridden by user code but must return a boolean.
    * @param res [description]
    */
  def handleMovementTrace(res: Double): Boolean = js.native
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    */
  def reset(x: Double, y: Double): Unit = js.native
  /**
    * Reset the size and position of the physics body.
    * @param x The x coordinate to position the body.
    * @param y The y coordinate to position the body.
    * @param width The width of the body.
    * @param height The height of the body.
    */
  def resetSize(x: Double, y: Double, width: Double, height: Double): Body = js.native
  /**
    * [description]
    */
  def skipHash(): Boolean = js.native
  /**
    * Export this body object to JSON.
    */
  def toJSON(): JSONImpactBody = js.native
  /**
    * Determines whether the body collides with the `other` one or not.
    * @param other [description]
    */
  def touches(other: Body): Boolean = js.native
  /**
    * [description]
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(delta: Double): Unit = js.native
  /**
    * [description]
    */
  def updateCallback(body: Body): Unit = js.native
  /**
    * [description]
    */
  def willDrawDebug(): Boolean = js.native
}

