package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A curve set is a collection of curves.
  */
@JSGlobal("pc.CurveSet")
@js.native
open class CurveSet protected ()
  extends typings.playcanvas.mod.CurveSet {
  /**
    * Creates a new CurveSet instance.
    *
    * @param {Array<number[]>} curveKeys - An array of arrays of keys (pairs of numbers with the
    * time first and value second).
    * @example
    * const curveSet = new pc.CurveSet([
    *     [
    *         0, 0,        // At 0 time, value of 0
    *         0.33, 2,     // At 0.33 time, value of 2
    *         0.66, 2.6,   // At 0.66 time, value of 2.6
    *         1, 3         // At 1 time, value of 3
    *     ],
    *     [
    *         0, 34,
    *         0.33, 35,
    *         0.66, 36,
    *         1, 37
    *     ]
    * ]);
    */
  def this(args: Any*) = this()
}
