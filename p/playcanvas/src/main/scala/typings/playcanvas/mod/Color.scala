package typings.playcanvas.mod

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
@JSImport("playcanvas", "Color")
@js.native
class Color ()
  extends typings.playcanvas.pc.Color {
  def this(r: js.Array[Number]) = this()
  def this(r: Double) = this()
  def this(r: js.Array[Number], g: Double) = this()
  def this(r: Double, g: Double) = this()
  def this(r: js.Array[Number], g: Double, b: Double) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(r: js.Array[Number], g: Double, b: Double, a: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
}

