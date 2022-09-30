package typings.pixiJs.mod

import typings.pixiText.anon.PartialITextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "TextStyle")
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
  extends typings.pixiText.mod.TextStyle {
  def this(style: PartialITextStyle) = this()
}
