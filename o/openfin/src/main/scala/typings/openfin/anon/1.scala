package typings.openfin.anon

import typings.openfin.downloadPreloadMod.DownloadPreloadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var newVal: js.UndefOr[js.Array[DownloadPreloadOption]] = js.undefined
  var oldVal: js.UndefOr[js.Array[DownloadPreloadOption]] = js.undefined
}

object `1` {
  @scala.inline
  def apply(newVal: js.Array[DownloadPreloadOption] = null, oldVal: js.Array[DownloadPreloadOption] = null): `1` = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

