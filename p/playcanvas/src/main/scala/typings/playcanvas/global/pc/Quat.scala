package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A quaternion.
  */
@JSGlobal("pc.Quat")
@js.native
/**
  * Create a new Quat instance.
  *
  * @param {number|number[]} [x] - The quaternion's x component. Defaults to 0. If x is an array
  * of length 4, the array will be used to populate all components.
  * @param {number} [y] - The quaternion's y component. Defaults to 0.
  * @param {number} [z] - The quaternion's z component. Defaults to 0.
  * @param {number} [w] - The quaternion's w component. Defaults to 1.
  */
open class Quat ()
  extends typings.playcanvas.mod.Quat {
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
object Quat {
  
  /**
    * A constant quaternion set to [0, 0, 0, 1] (the identity).
    *
    * @type {Quat}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Quat.IDENTITY")
  @js.native
  val IDENTITY: typings.playcanvas.mod.Quat = js.native
  
  /**
    * A constant quaternion set to [0, 0, 0, 0].
    *
    * @type {Quat}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Quat.ZERO")
  @js.native
  val ZERO: typings.playcanvas.mod.Quat = js.native
}
