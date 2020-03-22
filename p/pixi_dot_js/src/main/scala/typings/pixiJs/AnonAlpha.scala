package typings.pixiJs

import typings.pixiJs.PIXI.Matrix
import typings.pixiJs.PIXI.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlpha extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[Double] = js.undefined
  var matrix: js.UndefOr[Matrix] = js.undefined
  var texture: js.UndefOr[Texture] = js.undefined
}

object AnonAlpha {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    color: Int | Double = null,
    matrix: Matrix = null,
    texture: Texture = null
  ): AnonAlpha = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (texture != null) __obj.updateDynamic("texture")(texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlpha]
  }
}

