package typings.ol.literalStyleMod

import typings.ol.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiteralSymbolStyle extends js.Object {
  var color: js.UndefOr[Color | js.Array[ExpressionValue] | String] = js.native
  var offset: js.UndefOr[js.Array[ExpressionValue]] = js.native
  var opacity: js.UndefOr[ExpressionValue] = js.native
  var rotateWithView: js.UndefOr[Boolean] = js.native
  var rotation: js.UndefOr[ExpressionValue] = js.native
  var size: ExpressionValue | js.Array[ExpressionValue] = js.native
  var src: js.UndefOr[String] = js.native
  var symbolType: SymbolType = js.native
  var textureCoord: js.UndefOr[js.Array[ExpressionValue]] = js.native
}

object LiteralSymbolStyle {
  @scala.inline
  def apply(size: ExpressionValue | js.Array[ExpressionValue], symbolType: SymbolType): LiteralSymbolStyle = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralSymbolStyle]
  }
  @scala.inline
  implicit class LiteralSymbolStyleOps[Self <: LiteralSymbolStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSizeVarargs(value: (js.Any | Double | ExpressionValue)*): Self = this.set("size", js.Array(value :_*))
    @scala.inline
    def setSize(value: ExpressionValue | js.Array[ExpressionValue]): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolType(value: SymbolType): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorVarargs(value: (Double | ExpressionValue)*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: Color | js.Array[ExpressionValue] | String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setOffsetVarargs(value: ExpressionValue*): Self = this.set("offset", js.Array(value :_*))
    @scala.inline
    def setOffset(value: js.Array[ExpressionValue]): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOpacityVarargs(value: (js.Any | Double)*): Self = this.set("opacity", js.Array(value :_*))
    @scala.inline
    def setOpacity(value: ExpressionValue): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setRotateWithView(value: Boolean): Self = this.set("rotateWithView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateWithView: Self = this.set("rotateWithView", js.undefined)
    @scala.inline
    def setRotationVarargs(value: (js.Any | Double)*): Self = this.set("rotation", js.Array(value :_*))
    @scala.inline
    def setRotation(value: ExpressionValue): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setTextureCoordVarargs(value: ExpressionValue*): Self = this.set("textureCoord", js.Array(value :_*))
    @scala.inline
    def setTextureCoord(value: js.Array[ExpressionValue]): Self = this.set("textureCoord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextureCoord: Self = this.set("textureCoord", js.undefined)
  }
  
}

