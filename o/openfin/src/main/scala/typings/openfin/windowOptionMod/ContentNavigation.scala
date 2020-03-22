package typings.openfin.windowOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentNavigation extends js.Object {
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object ContentNavigation {
  @scala.inline
  def apply(blacklist: js.Array[String] = null, whitelist: js.Array[String] = null): ContentNavigation = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentNavigation]
  }
}

