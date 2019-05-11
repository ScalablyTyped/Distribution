package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Matter Physics Image Game Object.
  * 
  * An Image is a light-weight Game Object useful for the display of static images in your game,
  * such as logos, backgrounds, scenery or other non-animated elements. Images can have input
  * events and physics bodies, or be tweened, tinted or scrolled. The main difference between an
  * Image and a Sprite is that you cannot animate an Image as they do not have the Animation component.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Texture because var conflicts: frame, texture. Inlined - phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs.Transform because var conflicts: angle, rotation, scaleX, scaleY, x, y. Inlined setFixedRotation */ @JSGlobal("Phaser.Physics.Matter.Image")
@js.native
class Image protected ()
  extends phaserLib.PhaserNs.GameObjectsNs.Image
     with phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs.Bounce
     with phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs.Collision
     with phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs.Force
     with phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs.Friction
     with phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs.Gravity
     with phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs.Mass
     with phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs.Sensor
     with phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs.SetBody
     with phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs.Sleep
     with phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs.Static
     with phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs.Velocity {
  /**
    * 
    * @param world [description]
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    * @param options Matter.js configuration object. Default {}.
    */
  def this(world: World, x: scala.Double, y: scala.Double, texture: java.lang.String) = this()
  def this(world: World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String) = this()
  def this(world: World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer) = this()
  def this(world: World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String, options: js.Object) = this()
  def this(world: World, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer, options: js.Object) = this()
  /**
    * The body's center of mass.
    */
  /* CompleteClass */
  override val centerOfMass: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * [description]
    */
  var world: World = js.native
  /**
    * Applies a force to a body.
    * @param force A Vector that specifies the force to apply.
    */
  /* CompleteClass */
  override def applyForce(force: phaserLib.PhaserNs.MathNs.Vector2): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Applies a force to a body from a given position.
    * @param position The position in which the force comes from.
    * @param force A Vector that specifies the force to apply.
    */
  /* CompleteClass */
  override def applyForceFrom(position: phaserLib.PhaserNs.MathNs.Vector2, force: phaserLib.PhaserNs.MathNs.Vector2): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def isSensor(): scala.Boolean = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def isStatic(): scala.Boolean = js.native
  /**
    * Sets the restitution on the physics object.
    * @param value A Number that defines the restitution (elasticity) of the body. The value is always positive and is in the range (0, 1). A value of 0 means collisions may be perfectly inelastic and no bouncing may occur. A value of 0.8 means the body may bounce back with approximately 80% of its kinetic energy. Note that collision response is based on pairs of bodies, and that restitution values are combined with the following formula: `Math.max(bodyA.restitution, bodyB.restitution)`
    */
  /* CompleteClass */
  override def setBounce(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets density of the body.
    * @param value The new density of the body.
    */
  /* CompleteClass */
  override def setDensity(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  /**
    * [description]
    */
  def setFixedRotation(): this.type = js.native
  /**
    * A togglable function for ignoring world gravity in real-time on the current body.
    * @param value Set to true to ignore the effect of world gravity, or false to not ignore it.
    */
  /* CompleteClass */
  override def setIgnoreGravity(value: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets the mass of the Game Object's Matter Body.
    * @param value The new mass of the body.
    */
  /* CompleteClass */
  override def setMass(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    * @param value [description]
    */
  /* CompleteClass */
  override def setSensor(value: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    * @param value [description]
    */
  /* CompleteClass */
  override def setStatic(value: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Apply thrust to the forward position of the body.
    * @param speed A speed value to be applied to a directional force.
    */
  /* CompleteClass */
  override def thrust(speed: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Apply thrust to the back position of the body.
    * @param speed A speed value to be applied to a directional force.
    */
  /* CompleteClass */
  override def thrustBack(speed: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Apply thrust to the left position of the body.
    * @param speed A speed value to be applied to a directional force.
    */
  /* CompleteClass */
  override def thrustLeft(speed: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Apply thrust to the right position of the body.
    * @param speed A speed value to be applied to a directional force.
    */
  /* CompleteClass */
  override def thrustRight(speed: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
}

