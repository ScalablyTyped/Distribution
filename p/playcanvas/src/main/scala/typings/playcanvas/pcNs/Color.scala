package typings.playcanvas.pcNs

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Color
  * @classdesc Representation of an RGBA color
  * @description Create a new Color object
  * @param {Number|Number[]} [r] The value of the red component (0-1). If r is an array of length 3 or 4, the array will be used to populate all components.
  * @param {Number} [g] The value of the green component (0-1)
  * @param {Number} [b] The value of the blue component (0-1)
  * @param {Number} [a] The value of the alpha component (0-1)
  * @property {Number} r The red component of the color
  * @property {Number} g The green component of the color
  * @property {Number} b The blue component of the color
  * @property {Number} a The alpha component of the color
  */
@JSGlobal("pc.Color")
@js.native
class Color () extends js.Object {
  def this(r: js.Array[Number]) = this()
  def this(r: Double) = this()
  def this(r: js.Array[Number], g: Double) = this()
  def this(r: Double, g: Double) = this()
  def this(r: js.Array[Number], g: Double, b: Double) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(r: js.Array[Number], g: Double, b: Double, a: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
  /**
    * The alpha component of the color
    */
  var a: Double = js.native
  /**
    * The blue component of the color
    */
  var b: Double = js.native
  /**
    * The green component of the color
    */
  var g: Double = js.native
  /**
    * The red component of the color
    */
  var r: Double = js.native
  /**
    * @function
    * @name pc.Color#copy
    * @description Copies the contents of a source color to a destination color.
    * @param {pc.Color} rhs A color to copy to the specified color.
    * @returns {pc.Color} Self for chaining
    * @example
    * var src = new pc.Color(1, 0, 0, 1);
    * var dst = new pc.Color();
    *
    * dst.copy(src);
    *
    * console.log("The two colors are " + (dst.equals(src) ? "equal" : "different"));
    */
  def copy(rhs: Color): Color = js.native
  /**
    * @function
    * @name pc.Color#fromString
    * @description Set the values of the color from a string representation '#11223344' or '#112233'.
    * @param {String} hex A string representation in the format '#RRGGBBAA' or '#RRGGBB'. Where RR, GG, BB, AA are red, green, blue and alpha values.
    * This is the same format used in HTML/CSS.
    * @returns {pc.Color} Self for chaining
    */
  def fromString(hex: String): Color = js.native
  /**
    * @function
    * @name pc.Color#lerp
    * @description Returns the result of a linear interpolation between two specified colors
    * @param {pc.Color} lhs The color to interpolate from
    * @param {pc.Color} rhs The color to interpolate to.
    * @param {Number} alpha The value controlling the point of interpolation. Between 0 and 1, the linear interpolant
    * will occur on a straight line between lhs and rhs. Outside of this range, the linear interpolant will occur on
    * a ray extrapolated from this line.
    * @returns {pc.Color} Self for chaining.
    * @example
    * var a = new pc.Color(0, 0, 0);
    * var b = new pc.Color(1, 1, 0.5);
    * var r = new pc.Color();
    *
    * r.lerp(a, b, 0);   // r is equal to a
    * r.lerp(a, b, 0.5); // r is 0.5, 0.5, 0.25
    * r.lerp(a, b, 1);   // r is equal to b
    */
  def lerp(lhs: Color, rhs: Color, alpha: Double): Color = js.native
  /**
    * @function
    * @name pc.Color#set
    * @description Assign values to the color components, including alpha
    * @param {Number} r The value for red (0-1)
    * @param {Number} g The value for blue (0-1)
    * @param {Number} b The value for green (0-1)
    * @param {Number} [a] The value for the alpha (0-1), defaults to 1
    * @returns {pc.Color} Self for chaining
    */
  def set(r: Double, g: Double, b: Double): Color = js.native
  def set(r: Double, g: Double, b: Double, a: Double): Color = js.native
  /**
    * @function
    * @name pc.Color#toString
    * @description Converts the color to string form. The format is '#RRGGBBAA', where
    * RR, GG, BB, AA are the red, green, blue and alpha values. When the alpha value is not
    * included (the default), this is the same format as used in HTML/CSS.
    * @param {Boolean} alpha If true, the output string will include the alpha value.
    * @returns {String} The color in string form.
    * @example
    * var c = new pc.Color(1, 1, 1);
    * // Should output '#ffffffff'
    * console.log(c.toString());
    */
  def toString(alpha: Boolean): String = js.native
}

