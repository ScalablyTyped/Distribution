package typings.pixiJs

import typings.pixiJs.PIXI.Matrix
import typings.pixiJs.PIXI.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlignment extends js.Object {
  var alignment: js.UndefOr[Double] = js.undefined
  var alpha: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[Double] = js.undefined
  var matrix: js.UndefOr[Matrix] = js.undefined
  var native: js.UndefOr[Boolean] = js.undefined
  var texture: js.UndefOr[Texture] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonAlignment {
  @scala.inline
  def apply(
    alignment: Int | Double = null,
    alpha: Int | Double = null,
    color: Int | Double = null,
    matrix: Matrix = null,
    native: js.UndefOr[Boolean] = js.undefined,
    texture: Texture = null,
    width: Int | Double = null
  ): AnonAlignment = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (texture != null) __obj.updateDynamic("texture")(texture.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignment]
  }
}

