package typings.pixiJs.anon

import typings.pixiJs.PIXI.Matrix
import typings.pixiJs.PIXI.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alignment extends js.Object {
  var alignment: js.UndefOr[Double] = js.undefined
  var alpha: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[Double] = js.undefined
  var matrix: js.UndefOr[Matrix] = js.undefined
  var native: js.UndefOr[Boolean] = js.undefined
  var texture: js.UndefOr[Texture] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Alignment {
  @scala.inline
  def apply(
    alignment: js.UndefOr[Double] = js.undefined,
    alpha: js.UndefOr[Double] = js.undefined,
    color: js.UndefOr[Double] = js.undefined,
    matrix: Matrix = null,
    native: js.UndefOr[Boolean] = js.undefined,
    texture: Texture = null,
    width: js.UndefOr[Double] = js.undefined
  ): Alignment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignment)) __obj.updateDynamic("alignment")(alignment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native.get.asInstanceOf[js.Any])
    if (texture != null) __obj.updateDynamic("texture")(texture.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alignment]
  }
}

