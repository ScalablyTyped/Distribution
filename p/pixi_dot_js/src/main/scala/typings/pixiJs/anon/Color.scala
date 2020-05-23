package typings.pixiJs.anon

import typings.pixiJs.PIXI.Matrix
import typings.pixiJs.PIXI.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[Double] = js.undefined
  var matrix: js.UndefOr[Matrix] = js.undefined
  var texture: js.UndefOr[Texture] = js.undefined
}

object Color {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    color: js.UndefOr[Double] = js.undefined,
    matrix: Matrix = null,
    texture: Texture = null
  ): Color = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (texture != null) __obj.updateDynamic("texture")(texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

