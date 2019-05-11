package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Physics Factory allows you to easily create Impact Physics enabled Game Objects.
  * Objects that are created by this Factory are automatically added to the physics world.
  */
@JSGlobal("Phaser.Physics.Impact.Factory")
@js.native
class Factory protected () extends js.Object {
  /**
    * 
    * @param world A reference to the Impact Physics world.
    */
  def this(world: World) = this()
  /**
    * A reference to the Scene.Systems this Impact Physics instance belongs to.
    */
  var sys: phaserLib.PhaserNs.ScenesNs.Systems = js.native
  /**
    * A reference to the Impact Physics world.
    */
  var world: World = js.native
  /**
    * Creates a new ImpactBody object and adds it to the physics simulation.
    * @param x The horizontal position of the body in the physics world.
    * @param y The vertical position of the body in the physics world.
    * @param width The width of the body.
    * @param height The height of the body.
    */
  def body(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): ImpactBody = js.native
  /**
    * Destroys this Factory.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Adds an Impact Physics Body to the given Game Object.
    * @param gameObject The Game Object to receive the physics body.
    */
  def existing(gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Creates a new ImpactImage object and adds it to the physics world.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param key The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def image(x: scala.Double, y: scala.Double, key: java.lang.String): ImpactImage = js.native
  def image(x: scala.Double, y: scala.Double, key: java.lang.String, frame: java.lang.String): ImpactImage = js.native
  def image(x: scala.Double, y: scala.Double, key: java.lang.String, frame: phaserLib.integer): ImpactImage = js.native
  /**
    * Creates a new ImpactSprite object and adds it to the physics world.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param key The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def sprite(x: scala.Double, y: scala.Double, key: java.lang.String): ImpactSprite = js.native
  def sprite(x: scala.Double, y: scala.Double, key: java.lang.String, frame: java.lang.String): ImpactSprite = js.native
  def sprite(x: scala.Double, y: scala.Double, key: java.lang.String, frame: phaserLib.integer): ImpactSprite = js.native
}

