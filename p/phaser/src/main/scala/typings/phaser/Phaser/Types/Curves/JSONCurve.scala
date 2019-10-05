package typings.phaser.Phaser.Types.Curves

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONCurve extends js.Object {
  /**
    * The arrays of points like `[x1, y1, x2, y2]`
    */
  var points: js.Array[Double]
  /**
    * The of the curve
    */
  var `type`: String
}

object JSONCurve {
  @scala.inline
  def apply(points: js.Array[Double], `type`: String): JSONCurve = {
    val __obj = js.Dynamic.literal(points = points)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSONCurve]
  }
}

