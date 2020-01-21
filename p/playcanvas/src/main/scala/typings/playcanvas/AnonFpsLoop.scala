package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFpsLoop extends js.Object {
  var fps: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var spriteAsset: js.UndefOr[Double] = js.undefined
}

object AnonFpsLoop {
  @scala.inline
  def apply(
    fps: Int | Double = null,
    loop: js.Any = null,
    name: String = null,
    spriteAsset: Int | Double = null
  ): AnonFpsLoop = {
    val __obj = js.Dynamic.literal()
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (spriteAsset != null) __obj.updateDynamic("spriteAsset")(spriteAsset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFpsLoop]
  }
}

