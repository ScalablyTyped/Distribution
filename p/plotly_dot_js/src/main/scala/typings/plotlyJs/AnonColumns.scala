package typings.plotlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumns extends js.Object {
  var columns: Double
  var rows: Double
  var x: js.Array[Double]
  var y: js.Array[Double]
}

object AnonColumns {
  @scala.inline
  def apply(columns: Double, rows: Double, x: js.Array[Double], y: js.Array[Double]): AnonColumns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumns]
  }
}

