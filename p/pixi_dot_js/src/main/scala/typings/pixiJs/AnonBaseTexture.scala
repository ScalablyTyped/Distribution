package typings.pixiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseTexture extends js.Object {
  var baseTexture: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Boolean] = js.undefined
  var texture: js.UndefOr[Boolean] = js.undefined
}

object AnonBaseTexture {
  @scala.inline
  def apply(
    baseTexture: js.UndefOr[Boolean] = js.undefined,
    children: js.UndefOr[Boolean] = js.undefined,
    texture: js.UndefOr[Boolean] = js.undefined
  ): AnonBaseTexture = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseTexture)) __obj.updateDynamic("baseTexture")(baseTexture.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(texture)) __obj.updateDynamic("texture")(texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseTexture]
  }
}

