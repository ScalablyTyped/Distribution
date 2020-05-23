package typings.playcanvas.mod

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
@JSImport("playcanvas", "Color")
@js.native
class Color ()
  extends typings.playcanvas.pc.Color {
  def this(r: js.Array[Double]) = this()
  def this(r: Double) = this()
  def this(r: js.Array[Double], g: Double) = this()
  def this(r: Double, g: Double) = this()
  def this(r: js.Array[Double], g: Double, b: Double) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(r: js.Array[Double], g: Double, b: Double, a: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
}

