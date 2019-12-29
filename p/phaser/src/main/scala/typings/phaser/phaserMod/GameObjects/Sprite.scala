package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Sprite Game Object.
  * 
  * A Sprite Game Object is used for the display of both static and animated images in your game.
  * Sprites can have input events and physics bodies. They can also be tweened, tinted, scrolled
  * and animated.
  * 
  * The main difference between a Sprite and an Image Game Object is that you cannot animate Images.
  * As such, Sprites take a fraction longer to process and have a larger API footprint due to the Animation
  * Component. If you do not require animation then you can safely use Images to replace Sprites in all cases.
  */
@JSImport("phaser", "GameObjects.Sprite")
@js.native
class Sprite protected ()
  extends typings.phaser.Phaser.GameObjects.Sprite {
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
}

