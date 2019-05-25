package typings
package olLib.structsLinkedListMod

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
    val __obj = js.Dynamic.literal(data = data)
    if (next != null) __obj.updateDynamic("next")(next)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[Item]
  }
}

