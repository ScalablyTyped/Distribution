package typings
package pixiDotJsLib.PIXINs.extrasNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatedSpriteTextureTimeObject extends js.Object {
  var texture: pixiDotJsLib.PIXINs.Texture
  var time: js.UndefOr[scala.Double] = js.undefined
}

object AnimatedSpriteTextureTimeObject {
  @scala.inline
  def apply(texture: pixiDotJsLib.PIXINs.Texture, time: scala.Int | scala.Double = null): AnimatedSpriteTextureTimeObject = {
    val __obj = js.Dynamic.literal(texture = texture)
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedSpriteTextureTimeObject]
  }
}

