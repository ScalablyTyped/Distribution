package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with typings.playcanvas.pc.Quat {
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
    */
  /* static member */
  @JSGlobal("pc.Quat.IDENTITY")
  @js.native
  val IDENTITY: typings.playcanvas.pc.Quat = js.native
  
  /**
    * A constant quaternion set to [0, 0, 0, 0].
    */
  /* static member */
  @JSGlobal("pc.Quat.ZERO")
  @js.native
  val ZERO: typings.playcanvas.pc.Quat = js.native
}
