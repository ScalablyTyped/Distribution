package typings.playcanvas.playcanvasMod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Quat
  * @classdesc A quaternion.
  * @description Create a new Quat object.
  * @param {Number|Number[]} [x] The quaternion's x component. Default value 0. If x is an array of length 4, the array will be used to populate all components.
  * @param {Number} [y] The quaternion's y component. Default value 0.
  * @param {Number} [z] The quaternion's z component. Default value 0.
  * @param {Number} [w] The quaternion's w component. Default value 1.
  */
@JSImport("playcanvas", "Quat")
@js.native
class Quat ()
  extends typings.playcanvas.pc.Quat {
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
@JSImport("playcanvas", "Quat")
@js.native
object Quat extends js.Object {
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Quat
    * @name pc.Quat.IDENTITY
    * @description A constant quaternion set to [0, 0, 0, 1] (the identity).
    */
  val IDENTITY: typings.playcanvas.pc.Quat = js.native
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Quat
    * @name pc.Quat.ZERO
    * @description A constant quaternion set to [0, 0, 0, 0].
    */
  val ZERO: typings.playcanvas.pc.Quat = js.native
}

