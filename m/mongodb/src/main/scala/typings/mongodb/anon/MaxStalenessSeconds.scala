package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxStalenessSeconds extends js.Object {
  /**
    * Max Secondary Read Staleness in Seconds
    */
  var maxStalenessSeconds: js.UndefOr[Double] = js.undefined
}

object MaxStalenessSeconds {
  @scala.inline
  def apply(maxStalenessSeconds: js.UndefOr[Double] = js.undefined): MaxStalenessSeconds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxStalenessSeconds)) __obj.updateDynamic("maxStalenessSeconds")(maxStalenessSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxStalenessSeconds]
  }
}

