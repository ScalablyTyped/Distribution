package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxStalenessSeconds extends js.Object {
  /**
    * Max Secondary Read Staleness in Seconds
    */
  var maxStalenessSeconds: js.UndefOr[Double] = js.undefined
}

object AnonMaxStalenessSeconds {
  @scala.inline
  def apply(maxStalenessSeconds: Int | Double = null): AnonMaxStalenessSeconds = {
    val __obj = js.Dynamic.literal()
    if (maxStalenessSeconds != null) __obj.updateDynamic("maxStalenessSeconds")(maxStalenessSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxStalenessSeconds]
  }
}

