package typings.ncom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteOptions extends js.Object {
  var batch: js.UndefOr[Boolean] = js.undefined
  var filters: js.UndefOr[js.Array[FilterFunction]] = js.undefined
}

object WriteOptions {
  @scala.inline
  def apply(batch: js.UndefOr[Boolean] = js.undefined, filters: js.Array[FilterFunction] = null): WriteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteOptions]
  }
}

