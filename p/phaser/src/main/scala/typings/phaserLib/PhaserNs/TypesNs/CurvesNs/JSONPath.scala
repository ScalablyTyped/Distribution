package typings
package phaserLib.PhaserNs.TypesNs.CurvesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONPath extends js.Object {
  /**
    * The path is auto closed.
    */
  var autoClose: scala.Boolean
  /**
    * The list of the curves
    */
  var curves: js.Array[JSONCurve]
  /**
    * The of the curve.
    */
  var `type`: java.lang.String
  /**
    * The X coordinate of the curve's starting point.
    */
  var x: scala.Double
  /**
    * The Y coordinate of the path's starting point.
    */
  var y: scala.Double
}

object JSONPath {
  @scala.inline
  def apply(
    autoClose: scala.Boolean,
    curves: js.Array[JSONCurve],
    `type`: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): JSONPath = {
    val __obj = js.Dynamic.literal(autoClose = autoClose, curves = curves, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSONPath]
  }
}

