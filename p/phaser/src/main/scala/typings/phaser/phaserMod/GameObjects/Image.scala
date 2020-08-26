package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Image Game Object.
  * 
  * An Image is a light-weight Game Object useful for the display of static images in your game,
  * such as logos, backgrounds, scenery or other non-animated elements. Images can have input
  * events and physics bodies, or be tweened, tinted or scrolled. The main difference between an
  * Image and a Sprite is that you cannot animate an Image as they do not have the Animation component.
  */
@JSImport("phaser", "GameObjects.Image")
@js.native
class Image protected ()
  extends typings.phaser.Phaser.GameObjects.Image {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def this(scene: Scene, x: Double, y: Double, texture: String) = this()
  def this(scene: Scene, x: Double, y: Double, texture: Texture) = this()
  def this(scene: Scene, x: Double, y: Double, texture: String, frame: String) = this()
  def this(scene: Scene, x: Double, y: Double, texture: String, frame: integer) = this()
  def this(scene: Scene, x: Double, y: Double, texture: Texture, frame: String) = this()
  def this(scene: Scene, x: Double, y: Double, texture: Texture, frame: integer) = this()
}

