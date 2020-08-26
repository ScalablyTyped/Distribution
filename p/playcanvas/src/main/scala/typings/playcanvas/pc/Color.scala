package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new Color object.
  * @property r - The red component of the color.
  * @property g - The green component of the color.
  * @property b - The blue component of the color.
  * @property a - The alpha component of the color.
  * @param [r] - The value of the red component (0-1). If r is an array of length 3 or 4, the array will be used to populate all components.
  * @param [g] - The value of the green component (0-1).
  * @param [b] - The value of the blue component (0-1).
  * @param [a] - The value of the alpha component (0-1).
  */
@js.native
trait Color extends js.Object {
  /**
    * The alpha component of the color.
    */
  var a: Double = js.native
  /**
    * The blue component of the color.
    */
  var b: Double = js.native
  /**
    * The green component of the color.
    */
  var g: Double = js.native
  /**
    * The red component of the color.
    */
  var r: Double = js.native
  /**
    * Copies the contents of a source color to a destination color.
    * @example
    * var src = new pc.Color(1, 0, 0, 1);
    * var dst = new pc.Color();
    *
    * dst.copy(src);
    *
    * console.log("The two colors are " + (dst.equals(src) ? "equal" : "different"));
    * @param rhs - A color to copy to the specified color.
    * @returns Self for chaining.
    */
  def copy(rhs: Color): Color = js.native
  /**
    * Reports whether two colors are equal.
    * @example
    * var a = new pc.Color(1, 0, 0, 1);
    * var b = new pc.Color(1, 1, 0, 1);
    * console.log("The two colors are " + (a.equals(b) ? "equal" : "different"));
    * @param rhs - The color to compare to the specified color.
    * @returns True if the colors are equal and false otherwise.
    */
  def equals(rhs: Color): Boolean = js.native
  /**
    * Set the values of the color from a string representation '#11223344' or '#112233'.
    * @param hex - A string representation in the format '#RRGGBBAA' or '#RRGGBB'. Where RR, GG, BB, AA are red, green, blue and alpha values.
    * This is the same format used in HTML/CSS.
    * @returns Self for chaining.
    */
  def fromString(hex: String): Color = js.native
  /**
    * Returns the result of a linear interpolation between two specified colors.
    * @example
    * var a = new pc.Color(0, 0, 0);
    * var b = new pc.Color(1, 1, 0.5);
    * var r = new pc.Color();
    *
    * r.lerp(a, b, 0);   // r is equal to a
    * r.lerp(a, b, 0.5); // r is 0.5, 0.5, 0.25
    * r.lerp(a, b, 1);   // r is equal to b
    * @param lhs - The color to interpolate from.
    * @param rhs - The color to interpolate to.
    * @param alpha - The value controlling the point of interpolation. Between 0 and 1, the linear interpolant
    * will occur on a straight line between lhs and rhs. Outside of this range, the linear interpolant will occur on
    * a ray extrapolated from this line.
    * @returns Self for chaining.
    */
  def lerp(lhs: Color, rhs: Color, alpha: Double): Color = js.native
  /**
    * Assign values to the color components, including alpha.
    * @param r - The value for red (0-1).
    * @param g - The value for blue (0-1).
    * @param b - The value for green (0-1).
    * @param [a] - The value for the alpha (0-1), defaults to 1.
    * @returns Self for chaining.
    */
  def set(r: Double, g: Double, b: Double): Color = js.native
  def set(r: Double, g: Double, b: Double, a: Double): Color = js.native
  /**
    * Converts the color to string form. The format is '#RRGGBBAA', where
    * RR, GG, BB, AA are the red, green, blue and alpha values. When the alpha value is not
    * included (the default), this is the same format as used in HTML/CSS.
    * @example
    * var c = new pc.Color(1, 1, 1);
    * // Should output '#ffffffff'
    * console.log(c.toString());
    * @param alpha - If true, the output string will include the alpha value.
    * @returns The color in string form.
    */
  def toString(alpha: Boolean): String = js.native
}

