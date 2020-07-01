package typings.pixiJs.anon

import typings.pixiJs.PIXI.LINE_CAP
import typings.pixiJs.PIXI.LINE_JOIN
import typings.pixiJs.PIXI.Matrix
import typings.pixiJs.PIXI.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alignment extends js.Object {
  var alignment: js.UndefOr[Double] = js.undefined
  var alpha: js.UndefOr[Double] = js.undefined
  var cap: js.UndefOr[LINE_CAP] = js.undefined
  var color: js.UndefOr[Double] = js.undefined
  var join: js.UndefOr[LINE_JOIN] = js.undefined
  var matrix: js.UndefOr[Matrix] = js.undefined
  var miterLimit: js.UndefOr[Double] = js.undefined
  var native: js.UndefOr[Boolean] = js.undefined
  var texture: js.UndefOr[Texture] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Alignment {
  @scala.inline
  def apply(
    alignment: js.UndefOr[Double] = js.undefined,
    alpha: js.UndefOr[Double] = js.undefined,
    cap: LINE_CAP = null,
    color: js.UndefOr[Double] = js.undefined,
    join: LINE_JOIN = null,
    matrix: Matrix = null,
    miterLimit: js.UndefOr[Double] = js.undefined,
    native: js.UndefOr[Boolean] = js.undefined,
    texture: Texture = null,
    width: js.UndefOr[Double] = js.undefined
  ): Alignment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignment)) __obj.updateDynamic("alignment")(alignment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (cap != null) __obj.updateDynamic("cap")(cap.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (join != null) __obj.updateDynamic("join")(join.asInstanceOf[js.Any])
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (!js.isUndefined(miterLimit)) __obj.updateDynamic("miterLimit")(miterLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native.get.asInstanceOf[js.Any])
    if (texture != null) __obj.updateDynamic("texture")(texture.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alignment]
  }
}

