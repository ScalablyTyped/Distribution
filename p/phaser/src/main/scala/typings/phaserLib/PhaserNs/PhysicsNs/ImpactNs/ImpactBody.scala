package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@JSGlobal("Phaser.Physics.Impact.ImpactBody")
@js.native
class ImpactBody protected ()
  extends phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs.Acceleration
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
    * @param x x - The horizontal position of this physics body in the world.
    * @param y y - The vertical position of this physics body in the world.
    * @param width The width of the physics body in the world.
    * @param height [description]
    */
  def this(world: World, x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
  /**
    * [description]
    */
  var accel: js.Object = js.native
  /**
    * [description]
    */
  var body: Body = js.native
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

