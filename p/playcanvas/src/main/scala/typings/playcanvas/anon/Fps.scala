package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fps extends js.Object {
  var fps: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var spriteAsset: js.UndefOr[Double] = js.undefined
}

object Fps {
  @scala.inline
  def apply(
    fps: js.UndefOr[Double] = js.undefined,
    loop: js.Any = null,
    name: String = null,
    spriteAsset: js.UndefOr[Double] = js.undefined
  ): Fps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fps)) __obj.updateDynamic("fps")(fps.get.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(spriteAsset)) __obj.updateDynamic("spriteAsset")(spriteAsset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fps]
  }
}

