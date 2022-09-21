package typings.pixiPrepare

import typings.pixiText.mod.TEXT_GRADIENT
import typings.pixiText.mod.TextStyle
import typings.pixiText.mod.TextStyleAlign
import typings.pixiText.mod.TextStyleFill
import typings.pixiText.mod.TextStyleFontStyle
import typings.pixiText.mod.TextStyleFontVariant
import typings.pixiText.mod.TextStyleFontWeight
import typings.pixiText.mod.TextStyleLineJoin
import typings.pixiText.mod.TextStyleTextBaseline
import typings.pixiText.mod.TextStyleWhiteSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@pixi/text.@pixi/text.TextStyle> */
  trait PartialTextStyle extends StObject {
    
    var _align: js.UndefOr[TextStyleAlign] = js.undefined
    
    var _breakWords: js.UndefOr[Boolean] = js.undefined
    
    var _dropShadow: js.UndefOr[Boolean] = js.undefined
    
    var _dropShadowAlpha: js.UndefOr[Double] = js.undefined
    
    var _dropShadowAngle: js.UndefOr[Double] = js.undefined
    
    var _dropShadowBlur: js.UndefOr[Double] = js.undefined
    
    var _dropShadowColor: js.UndefOr[String | Double] = js.undefined
    
    var _dropShadowDistance: js.UndefOr[Double] = js.undefined
    
    var _fill: js.UndefOr[TextStyleFill] = js.undefined
    
    var _fillGradientStops: js.UndefOr[js.Array[Double]] = js.undefined
    
    var _fillGradientType: js.UndefOr[TEXT_GRADIENT] = js.undefined
    
    var _fontFamily: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var _fontSize: js.UndefOr[Double | String] = js.undefined
    
    var _fontStyle: js.UndefOr[TextStyleFontStyle] = js.undefined
    
    var _fontVariant: js.UndefOr[TextStyleFontVariant] = js.undefined
    
    var _fontWeight: js.UndefOr[TextStyleFontWeight] = js.undefined
    
    var _leading: js.UndefOr[Double] = js.undefined
    
    var _letterSpacing: js.UndefOr[Double] = js.undefined
    
    var _lineHeight: js.UndefOr[Double] = js.undefined
    
    var _lineJoin: js.UndefOr[TextStyleLineJoin] = js.undefined
    
    var _miterLimit: js.UndefOr[Double] = js.undefined
    
    var _padding: js.UndefOr[Double] = js.undefined
    
    var _stroke: js.UndefOr[String | Double] = js.undefined
    
    var _strokeThickness: js.UndefOr[Double] = js.undefined
    
    var _textBaseline: js.UndefOr[TextStyleTextBaseline] = js.undefined
    
    var _trim: js.UndefOr[Boolean] = js.undefined
    
    var _whiteSpace: js.UndefOr[TextStyleWhiteSpace] = js.undefined
    
    var _wordWrap: js.UndefOr[Boolean] = js.undefined
    
    var _wordWrapWidth: js.UndefOr[Double] = js.undefined
    
    var align: js.UndefOr[js.Function0[TextStyleAlign]] = js.undefined
    
    var breakWords: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    @JSName("clone")
    var clone_FPartialTextStyle: js.UndefOr[js.Function0[TextStyle]] = js.undefined
    
    var constructor: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var dropShadow: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var dropShadowAlpha: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var dropShadowAngle: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var dropShadowBlur: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var dropShadowColor: js.UndefOr[js.Function0[Double | String]] = js.undefined
    
    var dropShadowDistance: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var fill: js.UndefOr[js.Function0[TextStyleFill]] = js.undefined
    
    var fillGradientStops: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
    
    var fillGradientType: js.UndefOr[js.Function0[TEXT_GRADIENT]] = js.undefined
    
    var fontFamily: js.UndefOr[js.Function0[String | js.Array[String]]] = js.undefined
    
    var fontSize: js.UndefOr[js.Function0[Double | String]] = js.undefined
    
    var fontStyle: js.UndefOr[js.Function0[TextStyleFontStyle]] = js.undefined
    
    var fontVariant: js.UndefOr[js.Function0[TextStyleFontVariant]] = js.undefined
    
    var fontWeight: js.UndefOr[js.Function0[TextStyleFontWeight]] = js.undefined
    
    var leading: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var letterSpacing: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var lineHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var lineJoin: js.UndefOr[js.Function0[TextStyleLineJoin]] = js.undefined
    
    var miterLimit: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var padding: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var stroke: js.UndefOr[js.Function0[String | Double]] = js.undefined
    
    var strokeThickness: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var styleID: js.UndefOr[Double] = js.undefined
    
    var textBaseline: js.UndefOr[js.Function0[TextStyleTextBaseline]] = js.undefined
    
    var toFontString: js.UndefOr[js.Function0[String]] = js.undefined
    
    var trim: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var whiteSpace: js.UndefOr[js.Function0[TextStyleWhiteSpace]] = js.undefined
    
    var wordWrap: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var wordWrapWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  }
  object PartialTextStyle {
    
    inline def apply(): PartialTextStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTextStyle]
    }
    
    extension [Self <: PartialTextStyle](x: Self) {
      
      inline def setAlign(value: () => TextStyleAlign): Self = StObject.set(x, "align", js.Any.fromFunction0(value))
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBreakWords(value: () => Boolean): Self = StObject.set(x, "breakWords", js.Any.fromFunction0(value))
      
      inline def setBreakWordsUndefined: Self = StObject.set(x, "breakWords", js.undefined)
      
      inline def setClone_(value: () => TextStyle): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setConstructor(value: () => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction0(value))
      
      inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      inline def setDropShadow(value: () => Boolean): Self = StObject.set(x, "dropShadow", js.Any.fromFunction0(value))
      
      inline def setDropShadowAlpha(value: () => Double): Self = StObject.set(x, "dropShadowAlpha", js.Any.fromFunction0(value))
      
      inline def setDropShadowAlphaUndefined: Self = StObject.set(x, "dropShadowAlpha", js.undefined)
      
      inline def setDropShadowAngle(value: () => Double): Self = StObject.set(x, "dropShadowAngle", js.Any.fromFunction0(value))
      
      inline def setDropShadowAngleUndefined: Self = StObject.set(x, "dropShadowAngle", js.undefined)
      
      inline def setDropShadowBlur(value: () => Double): Self = StObject.set(x, "dropShadowBlur", js.Any.fromFunction0(value))
      
      inline def setDropShadowBlurUndefined: Self = StObject.set(x, "dropShadowBlur", js.undefined)
      
      inline def setDropShadowColor(value: () => Double | String): Self = StObject.set(x, "dropShadowColor", js.Any.fromFunction0(value))
      
      inline def setDropShadowColorUndefined: Self = StObject.set(x, "dropShadowColor", js.undefined)
      
      inline def setDropShadowDistance(value: () => Double): Self = StObject.set(x, "dropShadowDistance", js.Any.fromFunction0(value))
      
      inline def setDropShadowDistanceUndefined: Self = StObject.set(x, "dropShadowDistance", js.undefined)
      
      inline def setDropShadowUndefined: Self = StObject.set(x, "dropShadow", js.undefined)
      
      inline def setFill(value: () => TextStyleFill): Self = StObject.set(x, "fill", js.Any.fromFunction0(value))
      
      inline def setFillGradientStops(value: () => js.Array[Double]): Self = StObject.set(x, "fillGradientStops", js.Any.fromFunction0(value))
      
      inline def setFillGradientStopsUndefined: Self = StObject.set(x, "fillGradientStops", js.undefined)
      
      inline def setFillGradientType(value: () => TEXT_GRADIENT): Self = StObject.set(x, "fillGradientType", js.Any.fromFunction0(value))
      
      inline def setFillGradientTypeUndefined: Self = StObject.set(x, "fillGradientType", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFontFamily(value: () => String | js.Array[String]): Self = StObject.set(x, "fontFamily", js.Any.fromFunction0(value))
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: () => Double | String): Self = StObject.set(x, "fontSize", js.Any.fromFunction0(value))
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: () => TextStyleFontStyle): Self = StObject.set(x, "fontStyle", js.Any.fromFunction0(value))
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontVariant(value: () => TextStyleFontVariant): Self = StObject.set(x, "fontVariant", js.Any.fromFunction0(value))
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontWeight(value: () => TextStyleFontWeight): Self = StObject.set(x, "fontWeight", js.Any.fromFunction0(value))
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setLeading(value: () => Double): Self = StObject.set(x, "leading", js.Any.fromFunction0(value))
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setLetterSpacing(value: () => Double): Self = StObject.set(x, "letterSpacing", js.Any.fromFunction0(value))
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLineHeight(value: () => Double): Self = StObject.set(x, "lineHeight", js.Any.fromFunction0(value))
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setLineJoin(value: () => TextStyleLineJoin): Self = StObject.set(x, "lineJoin", js.Any.fromFunction0(value))
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setMiterLimit(value: () => Double): Self = StObject.set(x, "miterLimit", js.Any.fromFunction0(value))
      
      inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
      
      inline def setPadding(value: () => Double): Self = StObject.set(x, "padding", js.Any.fromFunction0(value))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setStroke(value: () => String | Double): Self = StObject.set(x, "stroke", js.Any.fromFunction0(value))
      
      inline def setStrokeThickness(value: () => Double): Self = StObject.set(x, "strokeThickness", js.Any.fromFunction0(value))
      
      inline def setStrokeThicknessUndefined: Self = StObject.set(x, "strokeThickness", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStyleID(value: Double): Self = StObject.set(x, "styleID", value.asInstanceOf[js.Any])
      
      inline def setStyleIDUndefined: Self = StObject.set(x, "styleID", js.undefined)
      
      inline def setTextBaseline(value: () => TextStyleTextBaseline): Self = StObject.set(x, "textBaseline", js.Any.fromFunction0(value))
      
      inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
      
      inline def setToFontString(value: () => String): Self = StObject.set(x, "toFontString", js.Any.fromFunction0(value))
      
      inline def setToFontStringUndefined: Self = StObject.set(x, "toFontString", js.undefined)
      
      inline def setTrim(value: () => Boolean): Self = StObject.set(x, "trim", js.Any.fromFunction0(value))
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setWhiteSpace(value: () => TextStyleWhiteSpace): Self = StObject.set(x, "whiteSpace", js.Any.fromFunction0(value))
      
      inline def setWhiteSpaceUndefined: Self = StObject.set(x, "whiteSpace", js.undefined)
      
      inline def setWordWrap(value: () => Boolean): Self = StObject.set(x, "wordWrap", js.Any.fromFunction0(value))
      
      inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
      
      inline def setWordWrapWidth(value: () => Double): Self = StObject.set(x, "wordWrapWidth", js.Any.fromFunction0(value))
      
      inline def setWordWrapWidthUndefined: Self = StObject.set(x, "wordWrapWidth", js.undefined)
      
      inline def set_align(value: TextStyleAlign): Self = StObject.set(x, "_align", value.asInstanceOf[js.Any])
      
      inline def set_alignUndefined: Self = StObject.set(x, "_align", js.undefined)
      
      inline def set_breakWords(value: Boolean): Self = StObject.set(x, "_breakWords", value.asInstanceOf[js.Any])
      
      inline def set_breakWordsUndefined: Self = StObject.set(x, "_breakWords", js.undefined)
      
      inline def set_dropShadow(value: Boolean): Self = StObject.set(x, "_dropShadow", value.asInstanceOf[js.Any])
      
      inline def set_dropShadowAlpha(value: Double): Self = StObject.set(x, "_dropShadowAlpha", value.asInstanceOf[js.Any])
      
      inline def set_dropShadowAlphaUndefined: Self = StObject.set(x, "_dropShadowAlpha", js.undefined)
      
      inline def set_dropShadowAngle(value: Double): Self = StObject.set(x, "_dropShadowAngle", value.asInstanceOf[js.Any])
      
      inline def set_dropShadowAngleUndefined: Self = StObject.set(x, "_dropShadowAngle", js.undefined)
      
      inline def set_dropShadowBlur(value: Double): Self = StObject.set(x, "_dropShadowBlur", value.asInstanceOf[js.Any])
      
      inline def set_dropShadowBlurUndefined: Self = StObject.set(x, "_dropShadowBlur", js.undefined)
      
      inline def set_dropShadowColor(value: String | Double): Self = StObject.set(x, "_dropShadowColor", value.asInstanceOf[js.Any])
      
      inline def set_dropShadowColorUndefined: Self = StObject.set(x, "_dropShadowColor", js.undefined)
      
      inline def set_dropShadowDistance(value: Double): Self = StObject.set(x, "_dropShadowDistance", value.asInstanceOf[js.Any])
      
      inline def set_dropShadowDistanceUndefined: Self = StObject.set(x, "_dropShadowDistance", js.undefined)
      
      inline def set_dropShadowUndefined: Self = StObject.set(x, "_dropShadow", js.undefined)
      
      inline def set_fill(value: TextStyleFill): Self = StObject.set(x, "_fill", value.asInstanceOf[js.Any])
      
      inline def set_fillGradientStops(value: js.Array[Double]): Self = StObject.set(x, "_fillGradientStops", value.asInstanceOf[js.Any])
      
      inline def set_fillGradientStopsUndefined: Self = StObject.set(x, "_fillGradientStops", js.undefined)
      
      inline def set_fillGradientStopsVarargs(value: Double*): Self = StObject.set(x, "_fillGradientStops", js.Array(value*))
      
      inline def set_fillGradientType(value: TEXT_GRADIENT): Self = StObject.set(x, "_fillGradientType", value.asInstanceOf[js.Any])
      
      inline def set_fillGradientTypeUndefined: Self = StObject.set(x, "_fillGradientType", js.undefined)
      
      inline def set_fillUndefined: Self = StObject.set(x, "_fill", js.undefined)
      
      inline def set_fillVarargs(value: (Double | String)*): Self = StObject.set(x, "_fill", js.Array(value*))
      
      inline def set_fontFamily(value: String | js.Array[String]): Self = StObject.set(x, "_fontFamily", value.asInstanceOf[js.Any])
      
      inline def set_fontFamilyUndefined: Self = StObject.set(x, "_fontFamily", js.undefined)
      
      inline def set_fontFamilyVarargs(value: String*): Self = StObject.set(x, "_fontFamily", js.Array(value*))
      
      inline def set_fontSize(value: Double | String): Self = StObject.set(x, "_fontSize", value.asInstanceOf[js.Any])
      
      inline def set_fontSizeUndefined: Self = StObject.set(x, "_fontSize", js.undefined)
      
      inline def set_fontStyle(value: TextStyleFontStyle): Self = StObject.set(x, "_fontStyle", value.asInstanceOf[js.Any])
      
      inline def set_fontStyleUndefined: Self = StObject.set(x, "_fontStyle", js.undefined)
      
      inline def set_fontVariant(value: TextStyleFontVariant): Self = StObject.set(x, "_fontVariant", value.asInstanceOf[js.Any])
      
      inline def set_fontVariantUndefined: Self = StObject.set(x, "_fontVariant", js.undefined)
      
      inline def set_fontWeight(value: TextStyleFontWeight): Self = StObject.set(x, "_fontWeight", value.asInstanceOf[js.Any])
      
      inline def set_fontWeightUndefined: Self = StObject.set(x, "_fontWeight", js.undefined)
      
      inline def set_leading(value: Double): Self = StObject.set(x, "_leading", value.asInstanceOf[js.Any])
      
      inline def set_leadingUndefined: Self = StObject.set(x, "_leading", js.undefined)
      
      inline def set_letterSpacing(value: Double): Self = StObject.set(x, "_letterSpacing", value.asInstanceOf[js.Any])
      
      inline def set_letterSpacingUndefined: Self = StObject.set(x, "_letterSpacing", js.undefined)
      
      inline def set_lineHeight(value: Double): Self = StObject.set(x, "_lineHeight", value.asInstanceOf[js.Any])
      
      inline def set_lineHeightUndefined: Self = StObject.set(x, "_lineHeight", js.undefined)
      
      inline def set_lineJoin(value: TextStyleLineJoin): Self = StObject.set(x, "_lineJoin", value.asInstanceOf[js.Any])
      
      inline def set_lineJoinUndefined: Self = StObject.set(x, "_lineJoin", js.undefined)
      
      inline def set_miterLimit(value: Double): Self = StObject.set(x, "_miterLimit", value.asInstanceOf[js.Any])
      
      inline def set_miterLimitUndefined: Self = StObject.set(x, "_miterLimit", js.undefined)
      
      inline def set_padding(value: Double): Self = StObject.set(x, "_padding", value.asInstanceOf[js.Any])
      
      inline def set_paddingUndefined: Self = StObject.set(x, "_padding", js.undefined)
      
      inline def set_stroke(value: String | Double): Self = StObject.set(x, "_stroke", value.asInstanceOf[js.Any])
      
      inline def set_strokeThickness(value: Double): Self = StObject.set(x, "_strokeThickness", value.asInstanceOf[js.Any])
      
      inline def set_strokeThicknessUndefined: Self = StObject.set(x, "_strokeThickness", js.undefined)
      
      inline def set_strokeUndefined: Self = StObject.set(x, "_stroke", js.undefined)
      
      inline def set_textBaseline(value: TextStyleTextBaseline): Self = StObject.set(x, "_textBaseline", value.asInstanceOf[js.Any])
      
      inline def set_textBaselineUndefined: Self = StObject.set(x, "_textBaseline", js.undefined)
      
      inline def set_trim(value: Boolean): Self = StObject.set(x, "_trim", value.asInstanceOf[js.Any])
      
      inline def set_trimUndefined: Self = StObject.set(x, "_trim", js.undefined)
      
      inline def set_whiteSpace(value: TextStyleWhiteSpace): Self = StObject.set(x, "_whiteSpace", value.asInstanceOf[js.Any])
      
      inline def set_whiteSpaceUndefined: Self = StObject.set(x, "_whiteSpace", js.undefined)
      
      inline def set_wordWrap(value: Boolean): Self = StObject.set(x, "_wordWrap", value.asInstanceOf[js.Any])
      
      inline def set_wordWrapUndefined: Self = StObject.set(x, "_wordWrap", js.undefined)
      
      inline def set_wordWrapWidth(value: Double): Self = StObject.set(x, "_wordWrapWidth", value.asInstanceOf[js.Any])
      
      inline def set_wordWrapWidthUndefined: Self = StObject.set(x, "_wordWrapWidth", js.undefined)
    }
  }
}
