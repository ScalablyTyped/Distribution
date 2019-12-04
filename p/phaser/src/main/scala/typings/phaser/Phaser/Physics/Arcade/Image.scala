package typings.phaser.Phaser.Physics.Arcade

import typings.phaser.Phaser.Physics.Arcade.Components.Acceleration
import typings.phaser.Phaser.Physics.Arcade.Components.Angular
import typings.phaser.Phaser.Physics.Arcade.Components.Bounce
import typings.phaser.Phaser.Physics.Arcade.Components.Debug
import typings.phaser.Phaser.Physics.Arcade.Components.Drag
import typings.phaser.Phaser.Physics.Arcade.Components.Enable
import typings.phaser.Phaser.Physics.Arcade.Components.Friction
import typings.phaser.Phaser.Physics.Arcade.Components.Gravity
import typings.phaser.Phaser.Physics.Arcade.Components.Immovable
import typings.phaser.Phaser.Physics.Arcade.Components.Mass
import typings.phaser.Phaser.Physics.Arcade.Components.Size
import typings.phaser.Phaser.Physics.Arcade.Components.Velocity
import typings.phaser.Phaser.Scene
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Arcade Physics Image is an Image with an Arcade Physics body and related components.
  * The body can be dynamic or static.
  * 
  * The main difference between an Arcade Image and an Arcade Sprite is that you cannot animate an Arcade Image.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited
- typings.phaser.Phaser.GameObjects.Components.Texture because var conflicts: frame, texture. Inlined  */ @JSGlobal("Phaser.Physics.Arcade.Image")
@js.native
class Image protected ()
  extends typings.phaser.Phaser.GameObjects.Image
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
    * Sets the size of this physics body. Setting the size does not adjust the dimensions
    * of the parent Game Object.
    * @param width The new width of the physics body, in pixels.
    * @param height The new height of the physics body, in pixels.
    * @param center Should the body be re-positioned so its center aligns with the parent Game Object? Default true.
    */
  /* InferMemberOverrides */
  override def setSize(width: Double, height: Double): this.type = js.native
}

