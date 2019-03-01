package typings
package mixpanelDashBrowserLib.mixpanelDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasOptedInOutOptions extends js.Object {
  var cookie_prefix: java.lang.String
  var persistence_type: Persistence
}

object HasOptedInOutOptions {
  @scala.inline
  def apply(cookie_prefix: java.lang.String, persistence_type: Persistence): HasOptedInOutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cookie_prefix")(cookie_prefix)
    __obj.updateDynamic("persistence_type")(persistence_type)
    __obj.asInstanceOf[HasOptedInOutOptions]
  }
}

