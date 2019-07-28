package typings.phaser.PhaserNs.PhysicsNs.ArcadeNs

import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Acceleration
import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Angular
import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Bounce
import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Debug
import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Drag
import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Enable
import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Friction
import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Gravity
import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Immovable
import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Mass
import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Size
import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Velocity
import typings.phaser.PhaserNs.Scene
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Arcade Physics Sprite is a Sprite with an Arcade Physics body and related components.
  * The body can be dynamic or static.
  * 
  * The main difference between an Arcade Sprite and an Arcade Image is that you cannot animate an Arcade Image.
  * If you do not require animation then you can safely use Arcade Images instead of Arcade Sprites.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.phaser.PhaserNs.TypesNs.PhysicsNs.ArcadeNs._ArcadeColliderType because Already inherited- typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Texture because var conflicts: frame, texture. Inlined  */ @JSGlobal("Phaser.Physics.Arcade.Sprite")
@js.native
class Sprite protected ()
  extends typings.phaser.PhaserNs.GameObjectsNs.Sprite
     with Acceleration
     with Angular
     with Bounce
     with Debug
     with Drag
     with Enable
     with Friction
     with Gravity
     with Immovable
     with Mass
     with Size
     with Velocity {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def this(scene: Scene, x: Double, y: Double, texture: String) = this()
  def this(scene: Scene, x: Double, y: Double, texture: String, frame: String) = this()
  def this(scene: Scene, x: Double, y: Double, texture: String, frame: integer) = this()
  /**
    * This Game Object's Physics Body.
    */
  @JSName("body")
  var body_Sprite: Body | StaticBody = js.native
  /**
    * The color of the body outline when it renders to the debug display.
    */
  /* CompleteClass */
  override var debugBodyColor: Double = js.native
  /**
    * Set to `true` to have this body render its outline to the debug display.
    */
  /* CompleteClass */
  override var debugShowBody: Boolean = js.native
  /**
    * Set to `true` to have this body render a velocity marker to the debug display.
    */
  /* CompleteClass */
  override var debugShowVelocity: Boolean = js.native
  /**
    * Sets the angular acceleration of the body.
    * 
    * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
    * However, they can have angular motion, which is passed on to the Game Object bound to the body,
    * causing them to visually rotate, even though the body remains axis-aligned.
    * @param value The amount of angular acceleration.
    */
  /* CompleteClass */
  override def setAngularAcceleration(value: Double): this.type = js.native
  /**
    * Sets the angular drag of the body. Drag is applied to the current velocity, providing a form of deceleration.
    * @param value The amount of drag.
    */
  /* CompleteClass */
  override def setAngularDrag(value: Double): this.type = js.native
  /**
    * Sets the angular velocity of the body.
    * 
    * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
    * However, they can have angular motion, which is passed on to the Game Object bound to the body,
    * causing them to visually rotate, even though the body remains axis-aligned.
    * @param value The amount of angular velocity.
    */
  /* CompleteClass */
  override def setAngularVelocity(value: Double): this.type = js.native
  /**
    * Sets the debug values of this body.
    * 
    * Bodies will only draw their debug if debug has been enabled for Arcade Physics as a whole.
    * Note that there is a performance cost in drawing debug displays. It should never be used in production.
    * @param showBody Set to `true` to have this body render its outline to the debug display.
    * @param showVelocity Set to `true` to have this body render a velocity marker to the debug display.
    * @param bodyColor The color of the body outline when rendered to the debug display.
    */
  /* CompleteClass */
  override def setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Double): this.type = js.native
  /**
    * Sets the color of the body outline when it renders to the debug display.
    * @param value The color of the body outline when rendered to the debug display.
    */
  /* CompleteClass */
  override def setDebugBodyColor(value: Double): this.type = js.native
  /**
    * Sets the mass of the physics body
    * @param value New value for the mass of the body.
    */
  /* CompleteClass */
  override def setMass(value: Double): this.type = js.native
  /**
    * Sets the internal size of this Game Object, as used for frame or physics body creation.
    * 
    * This will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or call the
    * `setDisplaySize` method, which is the same thing as changing the scale but allows you
    * to do so by giving pixel values.
    * 
    * If you have enabled this Game Object for input, changing the size will _not_ change the
    * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* InferMemberOverrides */
  override def setSize(width: Double, height: Double): this.type = js.native
}

