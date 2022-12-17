package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 4-dimensional vector.
  */
@JSGlobal("pc.Vec4")
@js.native
/**
  * Creates a new Vec4 object.
  *
  * @param {number|number[]} [x] - The x value. Defaults to 0. If x is an array of length 4, the
  * array will be used to populate all components.
  * @param {number} [y] - The y value. Defaults to 0.
  * @param {number} [z] - The z value. Defaults to 0.
  * @param {number} [w] - The w value. Defaults to 0.
  * @example
  * var v = new pc.Vec4(1, 2, 3, 4);
  */
open class Vec4 ()
  extends typings.playcanvas.mod.Vec4 {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double) = this()
  def this(x: js.Array[Double], y: Unit, z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double, w: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Unit, w: Double) = this()
  def this(x: js.Array[Double], y: Unit, z: Double, w: Double) = this()
  def this(x: js.Array[Double], y: Unit, z: Unit, w: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Unit, w: Double) = this()
  def this(x: Double, y: Unit, z: Double, w: Double) = this()
  def this(x: Double, y: Unit, z: Unit, w: Double) = this()
  def this(x: Unit, y: Double, z: Double, w: Double) = this()
  def this(x: Unit, y: Double, z: Unit, w: Double) = this()
  def this(x: Unit, y: Unit, z: Double, w: Double) = this()
  def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
}
object Vec4 {
  
  /**
    * A constant vector set to [1, 1, 1, 1].
    *
    * @type {Vec4}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec4.ONE")
  @js.native
  val ONE: typings.playcanvas.mod.Vec4 = js.native
  
  /**
    * A constant vector set to [0, 0, 0, 0].
    *
    * @type {Vec4}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec4.ZERO")
  @js.native
  val ZERO: typings.playcanvas.mod.Vec4 = js.native
}
