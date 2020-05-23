package typings.pino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Equivalent of SonicBoom constructor options object
  */
// TODO: use SonicBoom constructor options interface when available
trait DestinationObjectOptions extends js.Object {
  var dest: js.UndefOr[String] = js.undefined
  var fd: js.UndefOr[String | Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
}

object DestinationObjectOptions {
  @scala.inline
  def apply(
    dest: String = null,
    fd: String | Double = null,
    minLength: js.UndefOr[Double] = js.undefined,
    sync: js.UndefOr[Boolean] = js.undefined
  ): DestinationObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationObjectOptions]
  }
}

