package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Vec4
  * @classdesc A 4-dimensional vector.
  * @description Creates a new Vec4 object.
  * @param {number|number[]} [x] - The x value. If x is an array of length 4, the array will be used to populate all components.
  * @param {number} [y] - The y value.
  * @param {number} [z] - The z value.
  * @param {number} [w] - The w value.
  * @example
  * var v = new pc.Vec4(1, 2, 3, 4);
  */
@JSImport("playcanvas", "Vec4")
@js.native
class Vec4 ()
  extends typings.playcanvas.pc.Vec4 {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
}

/* static members */
@JSImport("playcanvas", "Vec4")
@js.native
object Vec4 extends js.Object {
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Vec4.ONE
    * @type {pc.Vec4}
    * @description A constant vector set to [1, 1, 1, 1].
    */
  val ONE: typings.playcanvas.pc.Vec4 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Vec4.ZERO
    * @type {pc.Vec4}
    * @description A constant vector set to [0, 0, 0, 0].
    */
  val ZERO: typings.playcanvas.pc.Vec4 = js.native
}

