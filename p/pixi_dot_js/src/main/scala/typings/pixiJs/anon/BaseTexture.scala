package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTexture extends js.Object {
  var baseTexture: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Boolean] = js.undefined
  var texture: js.UndefOr[Boolean] = js.undefined
}

object BaseTexture {
  @scala.inline
  def apply(
    baseTexture: js.UndefOr[Boolean] = js.undefined,
    children: js.UndefOr[Boolean] = js.undefined,
    texture: js.UndefOr[Boolean] = js.undefined
  ): BaseTexture = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseTexture)) __obj.updateDynamic("baseTexture")(baseTexture.get.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.get.asInstanceOf[js.Any])
    if (!js.isUndefined(texture)) __obj.updateDynamic("texture")(texture.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTexture]
  }
}

