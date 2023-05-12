package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.TextStyleWordWrapCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  /**
    * Results object from a call to GetTextSize.
    */
  trait GetTextSizeObject extends StObject {
    
    /**
      * The height of the Text object.
      */
    var height: Double
    
    /**
      * The height of a line factoring in font and stroke.
      */
    var lineHeight: Double
    
    /**
      * The line spacing of the Text object.
      */
    var lineSpacing: Double
    
    /**
      * An array of the lines for each line in the Text object.
      */
    var lineWidths: js.Array[Double]
    
    /**
      * The number of lines in the Text object.
      */
    var lines: Double
    
    /**
      * The width of the longest line in the Text object.
      */
    var width: Double
  }
  object GetTextSizeObject {
    
    inline def apply(
      height: Double,
      lineHeight: Double,
      lineSpacing: Double,
      lineWidths: js.Array[Double],
      lines: Double,
      width: Double
    ): GetTextSizeObject = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], lineWidths = lineWidths.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTextSizeObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetTextSizeObject] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
      
      inline def setLineWidths(value: js.Array[Double]): Self = StObject.set(x, "lineWidths", value.asInstanceOf[js.Any])
      
      inline def setLineWidthsVarargs(value: Double*): Self = StObject.set(x, "lineWidths", js.Array(value*))
      
      inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextConfig
    extends StObject
       with GameObjectConfig {
    
    /**
      * A Text Padding object.
      */
    var padding: js.UndefOr[TextPadding] = js.undefined
    
    /**
      * The Text style configuration object.
      */
    var style: js.UndefOr[TextStyle] = js.undefined
    
    /**
      * The text this Text object will display.
      */
    var text: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object TextConfig {
    
    inline def apply(): TextConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextConfig] (val x: Self) extends AnyVal {
      
      inline def setPadding(value: TextPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setStyle(value: TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
    }
  }
  
  /**
    * Font metrics for a Text Style object.
    */
  trait TextMetrics extends StObject {
    
    /**
      * The ascent of the font.
      */
    var ascent: Double
    
    /**
      * The descent of the font.
      */
    var descent: Double
    
    /**
      * The size of the font.
      */
    var fontSize: Double
  }
  object TextMetrics {
    
    inline def apply(ascent: Double, descent: Double, fontSize: Double): TextMetrics = {
      val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextMetrics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextMetrics] (val x: Self) extends AnyVal {
      
      inline def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      inline def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A Text Padding configuration object as used by the Text Style.
    */
  trait TextPadding extends StObject {
    
    /**
      * The amount of padding added to the bottom of the Text object.
      */
    var bottom: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of padding added to the left of the Text object.
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of padding added to the right of the Text object.
      */
    var right: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of padding added to the top of the Text object.
      */
    var top: js.UndefOr[Double] = js.undefined
    
    /**
      * If set this value is used for both the left and right padding.
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /**
      * If set this value is used for both the top and bottom padding.
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object TextPadding {
    
    inline def apply(): TextPadding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextPadding]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextPadding] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /**
    * A Text Shadow configuration object as used by the Text Style.
    */
  trait TextShadow extends StObject {
    
    /**
      * The amount of blur applied to the shadow. Leave as zero for a hard shadow.
      */
    var blur: js.UndefOr[Double] = js.undefined
    
    /**
      * The color of the shadow, given as a CSS string value.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Apply the shadow to the fill effect on the Text object?
      */
    var fill: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The horizontal offset of the shadow.
      */
    var offsetX: js.UndefOr[Double] = js.undefined
    
    /**
      * The vertical offset of the shadow.
      */
    var offsetY: js.UndefOr[Double] = js.undefined
    
    /**
      * Apply the shadow to the stroke effect on the Text object?
      */
    var stroke: js.UndefOr[Boolean] = js.undefined
  }
  object TextShadow {
    
    inline def apply(): TextShadow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextShadow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextShadow] (val x: Self) extends AnyVal {
      
      inline def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setStroke(value: Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  /**
    * A Text Style configuration object as used by the Text Game Object.
    */
  trait TextStyle extends StObject {
    
    /**
      * The alignment of the Text. This only impacts multi-line text. Either `left`, `right`, `center` or `justify`.
      */
    var align: js.UndefOr[String] = js.undefined
    
    /**
      * A solid fill color that is rendered behind the Text object. Given as a CSS string color such as `#ff0`.
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * The amount of horizontal padding added to the width of the text when calculating the font metrics.
      */
    var baselineX: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of vertical padding added to the height of the text when calculating the font metrics.
      */
    var baselineY: js.UndefOr[Double] = js.undefined
    
    /**
      * The color the Text is drawn in. Given as a CSS string color such as `#fff` or `rgb()`.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Force the Text object to have the exact height specified in this property. Leave as zero for it to change accordingly to content.
      */
    var fixedHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Force the Text object to have the exact width specified in this property. Leave as zero for it to change accordingly to content.
      */
    var fixedWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * The font family or font settings to set. Overrides the other font settings.
      */
    var font: js.UndefOr[String] = js.undefined
    
    /**
      * The font the Text object will render with. This is a Canvas style font string.
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * The font size, as a CSS size string.
      */
    var fontSize: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Any addition font styles, such as 'strong'.
      */
    var fontStyle: js.UndefOr[String] = js.undefined
    
    /**
      * The amount to add to the font height to achieve the overall line height.
      */
    var lineSpacing: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of lines to display within the Text object.
      */
    var maxLines: js.UndefOr[Double] = js.undefined
    
    /**
      * A Text Metrics object. Use this to avoid expensive font size calculations in text heavy games.
      */
    var metrics: js.UndefOr[TextMetrics] = js.undefined
    
    /**
      * A Text Padding object.
      */
    var padding: js.UndefOr[TextPadding] = js.undefined
    
    /**
      * Sets the resolution (DPI setting) of the Text object. Leave at zero for it to use the game resolution.
      */
    var resolution: js.UndefOr[Double] = js.undefined
    
    /**
      * Set to `true` if this Text object should render from right-to-left.
      */
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The Text shadow configuration object.
      */
    var shadow: js.UndefOr[TextShadow] = js.undefined
    
    /**
      * The color used to stroke the Text if the `strokeThickness` property is greater than zero.
      */
    var stroke: js.UndefOr[String] = js.undefined
    
    /**
      * The thickness of the stroke around the Text. Set to zero for no stroke.
      */
    var strokeThickness: js.UndefOr[Double] = js.undefined
    
    /**
      * This is the string used to aid Canvas in calculating the height of the font.
      */
    var testString: js.UndefOr[String] = js.undefined
    
    /**
      * The Text Word wrap configuration object.
      */
    var wordWrap: js.UndefOr[TextWordWrap] = js.undefined
  }
  object TextStyle {
    
    inline def apply(): TextStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextStyle] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBaselineX(value: Double): Self = StObject.set(x, "baselineX", value.asInstanceOf[js.Any])
      
      inline def setBaselineXUndefined: Self = StObject.set(x, "baselineX", js.undefined)
      
      inline def setBaselineY(value: Double): Self = StObject.set(x, "baselineY", value.asInstanceOf[js.Any])
      
      inline def setBaselineYUndefined: Self = StObject.set(x, "baselineY", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFixedHeight(value: Double): Self = StObject.set(x, "fixedHeight", value.asInstanceOf[js.Any])
      
      inline def setFixedHeightUndefined: Self = StObject.set(x, "fixedHeight", js.undefined)
      
      inline def setFixedWidth(value: Double): Self = StObject.set(x, "fixedWidth", value.asInstanceOf[js.Any])
      
      inline def setFixedWidthUndefined: Self = StObject.set(x, "fixedWidth", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
      
      inline def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
      
      inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setMetrics(value: TextMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setPadding(value: TextPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setShadow(value: TextShadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeThickness(value: Double): Self = StObject.set(x, "strokeThickness", value.asInstanceOf[js.Any])
      
      inline def setStrokeThicknessUndefined: Self = StObject.set(x, "strokeThickness", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setTestString(value: String): Self = StObject.set(x, "testString", value.asInstanceOf[js.Any])
      
      inline def setTestStringUndefined: Self = StObject.set(x, "testString", js.undefined)
      
      inline def setWordWrap(value: TextWordWrap): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
    }
  }
  
  /**
    * A Text Word Wrap configuration object as used by the Text Style configuration.
    */
  trait TextWordWrap extends StObject {
    
    /**
      * Provide a custom callback when word wrapping is enabled.
      */
    var callback: js.UndefOr[TextStyleWordWrapCallback] = js.undefined
    
    /**
      * The context in which the word wrap callback is invoked.
      */
    var callbackScope: js.UndefOr[Any] = js.undefined
    
    /**
      * Use basic or advanced word wrapping?
      */
    var useAdvancedWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The width at which text should be considered for word-wrapping.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object TextWordWrap {
    
    inline def apply(): TextWordWrap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextWordWrap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextWordWrap] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* text */ String, /* textObject */ typings.phaser.Phaser.GameObjects.Text) => String | js.Array[String]
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackScope(value: Any): Self = StObject.set(x, "callbackScope", value.asInstanceOf[js.Any])
      
      inline def setCallbackScopeUndefined: Self = StObject.set(x, "callbackScope", js.undefined)
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setUseAdvancedWrap(value: Boolean): Self = StObject.set(x, "useAdvancedWrap", value.asInstanceOf[js.Any])
      
      inline def setUseAdvancedWrapUndefined: Self = StObject.set(x, "useAdvancedWrap", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
