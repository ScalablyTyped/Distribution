package typings.parse.parseMod._Global_.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchSizeOption extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
}

object BatchSizeOption {
  @scala.inline
  def apply(batchSize: Int | Double = null): BatchSizeOption = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchSizeOption]
  }
}

