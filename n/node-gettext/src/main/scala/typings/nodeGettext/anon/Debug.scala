package typings.nodeGettext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Debug extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var sourceLocale: js.UndefOr[String] = js.undefined
}

object Debug {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined, sourceLocale: String = null): Debug = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (sourceLocale != null) __obj.updateDynamic("sourceLocale")(sourceLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Debug]
  }
}

