package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * All properties and functions that expect color values in the form
  * of instances of Color objects, also accept named colors and hex values as
  * strings which are then converted to instances of
  * {@link Color} internally.
  */
@JSImport("paper", "Color")
@js.native
class Color protected ()
  extends typings.paper.paper.Color {
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
  def this(
    gradient: typings.paper.paper.Gradient,
    origin: typings.paper.paper.Point,
    destination: typings.paper.paper.Point
  ) = this()
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
  def this(
    gradient: typings.paper.paper.Gradient,
    origin: typings.paper.paper.Point,
    destination: typings.paper.paper.Point,
    highlight: typings.paper.paper.Point
  ) = this()
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
}

/* static members */
@JSImport("paper", "Color")
@js.native
object Color extends js.Object {
  /** 
    * Returns a color object with random {@link #red}, {@link #green}
    * and {@link #blue} values between `0` and `1`.
    * 
    * @return the newly created color object
    */
  def random(): typings.paper.paper.Color = js.native
}

