package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A curve is a collection of keys (time/value pairs). The shape of the curve is defined by its
  * type that specifies an interpolation scheme for the keys.
  */
@JSGlobal("pc.Curve")
@js.native
/**
  * Creates a new Curve instance.
  *
  * @param {number[]} [data] - An array of keys (pairs of numbers with the time first and value
  * second).
  * @example
  * const curve = new pc.Curve([
  *     0, 0,        // At 0 time, value of 0
  *     0.33, 2,     // At 0.33 time, value of 2
  *     0.66, 2.6,   // At 0.66 time, value of 2.6
  *     1, 3         // At 1 time, value of 3
  * ]);
  */
open class Curve ()
  extends typings.playcanvas.mod.Curve {
  def this(data: js.Array[Double]) = this()
}
