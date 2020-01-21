package typings.playcanvas.mod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Vec2
  * @classdesc A 2-dimensional vector.
  * @description Creates a new Vec2 object.
  * @param {Number|Number[]} [x] The x value. If x is an array of length 2, the array will be used to populate all components.
  * @param {Number} [y] The y value.
  * @example
  * var v = new pc.Vec2(1, 2);
  */
@JSImport("playcanvas", "Vec2")
@js.native
class Vec2 ()
  extends typings.playcanvas.pc.Vec2 {
  def this(x: js.Array[Number]) = this()
  def this(x: Double) = this()
  def this(x: js.Array[Number], y: Double) = this()
  def this(x: Double, y: Double) = this()
}

/* static members */
@JSImport("playcanvas", "Vec2")
@js.native
object Vec2 extends js.Object {
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Vec2
    * @name pc.Vec2.ONE
    * @description A constant vector set to [1, 1].
    */
  val ONE: typings.playcanvas.pc.Vec2 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Vec2
    * @name pc.Vec2.RIGHT
    * @description A constant vector set to [1, 0].
    */
  val RIGHT: typings.playcanvas.pc.Vec2 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Vec2
    * @name pc.Vec2.UP
    * @description A constant vector set to [0, 1].
    */
  val UP: typings.playcanvas.pc.Vec2 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Vec2
    * @name pc.Vec2.ZERO
    * @description A constant vector set to [0, 0].
    */
  val ZERO: typings.playcanvas.pc.Vec2 = js.native
}

