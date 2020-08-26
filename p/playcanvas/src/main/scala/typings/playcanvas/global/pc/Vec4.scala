package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new Vec4 object.
  * @example
  * var v = new pc.Vec4(1, 2, 3, 4);
  * @param [x] - The x value. If x is an array of length 4, the array will be used to populate all components.
  * @param [y] - The y value.
  * @param [z] - The z value.
  * @param [w] - The w value.
  */
@JSGlobal("pc.Vec4")
@js.native
class Vec4 ()
  extends typings.playcanvas.pc.Vec4 {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
  def this(x: js.Array[Double], y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    z: js.UndefOr[scala.Nothing],
    w: Double
  ) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double, w: Double) = this()
  def this(x: js.Array[Double], y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: js.Array[Double], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
  def this(x: js.Array[Double], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
}

/* static members */
@JSGlobal("pc.Vec4")
@js.native
object Vec4 extends js.Object {
  /**
    * A constant vector set to [1, 1, 1, 1].
    */
  val ONE: typings.playcanvas.pc.Vec4 = js.native
  /**
    * A constant vector set to [0, 0, 0, 0].
    */
  val ZERO: typings.playcanvas.pc.Vec4 = js.native
}

