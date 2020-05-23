package typings.ol.literalStyleMod

import typings.ol.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralSymbolStyle extends js.Object {
  var color: js.UndefOr[Color | js.Array[ExpressionValue] | String] = js.undefined
  var offset: js.UndefOr[js.Array[ExpressionValue]] = js.undefined
  var opacity: js.UndefOr[ExpressionValue] = js.undefined
  var rotateWithView: js.UndefOr[Boolean] = js.undefined
  var rotation: js.UndefOr[ExpressionValue] = js.undefined
  var size: ExpressionValue | js.Array[ExpressionValue]
  var src: js.UndefOr[String] = js.undefined
  var symbolType: SymbolType
  var textureCoord: js.UndefOr[js.Array[ExpressionValue]] = js.undefined
}

object LiteralSymbolStyle {
  @scala.inline
  def apply(
    size: ExpressionValue | js.Array[ExpressionValue],
    symbolType: SymbolType,
    color: Color | js.Array[ExpressionValue] | String = null,
    offset: js.Array[ExpressionValue] = null,
    opacity: ExpressionValue = null,
    rotateWithView: js.UndefOr[Boolean] = js.undefined,
    rotation: ExpressionValue = null,
    src: String = null,
    textureCoord: js.Array[ExpressionValue] = null
  ): LiteralSymbolStyle = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateWithView)) __obj.updateDynamic("rotateWithView")(rotateWithView.get.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (textureCoord != null) __obj.updateDynamic("textureCoord")(textureCoord.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralSymbolStyle]
  }
}

