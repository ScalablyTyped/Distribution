package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Impact Physics Sprite Game Object.
  * 
  * A Sprite Game Object is used for the display of both static and animated images in your game.
  * Sprites can have input events and physics bodies. They can also be tweened, tinted, scrolled
  * and animated.
  * 
  * The main difference between a Sprite and an Image Game Object is that you cannot animate Images.
  * As such, Sprites take a fraction longer to process and have a larger API footprint due to the Animation
  * Component. If you do not require animation then you can safely use Images to replace Sprites in all cases.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Texture because var conflicts: frame, texture. Inlined  */ @JSGlobal("Phaser.Physics.Impact.ImpactSprite")
@js.native
class ImpactSprite protected ()
  extends phaserLib.PhaserNs.GameObjectsNs.Sprite
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
    * @param world [description]
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def this(world: World, x: scala.Double, y: scala.Double, texture: java.lang.String) = this()
  def this(world: World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String) = this()
  def this(world: World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer) = this()
  /**
    * [description]
    */
  var accel: js.Object = js.native
  /**
    * [description]
    */
  @JSName("body")
  var body_ImpactSprite: Body = js.native
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
    * [description]
    */
  var friction: js.Object = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override var gravity: scala.Double = js.native
  /**
    * [description]
    */
  var maxVel: js.Object = js.native
  /**
    * [description]
    */
  var offset: js.Object = js.native
  /**
    * [description]
    */
  var size: js.Object = js.native
  /**
    * [description]
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

