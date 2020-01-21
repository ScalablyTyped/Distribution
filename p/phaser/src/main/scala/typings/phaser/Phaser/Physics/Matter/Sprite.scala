package typings.phaser.Phaser.Physics.Matter

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Physics.Matter.Components.Bounce
import typings.phaser.Phaser.Physics.Matter.Components.Collision
import typings.phaser.Phaser.Physics.Matter.Components.Force
import typings.phaser.Phaser.Physics.Matter.Components.Friction
import typings.phaser.Phaser.Physics.Matter.Components.Gravity
import typings.phaser.Phaser.Physics.Matter.Components.Mass
import typings.phaser.Phaser.Physics.Matter.Components.Sensor
import typings.phaser.Phaser.Physics.Matter.Components.SetBody
import typings.phaser.Phaser.Physics.Matter.Components.Sleep
import typings.phaser.Phaser.Physics.Matter.Components.Static
import typings.phaser.Phaser.Physics.Matter.Components.Velocity
import typings.phaser.Phaser.Types.Physics.Matter.MatterBodyConfig
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Matter Physics Sprite Game Object.
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
- typings.phaser.Phaser.Types.Physics.Matter.MatterBody because Already inherited
- typings.phaser.Phaser.GameObjects.Components.Texture because var conflicts: frame, texture. Inlined 
- typings.phaser.Phaser.Physics.Matter.Components.Transform because var conflicts: angle, rotation, scaleX, scaleY, x, y. Inlined setFixedRotation */ @JSGlobal("Phaser.Physics.Matter.Sprite")
@js.native
class Sprite protected ()
  extends typings.phaser.Phaser.GameObjects.Sprite
     with Bounce
     with Collision
     with Force
     with Friction
     with Gravity
     with Mass
     with Sensor
     with SetBody
     with Sleep
     with Static
     with Velocity {
  /**
    * 
    * @param world A reference to the Matter.World instance that this body belongs to.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    */
  def this(world: World, x: Double, y: Double, texture: String) = this()
  def this(world: World, x: Double, y: Double, texture: String, frame: String) = this()
  def this(world: World, x: Double, y: Double, texture: String, frame: integer) = this()
  def this(world: World, x: Double, y: Double, texture: String, frame: String, options: MatterBodyConfig) = this()
  def this(world: World, x: Double, y: Double, texture: String, frame: integer, options: MatterBodyConfig) = this()
  /**
    * The body's center of mass.
    * 
    * Calling this creates a new `Vector2 each time to avoid mutation.
    * 
    * If you only need to read the value and won't change it, you can get it from `GameObject.body.centerOfMass`.
    */
  /* CompleteClass */
  override val centerOfMass: Vector2 = js.native
  /**
    * A reference to the Matter.World instance that this body belongs to.
    */
  var world: World = js.native
  /**
    * Applies a force to a body.
    * @param force A Vector that specifies the force to apply.
    */
  /* CompleteClass */
  override def applyForce(force: Vector2): GameObject = js.native
  /**
    * Applies a force to a body from a given position.
    * @param position The position in which the force comes from.
    * @param force A Vector that specifies the force to apply.
    */
  /* CompleteClass */
  override def applyForceFrom(position: Vector2, force: Vector2): GameObject = js.native
  /**
    * Is the body belonging to this Game Object a sensor or not?
    */
  /* CompleteClass */
  override def isSensor(): Boolean = js.native
  /**
    * Returns `true` if the body is static, otherwise `false` for a dynamic body.
    */
  /* CompleteClass */
  override def isStatic(): Boolean = js.native
  /**
    * Sets the restitution on the physics object.
    * @param value A Number that defines the restitution (elasticity) of the body. The value is always positive and is in the range (0, 1). A value of 0 means collisions may be perfectly inelastic and no bouncing may occur. A value of 0.8 means the body may bounce back with approximately 80% of its kinetic energy. Note that collision response is based on pairs of bodies, and that restitution values are combined with the following formula: `Math.max(bodyA.restitution, bodyB.restitution)`
    */
  /* CompleteClass */
  override def setBounce(value: Double): GameObject = js.native
  /**
    * Sets density of the body.
    * @param value The new density of the body.
    */
  /* CompleteClass */
  override def setDensity(value: Double): GameObject = js.native
  /**
    * Setting fixed rotation sets the Body inertia to Infinity, which stops it
    * from being able to rotate when forces are applied to it.
    */
  /**
    * Setting fixed rotation sets the Body inertia to Infinity, which stops it
    * from being able to rotate when forces are applied to it.
    */
  def setFixedRotation(): this.type = js.native
  /**
    * A togglable function for ignoring world gravity in real-time on the current body.
    * @param value Set to true to ignore the effect of world gravity, or false to not ignore it.
    */
  /* CompleteClass */
  override def setIgnoreGravity(value: Boolean): GameObject = js.native
  /**
    * Sets the mass of the Game Object's Matter Body.
    * @param value The new mass of the body.
    */
  /* CompleteClass */
  override def setMass(value: Double): GameObject = js.native
  /**
    * Set the body belonging to this Game Object to be a sensor.
    * Sensors trigger collision events, but don't react with colliding body physically.
    * @param value `true` to set the body as a sensor, or `false` to disable it.
    */
  /* CompleteClass */
  override def setSensor(value: Boolean): GameObject = js.native
  /**
    * Changes the physics body to be either static `true` or dynamic `false`.
    * @param value `true` to set the body as being static, or `false` to make it dynamic.
    */
  /* CompleteClass */
  override def setStatic(value: Boolean): GameObject = js.native
  /**
    * Apply thrust to the forward position of the body.
    * 
    * Use very small values, such as 0.1, depending on the mass and required speed.
    * @param speed A speed value to be applied to a directional force.
    */
  /* CompleteClass */
  override def thrust(speed: Double): GameObject = js.native
  /**
    * Apply thrust to the back position of the body.
    * 
    * Use very small values, such as 0.1, depending on the mass and required speed.
    * @param speed A speed value to be applied to a directional force.
    */
  /* CompleteClass */
  override def thrustBack(speed: Double): GameObject = js.native
  /**
    * Apply thrust to the left position of the body.
    * 
    * Use very small values, such as 0.1, depending on the mass and required speed.
    * @param speed A speed value to be applied to a directional force.
    */
  /* CompleteClass */
  override def thrustLeft(speed: Double): GameObject = js.native
  /**
    * Apply thrust to the right position of the body.
    * 
    * Use very small values, such as 0.1, depending on the mass and required speed.
    * @param speed A speed value to be applied to a directional force.
    */
  /* CompleteClass */
  override def thrustRight(speed: Double): GameObject = js.native
}

