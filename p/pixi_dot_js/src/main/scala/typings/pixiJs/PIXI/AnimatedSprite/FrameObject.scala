package typings.pixiJs.PIXI.AnimatedSprite

import typings.pixiJs.PIXI.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @memberof PIXI.AnimatedSprite
  * @typedef {object} FrameObject
  * @type {object}
  * @property {PIXI.Texture} texture - The {@link PIXI.Texture} of the frame
  * @property {number} time - the duration of the frame in ms
  */
trait FrameObject extends js.Object {
  var texture: Texture
  var time: Double
}

object FrameObject {
  @scala.inline
  def apply(texture: Texture, time: Double): FrameObject = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameObject]
  }
}

