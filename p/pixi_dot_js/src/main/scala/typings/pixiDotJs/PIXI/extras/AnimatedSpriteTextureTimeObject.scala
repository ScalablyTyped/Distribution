package typings.pixiDotJs.PIXI.extras

import typings.pixiDotJs.PIXI.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatedSpriteTextureTimeObject extends js.Object {
  var texture: Texture
  var time: js.UndefOr[Double] = js.undefined
}

object AnimatedSpriteTextureTimeObject {
  @scala.inline
  def apply(texture: Texture, time: Int | Double = null): AnimatedSpriteTextureTimeObject = {
    val __obj = js.Dynamic.literal(texture = texture)
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedSpriteTextureTimeObject]
  }
}

