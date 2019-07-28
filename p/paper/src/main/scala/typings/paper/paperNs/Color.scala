package typings.paper.paperNs

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
  def this(css: String) = this()
  /**
    * Creates a gray Color object.
    * @param gray - the amount of gray in the color as a value between 0 and 1
    * @param alpha [optional] - the alpha of the color as a value between 0 and 1
    */
  def this(gray: Double) = this()
  def this(`object`: IGradientColor) = this()
  /**
    * Creates a HSB, HSL or gradient Color object from the properties of the provided object:
    * @param object - an object describing the components and properties of the color.
    */
  def this(`object`: IHSBColor) = this()
  def this(`object`: IHSLColor) = this()
  def this(gray: Double, alpha: Double) = this()
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
  def this(red: Double, green: Double, blue: Double) = this()
  def this(color: Gradient, origin: Point, destination: Point, highlight: Point) = this()
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  /**
    * The color's alpha value as a number between 0 and 1.
    * All colors of the different subclasses support alpha values.
    */
  var alpha: Double = js.native
  /**
    * The amount of blue in the color as a value between 0 and 1.
    */
  var blue: Double = js.native
  /**
    * The brightness of the color as a value between 0 and 1.
    */
  var brightness: Double = js.native
  /**
    * The color components that define the color, including the alpha value if defined.
    * Read Only.
    */
  val components: Double = js.native
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
  var gray: Double = js.native
  /**
    * The amount of green in the color as a value between 0 and 1.
    */
  var green: Double = js.native
  /**
    * The highlight point of the gradient. Only defined if the color was constructed as a gradient.
    */
  var highlight: js.UndefOr[Point] = js.native
  /**
    * The hue of the color as a value in degrees between 0 and 360.
    */
  var hue: Double = js.native
  /**
    * The lightness of the color as a value between 0 and 1.
    * Note that all other components are shared with HSB.
    */
  var lightness: Double = js.native
  /**
    * The starting point of the gradient. Only defined if the color was constructed as a gradient.
    */
  var origin: js.UndefOr[Point] = js.native
  /**
    * The amount of red in the color as a value between 0 and 1.
    */
  var red: Double = js.native
  /**
    * The saturation of the color as a value between 0 and 1.
    */
  var saturation: Double = js.native
  /**
    * The type of the color as a string.
    * String('rgb', 'gray', 'hsb', 'hsl')
    */
  var `type`: String = js.native
  /**
    * Returns the addition of the supplied color to the color as a new color. The object itself is not modified!
    * @param color - the color to add
    */
  def add(color: Color): Color = js.native
  /**
    * Returns the addition of the supplied value to both coordinates of the color as a new color. The object itself is not modified!
    * @param number - the number to add
    */
  def add(number: Double): Color = js.native
  /**
    * Converts the color another type.
    * @param type - String('rgb'|'gray'|'hsb'|'hsl') the color type to convert to.
    */
  def convert(`type`: String): Color = js.native
  /**
    * Returns the division of the supplied color to the color as a new color. The object itself is not modified!
    * @param color - the color to divide
    */
  def divide(color: Color): Color = js.native
  /**
    * Returns the division of the supplied value to both coordinates of the color as a new color. The object itself is not modified!
    * @param number - the number to divide
    */
  def divide(number: Double): Color = js.native
  /**
    * Checks if the component color values of the color are the same as those of the supplied one.
    * @param color - the color to compare with
    */
  def equals(color: Color): Boolean = js.native
  /**
    * Checks if the color has an alpha value.
    */
  def hasAlpha(): Boolean = js.native
  /**
    * Returns the multiplication of the supplied color to the color as a new color. The object itself is not modified!
    * @param color - the color to multiply
    */
  def multiply(color: Color): Color = js.native
  /**
    * Returns the multiplication of the supplied value to both coordinates of the color as a new color. The object itself is not modified!
    * @param number - the number to multiply
    */
  def multiply(number: Double): Color = js.native
  /**
    * Sets color to a gradient Color object.
    * @param gradient -
    * @param origin -
    * @param destination -
    * @param highlight [optional] -
    */
  def set(color: Gradient, origin: Point, destination: Point): Unit = js.native
  def set(color: Gradient, origin: Point, destination: Point, highlight: Point): Unit = js.native
  /**
    * Sets color to a RGB Color object from CSS string
    * @param css - the RGB color in hex, i.e. #000000, rbga, i.e. rgba(0,0,0,0) or named color.
    */
  def set(css: String): Unit = js.native
  /**
    * Sets color to a gray Color object.
    * @param gray - the amount of gray in the color as a value between 0 and 1
    * @param alpha [optional] - the alpha of the color as a value between 0 and 1
    */
  def set(gray: Double): Unit = js.native
  def set(gray: Double, alpha: Double): Unit = js.native
  def set(`object`: IGradientColor): Unit = js.native
  /**
    * Sets color to a HSB, HSL or gradient Color object from the properties of the provided object:
    * @param object - an object describing the components and properties of the color.
    */
  def set(`object`: IHSBColor): Unit = js.native
  def set(`object`: IHSLColor): Unit = js.native
  /**
    * Sets color to a RGB Color object.
    * @param red - the amount of red in the color as a value between 0 and 1
    * @param green - the amount of green in the color as a value between 0 and 1
    * @param blue - the amount of blue in the color as a value between 0 and 1
    * @param alpha [optional] - the alpha of the color as a value between 0 and 1
    */
  def set(red: Double, green: Double, blue: Double): Unit = js.native
  def set(red: Double, green: Double, blue: Double, alpha: Double): Unit = js.native
  /**
    * Returns the subtraction of the supplied color to the color as a new color. The object itself is not modified!
    * @param color - the color to subtract
    */
  def subtract(color: Color): Color = js.native
  /**
    * Returns the subtraction of the supplied value to both coordinates of the color as a new color. The object itself is not modified!
    * @param number - the number to subtract
    */
  def subtract(number: Double): Color = js.native
  /**
    * Returns the color as a CSS string.
    * @param hex - whether to return the color in hexadecial representation or as a CSS RGB / RGBA string.
    */
  def toCSS(hex: Boolean): String = js.native
  /**
    * Transform the gradient color by the specified matrix.
    * @param matrix - the matrix to transform the gradient color by
    */
  def transform(matrix: Matrix): Unit = js.native
}

