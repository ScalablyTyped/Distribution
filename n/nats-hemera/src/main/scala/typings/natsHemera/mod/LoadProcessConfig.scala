package typings.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadProcessConfig extends js.Object {
  var sampleInterval: js.UndefOr[Double] = js.undefined
}

object LoadProcessConfig {
  @scala.inline
  def apply(sampleInterval: js.UndefOr[Double] = js.undefined): LoadProcessConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sampleInterval)) __obj.updateDynamic("sampleInterval")(sampleInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadProcessConfig]
  }
}

