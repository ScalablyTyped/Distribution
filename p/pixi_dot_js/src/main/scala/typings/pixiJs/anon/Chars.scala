package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chars extends js.Object {
  var chars: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var textureHeight: js.UndefOr[Double] = js.undefined
  var textureWidth: js.UndefOr[Double] = js.undefined
}

object Chars {
  @scala.inline
  def apply(
    chars: String | (js.Array[js.Array[String] | String]) = null,
    padding: js.UndefOr[Double] = js.undefined,
    resolution: js.UndefOr[Double] = js.undefined,
    textureHeight: js.UndefOr[Double] = js.undefined,
    textureWidth: js.UndefOr[Double] = js.undefined
  ): Chars = {
    val __obj = js.Dynamic.literal()
    if (chars != null) __obj.updateDynamic("chars")(chars.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textureHeight)) __obj.updateDynamic("textureHeight")(textureHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textureWidth)) __obj.updateDynamic("textureWidth")(textureWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chars]
  }
}

