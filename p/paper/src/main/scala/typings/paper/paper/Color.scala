package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * All properties and functions that expect color values in the form
  * of instances of Color objects, also accept named colors and hex values as
  * strings which are then converted to instances of
  * {@link Color} internally.
  */
@JSGlobal("paper.Color")
@js.native
class Color protected () extends js.Object {
  /** 
    * Creates a Color object from a CSS string. All common CSS color string
    * formats are supported:
    * - Named colors (e.g. `'red'`, `'fuchsia'`, …)
    * - Hex strings (`'#ffff00'`, `'#ff0'`, …)
    * - RGB strings (`'rgb(255, 128, 0)'`, `'rgba(255, 128, 0, 0.5)'`, …)
    * - HSL strings (`'hsl(180deg, 20%, 50%)'`,
    *   `'hsla(3.14rad, 20%, 50%, 0.5)'`, …)
    * 
    * @param color - the color's CSS string representation
    */
  def this(color: String) = this()
  /** 
    * Creates a gray Color object.
    * 
    * @param gray - the amount of gray in the color as a value
    *     between `0` and `1`
    * @param alpha - the alpha of the color as a value between `0`
    *     and `1`
    */
  def this(gray: Double) = this()
  /** 
    * Creates a HSB, HSL or gradient Color object from the properties of
    * the provided object:
    * 
    * @option hsb.hue {Number} the hue of the color as a value in degrees
    *     between `0` and `360`
    * @option hsb.saturation {Number} the saturation of the color as a
    *     value between `0` and `1`
    * @option hsb.brightness {Number} the brightness of the color as a
    *     value between `0` and `1`
    * @option hsb.alpha {Number} the alpha of the color as a value between
    *     `0` and `1`
    * @option hsl.hue {Number} the hue of the color as a value in degrees
    *     between `0` and `360`
    * @option hsl.saturation {Number} the saturation of the color as a
    *     value between `0` and `1`
    * @option hsl.lightness {Number} the lightness of the color as a value
    *     between `0` and `1`<br>
    * @option hsl.alpha {Number} the alpha of the color as a value between
    *     `0` and `1`
    * @option gradient.gradient {Gradient} the gradient object that
    *     describes the color stops and type of gradient to be used
    * @option gradient.origin {Point} the origin point of the gradient
    * @option gradient.destination {Point} the destination point of the
    *     gradient
    * @option gradient.stops {GradientStop[]} the gradient stops describing
    *     the gradient, as an alternative to providing a gradient object
    * @option gradient.radial {Boolean} controls whether the gradient is
    *     radial, as an alternative to providing a gradient object
    * 
    * @param object - an object describing the components and
    * properties of the color
    */
  def this(`object`: js.Object) = this()
  def this(gray: Double, alpha: Double) = this()
  /** 
    * Creates a gradient Color object.
    */
  def this(gradient: Gradient, origin: Point, destination: Point) = this()
  /** 
    * Creates a RGB Color object.
    * 
    * @param red - the amount of red in the color as a value between
    *     `0` and `1`
    * @param green - the amount of green in the color as a value
    *     between `0` and `1`
    * @param blue - the amount of blue in the color as a value
    *     between `0` and `1`
    * @param alpha - the alpha of the color as a value between `0`
    *     and `1`
    */
  def this(red: Double, green: Double, blue: Double) = this()
  def this(gradient: Gradient, origin: Point, destination: Point, highlight: Point) = this()
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  /** 
    * The color's alpha value as a number between `0` and `1`.
    * All colors of the different subclasses support alpha values.
    */
  var alpha: Double = js.native
  /** 
    * The amount of blue in the color as a value between `0` and `1`.
    */
  var blue: Double = js.native
  /** 
    * The brightness of the color as a value between `0` and `1`.
    */
  var brightness: Double = js.native
  /** 
    * The color components that define the color, including the alpha value
    * if defined.
    */
  val components: js.Array[Double] = js.native
  /** 
    * The gradient object describing the type of gradient and the stops.
    */
  var gradient: Gradient = js.native
  /** 
    * The amount of gray in the color as a value between `0` and `1`.
    */
  var gray: Double = js.native
  /** 
    * The amount of green in the color as a value between `0` and `1`.
    */
  var green: Double = js.native
  /** 
    * The highlight point of the gradient.
    */
  var highlight: Point = js.native
  /** 
    * The hue of the color as a value in degrees between `0` and `360`.
    */
  var hue: Double = js.native
  /** 
    * The lightness of the color as a value between `0` and `1`.
    * 
    * Note that all other components are shared with HSB.
    */
  var lightness: Double = js.native
  /** 
    * The amount of red in the color as a value between `0` and `1`.
    */
  var red: Double = js.native
  /** 
    * The saturation of the color as a value between `0` and `1`.
    */
  var saturation: Double = js.native
  /** 
    * The type of the color as a string.
    */
  var `type`: String = js.native
  /** 
    * Returns the addition of the supplied color to the color as a new
    * color.
    * The object itself is not modified!
    * 
    * @param color - the color to add
    * 
    * @return the addition of the two colors as a new color
    */
  def add(color: Color): Color = js.native
  /** 
    * Returns the addition of the supplied value to both coordinates of
    * the color as a new color.
    * The object itself is not modified!
    * 
    * @param number - the number to add
    * 
    * @return the addition of the color and the value as a new
    * color
    */
  def add(number: Double): Color = js.native
  /** 
    * Converts the color to another type.
    * 
    * @param type - the color type to convert to. Possible values:
    * {@values 'rgb', 'gray', 'hsb', 'hsl'}
    * 
    * @return the converted color as a new instance
    */
  def convert(`type`: String): Color = js.native
  /** 
    * Returns the division of the supplied color to the color as a new
    * color.
    * The object itself is not modified!
    * 
    * @param color - the color to divide
    * 
    * @return the division of the two colors as a new color
    */
  def divide(color: Color): Color = js.native
  /** 
    * Returns the division of the supplied value to both coordinates of
    * the color as a new color.
    * The object itself is not modified!
    * 
    * @param number - the number to divide
    * 
    * @return the division of the color and the value as a new
    * color
    */
  def divide(number: Double): Color = js.native
  /** 
    * Checks if the component color values of the color are the
    * same as those of the supplied one.
    * 
    * @param color - the color to compare with
    * 
    * @return true if the colors are the same
    */
  def equals(color: Color): Boolean = js.native
  /** 
    * Checks if the color has an alpha value.
    * 
    * @return true if the color has an alpha value
    */
  def hasAlpha(): Boolean = js.native
  /** 
    * Returns the multiplication of the supplied color to the color as a
    * new color.
    * The object itself is not modified!
    * 
    * @param color - the color to multiply
    * 
    * @return the multiplication of the two colors as a new color
    */
  def multiply(color: Color): Color = js.native
  /** 
    * Returns the multiplication of the supplied value to both coordinates
    * of the color as a new color.
    * The object itself is not modified!
    * 
    * @param number - the number to multiply
    * 
    * @return the multiplication of the color and the value as a
    * new color
    */
  def multiply(number: Double): Color = js.native
  /** 
    * Sets the color to the passed values. Note that any sequence of
    * parameters that is supported by the various {@link Color}
    * constructors also work for calls of `set()`.
    */
  def set(values: js.Any*): Color = js.native
  /** 
    * Returns the subtraction of the supplied color to the color as a new
    * color.
    * The object itself is not modified!
    * 
    * @param color - the color to subtract
    * 
    * @return the subtraction of the two colors as a new color
    */
  def subtract(color: Color): Color = js.native
  /** 
    * Returns the subtraction of the supplied value to both coordinates of
    * the color as a new color.
    * The object itself is not modified!
    * 
    * @param number - the number to subtract
    * 
    * @return the subtraction of the color and the value as a new
    * color
    */
  def subtract(number: Double): Color = js.native
  /** 
    * Returns the color as a CSS string.
    * 
    * @param hex - whether to return the color in hexadecimal
    * representation or as a CSS RGB / RGBA string.
    * 
    * @return a CSS string representation of the color
    */
  def toCSS(hex: Boolean): String = js.native
  /** 
    * Transform the gradient color by the specified matrix.
    * 
    * @param matrix - the matrix to transform the gradient color by
    */
  def transform(matrix: Matrix): Unit = js.native
}

/* static members */
@JSGlobal("paper.Color")
@js.native
object Color extends js.Object {
  /** 
    * Returns a color object with random {@link #red}, {@link #green}
    * and {@link #blue} values between `0` and `1`.
    * 
    * @return the newly created color object
    */
  def random(): Color = js.native
}

