package typings.pixiJs.mod

import typings.pixiJs.anon.Align
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextStyle Object contains information to decorate a Text objects.
  *
  * An instance can be shared between multiple Text objects; then changing the style will update all text objects using it.
  *
  * A tool can be used to generate a text style [here](https://pixijs.io/pixi-text-style).
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "TextStyle")
@js.native
class TextStyle ()
  extends typings.pixiJs.PIXI.TextStyle {
  def this(style: Align) = this()
  /**
    * Alignment for multiline text ('left', 'center' or 'right'), does not affect single line text
    *
    * @member {string}
    */
  /* CompleteClass */
  override var align: String = js.native
  /**
    * Indicates if lines can be wrapped within words, it needs wordWrap to be set to true
    *
    * @member {boolean}
    */
  /* CompleteClass */
  override var breakWords: Boolean = js.native
  /**
    * Set a drop shadow for the text
    *
    * @member {boolean}
    */
  /* CompleteClass */
  override var dropShadow: Boolean = js.native
  /**
    * Set alpha for the drop shadow
    *
    * @member {number}
    */
  /* CompleteClass */
  override var dropShadowAlpha: Double = js.native
  /**
    * Set a angle of the drop shadow
    *
    * @member {number}
    */
  /* CompleteClass */
  override var dropShadowAngle: Double = js.native
  /**
    * Set a shadow blur radius
    *
    * @member {number}
    */
  /* CompleteClass */
  override var dropShadowBlur: Double = js.native
  /**
    * A fill style to be used on the dropshadow e.g 'red', '#00FF00'
    *
    * @member {string|number}
    */
  /* CompleteClass */
  override var dropShadowColor: String | Double = js.native
  /**
    * Set a distance of the drop shadow
    *
    * @member {number}
    */
  /* CompleteClass */
  override var dropShadowDistance: Double = js.native
  /**
    * A canvas fillstyle that will be used on the text e.g 'red', '#00FF00'.
    * Can be an array to create a gradient eg ['#000000','#FFFFFF']
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillStyle|MDN}
    *
    * @member {string|string[]|number|number[]|CanvasGradient|CanvasPattern}
    */
  /* CompleteClass */
  override var fill: String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern = js.native
  /**
    * If fill is an array of colours to create a gradient, this array can set the stop points
    * (numbers between 0 and 1) for the color, overriding the default behaviour of evenly spacing them.
    *
    * @member {number[]}
    */
  /* CompleteClass */
  override var fillGradientStops: js.Array[Double] = js.native
  /**
    * If fill is an array of colours to create a gradient, this can change the type/direction of the gradient.
    * See {@link PIXI.TEXT_GRADIENT}
    *
    * @member {number}
    */
  /* CompleteClass */
  override var fillGradientType: Double = js.native
  /**
    * The font family
    *
    * @member {string|string[]}
    */
  /* CompleteClass */
  override var fontFamily: String | js.Array[String] = js.native
  /**
    * The font size
    * (as a number it converts to px, but as a string, equivalents are '26px','20pt','160%' or '1.6em')
    *
    * @member {number|string}
    */
  /* CompleteClass */
  override var fontSize: Double | String = js.native
  /**
    * The font style
    * ('normal', 'italic' or 'oblique')
    *
    * @member {string}
    */
  /* CompleteClass */
  override var fontStyle: String = js.native
  /**
    * The font variant
    * ('normal' or 'small-caps')
    *
    * @member {string}
    */
  /* CompleteClass */
  override var fontVariant: String = js.native
  /**
    * The font weight
    * ('normal', 'bold', 'bolder', 'lighter' and '100', '200', '300', '400', '500', '600', '700', 800' or '900')
    *
    * @member {string}
    */
  /* CompleteClass */
  override var fontWeight: String = js.native
  /**
    * The space between lines
    *
    * @member {number}
    */
  /* CompleteClass */
  override var leading: Double = js.native
  /**
    * The amount of spacing between letters, default is 0
    *
    * @member {number}
    */
  /* CompleteClass */
  override var letterSpacing: Double = js.native
  /**
    * The line height, a number that represents the vertical space that a letter uses
    *
    * @member {number}
    */
  /* CompleteClass */
  override var lineHeight: Double = js.native
  /**
    * The lineJoin property sets the type of corner created, it can resolve spiked text issues.
    * Default is 'miter' (creates a sharp corner).
    *
    * @member {string}
    */
  /* CompleteClass */
  override var lineJoin: String = js.native
  /**
    * The miter limit to use when using the 'miter' lineJoin mode
    * This can reduce or increase the spikiness of rendered text.
    *
    * @member {number}
    */
  /* CompleteClass */
  override var miterLimit: Double = js.native
  /**
    * Occasionally some fonts are cropped. Adding some padding will prevent this from happening
    * by adding padding to all sides of the text.
    *
    * @member {number}
    */
  /* CompleteClass */
  override var padding: Double = js.native
  /**
    * A canvas fillstyle that will be used on the text stroke
    * e.g 'blue', '#FCFF00'
    *
    * @member {string|number}
    */
  /* CompleteClass */
  override var stroke: String | Double = js.native
  /**
    * A number that represents the thickness of the stroke.
    * Default is 0 (no stroke)
    *
    * @member {number}
    */
  /* CompleteClass */
  override var strokeThickness: Double = js.native
  /**
    * The baseline of the text that is rendered.
    *
    * @member {string}
    */
  /* CompleteClass */
  override var textBaseline: String = js.native
  /**
    * Trim transparent borders
    *
    * @member {boolean}
    */
  /* CompleteClass */
  override var trim: Boolean = js.native
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
  /* CompleteClass */
  override var whiteSpace: String = js.native
  /**
    * Indicates if word wrap should be used
    *
    * @member {boolean}
    */
  /* CompleteClass */
  override var wordWrap: Boolean = js.native
  /**
    * The width at which text will wrap, it needs wordWrap to be set to true
    *
    * @member {number}
    */
  /* CompleteClass */
  override var wordWrapWidth: Double = js.native
  /**
    * Resets all properties to the defaults specified in TextStyle.prototype._default
    */
  /* CompleteClass */
  override def reset(): Unit = js.native
  /**
    * Generates a font style string to use for `TextMetrics.measureFont()`.
    *
    * @return {string} Font style string, for passing to `TextMetrics.measureFont()`
    */
  /* CompleteClass */
  override def toFontString(): String = js.native
}

