package typings
package pgDashQueryDashStreamLib.pgDashQueryDashStreamMod.QueryStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(batchSize: scala.Int | scala.Double = null, highWaterMark: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

