package typings
package paperLib.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Color")
@js.native
class Color protected () extends Base {
  /**
    * Creates a RGB Color object from CSS string
    * @param css - the RGB color in hex, i.e. #000000, rbga, i.e. rgba(0,0,0,0) or named color.
    */
  def this(css: java.lang.String) = this()
  /**
    * Creates a gray Color object.
    * @param gray - the amount of gray in the color as a value between 0 and 1
    * @param alpha [optional] - the alpha of the color as a value between 0 and 1
    */
  def this(gray: scala.Double) = this()
  def this(`object`: IGradientColor) = this()
  /**
    * Creates a HSB, HSL or gradient Color object from the properties of the provided object:
    * @param object - an object describing the components and properties of the color.
    */
  def this(`object`: IHSBColor) = this()
  def this(`object`: IHSLColor) = this()
  def this(gray: scala.Double, alpha: scala.Double) = this()
  /**
    * Creates a gradient Color object.
    * @param gradient -
    * @param origin -
    * @param destination -
    * @param highlight [optional] -
    */
  def this(color: Gradient, origin: Point, destination: Point) = this()
  /**
    * Creates a RGB Color object.
    * @param red - the amount of red in the color as a value between 0 and 1
    * @param green - the amount of green in the color as a value between 0 and 1
    * @param blue - the amount of blue in the color as a value between 0 and 1
    * @param alpha [optional] - the alpha of the color as a value between 0 and 1
    */
  def this(red: scala.Double, green: scala.Double, blue: scala.Double) = this()
  def this(color: Gradient, origin: Point, destination: Point, highlight: Point) = this()
  def this(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double) = this()
  /**
    * The color's alpha value as a number between 0 and 1.
    * All colors of the different subclasses support alpha values.
    */
  var alpha: scala.Double = js.native
  /**
    * The amount of blue in the color as a value between 0 and 1.
    */
  var blue: scala.Double = js.native
  /**
    * The brightness of the color as a value between 0 and 1.
    */
  var brightness: scala.Double = js.native
  /**
    * The color components that define the color, including the alpha value if defined.
    * Read Only.
    */
  val components: scala.Double = js.native
  /**
    * The ending point of the gradient. Only defined if the color was constructed as a gradient.
    */
  var destination: js.UndefOr[Point] = js.native
  /**
    * The gradient object describing the type of gradient and the stops. Only defined if the color was constructed as a gradient.
    */
  var gradient: js.UndefOr[Gradient] = js.native
  /**
    * The amount of gray in the color as a value between 0 and 1.
    */
  var gray: scala.Double = js.native
  /**
    * The amount of green in the color as a value between 0 and 1.
    */
  var green: scala.Double = js.native
  /**
    * The highlight point of the gradient. Only defined if the color was constructed as a gradient.
    */
  var highlight: js.UndefOr[Point] = js.native
  /**
    * The hue of the color as a value in degrees between 0 and 360.
    */
  var hue: scala.Double = js.native
  /**
    * The lightness of the color as a value between 0 and 1.
    * Note that all other components are shared with HSB.
    */
  var lightness: scala.Double = js.native
  /**
    * The starting point of the gradient. Only defined if the color was constructed as a gradient.
    */
  var origin: js.UndefOr[Point] = js.native
  /**
    * The amount of red in the color as a value between 0 and 1.
    */
  var red: scala.Double = js.native
  /**
    * The saturation of the color as a value between 0 and 1.
    */
  var saturation: scala.Double = js.native
  /**
    * The type of the color as a string.
    * String('rgb', 'gray', 'hsb', 'hsl')
    */
  var `type`: java.lang.String = js.native
  /**
    * Returns the addition of the supplied color to the color as a new color. The object itself is not modified!
    * @param color - the color to add
    */
  def add(color: Color): Color = js.native
  /**
    * Returns the addition of the supplied value to both coordinates of the color as a new color. The object itself is not modified!
    * @param number - the number to add
    */
  def add(number: scala.Double): Color = js.native
  /**
    * Converts the color another type.
    * @param type - String('rgb'|'gray'|'hsb'|'hsl') the color type to convert to.
    */
  def convert(`type`: java.lang.String): Color = js.native
  /**
    * Returns the division of the supplied color to the color as a new color. The object itself is not modified!
    * @param color - the color to divide
    */
  def divide(color: Color): Color = js.native
  /**
    * Returns the division of the supplied value to both coordinates of the color as a new color. The object itself is not modified!
    * @param number - the number to divide
    */
  def divide(number: scala.Double): Color = js.native
  /**
    * Checks if the component color values of the color are the same as those of the supplied one.
    * @param color - the color to compare with
    */
  def equals(color: Color): scala.Boolean = js.native
  /**
    * Checks if the color has an alpha value.
    */
  def hasAlpha(): scala.Boolean = js.native
  /**
    * Returns the multiplication of the supplied color to the color as a new color. The object itself is not modified!
    * @param color - the color to multiply
    */
  def multiply(color: Color): Color = js.native
  /**
    * Returns the multiplication of the supplied value to both coordinates of the color as a new color. The object itself is not modified!
    * @param number - the number to multiply
    */
  def multiply(number: scala.Double): Color = js.native
  /**
    * Sets color to a gradient Color object.
    * @param gradient -
    * @param origin -
    * @param destination -
    * @param highlight [optional] -
    */
  def set(color: Gradient, origin: Point, destination: Point): scala.Unit = js.native
  def set(color: Gradient, origin: Point, destination: Point, highlight: Point): scala.Unit = js.native
  /**
    * Sets color to a RGB Color object from CSS string
    * @param css - the RGB color in hex, i.e. #000000, rbga, i.e. rgba(0,0,0,0) or named color.
    */
  def set(css: java.lang.String): scala.Unit = js.native
  /**
    * Sets color to a gray Color object.
    * @param gray - the amount of gray in the color as a value between 0 and 1
    * @param alpha [optional] - the alpha of the color as a value between 0 and 1
    */
  def set(gray: scala.Double): scala.Unit = js.native
  def set(gray: scala.Double, alpha: scala.Double): scala.Unit = js.native
  def set(`object`: IGradientColor): scala.Unit = js.native
  /**
    * Sets color to a HSB, HSL or gradient Color object from the properties of the provided object:
    * @param object - an object describing the components and properties of the color.
    */
  def set(`object`: IHSBColor): scala.Unit = js.native
  def set(`object`: IHSLColor): scala.Unit = js.native
  /**
    * Sets color to a RGB Color object.
    * @param red - the amount of red in the color as a value between 0 and 1
    * @param green - the amount of green in the color as a value between 0 and 1
    * @param blue - the amount of blue in the color as a value between 0 and 1
    * @param alpha [optional] - the alpha of the color as a value between 0 and 1
    */
  def set(red: scala.Double, green: scala.Double, blue: scala.Double): scala.Unit = js.native
  def set(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double): scala.Unit = js.native
  /**
    * Returns the subtraction of the supplied color to the color as a new color. The object itself is not modified!
    * @param color - the color to subtract
    */
  def subtract(color: Color): Color = js.native
  /**
    * Returns the subtraction of the supplied value to both coordinates of the color as a new color. The object itself is not modified!
    * @param number - the number to subtract
    */
  def subtract(number: scala.Double): Color = js.native
  /**
    * Returns the color as a CSS string.
    * @param hex - whether to return the color in hexadecial representation or as a CSS RGB / RGBA string.
    */
  def toCSS(hex: scala.Boolean): java.lang.String = js.native
  /**
    * Transform the gradient color by the specified matrix.
    * @param matrix - the matrix to transform the gradient color by
    */
  def transform(matrix: Matrix): scala.Unit = js.native
}

