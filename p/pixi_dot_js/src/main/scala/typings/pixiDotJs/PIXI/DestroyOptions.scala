package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyOptions extends js.Object {
  /**
    * Should it destroy the base texture of the sprite as well
    *
    * Only used for child Sprites if options.children is set to true
    */
  var baseTexture: js.UndefOr[Boolean] = js.undefined
  /** if set to true, all the children will have their destroy method called as well. "options" will be passed on to those calls. */
  var children: js.UndefOr[Boolean] = js.undefined
  /**
    * It Should it destroy the current texture of the sprite as well
    *
    * Only used for child Sprites if options.children is set to true
    */
  var texture: js.UndefOr[Boolean] = js.undefined
}

object DestroyOptions {
  @scala.inline
  def apply(
    baseTexture: js.UndefOr[Boolean] = js.undefined,
    children: js.UndefOr[Boolean] = js.undefined,
    texture: js.UndefOr[Boolean] = js.undefined
  ): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseTexture)) __obj.updateDynamic("baseTexture")(baseTexture)
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(texture)) __obj.updateDynamic("texture")(texture)
    __obj.asInstanceOf[DestroyOptions]
  }
}

