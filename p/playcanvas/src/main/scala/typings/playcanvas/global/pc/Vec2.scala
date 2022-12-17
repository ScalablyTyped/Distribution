package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 2-dimensional vector.
  */
@JSGlobal("pc.Vec2")
@js.native
/**
  * Create a new Vec2 instance.
  *
  * @param {number|number[]} [x] - The x value. Defaults to 0. If x is an array of length 2, the
  * array will be used to populate all components.
  * @param {number} [y] - The y value. Defaults to 0.
  * @example
  * var v = new pc.Vec2(1, 2);
  */
open class Vec2 ()
  extends typings.playcanvas.mod.Vec2 {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
}
object Vec2 {
  
  @JSGlobal("pc.Vec2")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A constant vector set to [0, -1].
    *
    * @type {Vec2}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec2.DOWN")
  @js.native
  val DOWN: typings.playcanvas.mod.Vec2 = js.native
  
  /**
    * A constant vector set to [-1, 0].
    *
    * @type {Vec2}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec2.LEFT")
  @js.native
  val LEFT: typings.playcanvas.mod.Vec2 = js.native
  
  /**
    * A constant vector set to [1, 1].
    *
    * @type {Vec2}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec2.ONE")
  @js.native
  val ONE: typings.playcanvas.mod.Vec2 = js.native
  
  /**
    * A constant vector set to [1, 0].
    *
    * @type {Vec2}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec2.RIGHT")
  @js.native
  val RIGHT: typings.playcanvas.mod.Vec2 = js.native
  
  /**
    * A constant vector set to [0, 1].
    *
    * @type {Vec2}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec2.UP")
  @js.native
  val UP: typings.playcanvas.mod.Vec2 = js.native
  
  /**
    * A constant vector set to [0, 0].
    *
    * @type {Vec2}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec2.ZERO")
  @js.native
  val ZERO: typings.playcanvas.mod.Vec2 = js.native
  
  /**
    * Calculates the angle between two Vec2's in radians.
    *
    * @param {Vec2} lhs - The first vector operand for the calculation.
    * @param {Vec2} rhs - The second vector operand for the calculation.
    * @returns {number} The calculated angle in radians.
    * @ignore
    */
  /* static member */
  inline def angleRad(lhs: typings.playcanvas.mod.Vec2, rhs: typings.playcanvas.mod.Vec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleRad")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any])).asInstanceOf[Double]
}
