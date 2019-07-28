package typings.pgDashQueryDashStream.pgDashQueryDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(batchSize: Int | Double = null, highWaterMark: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

