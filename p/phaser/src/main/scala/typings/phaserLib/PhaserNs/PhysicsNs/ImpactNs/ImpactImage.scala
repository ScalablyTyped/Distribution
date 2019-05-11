package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Impact Physics Image Game Object.
  * 
  * An Image is a light-weight Game Object useful for the display of static images in your game,
  * such as logos, backgrounds, scenery or other non-animated elements. Images can have input
  * events and physics bodies, or be tweened, tinted or scrolled. The main difference between an
  * Image and a Sprite is that you cannot animate an Image as they do not have the Animation component.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Texture because var conflicts: frame, texture. Inlined  */ @JSGlobal("Phaser.Physics.Impact.ImpactImage")
@js.native
class ImpactImage protected ()
  extends phaserLib.PhaserNs.GameObjectsNs.Image
     with phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs.Acceleration
     with phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs.BodyScale
     with phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs.BodyType
     with phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs.Bounce
     with phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs.CheckAgainst
     with phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs.Collides
     with phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs.Debug
     with phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs.Friction
     with phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs.Gravity
     with phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs.Offset
     with phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs.SetGameObject
     with phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs.Velocity {
  /**
    * 
    * @param world The physics world of the Impact physics system.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def this(world: World, x: scala.Double, y: scala.Double, texture: java.lang.String) = this()
  def this(world: World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String) = this()
  def this(world: World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer) = this()
  /**
    * The acceleration is the rate of change of the velocity. Measured in pixels per second squared.
    */
  var accel: js.Object = js.native
  /**
    * The Physics Body linked to an ImpactImage.
    */
  @JSName("body")
  var body_ImpactImage: Body = js.native
  /**
    * The bounce, or restitution, value of this body.
    * A value between 0 (no rebound) and 1 (full rebound)
    */
  /* CompleteClass */
  override var bounce: scala.Double = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override var checkAgainst: scala.Double = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override var collides: scala.Double = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override var debugBodyColor: scala.Double = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override var debugShowBody: scala.Boolean = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override var debugShowVelocity: scala.Boolean = js.native
  /**
    * Friction between colliding bodies.
    */
  var friction: js.Object = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override var gravity: scala.Double = js.native
  /**
    * The maximum velocity of the body.
    */
  var maxVel: js.Object = js.native
  /**
    * The X and Y offset of the Body from the left and top of the Image.
    */
  var offset: js.Object = js.native
  /**
    * The size of the physics Body.
    */
  var size: js.Object = js.native
  /**
    * The velocity, or rate of change the Body's position. Measured in pixels per second.
    */
  var vel: js.Object = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def getBodyType(): scala.Double = js.native
  /**
    * Sets the horizontal and vertical acceleration of this body.
    * @param x The amount of horizontal acceleration to apply.
    * @param y The amount of vertical acceleration to apply.
    */
  /* CompleteClass */
  override def setAcceleration(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Sets the horizontal acceleration of this body.
    * @param x The amount of acceleration to apply.
    */
  /* CompleteClass */
  override def setAccelerationX(x: scala.Double): this.type = js.native
  /**
    * Sets the vertical acceleration of this body.
    * @param y The amount of acceleration to apply.
    */
  /* CompleteClass */
  override def setAccelerationY(y: scala.Double): this.type = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setActiveCollision(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setAvsB(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets the impact physics bounce, or restitution, value.
    * @param value A value between 0 (no rebound) and 1 (full rebound)
    */
  /* CompleteClass */
  override def setBounce(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setBvsA(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setCheckAgainstA(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setCheckAgainstB(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setCheckAgainstNone(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    * @param callback [description]
    * @param scope [description]
    */
  /* CompleteClass */
  override def setCollideCallback(callback: phaserLib.CollideCallback, scope: js.Any): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setCollidesNever(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    * @param showBody [description]
    * @param showVelocity [description]
    * @param bodyColor [description]
    */
  /* CompleteClass */
  override def setDebug(showBody: scala.Boolean, showVelocity: scala.Boolean, bodyColor: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    * @param value [description]
    */
  /* CompleteClass */
  override def setDebugBodyColor(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setFixedCollision(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    */
  /* CompleteClass */
  override def setFriction(x: scala.Double, y: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    * @param x [description]
    */
  /* CompleteClass */
  override def setFrictionX(x: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    * @param y [description]
    */
  /* CompleteClass */
  override def setFrictionY(y: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    * @param value [description]
    */
  /* CompleteClass */
  override def setGravity(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setLiteCollision(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets the minimum velocity the body is allowed to be moving to be considered for rebound.
    * @param value The minimum allowed velocity.
    */
  /* CompleteClass */
  override def setMinBounceVelocity(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setPassiveCollision(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setTypeA(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setTypeB(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setTypeNone(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
}

