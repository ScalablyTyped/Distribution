package typings.phaser.PhaserNs.TypesNs.CurvesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONPath extends js.Object {
  /**
    * The path is auto closed.
    */
  var autoClose: Boolean
  /**
    * The list of the curves
    */
  var curves: js.Array[JSONCurve]
  /**
    * The of the curve.
    */
  var `type`: String
  /**
    * The X coordinate of the curve's starting point.
    */
  var x: Double
  /**
    * The Y coordinate of the path's starting point.
    */
  var y: Double
}

object JSONPath {
  @scala.inline
  def apply(autoClose: Boolean, curves: js.Array[JSONCurve], `type`: String, x: Double, y: Double): JSONPath = {
    val __obj = js.Dynamic.literal(autoClose = autoClose, curves = curves, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSONPath]
  }
}

