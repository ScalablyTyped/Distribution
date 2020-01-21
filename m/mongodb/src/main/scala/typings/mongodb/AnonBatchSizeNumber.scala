package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBatchSizeNumber extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
}

object AnonBatchSizeNumber {
  @scala.inline
  def apply(batchSize: Int | Double = null): AnonBatchSizeNumber = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBatchSizeNumber]
  }
}

