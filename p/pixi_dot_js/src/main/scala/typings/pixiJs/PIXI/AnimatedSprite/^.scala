package typings.pixiJs.PIXI.AnimatedSprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.AnimatedSprite")
@js.native
object ^ extends js.Object {
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

