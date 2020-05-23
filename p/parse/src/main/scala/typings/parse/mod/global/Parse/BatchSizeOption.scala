package typings.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchSizeOption extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
}

object BatchSizeOption {
  @scala.inline
  def apply(batchSize: js.UndefOr[Double] = js.undefined): BatchSizeOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchSizeOption]
  }
}

