package typings.pixiTextBitmap

import typings.pixiText.mod.TEXT_GRADIENT
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
  
  trait Amount extends StObject {
    
    var amount: String
    
    var first: String
    
    var second: String
  }
  object Amount {
    
    inline def apply(amount: String, first: String, second: String): Amount = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
      __obj.asInstanceOf[Amount]
    }
    
    extension [Self <: Amount](x: Self) {
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    }
  }
  
  trait Count extends StObject {
    
    var count: Double
  }
  object Count {
    
    inline def apply(count: Double): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    extension [Self <: Count](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    }
  }
  
  trait DistanceRange extends StObject {
    
    var distanceRange: String
    
    var fieldType: String
  }
  object DistanceRange {
    
    inline def apply(distanceRange: String, fieldType: String): DistanceRange = {
      val __obj = js.Dynamic.literal(distanceRange = distanceRange.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistanceRange]
    }
    
    extension [Self <: DistanceRange](x: Self) {
      
      inline def setDistanceRange(value: String): Self = StObject.set(x, "distanceRange", value.asInstanceOf[js.Any])
      
      inline def setFieldType(value: String): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Face extends StObject {
    
    var face: String
    
    var size: String
  }
  object Face {
    
    inline def apply(face: String, size: String): Face = {
      val __obj = js.Dynamic.literal(face = face.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Face]
    }
    
    extension [Self <: Face](x: Self) {
      
      inline def setFace(value: String): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait File extends StObject {
    
    var file: String
    
    var id: String
  }
  object File {
    
    inline def apply(file: String, id: String): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: String
    
    var id: String
    
    var page: String
    
    var width: String
    
    var x: String
    
    var xadvance: String
    
    var xoffset: String
    
    var y: String
    
    var yoffset: String
  }
  object Height {
    
    inline def apply(
      height: String,
      id: String,
      page: String,
      width: String,
      x: String,
      xadvance: String,
      xoffset: String,
      y: String,
      yoffset: String
    ): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xadvance = xadvance.asInstanceOf[js.Any], xoffset = xoffset.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yoffset = yoffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXadvance(value: String): Self = StObject.set(x, "xadvance", value.asInstanceOf[js.Any])
      
      inline def setXoffset(value: String): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYoffset(value: String): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait LineHeight extends StObject {
    
    var lineHeight: String
  }
  object LineHeight {
    
    inline def apply(lineHeight: String): LineHeight = {
      val __obj = js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineHeight]
    }
    
    extension [Self <: LineHeight](x: Self) {
      
      inline def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@pixi/text-bitmap.@pixi/text-bitmap.IBitmapTextStyle> */
  trait PartialIBitmapTextStyle extends StObject {
    
    var align: js.UndefOr[TextStyleAlign] = js.undefined
    
    var fontName: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var letterSpacing: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var tint: js.UndefOr[Double] = js.undefined
  }
  object PartialIBitmapTextStyle {
    
    inline def apply(): PartialIBitmapTextStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIBitmapTextStyle]
    }
    
    extension [Self <: PartialIBitmapTextStyle](x: Self) {
      
      inline def setAlign(value: TextStyleAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
      
      inline def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setTint(value: Double): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
      
      inline def setTintUndefined: Self = StObject.set(x, "tint", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@pixi/text.@pixi/text.ITextStyle> */
  trait PartialITextStyle extends StObject {
    
    var align: js.UndefOr[TextStyleAlign] = js.undefined
    
    var breakWords: js.UndefOr[Boolean] = js.undefined
    
    var dropShadow: js.UndefOr[Boolean] = js.undefined
    
    var dropShadowAlpha: js.UndefOr[Double] = js.undefined
    
    var dropShadowAngle: js.UndefOr[Double] = js.undefined
    
    var dropShadowBlur: js.UndefOr[Double] = js.undefined
    
    var dropShadowColor: js.UndefOr[String | Double] = js.undefined
    
    var dropShadowDistance: js.UndefOr[Double] = js.undefined
    
    var fill: js.UndefOr[TextStyleFill] = js.undefined
    
    var fillGradientStops: js.UndefOr[js.Array[Double]] = js.undefined
    
    var fillGradientType: js.UndefOr[TEXT_GRADIENT] = js.undefined
    
    var fontFamily: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var fontSize: js.UndefOr[Double | String] = js.undefined
    
    var fontStyle: js.UndefOr[TextStyleFontStyle] = js.undefined
    
    var fontVariant: js.UndefOr[TextStyleFontVariant] = js.undefined
    
    var fontWeight: js.UndefOr[TextStyleFontWeight] = js.undefined
    
    var leading: js.UndefOr[Double] = js.undefined
    
    var letterSpacing: js.UndefOr[Double] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var lineJoin: js.UndefOr[TextStyleLineJoin] = js.undefined
    
    var miterLimit: js.UndefOr[Double] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var stroke: js.UndefOr[String | Double] = js.undefined
    
    var strokeThickness: js.UndefOr[Double] = js.undefined
    
    var textBaseline: js.UndefOr[TextStyleTextBaseline] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
    
    var whiteSpace: js.UndefOr[TextStyleWhiteSpace] = js.undefined
    
    var wordWrap: js.UndefOr[Boolean] = js.undefined
    
    var wordWrapWidth: js.UndefOr[Double] = js.undefined
  }
  object PartialITextStyle {
    
    inline def apply(): PartialITextStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialITextStyle]
    }
    
    extension [Self <: PartialITextStyle](x: Self) {
      
      inline def setAlign(value: TextStyleAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBreakWords(value: Boolean): Self = StObject.set(x, "breakWords", value.asInstanceOf[js.Any])
      
      inline def setBreakWordsUndefined: Self = StObject.set(x, "breakWords", js.undefined)
      
      inline def setDropShadow(value: Boolean): Self = StObject.set(x, "dropShadow", value.asInstanceOf[js.Any])
      
      inline def setDropShadowAlpha(value: Double): Self = StObject.set(x, "dropShadowAlpha", value.asInstanceOf[js.Any])
      
      inline def setDropShadowAlphaUndefined: Self = StObject.set(x, "dropShadowAlpha", js.undefined)
      
      inline def setDropShadowAngle(value: Double): Self = StObject.set(x, "dropShadowAngle", value.asInstanceOf[js.Any])
      
      inline def setDropShadowAngleUndefined: Self = StObject.set(x, "dropShadowAngle", js.undefined)
      
      inline def setDropShadowBlur(value: Double): Self = StObject.set(x, "dropShadowBlur", value.asInstanceOf[js.Any])
      
      inline def setDropShadowBlurUndefined: Self = StObject.set(x, "dropShadowBlur", js.undefined)
      
      inline def setDropShadowColor(value: String | Double): Self = StObject.set(x, "dropShadowColor", value.asInstanceOf[js.Any])
      
      inline def setDropShadowColorUndefined: Self = StObject.set(x, "dropShadowColor", js.undefined)
      
      inline def setDropShadowDistance(value: Double): Self = StObject.set(x, "dropShadowDistance", value.asInstanceOf[js.Any])
      
      inline def setDropShadowDistanceUndefined: Self = StObject.set(x, "dropShadowDistance", js.undefined)
      
      inline def setDropShadowUndefined: Self = StObject.set(x, "dropShadow", js.undefined)
      
      inline def setFill(value: TextStyleFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillGradientStops(value: js.Array[Double]): Self = StObject.set(x, "fillGradientStops", value.asInstanceOf[js.Any])
      
      inline def setFillGradientStopsUndefined: Self = StObject.set(x, "fillGradientStops", js.undefined)
      
      inline def setFillGradientStopsVarargs(value: Double*): Self = StObject.set(x, "fillGradientStops", js.Array(value*))
      
      inline def setFillGradientType(value: TEXT_GRADIENT): Self = StObject.set(x, "fillGradientType", value.asInstanceOf[js.Any])
      
      inline def setFillGradientTypeUndefined: Self = StObject.set(x, "fillGradientType", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFillVarargs(value: (Double | String)*): Self = StObject.set(x, "fill", js.Array(value*))
      
      inline def setFontFamily(value: String | js.Array[String]): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontFamilyVarargs(value: String*): Self = StObject.set(x, "fontFamily", js.Array(value*))
      
      inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: TextStyleFontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontVariant(value: TextStyleFontVariant): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontWeight(value: TextStyleFontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setLineJoin(value: TextStyleLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setStroke(value: String | Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeThickness(value: Double): Self = StObject.set(x, "strokeThickness", value.asInstanceOf[js.Any])
      
      inline def setStrokeThicknessUndefined: Self = StObject.set(x, "strokeThickness", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setTextBaseline(value: TextStyleTextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setWhiteSpace(value: TextStyleWhiteSpace): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
      
      inline def setWhiteSpaceUndefined: Self = StObject.set(x, "whiteSpace", js.undefined)
      
      inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
      
      inline def setWordWrapWidth(value: Double): Self = StObject.set(x, "wordWrapWidth", value.asInstanceOf[js.Any])
      
      inline def setWordWrapWidthUndefined: Self = StObject.set(x, "wordWrapWidth", js.undefined)
    }
  }
}
