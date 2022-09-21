package typings.pixiText

import typings.offscreencanvas.OffscreenCanvas
import typings.pixiSprite.mod.Sprite
import typings.pixiText.anon.PartialITextStyle
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait TEXT_GRADIENT extends StObject
  @JSImport("@pixi/text", "TEXT_GRADIENT")
  @js.native
  object TEXT_GRADIENT extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TEXT_GRADIENT & Double] = js.native
    
    @js.native
    sealed trait LINEAR_HORIZONTAL
      extends StObject
         with TEXT_GRADIENT
    /* 1 */ val LINEAR_HORIZONTAL: typings.pixiText.mod.TEXT_GRADIENT.LINEAR_HORIZONTAL & Double = js.native
    
    @js.native
    sealed trait LINEAR_VERTICAL
      extends StObject
         with TEXT_GRADIENT
    /* 0 */ val LINEAR_VERTICAL: typings.pixiText.mod.TEXT_GRADIENT.LINEAR_VERTICAL & Double = js.native
  }
  
  /**
    * A Text Object will create a line or multiple lines of text.
    *
    * The text is created using the [Canvas API](https://developer.mozilla.org/en-US/docs/Web/API/Canvas_API).
    *
    * The primary advantage of this class over BitmapText is that you have great control over the style of the text,
    * which you can change at runtime.
    *
    * The primary disadvantages is that each piece of text has it's own texture, which can use more memory.
    * When text changes, this texture has to be re-generated and re-uploaded to the GPU, taking up time.
    *
    * To split a line you can use '\n' in your text string, or, on the `style` object,
    * change its `wordWrap` property to true and and give the `wordWrapWidth` property a value.
    *
    * A Text can be created directly from a string and a style object,
    * which can be generated [here](https://pixijs.io/pixi-text-style).
    *
    * ```js
    * let text = new PIXI.Text('This is a PixiJS text',{fontFamily : 'Arial', fontSize: 24, fill : 0xff1010, align : 'center'});
    * ```
    * @memberof PIXI
    */
  @JSImport("@pixi/text", "Text")
  @js.native
  /**
    * @param text - The string that you would like the text to display
    * @param {object|PIXI.TextStyle} [style] - The style parameters
    * @param canvas - The canvas element for drawing text
    */
  open class Text () extends Text2 {
    def this(text: String) = this()
    def this(text: Double) = this()
    def this(text: String, style: PartialITextStyle) = this()
    def this(text: String, style: TextStyle) = this()
    def this(text: Double, style: PartialITextStyle) = this()
    def this(text: Double, style: TextStyle) = this()
    def this(text: Unit, style: PartialITextStyle) = this()
    def this(text: Unit, style: TextStyle) = this()
    def this(text: String, style: Unit, canvas: HTMLCanvasElement) = this()
    def this(text: String, style: PartialITextStyle, canvas: HTMLCanvasElement) = this()
    def this(text: String, style: TextStyle, canvas: HTMLCanvasElement) = this()
    def this(text: Double, style: Unit, canvas: HTMLCanvasElement) = this()
    def this(text: Double, style: PartialITextStyle, canvas: HTMLCanvasElement) = this()
    def this(text: Double, style: TextStyle, canvas: HTMLCanvasElement) = this()
    def this(text: Unit, style: Unit, canvas: HTMLCanvasElement) = this()
    def this(text: Unit, style: PartialITextStyle, canvas: HTMLCanvasElement) = this()
    def this(text: Unit, style: TextStyle, canvas: HTMLCanvasElement) = this()
  }
  object Text {
    
    @JSImport("@pixi/text", "Text")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * New rendering behavior for letter-spacing which uses Chrome's new native API. This will
      * lead to more accurate letter-spacing results because it does not try to manually draw
      * each character. However, this Chrome API is experimental and may not serve all cases yet.
      */
    /* static member */
    @JSImport("@pixi/text", "Text.experimentalLetterSpacing")
    @js.native
    def experimentalLetterSpacing: Boolean = js.native
    inline def experimentalLetterSpacing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("experimentalLetterSpacing")(x.asInstanceOf[js.Any])
    
    /**
      * New behavior for `lineHeight` that's meant to mimic HTML text. A value of `true` will
      * make sure the first baseline is offset by the `lineHeight` value if it is greater than `fontSize`.
      * A value of `false` will use the legacy behavior and not change the baseline of the first line.
      * In the next major release, we'll enable this by default.
      */
    /* static member */
    @JSImport("@pixi/text", "Text.nextLineHeightBehavior")
    @js.native
    def nextLineHeightBehavior: Boolean = js.native
    inline def nextLineHeightBehavior_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextLineHeightBehavior")(x.asInstanceOf[js.Any])
  }
  
  /**
    * The TextMetrics object represents the measurement of a block of text with a specified style.
    *
    * ```js
    * let style = new PIXI.TextStyle({fontFamily : 'Arial', fontSize: 24, fill : 0xff1010, align : 'center'})
    * let textMetrics = PIXI.TextMetrics.measureText('Your text', style)
    * ```
    * @memberof PIXI
    */
  @JSImport("@pixi/text", "TextMetrics")
  @js.native
  open class TextMetrics protected ()
    extends StObject
       with TextMetrics2 {
    /**
      * @param text - the text that was measured
      * @param style - the style that was measured
      * @param width - the measured width of the text
      * @param height - the measured height of the text
      * @param lines - an array of the lines of text broken by new lines and wrapping if specified in style
      * @param lineWidths - an array of the line widths for each line matched to `lines`
      * @param lineHeight - the measured line height for this style
      * @param maxLineWidth - the maximum line width for all measured lines
      * @param {PIXI.IFontMetrics} fontProperties - the font properties object from TextMetrics.measureFont
      */
    def this(
      text: String,
      style: TextStyle,
      width: Double,
      height: Double,
      lines: js.Array[String],
      lineWidths: js.Array[Double],
      lineHeight: Double,
      maxLineWidth: Double,
      fontProperties: IFontMetrics
    ) = this()
    
    /**
      * The font properties object from TextMetrics.measureFont.
      * @type {PIXI.IFontMetrics}
      */
    /* CompleteClass */
    var fontProperties: IFontMetrics = js.native
    
    /** The measured height of the text. */
    /* CompleteClass */
    var height: Double = js.native
    
    /** The measured line height for this style. */
    /* CompleteClass */
    var lineHeight: Double = js.native
    
    /** An array of the line widths for each line matched to `lines`. */
    /* CompleteClass */
    var lineWidths: js.Array[Double] = js.native
    
    /** An array of lines of the text broken by new lines and wrapping is specified in style. */
    /* CompleteClass */
    var lines: js.Array[String] = js.native
    
    /** The maximum line width for all measured lines. */
    /* CompleteClass */
    var maxLineWidth: Double = js.native
    
    /** The style that was measured. */
    /* CompleteClass */
    var style: TextStyle = js.native
    
    /** The text that was measured. */
    /* CompleteClass */
    var text: String = js.native
    
    /** The measured width of the text. */
    /* CompleteClass */
    var width: Double = js.native
  }
  object TextMetrics {
    
    @JSImport("@pixi/text", "TextMetrics")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@pixi/text", "TextMetrics.BASELINE_MULTIPLIER")
    @js.native
    def BASELINE_MULTIPLIER: Double = js.native
    inline def BASELINE_MULTIPLIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASELINE_MULTIPLIER")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@pixi/text", "TextMetrics.BASELINE_SYMBOL")
    @js.native
    def BASELINE_SYMBOL: String = js.native
    inline def BASELINE_SYMBOL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASELINE_SYMBOL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@pixi/text", "TextMetrics.HEIGHT_MULTIPLIER")
    @js.native
    def HEIGHT_MULTIPLIER: Double = js.native
    inline def HEIGHT_MULTIPLIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEIGHT_MULTIPLIER")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@pixi/text", "TextMetrics.METRICS_STRING")
    @js.native
    def METRICS_STRING: String = js.native
    inline def METRICS_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METRICS_STRING")(x.asInstanceOf[js.Any])
    
    /**
      * Convienience function for logging each line added during the wordWrap method.
      * @param line    - The line of text to add
      * @param newLine - Add new line character to end
      * @returns A formatted line
      */
    /* static member */
    @JSImport("@pixi/text", "TextMetrics.addLine")
    @js.native
    def addLine: Any = js.native
    inline def addLine_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addLine")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@pixi/text", "TextMetrics._breakingSpaces")
    @js.native
    def breakingSpaces: js.Array[Double] = js.native
    
    inline def breakingSpaces_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_breakingSpaces")(x.asInstanceOf[js.Any])
    
    /**
      * Overridable helper method used internally by TextMetrics, exposed to allow customizing the class's behavior.
      *
      * It allows one to determine whether a pair of characters
      * should be broken by newlines
      * For example certain characters in CJK langs or numbers.
      * It must return a boolean.
      * @param _char - The character
      * @param _nextChar - The next character
      * @param _token - The token/word the characters are from
      * @param _index - The index in the token of the char
      * @param _breakWords - The style attr break words
      * @returns whether to break word or not
      */
    /* static member */
    inline def canBreakChars(_char: String, _nextChar: String, _token: String, _index: Double, _breakWords: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canBreakChars")(_char.asInstanceOf[js.Any], _nextChar.asInstanceOf[js.Any], _token.asInstanceOf[js.Any], _index.asInstanceOf[js.Any], _breakWords.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Overridable helper method used internally by TextMetrics, exposed to allow customizing the class's behavior.
      *
      * It allows one to customise which words should break
      * Examples are if the token is CJK or numbers.
      * It must return a boolean.
      * @param _token - The token
      * @param  breakWords - The style attr break words
      * @returns Whether to break word or not
      */
    /* static member */
    inline def canBreakWords(_token: String, breakWords: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canBreakWords")(_token.asInstanceOf[js.Any], breakWords.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    @JSImport("@pixi/text", "TextMetrics.__canvas")
    @js.native
    def canvas: Any = js.native
    
    inline def canvas_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__canvas")(x.asInstanceOf[js.Any])
    
    /**
      * Clear font metrics in metrics cache.
      * @param {string} [font] - font name. If font name not set then clear cache for all fonts.
      */
    /* static member */
    inline def clearMetrics(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearMetrics")().asInstanceOf[Unit]
    inline def clearMetrics(font: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearMetrics")(font.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Determines whether we should collapse newLine chars.
      * @param whiteSpace - The white space
      * @returns  should collapse
      */
    /* static member */
    @JSImport("@pixi/text", "TextMetrics.collapseNewlines")
    @js.native
    def collapseNewlines: Any = js.native
    inline def collapseNewlines_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapseNewlines")(x.asInstanceOf[js.Any])
    
    /**
      * Determines whether we should collapse breaking spaces.
      * @param whiteSpace - The TextStyle property whiteSpace
      * @returns Should collapse
      */
    /* static member */
    @JSImport("@pixi/text", "TextMetrics.collapseSpaces")
    @js.native
    def collapseSpaces: Any = js.native
    inline def collapseSpaces_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapseSpaces")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@pixi/text", "TextMetrics.__context")
    @js.native
    def context: Any = js.native
    
    inline def context_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__context")(x.asInstanceOf[js.Any])
    
    /**
      * Gets & sets the widths of calculated characters in a cache object
      * @param key            - The key
      * @param letterSpacing  - The letter spacing
      * @param cache          - The cache
      * @param context        - The canvas context
      * @returns The from cache.
      */
    /* static member */
    @JSImport("@pixi/text", "TextMetrics.getFromCache")
    @js.native
    def getFromCache: Any = js.native
    inline def getFromCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFromCache")(x.asInstanceOf[js.Any])
    
    /**
      * Determines if char is a breaking whitespace.
      *
      * It allows one to determine whether char should be a breaking whitespace
      * For example certain characters in CJK langs or numbers.
      * It must return a boolean.
      * @param char - The character
      * @param [_nextChar] - The next character
      * @returns True if whitespace, False otherwise.
      */
    /* static member */
    inline def isBreakingSpace(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBreakingSpace")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isBreakingSpace(char: String, _nextChar: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBreakingSpace")(char.asInstanceOf[js.Any], _nextChar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines if char is a newline.
      * @param  char - The character
      * @returns True if newline, False otherwise.
      */
    /* static member */
    @JSImport("@pixi/text", "TextMetrics.isNewline")
    @js.native
    def isNewline: Any = js.native
    inline def isNewline_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isNewline")(x.asInstanceOf[js.Any])
    
    /**
      * Calculates the ascent, descent and fontSize of a given font-style
      * @param font - String representing the style of the font
      * @returns Font properties object
      */
    /* static member */
    inline def measureFont(font: String): IFontMetrics = ^.asInstanceOf[js.Dynamic].applyDynamic("measureFont")(font.asInstanceOf[js.Any]).asInstanceOf[IFontMetrics]
    
    /**
      * Measures the supplied string of text and returns a Rectangle.
      * @param text - The text to measure.
      * @param style - The text style to use for measuring
      * @param wordWrap - Override for if word-wrap should be applied to the text.
      * @param canvas - optional specification of the canvas to use for measuring.
      * @returns Measured width and height of the text.
      */
    /* static member */
    inline def measureText(text: String, style: TextStyle): TextMetrics2 = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[TextMetrics2]
    inline def measureText(text: String, style: TextStyle, wordWrap: Boolean): TextMetrics2 = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], wordWrap.asInstanceOf[js.Any])).asInstanceOf[TextMetrics2]
    inline def measureText(text: String, style: TextStyle, wordWrap: Boolean, canvas: OffscreenCanvas): TextMetrics2 = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], wordWrap.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[TextMetrics2]
    inline def measureText(text: String, style: TextStyle, wordWrap: Boolean, canvas: HTMLCanvasElement): TextMetrics2 = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], wordWrap.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[TextMetrics2]
    inline def measureText(text: String, style: TextStyle, wordWrap: Unit, canvas: OffscreenCanvas): TextMetrics2 = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], wordWrap.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[TextMetrics2]
    inline def measureText(text: String, style: TextStyle, wordWrap: Unit, canvas: HTMLCanvasElement): TextMetrics2 = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], wordWrap.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[TextMetrics2]
    
    /* static member */
    @JSImport("@pixi/text", "TextMetrics._newlines")
    @js.native
    def newlines: js.Array[Double] = js.native
    
    inline def newlines_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_newlines")(x.asInstanceOf[js.Any])
    
    /**
      * Splits a string into words, breaking-spaces and newLine characters
      * @param  text - The text
      * @returns  A tokenized array
      */
    /* static member */
    @JSImport("@pixi/text", "TextMetrics.tokenize")
    @js.native
    def tokenize: Any = js.native
    inline def tokenize_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenize")(x.asInstanceOf[js.Any])
    
    /**
      * Trims breaking whitespaces from string.
      * @param  text - The text
      * @returns Trimmed string
      */
    /* static member */
    @JSImport("@pixi/text", "TextMetrics.trimRight")
    @js.native
    def trimRight: Any = js.native
    inline def trimRight_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trimRight")(x.asInstanceOf[js.Any])
    
    /**
      * Applies newlines to a string to have it optimally fit into the horizontal
      * bounds set by the Text object's wordWrapWidth property.
      * @param text - String to apply word wrapping to
      * @param style - the style to use when wrapping
      * @param canvas - optional specification of the canvas to use for measuring.
      * @returns New string with new lines applied where required
      */
    /* static member */
    @JSImport("@pixi/text", "TextMetrics.wordWrap")
    @js.native
    def wordWrap: Any = js.native
    
    /**
      * Overridable helper method used internally by TextMetrics, exposed to allow customizing the class's behavior.
      *
      * It is called when a token (usually a word) has to be split into separate pieces
      * in order to determine the point to break a word.
      * It must return an array of characters.
      * @example
      * // Correctly splits emojis, eg "🤪🤪" will result in two element array, each with one emoji.
      * TextMetrics.wordWrapSplit = (token) => [...token];
      * @param  token - The token to split
      * @returns The characters of the token
      */
    /* static member */
    inline def wordWrapSplit(token: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("wordWrapSplit")(token.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def wordWrap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@pixi/text", "TextStyle")
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
  
  trait IFontMetrics extends StObject {
    
    var ascent: Double
    
    var descent: Double
    
    var fontSize: Double
  }
  object IFontMetrics {
    
    inline def apply(ascent: Double, descent: Double, fontSize: Double): IFontMetrics = {
      val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFontMetrics]
    }
    
    extension [Self <: IFontMetrics](x: Self) {
      
      inline def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      inline def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    }
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
  
  @js.native
  trait ModernContext2D
    extends StObject
       with CanvasRenderingContext2D {
    
    var letterSpacing: js.UndefOr[Double] = js.native
    
    var textLetterSpacing: js.UndefOr[Double] = js.native
  }
  
  /**
    * A Text Object will create a line or multiple lines of text.
    *
    * The text is created using the [Canvas API](https://developer.mozilla.org/en-US/docs/Web/API/Canvas_API).
    *
    * The primary advantage of this class over BitmapText is that you have great control over the style of the text,
    * which you can change at runtime.
    *
    * The primary disadvantages is that each piece of text has it's own texture, which can use more memory.
    * When text changes, this texture has to be re-generated and re-uploaded to the GPU, taking up time.
    *
    * To split a line you can use '\n' in your text string, or, on the `style` object,
    * change its `wordWrap` property to true and and give the `wordWrapWidth` property a value.
    *
    * A Text can be created directly from a string and a style object,
    * which can be generated [here](https://pixijs.io/pixi-text-style).
    *
    * ```js
    * let text = new PIXI.Text('This is a PixiJS text',{fontFamily : 'Arial', fontSize: 24, fill : 0xff1010, align : 'center'});
    * ```
    * @memberof PIXI
    */
  @js.native
  trait Text2 extends Sprite {
    
    var _autoResolution: Boolean = js.native
    
    /**
      * Private tracker for the current font.
      * @private
      */
    /* protected */ var _font: String = js.native
    
    /**
      * Generates the fill style. Can automatically generate a gradient based on the fill style being an array
      * @param style - The style.
      * @param lines - The lines of text.
      * @param metrics
      * @returns The fill style
      */
    /* private */ var _generateFillStyle: Any = js.native
    
    /**
      * Keep track if this Text object created it's own canvas
      * element (`true`) or uses the constructor argument (`false`).
      * Used to workaround a GC issues with Safari < 13 when
      * destroying Text. See `destroy` for more info.
      */
    /* private */ var _ownCanvas: Any = js.native
    
    /**
      * The resolution / device pixel ratio of the canvas.
      *
      * This is set to automatically match the renderer resolution by default, but can be overridden by setting manually.
      * @default PIXI.settings.RESOLUTION
      */
    var _resolution: Double = js.native
    
    /**
      * Private tracker for the current style.
      * @private
      */
    /* protected */ var _style: TextStyle = js.native
    
    /**
      * Private listener to track style changes.
      * @private
      */
    /* protected */ def _styleListener(): Unit = js.native
    
    /**
      * Private tracker for the current text.
      * @private
      */
    /* protected */ var _text: String = js.native
    
    /** The canvas element that everything is drawn to. */
    var canvas: HTMLCanvasElement = js.native
    
    /** The canvas 2d context that everything is drawn with. */
    var context: ModernContext2D = js.native
    
    var dirty: Boolean = js.native
    
    /**
      * Render the text with letter-spacing.
      * @param text - The text to draw
      * @param x - Horizontal position to draw the text
      * @param y - Vertical position to draw the text
      * @param isStroke - Is this drawing for the outside stroke of the
      *  text? If not, it's for the inside fill
      */
    /* private */ var drawLetterSpacing: Any = js.native
    
    var localStyleID: Double = js.native
    
    /**
      * The resolution / device pixel ratio of the canvas.
      *
      * This is set to automatically match the renderer resolution by default, but can be overridden by setting manually.
      * @default 1
      */
    def resolution: Double = js.native
    def resolution_=(value: Double): Unit = js.native
    
    /**
      * Set the style of the text.
      *
      * Set up an event listener to listen for changes on the style object and mark the text as dirty.
      */
    def style: TextStyle | PartialITextStyle = js.native
    def style_=(style: TextStyle | PartialITextStyle): Unit = js.native
    
    /** Set the copy for the text object. To split a line you can use '\n'. */
    def text: String = js.native
    def text_=(text: String | Double): Unit = js.native
    
    /**
      * Renders text to its canvas, and updates its texture.
      *
      * By default this is used internally to ensure the texture is correct before rendering,
      * but it can be used called externally, for example from this class to 'pre-generate' the texture from a piece of text,
      * and then shared across multiple Sprites.
      * @param respectDirty - Whether to abort updating the text if the Text isn't dirty and the function is called.
      */
    def updateText(respectDirty: Boolean): Unit = js.native
    
    /** Updates texture size based on canvas size. */
    /* private */ var updateTexture: Any = js.native
  }
  
  /**
    * The TextMetrics object represents the measurement of a block of text with a specified style.
    *
    * ```js
    * let style = new PIXI.TextStyle({fontFamily : 'Arial', fontSize: 24, fill : 0xff1010, align : 'center'})
    * let textMetrics = PIXI.TextMetrics.measureText('Your text', style)
    * ```
    * @memberof PIXI
    */
  trait TextMetrics2 extends StObject {
    
    /**
      * The font properties object from TextMetrics.measureFont.
      * @type {PIXI.IFontMetrics}
      */
    var fontProperties: IFontMetrics
    
    /** The measured height of the text. */
    var height: Double
    
    /** The measured line height for this style. */
    var lineHeight: Double
    
    /** An array of the line widths for each line matched to `lines`. */
    var lineWidths: js.Array[Double]
    
    /** An array of lines of the text broken by new lines and wrapping is specified in style. */
    var lines: js.Array[String]
    
    /** The maximum line width for all measured lines. */
    var maxLineWidth: Double
    
    /** The style that was measured. */
    var style: TextStyle
    
    /** The text that was measured. */
    var text: String
    
    /** The measured width of the text. */
    var width: Double
  }
  object TextMetrics2 {
    
    inline def apply(
      fontProperties: IFontMetrics,
      height: Double,
      lineHeight: Double,
      lineWidths: js.Array[Double],
      lines: js.Array[String],
      maxLineWidth: Double,
      style: TextStyle,
      text: String,
      width: Double
    ): TextMetrics2 = {
      val __obj = js.Dynamic.literal(fontProperties = fontProperties.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineWidths = lineWidths.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], maxLineWidth = maxLineWidth.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextMetrics2]
    }
    
    extension [Self <: TextMetrics2](x: Self) {
      
      inline def setFontProperties(value: IFontMetrics): Self = StObject.set(x, "fontProperties", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineWidths(value: js.Array[Double]): Self = StObject.set(x, "lineWidths", value.asInstanceOf[js.Any])
      
      inline def setLineWidthsVarargs(value: Double*): Self = StObject.set(x, "lineWidths", js.Array(value*))
      
      inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value*))
      
      inline def setMaxLineWidth(value: Double): Self = StObject.set(x, "maxLineWidth", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
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
