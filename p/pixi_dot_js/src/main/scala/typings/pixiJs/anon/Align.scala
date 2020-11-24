package typings.pixiJs.anon

import typings.std.CanvasGradient
import typings.std.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Align extends js.Object {
  
  var align: js.UndefOr[String] = js.native
  
  var breakWords: js.UndefOr[Boolean] = js.native
  
  var dropShadow: js.UndefOr[Boolean] = js.native
  
  var dropShadowAlpha: js.UndefOr[Double] = js.native
  
  var dropShadowAngle: js.UndefOr[Double] = js.native
  
  var dropShadowBlur: js.UndefOr[Double] = js.native
  
  var dropShadowColor: js.UndefOr[String | Double] = js.native
  
  var dropShadowDistance: js.UndefOr[Double] = js.native
  
  var fill: js.UndefOr[String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern] = js.native
  
  var fillGradientStops: js.UndefOr[js.Array[Double]] = js.native
  
  var fillGradientType: js.UndefOr[Double] = js.native
  
  var fontFamily: js.UndefOr[String | js.Array[String]] = js.native
  
  var fontSize: js.UndefOr[Double | String] = js.native
  
  var fontStyle: js.UndefOr[String] = js.native
  
  var fontVariant: js.UndefOr[String] = js.native
  
  var fontWeight: js.UndefOr[String] = js.native
  
  var leading: js.UndefOr[Double] = js.native
  
  var letterSpacing: js.UndefOr[Double] = js.native
  
  var lineHeight: js.UndefOr[Double] = js.native
  
  var lineJoin: js.UndefOr[String] = js.native
  
  var miterLimit: js.UndefOr[Double] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var stroke: js.UndefOr[String | Double] = js.native
  
  var strokeThickness: js.UndefOr[Double] = js.native
  
  var textBaseline: js.UndefOr[String] = js.native
  
  var trim: js.UndefOr[Boolean] = js.native
  
  var whiteSpace: js.UndefOr[String] = js.native
  
  var wordWrap: js.UndefOr[Boolean] = js.native
  
  var wordWrapWidth: js.UndefOr[Double] = js.native
}
object Align {
  
  @scala.inline
  def apply(): Align = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Align]
  }
  
  @scala.inline
  implicit class AlignOps[Self <: Align] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setBreakWords(value: Boolean): Self = this.set("breakWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakWords: Self = this.set("breakWords", js.undefined)
    
    @scala.inline
    def setDropShadow(value: Boolean): Self = this.set("dropShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropShadow: Self = this.set("dropShadow", js.undefined)
    
    @scala.inline
    def setDropShadowAlpha(value: Double): Self = this.set("dropShadowAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropShadowAlpha: Self = this.set("dropShadowAlpha", js.undefined)
    
    @scala.inline
    def setDropShadowAngle(value: Double): Self = this.set("dropShadowAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropShadowAngle: Self = this.set("dropShadowAngle", js.undefined)
    
    @scala.inline
    def setDropShadowBlur(value: Double): Self = this.set("dropShadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropShadowBlur: Self = this.set("dropShadowBlur", js.undefined)
    
    @scala.inline
    def setDropShadowColor(value: String | Double): Self = this.set("dropShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropShadowColor: Self = this.set("dropShadowColor", js.undefined)
    
    @scala.inline
    def setDropShadowDistance(value: Double): Self = this.set("dropShadowDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropShadowDistance: Self = this.set("dropShadowDistance", js.undefined)
    
    @scala.inline
    def setFillVarargs(value: (Double | String)*): Self = this.set("fill", js.Array(value :_*))
    
    @scala.inline
    def setFill(value: String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFillGradientStopsVarargs(value: Double*): Self = this.set("fillGradientStops", js.Array(value :_*))
    
    @scala.inline
    def setFillGradientStops(value: js.Array[Double]): Self = this.set("fillGradientStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillGradientStops: Self = this.set("fillGradientStops", js.undefined)
    
    @scala.inline
    def setFillGradientType(value: Double): Self = this.set("fillGradientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillGradientType: Self = this.set("fillGradientType", js.undefined)
    
    @scala.inline
    def setFontFamilyVarargs(value: String*): Self = this.set("fontFamily", js.Array(value :_*))
    
    @scala.inline
    def setFontFamily(value: String | js.Array[String]): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double | String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: String): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setLeading(value: Double): Self = this.set("leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeading: Self = this.set("leading", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setLineJoin(value: String): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineJoin: Self = this.set("lineJoin", js.undefined)
    
    @scala.inline
    def setMiterLimit(value: Double): Self = this.set("miterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiterLimit: Self = this.set("miterLimit", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setStroke(value: String | Double): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeThickness(value: Double): Self = this.set("strokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeThickness: Self = this.set("strokeThickness", js.undefined)
    
    @scala.inline
    def setTextBaseline(value: String): Self = this.set("textBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBaseline: Self = this.set("textBaseline", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setWhiteSpace(value: String): Self = this.set("whiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhiteSpace: Self = this.set("whiteSpace", js.undefined)
    
    @scala.inline
    def setWordWrap(value: Boolean): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
    
    @scala.inline
    def setWordWrapWidth(value: Double): Self = this.set("wordWrapWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrapWidth: Self = this.set("wordWrapWidth", js.undefined)
  }
}
