package typings.pixiText

import typings.pixiText.anon.PartialITextStyle
import typings.pixiText.libConstMod.TEXT_GRADIENT
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTextStyleMod {
  
  @JSImport("@pixi/text/lib/TextStyle", "TextStyle")
  @js.native
  /**
    * @param {object} [style] - The style parameters
    * @param {string} [style.align='left'] - Alignment for multiline text ('left', 'center' or 'right'),
    *  does not affect single line text
    * @param {boolean} [style.breakWords=false] - Indicates if lines can be wrapped within words, it
    *  needs wordWrap to be set to true
    * @param {boolean} [style.dropShadow=false] - Set a drop shadow for the text
    * @param {number} [style.dropShadowAlpha=1] - Set alpha for the drop shadow
    * @param {number} [style.dropShadowAngle=Math.PI/6] - Set a angle of the drop shadow
    * @param {number} [style.dropShadowBlur=0] - Set a shadow blur radius
    * @param {string|number} [style.dropShadowColor='black'] - A fill style to be used on the dropshadow e.g 'red', '#00FF00'
    * @param {number} [style.dropShadowDistance=5] - Set a distance of the drop shadow
    * @param {string|string[]|number|number[]|CanvasGradient|CanvasPattern} [style.fill='black'] - A canvas
    *  fillstyle that will be used on the text e.g 'red', '#00FF00'. Can be an array to create a gradient
    *  eg ['#000000','#FFFFFF']
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillStyle|MDN}
    * @param {number} [style.fillGradientType=PIXI.TEXT_GRADIENT.LINEAR_VERTICAL] - If fill is an array of colours
    *  to create a gradient, this can change the type/direction of the gradient. See {@link PIXI.TEXT_GRADIENT}
    * @param {number[]} [style.fillGradientStops] - If fill is an array of colours to create a gradient, this array can set
    * the stop points (numbers between 0 and 1) for the color, overriding the default behaviour of evenly spacing them.
    * @param {string|string[]} [style.fontFamily='Arial'] - The font family
    * @param {number|string} [style.fontSize=26] - The font size (as a number it converts to px, but as a string,
    *  equivalents are '26px','20pt','160%' or '1.6em')
    * @param {string} [style.fontStyle='normal'] - The font style ('normal', 'italic' or 'oblique')
    * @param {string} [style.fontVariant='normal'] - The font variant ('normal' or 'small-caps')
    * @param {string} [style.fontWeight='normal'] - The font weight ('normal', 'bold', 'bolder', 'lighter' and '100',
    *  '200', '300', '400', '500', '600', '700', '800' or '900')
    * @param {number} [style.leading=0] - The space between lines
    * @param {number} [style.letterSpacing=0] - The amount of spacing between letters, default is 0
    * @param {number} [style.lineHeight] - The line height, a number that represents the vertical space that a letter uses
    * @param {string} [style.lineJoin='miter'] - The lineJoin property sets the type of corner created, it can resolve
    *      spiked text issues. Possible values "miter" (creates a sharp corner), "round" (creates a round corner) or "bevel"
    *      (creates a squared corner).
    * @param {number} [style.miterLimit=10] - The miter limit to use when using the 'miter' lineJoin mode. This can reduce
    *      or increase the spikiness of rendered text.
    * @param {number} [style.padding=0] - Occasionally some fonts are cropped. Adding some padding will prevent this from
    *     happening by adding padding to all sides of the text.
    * @param {string|number} [style.stroke='black'] - A canvas fillstyle that will be used on the text stroke
    *  e.g 'blue', '#FCFF00'
    * @param {number} [style.strokeThickness=0] - A number that represents the thickness of the stroke.
    *  Default is 0 (no stroke)
    * @param {boolean} [style.trim=false] - Trim transparent borders
    * @param {string} [style.textBaseline='alphabetic'] - The baseline of the text that is rendered.
    * @param {string} [style.whiteSpace='pre'] - Determines whether newlines & spaces are collapsed or preserved "normal"
    *      (collapse, collapse), "pre" (preserve, preserve) | "pre-line" (preserve, collapse). It needs wordWrap to be set to true
    * @param {boolean} [style.wordWrap=false] - Indicates if word wrap should be used
    * @param {number} [style.wordWrapWidth=100] - The width at which text will wrap, it needs wordWrap to be set to true
    */
  open class TextStyle ()
    extends StObject
       with ITextStyle {
    def this(style: PartialITextStyle) = this()
    
    /* protected */ var _align: TextStyleAlign = js.native
    
    /* protected */ var _breakWords: Boolean = js.native
    
    /* protected */ var _dropShadow: Boolean = js.native
    
    /* protected */ var _dropShadowAlpha: Double = js.native
    
    /* protected */ var _dropShadowAngle: Double = js.native
    
    /* protected */ var _dropShadowBlur: Double = js.native
    
    /* protected */ var _dropShadowColor: String | Double = js.native
    
    /* protected */ var _dropShadowDistance: Double = js.native
    
    /* protected */ var _fill: TextStyleFill = js.native
    
    /* protected */ var _fillGradientStops: js.Array[Double] = js.native
    
    /* protected */ var _fillGradientType: TEXT_GRADIENT = js.native
    
    /* protected */ var _fontFamily: String | js.Array[String] = js.native
    
    /* protected */ var _fontSize: Double | String = js.native
    
    /* protected */ var _fontStyle: TextStyleFontStyle = js.native
    
    /* protected */ var _fontVariant: TextStyleFontVariant = js.native
    
    /* protected */ var _fontWeight: TextStyleFontWeight = js.native
    
    /* protected */ var _leading: Double = js.native
    
    /* protected */ var _letterSpacing: Double = js.native
    
    /* protected */ var _lineHeight: Double = js.native
    
    /* protected */ var _lineJoin: TextStyleLineJoin = js.native
    
    /* protected */ var _miterLimit: Double = js.native
    
    /* protected */ var _padding: Double = js.native
    
    /* protected */ var _stroke: String | Double = js.native
    
    /* protected */ var _strokeThickness: Double = js.native
    
    /* protected */ var _textBaseline: TextStyleTextBaseline = js.native
    
    /* protected */ var _trim: Boolean = js.native
    
    /* protected */ var _whiteSpace: TextStyleWhiteSpace = js.native
    
    /* protected */ var _wordWrap: Boolean = js.native
    
    /* protected */ var _wordWrapWidth: Double = js.native
    
    /* CompleteClass */
    var align: TextStyleAlign = js.native
    /**
      * Alignment for multiline text ('left', 'center' or 'right'), does not affect single line text
      *
      * @member {string}
      */
    @JSName("align")
    def align_MTextStyle: TextStyleAlign = js.native
    
    /* CompleteClass */
    var breakWords: Boolean = js.native
    /** Indicates if lines can be wrapped within words, it needs wordWrap to be set to true. */
    @JSName("breakWords")
    def breakWords_MTextStyle: Boolean = js.native
    
    /* CompleteClass */
    var dropShadow: Boolean = js.native
    
    /* CompleteClass */
    var dropShadowAlpha: Double = js.native
    /** Set alpha for the drop shadow. */
    @JSName("dropShadowAlpha")
    def dropShadowAlpha_MTextStyle: Double = js.native
    
    /* CompleteClass */
    var dropShadowAngle: Double = js.native
    /** Set a angle of the drop shadow. */
    @JSName("dropShadowAngle")
    def dropShadowAngle_MTextStyle: Double = js.native
    
    /* CompleteClass */
    var dropShadowBlur: Double = js.native
    /** Set a shadow blur radius. */
    @JSName("dropShadowBlur")
    def dropShadowBlur_MTextStyle: Double = js.native
    
    /* CompleteClass */
    var dropShadowColor: String | Double = js.native
    /** A fill style to be used on the dropshadow e.g 'red', '#00FF00'. */
    @JSName("dropShadowColor")
    def dropShadowColor_MTextStyle: Double | String = js.native
    
    /* CompleteClass */
    var dropShadowDistance: Double = js.native
    /** Set a distance of the drop shadow. */
    @JSName("dropShadowDistance")
    def dropShadowDistance_MTextStyle: Double = js.native
    
    /** Set a drop shadow for the text. */
    @JSName("dropShadow")
    def dropShadow_MTextStyle: Boolean = js.native
    
    /* CompleteClass */
    var fill: TextStyleFill = js.native
    
    /* CompleteClass */
    var fillGradientStops: js.Array[Double] = js.native
    /**
      * If fill is an array of colours to create a gradient, this array can set the stop points
      * (numbers between 0 and 1) for the color, overriding the default behaviour of evenly spacing them.
      */
    @JSName("fillGradientStops")
    def fillGradientStops_MTextStyle: js.Array[Double] = js.native
    
    /* CompleteClass */
    var fillGradientType: TEXT_GRADIENT = js.native
    /**
      * If fill is an array of colours to create a gradient, this can change the type/direction of the gradient.
      *
      * @see PIXI.TEXT_GRADIENT
      */
    @JSName("fillGradientType")
    def fillGradientType_MTextStyle: TEXT_GRADIENT = js.native
    
    /**
      * A canvas fillstyle that will be used on the text e.g 'red', '#00FF00'.
      *
      * Can be an array to create a gradient eg ['#000000','#FFFFFF']
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillStyle|MDN}
      *
      * @member {string|string[]|number|number[]|CanvasGradient|CanvasPattern}
      */
    @JSName("fill")
    def fill_MTextStyle: TextStyleFill = js.native
    
    /* CompleteClass */
    var fontFamily: String | js.Array[String] = js.native
    /** The font family. */
    @JSName("fontFamily")
    def fontFamily_MTextStyle: String | js.Array[String] = js.native
    
    /* CompleteClass */
    var fontSize: Double | String = js.native
    /**
      * The font size
      * (as a number it converts to px, but as a string, equivalents are '26px','20pt','160%' or '1.6em')
      */
    @JSName("fontSize")
    def fontSize_MTextStyle: Double | String = js.native
    
    /* CompleteClass */
    var fontStyle: TextStyleFontStyle = js.native
    /**
      * The font style
      * ('normal', 'italic' or 'oblique')
      *
      * @member {string}
      */
    @JSName("fontStyle")
    def fontStyle_MTextStyle: TextStyleFontStyle = js.native
    
    /* CompleteClass */
    var fontVariant: TextStyleFontVariant = js.native
    /**
      * The font variant
      * ('normal' or 'small-caps')
      *
      * @member {string}
      */
    @JSName("fontVariant")
    def fontVariant_MTextStyle: TextStyleFontVariant = js.native
    
    /* CompleteClass */
    var fontWeight: TextStyleFontWeight = js.native
    /**
      * The font weight
      * ('normal', 'bold', 'bolder', 'lighter' and '100', '200', '300', '400', '500', '600', '700', 800' or '900')
      *
      * @member {string}
      */
    @JSName("fontWeight")
    def fontWeight_MTextStyle: TextStyleFontWeight = js.native
    
    /* CompleteClass */
    var leading: Double = js.native
    /** The space between lines. */
    @JSName("leading")
    def leading_MTextStyle: Double = js.native
    
    /* CompleteClass */
    var letterSpacing: Double = js.native
    /** The amount of spacing between letters, default is 0. */
    @JSName("letterSpacing")
    def letterSpacing_MTextStyle: Double = js.native
    
    /* CompleteClass */
    var lineHeight: Double = js.native
    /** The line height, a number that represents the vertical space that a letter uses. */
    @JSName("lineHeight")
    def lineHeight_MTextStyle: Double = js.native
    
    /* CompleteClass */
    var lineJoin: TextStyleLineJoin = js.native
    /**
      * The lineJoin property sets the type of corner created, it can resolve spiked text issues.
      * Default is 'miter' (creates a sharp corner).
      *
      * @member {string}
      */
    @JSName("lineJoin")
    def lineJoin_MTextStyle: TextStyleLineJoin = js.native
    
    /* CompleteClass */
    var miterLimit: Double = js.native
    /**
      * The miter limit to use when using the 'miter' lineJoin mode.
      *
      * This can reduce or increase the spikiness of rendered text.
      */
    @JSName("miterLimit")
    def miterLimit_MTextStyle: Double = js.native
    
    /* CompleteClass */
    var padding: Double = js.native
    /**
      * Occasionally some fonts are cropped. Adding some padding will prevent this from happening
      * by adding padding to all sides of the text.
      */
    @JSName("padding")
    def padding_MTextStyle: Double = js.native
    
    /** Resets all properties to the defaults specified in TextStyle.prototype._default */
    def reset(): Unit = js.native
    
    /* CompleteClass */
    var stroke: String | Double = js.native
    
    /* CompleteClass */
    var strokeThickness: Double = js.native
    /**
      * A number that represents the thickness of the stroke.
      *
      * @default 0
      */
    @JSName("strokeThickness")
    def strokeThickness_MTextStyle: Double = js.native
    
    /**
      * A canvas fillstyle that will be used on the text stroke
      * e.g 'blue', '#FCFF00'
      */
    @JSName("stroke")
    def stroke_MTextStyle: String | Double = js.native
    
    var styleID: Double = js.native
    
    /* CompleteClass */
    var textBaseline: TextStyleTextBaseline = js.native
    /**
      * The baseline of the text that is rendered.
      *
      * @member {string}
      */
    @JSName("textBaseline")
    def textBaseline_MTextStyle: TextStyleTextBaseline = js.native
    
    /**
      * Generates a font style string to use for `TextMetrics.measureFont()`.
      *
      * @return Font style string, for passing to `TextMetrics.measureFont()`
      */
    def toFontString(): String = js.native
    
    /* CompleteClass */
    var trim: Boolean = js.native
    /** Trim transparent borders. */
    @JSName("trim")
    def trim_MTextStyle: Boolean = js.native
    
    /* CompleteClass */
    var whiteSpace: TextStyleWhiteSpace = js.native
    /**
      * How newlines and spaces should be handled.
      * Default is 'pre' (preserve, preserve).
      *
      *  value       | New lines     |   Spaces
      *  ---         | ---           |   ---
      * 'normal'     | Collapse      |   Collapse
      * 'pre'        | Preserve      |   Preserve
      * 'pre-line'   | Preserve      |   Collapse
      *
      * @member {string}
      */
    @JSName("whiteSpace")
    def whiteSpace_MTextStyle: TextStyleWhiteSpace = js.native
    
    /* CompleteClass */
    var wordWrap: Boolean = js.native
    
    /* CompleteClass */
    var wordWrapWidth: Double = js.native
    /** The width at which text will wrap, it needs wordWrap to be set to true. */
    @JSName("wordWrapWidth")
    def wordWrapWidth_MTextStyle: Double = js.native
    
    /** Indicates if word wrap should be used. */
    @JSName("wordWrap")
    def wordWrap_MTextStyle: Boolean = js.native
  }
  
  trait ITextStyle extends StObject {
    
    var align: TextStyleAlign
    
    var breakWords: Boolean
    
    var dropShadow: Boolean
    
    var dropShadowAlpha: Double
    
    var dropShadowAngle: Double
    
    var dropShadowBlur: Double
    
    var dropShadowColor: String | Double
    
    var dropShadowDistance: Double
    
    var fill: TextStyleFill
    
    var fillGradientStops: js.Array[Double]
    
    var fillGradientType: TEXT_GRADIENT
    
    var fontFamily: String | js.Array[String]
    
    var fontSize: Double | String
    
    var fontStyle: TextStyleFontStyle
    
    var fontVariant: TextStyleFontVariant
    
    var fontWeight: TextStyleFontWeight
    
    var leading: Double
    
    var letterSpacing: Double
    
    var lineHeight: Double
    
    var lineJoin: TextStyleLineJoin
    
    var miterLimit: Double
    
    var padding: Double
    
    var stroke: String | Double
    
    var strokeThickness: Double
    
    var textBaseline: TextStyleTextBaseline
    
    var trim: Boolean
    
    var whiteSpace: TextStyleWhiteSpace
    
    var wordWrap: Boolean
    
    var wordWrapWidth: Double
  }
  object ITextStyle {
    
    inline def apply(
      align: TextStyleAlign,
      breakWords: Boolean,
      dropShadow: Boolean,
      dropShadowAlpha: Double,
      dropShadowAngle: Double,
      dropShadowBlur: Double,
      dropShadowColor: String | Double,
      dropShadowDistance: Double,
      fill: TextStyleFill,
      fillGradientStops: js.Array[Double],
      fillGradientType: TEXT_GRADIENT,
      fontFamily: String | js.Array[String],
      fontSize: Double | String,
      fontStyle: TextStyleFontStyle,
      fontVariant: TextStyleFontVariant,
      fontWeight: TextStyleFontWeight,
      leading: Double,
      letterSpacing: Double,
      lineHeight: Double,
      lineJoin: TextStyleLineJoin,
      miterLimit: Double,
      padding: Double,
      stroke: String | Double,
      strokeThickness: Double,
      textBaseline: TextStyleTextBaseline,
      trim: Boolean,
      whiteSpace: TextStyleWhiteSpace,
      wordWrap: Boolean,
      wordWrapWidth: Double
    ): ITextStyle = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], breakWords = breakWords.asInstanceOf[js.Any], dropShadow = dropShadow.asInstanceOf[js.Any], dropShadowAlpha = dropShadowAlpha.asInstanceOf[js.Any], dropShadowAngle = dropShadowAngle.asInstanceOf[js.Any], dropShadowBlur = dropShadowBlur.asInstanceOf[js.Any], dropShadowColor = dropShadowColor.asInstanceOf[js.Any], dropShadowDistance = dropShadowDistance.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], fillGradientStops = fillGradientStops.asInstanceOf[js.Any], fillGradientType = fillGradientType.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontVariant = fontVariant.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], strokeThickness = strokeThickness.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any], trim = trim.asInstanceOf[js.Any], whiteSpace = whiteSpace.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any], wordWrapWidth = wordWrapWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextStyle]
    }
    
    extension [Self <: ITextStyle](x: Self) {
      
      inline def setAlign(value: TextStyleAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setBreakWords(value: Boolean): Self = StObject.set(x, "breakWords", value.asInstanceOf[js.Any])
      
      inline def setDropShadow(value: Boolean): Self = StObject.set(x, "dropShadow", value.asInstanceOf[js.Any])
      
      inline def setDropShadowAlpha(value: Double): Self = StObject.set(x, "dropShadowAlpha", value.asInstanceOf[js.Any])
      
      inline def setDropShadowAngle(value: Double): Self = StObject.set(x, "dropShadowAngle", value.asInstanceOf[js.Any])
      
      inline def setDropShadowBlur(value: Double): Self = StObject.set(x, "dropShadowBlur", value.asInstanceOf[js.Any])
      
      inline def setDropShadowColor(value: String | Double): Self = StObject.set(x, "dropShadowColor", value.asInstanceOf[js.Any])
      
      inline def setDropShadowDistance(value: Double): Self = StObject.set(x, "dropShadowDistance", value.asInstanceOf[js.Any])
      
      inline def setFill(value: TextStyleFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillGradientStops(value: js.Array[Double]): Self = StObject.set(x, "fillGradientStops", value.asInstanceOf[js.Any])
      
      inline def setFillGradientStopsVarargs(value: Double*): Self = StObject.set(x, "fillGradientStops", js.Array(value*))
      
      inline def setFillGradientType(value: TEXT_GRADIENT): Self = StObject.set(x, "fillGradientType", value.asInstanceOf[js.Any])
      
      inline def setFillVarargs(value: (Double | String)*): Self = StObject.set(x, "fill", js.Array(value*))
      
      inline def setFontFamily(value: String | js.Array[String]): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyVarargs(value: String*): Self = StObject.set(x, "fontFamily", js.Array(value*))
      
      inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontStyle(value: TextStyleFontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontVariant(value: TextStyleFontVariant): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontWeight(value: TextStyleFontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineJoin(value: TextStyleLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setStroke(value: String | Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeThickness(value: Double): Self = StObject.set(x, "strokeThickness", value.asInstanceOf[js.Any])
      
      inline def setTextBaseline(value: TextStyleTextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setWhiteSpace(value: TextStyleWhiteSpace): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
      
      inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapWidth(value: Double): Self = StObject.set(x, "wordWrapWidth", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiText.pixiTextStrings.left
    - typings.pixiText.pixiTextStrings.center
    - typings.pixiText.pixiTextStrings.right
    - typings.pixiText.pixiTextStrings.justify
  */
  trait TextStyleAlign extends StObject
  object TextStyleAlign {
    
    inline def center: typings.pixiText.pixiTextStrings.center = "center".asInstanceOf[typings.pixiText.pixiTextStrings.center]
    
    inline def justify: typings.pixiText.pixiTextStrings.justify = "justify".asInstanceOf[typings.pixiText.pixiTextStrings.justify]
    
    inline def left: typings.pixiText.pixiTextStrings.left = "left".asInstanceOf[typings.pixiText.pixiTextStrings.left]
    
    inline def right: typings.pixiText.pixiTextStrings.right = "right".asInstanceOf[typings.pixiText.pixiTextStrings.right]
  }
  
  type TextStyleFill = String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiText.pixiTextStrings.normal
    - typings.pixiText.pixiTextStrings.italic
    - typings.pixiText.pixiTextStrings.oblique
  */
  trait TextStyleFontStyle extends StObject
  object TextStyleFontStyle {
    
    inline def italic: typings.pixiText.pixiTextStrings.italic = "italic".asInstanceOf[typings.pixiText.pixiTextStrings.italic]
    
    inline def normal: typings.pixiText.pixiTextStrings.normal = "normal".asInstanceOf[typings.pixiText.pixiTextStrings.normal]
    
    inline def oblique: typings.pixiText.pixiTextStrings.oblique = "oblique".asInstanceOf[typings.pixiText.pixiTextStrings.oblique]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiText.pixiTextStrings.normal
    - typings.pixiText.pixiTextStrings.`small-caps`
  */
  trait TextStyleFontVariant extends StObject
  object TextStyleFontVariant {
    
    inline def normal: typings.pixiText.pixiTextStrings.normal = "normal".asInstanceOf[typings.pixiText.pixiTextStrings.normal]
    
    inline def `small-caps`: typings.pixiText.pixiTextStrings.`small-caps` = "small-caps".asInstanceOf[typings.pixiText.pixiTextStrings.`small-caps`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiText.pixiTextStrings.normal
    - typings.pixiText.pixiTextStrings.bold
    - typings.pixiText.pixiTextStrings.bolder
    - typings.pixiText.pixiTextStrings.lighter
    - typings.pixiText.pixiTextStrings.`100`
    - typings.pixiText.pixiTextStrings.`200`
    - typings.pixiText.pixiTextStrings.`300`
    - typings.pixiText.pixiTextStrings.`400`
    - typings.pixiText.pixiTextStrings.`500`
    - typings.pixiText.pixiTextStrings.`600`
    - typings.pixiText.pixiTextStrings.`700`
    - typings.pixiText.pixiTextStrings.`800`
    - typings.pixiText.pixiTextStrings.`900`
  */
  trait TextStyleFontWeight extends StObject
  object TextStyleFontWeight {
    
    inline def `100`: typings.pixiText.pixiTextStrings.`100` = "100".asInstanceOf[typings.pixiText.pixiTextStrings.`100`]
    
    inline def `200`: typings.pixiText.pixiTextStrings.`200` = "200".asInstanceOf[typings.pixiText.pixiTextStrings.`200`]
    
    inline def `300`: typings.pixiText.pixiTextStrings.`300` = "300".asInstanceOf[typings.pixiText.pixiTextStrings.`300`]
    
    inline def `400`: typings.pixiText.pixiTextStrings.`400` = "400".asInstanceOf[typings.pixiText.pixiTextStrings.`400`]
    
    inline def `500`: typings.pixiText.pixiTextStrings.`500` = "500".asInstanceOf[typings.pixiText.pixiTextStrings.`500`]
    
    inline def `600`: typings.pixiText.pixiTextStrings.`600` = "600".asInstanceOf[typings.pixiText.pixiTextStrings.`600`]
    
    inline def `700`: typings.pixiText.pixiTextStrings.`700` = "700".asInstanceOf[typings.pixiText.pixiTextStrings.`700`]
    
    inline def `800`: typings.pixiText.pixiTextStrings.`800` = "800".asInstanceOf[typings.pixiText.pixiTextStrings.`800`]
    
    inline def `900`: typings.pixiText.pixiTextStrings.`900` = "900".asInstanceOf[typings.pixiText.pixiTextStrings.`900`]
    
    inline def bold: typings.pixiText.pixiTextStrings.bold = "bold".asInstanceOf[typings.pixiText.pixiTextStrings.bold]
    
    inline def bolder: typings.pixiText.pixiTextStrings.bolder = "bolder".asInstanceOf[typings.pixiText.pixiTextStrings.bolder]
    
    inline def lighter: typings.pixiText.pixiTextStrings.lighter = "lighter".asInstanceOf[typings.pixiText.pixiTextStrings.lighter]
    
    inline def normal: typings.pixiText.pixiTextStrings.normal = "normal".asInstanceOf[typings.pixiText.pixiTextStrings.normal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiText.pixiTextStrings.miter
    - typings.pixiText.pixiTextStrings.round
    - typings.pixiText.pixiTextStrings.bevel
  */
  trait TextStyleLineJoin extends StObject
  object TextStyleLineJoin {
    
    inline def bevel: typings.pixiText.pixiTextStrings.bevel = "bevel".asInstanceOf[typings.pixiText.pixiTextStrings.bevel]
    
    inline def miter: typings.pixiText.pixiTextStrings.miter = "miter".asInstanceOf[typings.pixiText.pixiTextStrings.miter]
    
    inline def round: typings.pixiText.pixiTextStrings.round = "round".asInstanceOf[typings.pixiText.pixiTextStrings.round]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiText.pixiTextStrings.alphabetic
    - typings.pixiText.pixiTextStrings.top
    - typings.pixiText.pixiTextStrings.hanging
    - typings.pixiText.pixiTextStrings.middle
    - typings.pixiText.pixiTextStrings.ideographic
    - typings.pixiText.pixiTextStrings.bottom
  */
  trait TextStyleTextBaseline extends StObject
  object TextStyleTextBaseline {
    
    inline def alphabetic: typings.pixiText.pixiTextStrings.alphabetic = "alphabetic".asInstanceOf[typings.pixiText.pixiTextStrings.alphabetic]
    
    inline def bottom: typings.pixiText.pixiTextStrings.bottom = "bottom".asInstanceOf[typings.pixiText.pixiTextStrings.bottom]
    
    inline def hanging: typings.pixiText.pixiTextStrings.hanging = "hanging".asInstanceOf[typings.pixiText.pixiTextStrings.hanging]
    
    inline def ideographic: typings.pixiText.pixiTextStrings.ideographic = "ideographic".asInstanceOf[typings.pixiText.pixiTextStrings.ideographic]
    
    inline def middle: typings.pixiText.pixiTextStrings.middle = "middle".asInstanceOf[typings.pixiText.pixiTextStrings.middle]
    
    inline def top: typings.pixiText.pixiTextStrings.top = "top".asInstanceOf[typings.pixiText.pixiTextStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiText.pixiTextStrings.normal
    - typings.pixiText.pixiTextStrings.pre
    - typings.pixiText.pixiTextStrings.`pre-line`
  */
  trait TextStyleWhiteSpace extends StObject
  object TextStyleWhiteSpace {
    
    inline def normal: typings.pixiText.pixiTextStrings.normal = "normal".asInstanceOf[typings.pixiText.pixiTextStrings.normal]
    
    inline def pre: typings.pixiText.pixiTextStrings.pre = "pre".asInstanceOf[typings.pixiText.pixiTextStrings.pre]
    
    inline def `pre-line`: typings.pixiText.pixiTextStrings.`pre-line` = "pre-line".asInstanceOf[typings.pixiText.pixiTextStrings.`pre-line`]
  }
}
