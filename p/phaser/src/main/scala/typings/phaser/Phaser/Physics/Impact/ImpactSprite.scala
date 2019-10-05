package typings.phaser.Phaser.Physics.Impact

import typings.phaser.CollideCallback
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Sprite
import typings.phaser.Phaser.Physics.Impact.Components.Acceleration
import typings.phaser.Phaser.Physics.Impact.Components.BodyScale
import typings.phaser.Phaser.Physics.Impact.Components.BodyType
import typings.phaser.Phaser.Physics.Impact.Components.Bounce
import typings.phaser.Phaser.Physics.Impact.Components.CheckAgainst
import typings.phaser.Phaser.Physics.Impact.Components.Collides
import typings.phaser.Phaser.Physics.Impact.Components.Debug
import typings.phaser.Phaser.Physics.Impact.Components.Friction
import typings.phaser.Phaser.Physics.Impact.Components.Gravity
import typings.phaser.Phaser.Physics.Impact.Components.Offset
import typings.phaser.Phaser.Physics.Impact.Components.SetGameObject
import typings.phaser.Phaser.Physics.Impact.Components.Velocity
import typings.phaser.integer
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
- typings.phaser.Phaser.GameObjects.Components.Texture because var conflicts: frame, texture. Inlined  */ @JSGlobal("Phaser.Physics.Impact.ImpactSprite")
@js.native
class ImpactSprite protected ()
  extends Sprite
     with Acceleration
     with BodyScale
     with BodyType
     with Bounce
     with CheckAgainst
     with Collides
     with Debug
     with Friction
     with Gravity
     with Offset
     with SetGameObject
     with Velocity {
  /**
    * 
    * @param world [description]
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def this(world: World, x: Double, y: Double, texture: String) = this()
  def this(world: World, x: Double, y: Double, texture: String, frame: String) = this()
  def this(world: World, x: Double, y: Double, texture: String, frame: integer) = this()
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
  override var bounce: Double = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override var checkAgainst: Double = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override var collides: Double = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override var debugBodyColor: Double = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override var debugShowBody: Boolean = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override var debugShowVelocity: Boolean = js.native
  /**
    * [description]
    */
  var friction: js.Object = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override var gravity: Double = js.native
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
  override def getBodyType(): Double = js.native
  /**
    * Sets the horizontal and vertical acceleration of this body.
    * @param x The amount of horizontal acceleration to apply.
    * @param y The amount of vertical acceleration to apply.
    */
  /* CompleteClass */
  override def setAcceleration(x: Double, y: Double): this.type = js.native
  /**
    * Sets the horizontal acceleration of this body.
    * @param x The amount of acceleration to apply.
    */
  /* CompleteClass */
  override def setAccelerationX(x: Double): this.type = js.native
  /**
    * Sets the vertical acceleration of this body.
    * @param y The amount of acceleration to apply.
    */
  /* CompleteClass */
  override def setAccelerationY(y: Double): this.type = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setActiveCollision(): GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setAvsB(): GameObject = js.native
  /**
    * Sets the impact physics bounce, or restitution, value.
    * @param value A value between 0 (no rebound) and 1 (full rebound)
    */
  /* CompleteClass */
  override def setBounce(value: Double): GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setBvsA(): GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setCheckAgainstA(): GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setCheckAgainstB(): GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setCheckAgainstNone(): GameObject = js.native
  /**
    * [description]
    * @param callback [description]
    * @param scope [description]
    */
  /* CompleteClass */
  override def setCollideCallback(callback: CollideCallback, scope: js.Any): GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setCollidesNever(): GameObject = js.native
  /**
    * [description]
    * @param showBody [description]
    * @param showVelocity [description]
    * @param bodyColor [description]
    */
  /* CompleteClass */
  override def setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Double): GameObject = js.native
  /**
    * [description]
    * @param value [description]
    */
  /* CompleteClass */
  override def setDebugBodyColor(value: Double): GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setFixedCollision(): GameObject = js.native
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    */
  /* CompleteClass */
  override def setFriction(x: Double, y: Double): GameObject = js.native
  /**
    * [description]
    * @param x [description]
    */
  /* CompleteClass */
  override def setFrictionX(x: Double): GameObject = js.native
  /**
    * [description]
    * @param y [description]
    */
  /* CompleteClass */
  override def setFrictionY(y: Double): GameObject = js.native
  /**
    * [description]
    * @param value [description]
    */
  /* CompleteClass */
  override def setGravity(value: Double): GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setLiteCollision(): GameObject = js.native
  /**
    * Sets the minimum velocity the body is allowed to be moving to be considered for rebound.
    * @param value The minimum allowed velocity.
    */
  /* CompleteClass */
  override def setMinBounceVelocity(value: Double): GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setPassiveCollision(): GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setTypeA(): GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setTypeB(): GameObject = js.native
  /**
    * [description]
    */
  /* CompleteClass */
  override def setTypeNone(): GameObject = js.native
}

