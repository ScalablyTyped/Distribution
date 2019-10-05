package typings.playcanvas.playcanvasMod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.CurveSet
  * @classdesc A curve set is a collection of curves.
  * @description Creates a new curve set.
  * @param {Array<Number[]>} [curveKeys] An array of arrays of keys (pairs of numbers with
  * the time first and value second).
  */
@JSImport("playcanvas", "CurveSet")
@js.native
class CurveSet ()
  extends typings.playcanvas.pc.CurveSet {
  def this(curveKeys: js.Array[js.Array[Number]]) = this()
}

