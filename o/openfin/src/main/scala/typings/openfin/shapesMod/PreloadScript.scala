package typings.openfin.shapesMod

import typings.openfin.openfinStrings.`load-failed`
import typings.openfin.openfinStrings.`load-started`
import typings.openfin.openfinStrings.`load-succeeded`
import typings.openfin.openfinStrings.failed
import typings.openfin.openfinStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreloadScript extends js.Object {
  var mandatory: js.UndefOr[Boolean] = js.undefined
  var state: js.UndefOr[`load-started` | `load-failed` | `load-succeeded` | failed | succeeded] = js.undefined
  var url: String
}

object PreloadScript {
  @scala.inline
  def apply(
    url: String,
    mandatory: js.UndefOr[Boolean] = js.undefined,
    state: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded = null
  ): PreloadScript = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadScript]
  }
}

