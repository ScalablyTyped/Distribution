package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new Quat object.
  * @param [x] - The quaternion's x component. Default value 0. If x is an array of length 4, the array will be used to populate all components.
  * @param [y] - The quaternion's y component. Default value 0.
  * @param [z] - The quaternion's z component. Default value 0.
  * @param [w] - The quaternion's w component. Default value 1.
  */
@JSGlobal("pc.Quat")
@js.native
class Quat ()
  extends typings.playcanvas.pc.Quat {
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
@JSGlobal("pc.Quat")
@js.native
object Quat extends js.Object {
  /**
    * A constant quaternion set to [0, 0, 0, 1] (the identity).
    */
  val IDENTITY: typings.playcanvas.pc.Quat = js.native
  /**
    * A constant quaternion set to [0, 0, 0, 0].
    */
  val ZERO: typings.playcanvas.pc.Quat = js.native
}

