package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs

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
- phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs._ArcadeColliderType because Already inherited- phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Texture because var conflicts: frame, texture. Inlined  */ @JSGlobal("Phaser.Physics.Arcade.Sprite")
@js.native
class Sprite protected ()
  extends phaserLib.PhaserNs.GameObjectsNs.Sprite
     with phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Acceleration
     with phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Angular
     with phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Bounce
     with phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Debug
     with phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Drag
     with phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Enable
     with phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Friction
     with phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Gravity
     with phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Immovable
     with phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Mass
     with phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Size
     with phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs.Velocity {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer) = this()
  /**
    * This Game Object's Physics Body.
    */
  @JSName("body")
  var body_Sprite: Body | StaticBody = js.native
  /**
    * The color of the body outline when it renders to the debug display.
    */
  /* CompleteClass */
  override var debugBodyColor: scala.Double = js.native
  /**
    * Set to `true` to have this body render its outline to the debug display.
    */
  /* CompleteClass */
  override var debugShowBody: scala.Boolean = js.native
  /**
    * Set to `true` to have this body render a velocity marker to the debug display.
    */
  /* CompleteClass */
  override var debugShowVelocity: scala.Boolean = js.native
  /**
    * Sets the angular acceleration of the body.
    * 
    * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
    * However, they can have angular motion, which is passed on to the Game Object bound to the body,
    * causing them to visually rotate, even though the body remains axis-aligned.
    * @param value The amount of angular acceleration.
    */
  /* CompleteClass */
  override def setAngularAcceleration(value: scala.Double): this.type = js.native
  /**
    * Sets the angular drag of the body. Drag is applied to the current velocity, providing a form of deceleration.
    * @param value The amount of drag.
    */
  /* CompleteClass */
  override def setAngularDrag(value: scala.Double): this.type = js.native
  /**
    * Sets the angular velocity of the body.
    * 
    * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
    * However, they can have angular motion, which is passed on to the Game Object bound to the body,
    * causing them to visually rotate, even though the body remains axis-aligned.
    * @param value The amount of angular velocity.
    */
  /* CompleteClass */
  override def setAngularVelocity(value: scala.Double): this.type = js.native
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
  override def setDebug(showBody: scala.Boolean, showVelocity: scala.Boolean, bodyColor: scala.Double): this.type = js.native
  /**
    * Sets the color of the body outline when it renders to the debug display.
    * @param value The color of the body outline when rendered to the debug display.
    */
  /* CompleteClass */
  override def setDebugBodyColor(value: scala.Double): this.type = js.native
  /**
    * Sets the mass of the physics body
    * @param value New value for the mass of the body.
    */
  /* CompleteClass */
  override def setMass(value: scala.Double): this.type = js.native
  /**
    * Sets the size of this physics body. Setting the size does not adjust the dimensions
    * of the parent Game Object.
    * @param width The new width of the physics body, in pixels.
    * @param height The new height of the physics body, in pixels.
    * @param center Should the body be re-positioned so its center aligns with the parent Game Object? Default true.
    */
  /* InferMemberOverrides */
  override def setSize(width: scala.Double, height: scala.Double): this.type = js.native
}

