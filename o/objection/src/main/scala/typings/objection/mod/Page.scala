package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page[QM] extends js.Object {
  var results: js.Array[QM]
  var total: Double
}

object Page {
  @scala.inline
  def apply[QM](results: js.Array[QM], total: Double): Page[QM] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Page[QM]]
  }
}

