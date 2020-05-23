package typings.pgQueryStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(batchSize: js.UndefOr[Double] = js.undefined, highWaterMark: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

