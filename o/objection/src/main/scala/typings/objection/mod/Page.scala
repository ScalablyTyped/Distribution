package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page[M /* <: Model */] extends js.Object {
  var results: js.Array[M]
  var total: Double
}

object Page {
  @scala.inline
  def apply[M /* <: Model */](results: js.Array[M], total: Double): Page[M] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page[M]]
  }
}

