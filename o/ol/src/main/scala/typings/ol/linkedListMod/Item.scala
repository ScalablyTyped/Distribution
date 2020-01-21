package typings.ol.linkedListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var data: js.Any
  var next: js.UndefOr[Item] = js.undefined
  var prev: js.UndefOr[Item] = js.undefined
}

object Item {
  @scala.inline
  def apply(data: js.Any, next: Item = null, prev: Item = null): Item = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

