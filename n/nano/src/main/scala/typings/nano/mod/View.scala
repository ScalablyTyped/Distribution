package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View[D] extends js.Object {
  var map: js.UndefOr[DocumentInfer[D]] = js.undefined
  var reduce: js.UndefOr[String | DocumentInfer[D]] = js.undefined
}

object View {
  @scala.inline
  def apply[D](map: /* doc */ D with Document => Unit = null, reduce: String | DocumentInfer[D] = null): View[D] = {
    val __obj = js.Dynamic.literal()
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (reduce != null) __obj.updateDynamic("reduce")(reduce.asInstanceOf[js.Any])
    __obj.asInstanceOf[View[D]]
  }
}

