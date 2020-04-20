package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var column: Double
  var row: Double
  var x: js.Array[Double]
  var y: js.Array[Double]
}

object Domain {
  @scala.inline
  def apply(column: Double, row: Double, x: js.Array[Double], y: js.Array[Double]): Domain = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
}

