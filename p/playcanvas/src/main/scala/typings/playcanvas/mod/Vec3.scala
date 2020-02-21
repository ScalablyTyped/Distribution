package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Vec3
  * @classdesc A 3-dimensional vector.
  * @description Creates a new Vec3 object.
  * @param {number|number[]} [x] - The x value. If x is an array of length 3, the array will be used to populate all components.
  * @param {number} [y] - The y value.
  * @param {number} [z] - The z value.
  * @example
  * var v = new pc.Vec3(1, 2, 3);
  */
@JSImport("playcanvas", "Vec3")
@js.native
class Vec3 ()
  extends typings.playcanvas.pc.Vec3 {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
}

/* static members */
@JSImport("playcanvas", "Vec3")
@js.native
object Vec3 extends js.Object {
  /**
    * @static
    * @readonly
    * @name pc.Vec3.BACK
    * @type {pc.Vec3}
    * @description A constant vector set to [0, 0, 1].
    */
  val BACK: typings.playcanvas.pc.Vec3 = js.native
  /**
    * @static
    * @readonly
    * @name pc.Vec3.DOWN
    * @type {pc.Vec3}
    * @description A constant vector set to [0, -1, 0].
    */
  val DOWN: typings.playcanvas.pc.Vec3 = js.native
  /**
    * @static
    * @readonly
    * @name pc.Vec3.FORWARD
    * @type {pc.Vec3}
    * @description A constant vector set to [0, 0, -1].
    */
  val FORWARD: typings.playcanvas.pc.Vec3 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Vec3.LEFT
    * @type {pc.Vec3}
    * @description A constant vector set to [-1, 0, 0].
    */
  val LEFT: typings.playcanvas.pc.Vec3 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Vec3.ONE
    * @type {pc.Vec3}
    * @description A constant vector set to [1, 1, 1].
    */
  val ONE: typings.playcanvas.pc.Vec3 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Vec3.RIGHT
    * @type {pc.Vec3}
    * @description A constant vector set to [1, 0, 0].
    */
  val RIGHT: typings.playcanvas.pc.Vec3 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Vec3.UP
    * @type {pc.Vec3}
    * @description A constant vector set to [0, 1, 0].
    */
  val UP: typings.playcanvas.pc.Vec3 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Vec3.ZERO
    * @type {pc.Vec3}
    * @description A constant vector set to [0, 0, 0].
    */
  val ZERO: typings.playcanvas.pc.Vec3 = js.native
}

