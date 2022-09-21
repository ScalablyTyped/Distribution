package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 3-dimensional vector.
  */
@JSGlobal("pc.Vec3")
@js.native
/**
  * Creates a new Vec3 object.
  *
  * @param {number|number[]} [x] - The x value. Defaults to 0. If x is an array of length 3, the
  * array will be used to populate all components.
  * @param {number} [y] - The y value. Defaults to 0.
  * @param {number} [z] - The z value. Defaults to 0.
  * @example
  * var v = new pc.Vec3(1, 2, 3);
  */
open class Vec3 ()
  extends typings.playcanvas.mod.Vec3 {
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
}
object Vec3 {
  
  /**
    * A constant vector set to [0, 0, 1].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec3.BACK")
  @js.native
  val BACK: typings.playcanvas.mod.Vec3 = js.native
  
  /**
    * A constant vector set to [0, -1, 0].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec3.DOWN")
  @js.native
  val DOWN: typings.playcanvas.mod.Vec3 = js.native
  
  /**
    * A constant vector set to [0, 0, -1].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec3.FORWARD")
  @js.native
  val FORWARD: typings.playcanvas.mod.Vec3 = js.native
  
  /**
    * A constant vector set to [-1, 0, 0].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec3.LEFT")
  @js.native
  val LEFT: typings.playcanvas.mod.Vec3 = js.native
  
  /**
    * A constant vector set to [1, 1, 1].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec3.ONE")
  @js.native
  val ONE: typings.playcanvas.mod.Vec3 = js.native
  
  /**
    * A constant vector set to [1, 0, 0].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec3.RIGHT")
  @js.native
  val RIGHT: typings.playcanvas.mod.Vec3 = js.native
  
  /**
    * A constant vector set to [0, 1, 0].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec3.UP")
  @js.native
  val UP: typings.playcanvas.mod.Vec3 = js.native
  
  /**
    * A constant vector set to [0, 0, 0].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Vec3.ZERO")
  @js.native
  val ZERO: typings.playcanvas.mod.Vec3 = js.native
}
