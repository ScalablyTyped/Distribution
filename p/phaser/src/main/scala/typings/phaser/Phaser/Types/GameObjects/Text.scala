package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.TextStyleWordWrapCallback
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  /**
    * Font metrics for a Text Style object.
    */
  @js.native
  trait TextMetrics extends StObject {
    
    /**
      * The ascent of the font.
      */
    var ascent: Double = js.native
    
    /**
      * The descent of the font.
      */
    var descent: Double = js.native
    
    /**
      * The size of the font.
      */
    var fontSize: Double = js.native
  }
  object TextMetrics {
    
    @scala.inline
    def apply(ascent: Double, descent: Double, fontSize: Double): TextMetrics = {
      val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextMetrics]
    }
    
    @scala.inline
    implicit class TextMetricsMutableBuilder[Self <: TextMetrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A Text Padding configuration object as used by the Text Style.
    */
  @js.native
  trait TextPadding extends StObject {
    
    /**
      * The amount of padding added to the bottom of the Text object.
      */
    var bottom: js.UndefOr[Double] = js.native
    
    /**
      * The amount of padding added to the left of the Text object.
      */
    var left: js.UndefOr[Double] = js.native
    
    /**
      * The amount of padding added to the right of the Text object.
      */
    var right: js.UndefOr[Double] = js.native
    
    /**
      * The amount of padding added to the top of the Text object.
      */
    var top: js.UndefOr[Double] = js.native
    
    /**
      * If set this value is used for both the left and right padding.
      */
    var x: js.UndefOr[Double] = js.native
    
    /**
      * If set this value is used for both the top and bottom padding.
      */
    var y: js.UndefOr[Double] = js.native
  }
  object TextPadding {
    
    @scala.inline
    def apply(): TextPadding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextPadding]
    }
    
    @scala.inline
    implicit class TextPaddingMutableBuilder[Self <: TextPadding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /**
    * A Text Shadow configuration object as used by the Text Style.
    */
  @js.native
  trait TextShadow extends StObject {
    
    /**
      * The amount of blur applied to the shadow. Leave as zero for a hard shadow.
      */
    var blur: js.UndefOr[Double] = js.native
    
    /**
      * The color of the shadow, given as a CSS string value.
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Apply the shadow to the fill effect on the Text object?
      */
    var fill: js.UndefOr[Boolean] = js.native
    
    /**
      * The horizontal offset of the shadow.
      */
    var offsetX: js.UndefOr[Double] = js.native
    
    /**
      * The vertical offset of the shadow.
      */
    var offsetY: js.UndefOr[Double] = js.native
    
    /**
      * Apply the shadow to the stroke effect on the Text object?
      */
    var stroke: js.UndefOr[Boolean] = js.native
  }
  object TextShadow {
    
    @scala.inline
    def apply(): TextShadow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextShadow]
    }
    
    @scala.inline
    implicit class TextShadowMutableBuilder[Self <: TextShadow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setStroke(value: Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  /**
    * A Text Style configuration object as used by the Text Game Object.
    */
  @js.native
  trait TextStyle extends StObject {
    
    /**
      * The alignment of the Text. This only impacts multi-line text. Either `left`, `right`, `center` or `justify`.
      */
    var align: js.UndefOr[String] = js.native
    
    /**
      * A solid fill color that is rendered behind the Text object. Given as a CSS string color such as `#ff0`.
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /**
      * The amount of horizontal padding added to the width of the text when calculating the font metrics.
      */
    var baselineX: js.UndefOr[Double] = js.native
    
    /**
      * The amount of vertical padding added to the height of the text when calculating the font metrics.
      */
    var baselineY: js.UndefOr[Double] = js.native
    
    /**
      * The color the Text is drawn in. Given as a CSS string color such as `#fff` or `rgb()`.
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Force the Text object to have the exact height specified in this property. Leave as zero for it to change accordingly to content.
      */
    var fixedHeight: js.UndefOr[Double] = js.native
    
    /**
      * Force the Text object to have the exact width specified in this property. Leave as zero for it to change accordingly to content.
      */
    var fixedWidth: js.UndefOr[Double] = js.native
    
    /**
      * The font the Text object will render with. This is a Canvas style font string.
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /**
      * The font size, as a CSS size string.
      */
    var fontSize: js.UndefOr[String] = js.native
    
    /**
      * Any addition font styles, such as 'strong'.
      */
    var fontStyle: js.UndefOr[String] = js.native
    
    /**
      * The maximum number of lines to display within the Text object.
      */
    var maxLines: js.UndefOr[integer] = js.native
    
    /**
      * A Text Metrics object. Use this to avoid expensive font size calculations in text heavy games.
      */
    var metrics: js.UndefOr[TextMetrics] = js.native
    
    /**
      * A Text Padding object.
      */
    var padding: js.UndefOr[TextPadding] = js.native
    
    /**
      * Sets the resolution (DPI setting) of the Text object. Leave at zero for it to use the game resolution.
      */
    var resolution: js.UndefOr[Double] = js.native
    
    /**
      * Set to `true` if this Text object should render from right-to-left.
      */
    var rtl: js.UndefOr[Boolean] = js.native
    
    /**
      * The Text shadow configuration object.
      */
    var shadow: js.UndefOr[TextShadow] = js.native
    
    /**
      * The color used to stroke the Text if the `strokeThickness` property is greater than zero.
      */
    var stroke: js.UndefOr[String] = js.native
    
    /**
      * The thickness of the stroke around the Text. Set to zero for no stroke.
      */
    var strokeThickness: js.UndefOr[Double] = js.native
    
    /**
      * This is the string used to aid Canvas in calculating the height of the font.
      */
    var testString: js.UndefOr[String] = js.native
    
    /**
      * The Text Word wrap configuration object.
      */
    var wordWrap: js.UndefOr[TextWordWrap] = js.native
  }
  object TextStyle {
    
    @scala.inline
    def apply(): TextStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextStyle]
    }
    
    @scala.inline
    implicit class TextStyleMutableBuilder[Self <: TextStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBaselineX(value: Double): Self = StObject.set(x, "baselineX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineXUndefined: Self = StObject.set(x, "baselineX", js.undefined)
      
      @scala.inline
      def setBaselineY(value: Double): Self = StObject.set(x, "baselineY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineYUndefined: Self = StObject.set(x, "baselineY", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFixedHeight(value: Double): Self = StObject.set(x, "fixedHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeightUndefined: Self = StObject.set(x, "fixedHeight", js.undefined)
      
      @scala.inline
      def setFixedWidth(value: Double): Self = StObject.set(x, "fixedWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedWidthUndefined: Self = StObject.set(x, "fixedWidth", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setMaxLines(value: integer): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      @scala.inline
      def setMetrics(value: TextMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      @scala.inline
      def setPadding(value: TextPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setShadow(value: TextShadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeThickness(value: Double): Self = StObject.set(x, "strokeThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeThicknessUndefined: Self = StObject.set(x, "strokeThickness", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setTestString(value: String): Self = StObject.set(x, "testString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestStringUndefined: Self = StObject.set(x, "testString", js.undefined)
      
      @scala.inline
      def setWordWrap(value: TextWordWrap): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
    }
  }
  
  /**
    * A Text Word Wrap configuration object as used by the Text Style configuration.
    */
  @js.native
  trait TextWordWrap extends StObject {
    
    /**
      * Provide a custom callback when word wrapping is enabled.
      */
    var callback: js.UndefOr[TextStyleWordWrapCallback] = js.native
    
    /**
      * The context in which the word wrap callback is invoked.
      */
    var callbackScope: js.UndefOr[js.Any] = js.native
    
    /**
      * Use basic or advanced word wrapping?
      */
    var useAdvancedWrap: js.UndefOr[Boolean] = js.native
    
    /**
      * The width at which text should be considered for word-wrapping.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object TextWordWrap {
    
    @scala.inline
    def apply(): TextWordWrap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextWordWrap]
    }
    
    @scala.inline
    implicit class TextWordWrapMutableBuilder[Self <: TextWordWrap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (/* text */ String, /* textObject */ typings.phaser.Phaser.GameObjects.Text) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCallbackScope(value: js.Any): Self = StObject.set(x, "callbackScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackScopeUndefined: Self = StObject.set(x, "callbackScope", js.undefined)
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setUseAdvancedWrap(value: Boolean): Self = StObject.set(x, "useAdvancedWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAdvancedWrapUndefined: Self = StObject.set(x, "useAdvancedWrap", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
