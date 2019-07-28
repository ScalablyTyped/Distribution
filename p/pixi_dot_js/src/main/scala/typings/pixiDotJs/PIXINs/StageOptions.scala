package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// display
trait StageOptions extends js.Object {
  var baseTexture: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Boolean] = js.undefined
  var texture: js.UndefOr[Boolean] = js.undefined
}

object StageOptions {
  @scala.inline
  def apply(
    baseTexture: js.UndefOr[Boolean] = js.undefined,
    children: js.UndefOr[Boolean] = js.undefined,
    texture: js.UndefOr[Boolean] = js.undefined
  ): StageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseTexture)) __obj.updateDynamic("baseTexture")(baseTexture)
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(texture)) __obj.updateDynamic("texture")(texture)
    __obj.asInstanceOf[StageOptions]
  }
}

