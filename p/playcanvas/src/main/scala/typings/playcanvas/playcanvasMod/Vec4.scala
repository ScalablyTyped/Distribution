package typings.playcanvas.playcanvasMod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Vec4
  * @classdesc A 4-dimensional vector.
  * @description Creates a new Vec4 object.
  * @param {Number|Number[]} [x] The x value. If x is an array of length 4, the array will be used to populate all components.
  * @param {Number} [y] The y value.
  * @param {Number} [z] The z value.
  * @param {Number} [w] The w value.
  * @example
  * var v = new pc.Vec4(1, 2, 3, 4);
  */
@JSImport("playcanvas", "Vec4")
@js.native
class Vec4 ()
  extends typings.playcanvas.pcNs.Vec4 {
  def this(x: js.Array[Number]) = this()
  def this(x: Double) = this()
  def this(x: js.Array[Number], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.Array[Number], y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: js.Array[Number], y: Double, z: Double, w: Double) = this()
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
    * @type pc.Vec4
    * @name pc.Vec4.ONE
    * @description A constant vector set to [1, 1, 1, 1].
    */
  val ONE: typings.playcanvas.pcNs.Vec4 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Vec4
    * @name pc.Vec4.ZERO
    * @description A constant vector set to [0, 0, 0, 0].
    */
  val ZERO: typings.playcanvas.pcNs.Vec4 = js.native
}

