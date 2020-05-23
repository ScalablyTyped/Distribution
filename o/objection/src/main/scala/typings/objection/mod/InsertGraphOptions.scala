package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertGraphOptions extends js.Object {
  var allowRefs: js.UndefOr[Boolean] = js.undefined
  var relate: js.UndefOr[Boolean | js.Array[String]] = js.undefined
}

object InsertGraphOptions {
  @scala.inline
  def apply(allowRefs: js.UndefOr[Boolean] = js.undefined, relate: Boolean | js.Array[String] = null): InsertGraphOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowRefs)) __obj.updateDynamic("allowRefs")(allowRefs.get.asInstanceOf[js.Any])
    if (relate != null) __obj.updateDynamic("relate")(relate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertGraphOptions]
  }
}

