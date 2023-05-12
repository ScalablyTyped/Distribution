package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of an RGBA color.
  */
@JSImport("playcanvas", "Color")
@js.native
/**
  * Create a new Color object.
  *
  * @param {number|number[]} [r] - The value of the red component (0-1). Defaults to 0. If r is
  * an array of length 3 or 4, the array will be used to populate all components.
  * @param {number} [g] - The value of the green component (0-1). Defaults to 0.
  * @param {number} [b] - The value of the blue component (0-1). Defaults to 0.
  * @param {number} [a] - The value of the alpha component (0-1). Defaults to 1.
  */
open class Color () extends StObject {
  def this(r: js.Array[Double]) = this()
  def this(r: Double) = this()
  def this(r: js.Array[Double], g: Double) = this()
  def this(r: Double, g: Double) = this()
  def this(r: Unit, g: Double) = this()
  def this(r: js.Array[Double], g: Double, b: Double) = this()
  def this(r: js.Array[Double], g: Unit, b: Double) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(r: Double, g: Unit, b: Double) = this()
  def this(r: Unit, g: Double, b: Double) = this()
  def this(r: Unit, g: Unit, b: Double) = this()
  def this(r: js.Array[Double], g: Double, b: Double, a: Double) = this()
  def this(r: js.Array[Double], g: Double, b: Unit, a: Double) = this()
  def this(r: js.Array[Double], g: Unit, b: Double, a: Double) = this()
  def this(r: js.Array[Double], g: Unit, b: Unit, a: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
  def this(r: Double, g: Double, b: Unit, a: Double) = this()
  def this(r: Double, g: Unit, b: Double, a: Double) = this()
  def this(r: Double, g: Unit, b: Unit, a: Double) = this()
  def this(r: Unit, g: Double, b: Double, a: Double) = this()
  def this(r: Unit, g: Double, b: Unit, a: Double) = this()
  def this(r: Unit, g: Unit, b: Double, a: Double) = this()
  def this(r: Unit, g: Unit, b: Unit, a: Double) = this()
  
  /**
    * The alpha component of the color.
    *
    * @type {number}
    */
  var a: Double = js.native
  
  /**
    * The blue component of the color.
    *
    * @type {number}
    */
  var b: Double = js.native
  
  /**
    * Copies the contents of a source color to a destination color.
    *
    * @param {Color} rhs - A color to copy to the specified color.
    * @returns {Color} Self for chaining.
    * @example
    * const src = new pc.Color(1, 0, 0, 1);
    * const dst = new pc.Color();
    *
    * dst.copy(src);
    *
    * console.log("The two colors are " + (dst.equals(src) ? "equal" : "different"));
    */
  def copy(rhs: Color): Color = js.native
  
  /**
    * Reports whether two colors are equal.
    *
    * @param {Color} rhs - The color to compare to the specified color.
    * @returns {boolean} True if the colors are equal and false otherwise.
    * @example
    * const a = new pc.Color(1, 0, 0, 1);
    * const b = new pc.Color(1, 1, 0, 1);
    * console.log("The two colors are " + (a.equals(b) ? "equal" : "different"));
    */
  def equals(rhs: Color): Boolean = js.native
  
  /**
    * Set the values of the color from a string representation '#11223344' or '#112233'.
    *
    * @param {string} hex - A string representation in the format '#RRGGBBAA' or '#RRGGBB'. Where
    * RR, GG, BB, AA are red, green, blue and alpha values. This is the same format used in
    * HTML/CSS.
    * @returns {Color} Self for chaining.
    */
  def fromString(hex: String): Color = js.native
  
  /**
    * The green component of the color.
    *
    * @type {number}
    */
  var g: Double = js.native
  
  /**
    * Returns the result of a linear interpolation between two specified colors.
    *
    * @param {Color} lhs - The color to interpolate from.
    * @param {Color} rhs - The color to interpolate to.
    * @param {number} alpha - The value controlling the point of interpolation. Between 0 and 1,
    * the linear interpolant will occur on a straight line between lhs and rhs. Outside of this
    * range, the linear interpolant will occur on a ray extrapolated from this line.
    * @returns {Color} Self for chaining.
    * @example
    * const a = new pc.Color(0, 0, 0);
    * const b = new pc.Color(1, 1, 0.5);
    * const r = new pc.Color();
    *
    * r.lerp(a, b, 0);   // r is equal to a
    * r.lerp(a, b, 0.5); // r is 0.5, 0.5, 0.25
    * r.lerp(a, b, 1);   // r is equal to b
    */
  def lerp(lhs: Color, rhs: Color, alpha: Double): Color = js.native
  
  /**
    * The red component of the color.
    *
    * @type {number}
    */
  var r: Double = js.native
  
  /**
    * Assign values to the color components, including alpha.
    *
    * @param {number} r - The value for red (0-1).
    * @param {number} g - The value for blue (0-1).
    * @param {number} b - The value for green (0-1).
    * @param {number} [a] - The value for the alpha (0-1), defaults to 1.
    * @returns {Color} Self for chaining.
    */
  def set(r: Double, g: Double, b: Double): Color = js.native
  def set(r: Double, g: Double, b: Double, a: Double): Color = js.native
  
  /**
    * Converts the color to string form. The format is '#RRGGBBAA', where RR, GG, BB, AA are the
    * red, green, blue and alpha values. When the alpha value is not included (the default), this
    * is the same format as used in HTML/CSS.
    *
    * @param {boolean} alpha - If true, the output string will include the alpha value.
    * @returns {string} The color in string form.
    * @example
    * const c = new pc.Color(1, 1, 1);
    * // Outputs #ffffffff
    * console.log(c.toString());
    */
  def toString(alpha: Boolean): String = js.native
}
object Color {
  
  /**
    * A constant color set to black [0, 0, 0, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Color.BLACK")
  @js.native
  val BLACK: Color = js.native
  
  /**
    * A constant color set to blue [0, 0, 1, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Color.BLUE")
  @js.native
  val BLUE: Color = js.native
  
  /**
    * A constant color set to cyan [0, 1, 1, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Color.CYAN")
  @js.native
  val CYAN: Color = js.native
  
  /**
    * A constant color set to gray [0.5, 0.5, 0.5, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Color.GRAY")
  @js.native
  val GRAY: Color = js.native
  
  /**
    * A constant color set to green [0, 1, 0, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Color.GREEN")
  @js.native
  val GREEN: Color = js.native
  
  /**
    * A constant color set to magenta [1, 0, 1, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Color.MAGENTA")
  @js.native
  val MAGENTA: Color = js.native
  
  /**
    * A constant color set to red [1, 0, 0, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Color.RED")
  @js.native
  val RED: Color = js.native
  
  /**
    * A constant color set to white [1, 1, 1, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Color.WHITE")
  @js.native
  val WHITE: Color = js.native
  
  /**
    * A constant color set to yellow [1, 1, 0, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Color.YELLOW")
  @js.native
  val YELLOW: Color = js.native
}
