package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs

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
  def this(world: World, x: scala.Double, y: scala.Double) = this()
  def this(world: World, x: scala.Double, y: scala.Double, sx: scala.Double) = this()
  def this(world: World, x: scala.Double, y: scala.Double, sx: scala.Double, sy: scala.Double) = this()
  /**
    * [description]
    */
  var accel: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like = js.native
  /**
    * [description]
    */
  var accelAir: scala.Double = js.native
  /**
    * [description]
    */
  var accelGround: scala.Double = js.native
  /**
    * [description]
    */
  var bounciness: scala.Double = js.native
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
  var debugBodyColor: phaserLib.integer = js.native
  /**
    * [description]
    */
  var debugShowBody: scala.Boolean = js.native
  /**
    * [description]
    */
  var debugShowVelocity: scala.Boolean = js.native
  /**
    * [description]
    */
  var enabled: scala.Boolean = js.native
  /**
    * [description]
    */
  var friction: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like = js.native
  /**
    * [description]
    */
  var gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  var gravityFactor: scala.Double = js.native
  /**
    * [description]
    */
  var id: phaserLib.integer = js.native
  /**
    * [description]
    */
  var jumpSpeed: scala.Double = js.native
  /**
    * [description]
    */
  var last: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like = js.native
  /**
    * [description]
    */
  var maxVel: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like = js.native
  /**
    * [description]
    */
  var minBounceVelocity: scala.Double = js.native
  /**
    * [description]
    */
  var name: java.lang.String = js.native
  /**
    * [description]
    */
  var offset: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like = js.native
  /**
    * The ImpactBody, ImpactSprite or ImpactImage object that owns this Body, if any.
    */
  var parent: ImpactBody | ImpactImage | ImpactSprite = js.native
  /**
    * [description]
    */
  var pos: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like = js.native
  /**
    * [description]
    */
  var size: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like = js.native
  /**
    * min 44 deg, max 136 deg
    */
  var slopeStanding: js.Object = js.native
  /**
    * [description]
    */
  var standing: scala.Boolean = js.native
  /**
    * [description]
    */
  var `type`: TYPE = js.native
  /**
    * [description]
    */
  @JSName("updateCallback")
  var updateCallback_Original: phaserLib.PhaserNs.TypesNs.PhysicsNs.ImpactNs.BodyUpdateCallback = js.native
  /**
    * [description]
    */
  var vel: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like = js.native
  /**
    * [description]
    */
  var world: World = js.native
  /**
    * Can be overridden by user code
    * @param other [description]
    */
  def check(other: Body): scala.Unit = js.native
  /**
    * Can be overridden by user code
    * @param other [description]
    * @param axis [description]
    */
  def collideWith(other: Body, axis: java.lang.String): scala.Unit = js.native
  /**
    * [description]
    */
  def destroy(): scala.Unit = js.native
  /**
    * [description]
    * @param graphic [description]
    */
  def drawDebug(graphic: phaserLib.PhaserNs.GameObjectsNs.Graphics): scala.Unit = js.native
  /**
    * [description]
    * @param config [description]
    */
  def fromJSON(config: js.Object): scala.Unit = js.native
  /**
    * Can be overridden by user code but must return a boolean.
    * @param res [description]
    */
  def handleMovementTrace(res: scala.Double): scala.Boolean = js.native
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    */
  def reset(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Reset the size and position of the physics body.
    * @param x The x coordinate to position the body.
    * @param y The y coordinate to position the body.
    * @param width The width of the body.
    * @param height The height of the body.
    */
  def resetSize(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): Body = js.native
  /**
    * [description]
    */
  def skipHash(): scala.Boolean = js.native
  /**
    * Export this body object to JSON.
    */
  def toJSON(): phaserLib.PhaserNs.TypesNs.PhysicsNs.ImpactNs.JSONImpactBody = js.native
  /**
    * Determines whether the body collides with the `other` one or not.
    * @param other [description]
    */
  def touches(other: Body): scala.Boolean = js.native
  /**
    * [description]
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(delta: scala.Double): scala.Unit = js.native
  /**
    * [description]
    */
  def updateCallback(body: Body): scala.Unit = js.native
  /**
    * [description]
    */
  def willDrawDebug(): scala.Boolean = js.native
}

