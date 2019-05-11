package typings
package phaserLib.PhaserNs.TypesNs.CurvesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONCurve extends js.Object {
  /**
    * The arrays of points like `[x1, y1, x2, y2]`
    */
  var points: js.Array[scala.Double]
  /**
    * The of the curve
    */
  var `type`: java.lang.String
}

object JSONCurve {
  @scala.inline
  def apply(points: js.Array[scala.Double], `type`: java.lang.String): JSONCurve = {
    val __obj = js.Dynamic.literal(points = points)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSONCurve]
  }
}

