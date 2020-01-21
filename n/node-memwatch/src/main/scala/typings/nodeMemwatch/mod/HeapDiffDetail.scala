package typings.nodeMemwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapDiffDetail extends js.Object {
  @JSName("+")
  var Plussign: Double
  @JSName("-")
  var _dash: Double
  var size: String
  var size_bytes: Double
  var what: String
}

object HeapDiffDetail {
  @scala.inline
  def apply(Plussign: Double, _dash: Double, size: String, size_bytes: Double, what: String): HeapDiffDetail = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], size_bytes = size_bytes.asInstanceOf[js.Any], what = what.asInstanceOf[js.Any])
    __obj.updateDynamic("+")(Plussign.asInstanceOf[js.Any])
    __obj.updateDynamic("-")(_dash.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapDiffDetail]
  }
}

