package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchSizeNumber extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
}

object BatchSizeNumber {
  @scala.inline
  def apply(batchSize: js.UndefOr[Double] = js.undefined): BatchSizeNumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchSizeNumber]
  }
}

