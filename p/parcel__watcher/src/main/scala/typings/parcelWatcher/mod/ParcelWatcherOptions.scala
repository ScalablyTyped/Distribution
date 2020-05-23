package typings.parcelWatcher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParcelWatcherOptions extends js.Object {
  var backend: js.UndefOr[ParcelWatcherBackend] = js.undefined
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
}

object ParcelWatcherOptions {
  @scala.inline
  def apply(backend: ParcelWatcherBackend = null, ignore: js.Array[String] = null): ParcelWatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (backend != null) __obj.updateDynamic("backend")(backend.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParcelWatcherOptions]
  }
}

