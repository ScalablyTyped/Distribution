package typings.pixiJs.mod

import typings.pixiJs.PIXI.AnimatedSprite.FrameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An AnimatedSprite is a simple way to display an animation depicted by a list of textures.
  *
  * ```js
  * let alienImages = ["image_sequence_01.png","image_sequence_02.png","image_sequence_03.png","image_sequence_04.png"];
  * let textureArray = [];
  *
  * for (let i=0; i < 4; i++)
  * {
  *      let texture = PIXI.Texture.from(alienImages[i]);
  *      textureArray.push(texture);
  * };
  *
  * let animatedSprite = new PIXI.AnimatedSprite(textureArray);
  * ```
  *
  * The more efficient and simpler way to create an animated sprite is using a {@link PIXI.Spritesheet}
  * containing the animation definitions:
  *
  * ```js
  * PIXI.Loader.shared.add("assets/spritesheet.json").load(setup);
  *
  * function setup() {
  *   let sheet = PIXI.Loader.shared.resources["assets/spritesheet.json"].spritesheet;
  *   animatedSprite = new PIXI.AnimatedSprite(sheet.animations["image_sequence"]);
  *   ...
  * }
  * ```
  *
  * @class
  * @extends PIXI.Sprite
  * @memberof PIXI
  */
@JSImport("pixi.js", "AnimatedSprite")
@js.native
class AnimatedSprite protected ()
  extends typings.pixiJs.PIXI.AnimatedSprite {
  def this(textures: js.Array[FrameObject | typings.pixiJs.PIXI.Texture]) = this()
  def this(textures: js.Array[FrameObject | typings.pixiJs.PIXI.Texture], autoUpdate: Boolean) = this()
}

/* static members */
@JSImport("pixi.js", "AnimatedSprite")
@js.native
object AnimatedSprite extends js.Object {
  /**
    * A short hand way of creating an AnimatedSprite from an array of frame ids.
    *
    * @static
    * @param {string[]} frames - The array of frames ids the AnimatedSprite will use as its texture frames.
    * @return {AnimatedSprite} The new animated sprite with the specified frames.
    */
  def fromFrames(frames: js.Array[String]): typings.pixiJs.PIXI.AnimatedSprite = js.native
  /**
    * A short hand way of creating an AnimatedSprite from an array of image ids.
    *
    * @static
    * @param {string[]} images - The array of image urls the AnimatedSprite will use as its texture frames.
    * @return {AnimatedSprite} The new animate sprite with the specified images as frames.
    */
  def fromImages(images: js.Array[String]): typings.pixiJs.PIXI.AnimatedSprite = js.native
}

