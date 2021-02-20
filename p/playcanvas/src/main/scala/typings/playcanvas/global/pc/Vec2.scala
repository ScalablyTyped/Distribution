package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new Vec2 object.
  * @example
  * var v = new pc.Vec2(1, 2);
  * @param [x] - The x value. If x is an array of length 2, the array will be used to populate all components.
  * @param [y] - The y value.
  */
@JSGlobal("pc.Vec2")
@js.native
class Vec2 ()
  extends typings.playcanvas.pc.Vec2 {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
}
object Vec2 {
  
  /**
    * A constant vector set to [0, -1].
    */
  /* static member */
  @JSGlobal("pc.Vec2.DOWN")
  @js.native
  val DOWN: typings.playcanvas.pc.Vec2 = js.native
  
  /**
    * A constant vector set to [-1, 0].
    */
  /* static member */
  @JSGlobal("pc.Vec2.LEFT")
  @js.native
  val LEFT: typings.playcanvas.pc.Vec2 = js.native
  
  /**
    * A constant vector set to [1, 1].
    */
  /* static member */
  @JSGlobal("pc.Vec2.ONE")
  @js.native
  val ONE: typings.playcanvas.pc.Vec2 = js.native
  
  /**
    * A constant vector set to [1, 0].
    */
  /* static member */
  @JSGlobal("pc.Vec2.RIGHT")
  @js.native
  val RIGHT: typings.playcanvas.pc.Vec2 = js.native
  
  /**
    * A constant vector set to [0, 1].
    */
  /* static member */
  @JSGlobal("pc.Vec2.UP")
  @js.native
  val UP: typings.playcanvas.pc.Vec2 = js.native
  
  /**
    * A constant vector set to [0, 0].
    */
  /* static member */
  @JSGlobal("pc.Vec2.ZERO")
  @js.native
  val ZERO: typings.playcanvas.pc.Vec2 = js.native
}
