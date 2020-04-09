package typings.nodeGettext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDebug extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var sourceLocale: js.UndefOr[String] = js.undefined
}

object AnonDebug {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined, sourceLocale: String = null): AnonDebug = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (sourceLocale != null) __obj.updateDynamic("sourceLocale")(sourceLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDebug]
  }
}

