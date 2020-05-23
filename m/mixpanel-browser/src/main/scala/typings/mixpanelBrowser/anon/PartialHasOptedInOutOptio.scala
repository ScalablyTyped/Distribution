package typings.mixpanelBrowser.anon

import typings.mixpanelBrowser.mod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mixpanel-browser.mixpanel-browser.HasOptedInOutOptions> */
trait PartialHasOptedInOutOptio extends js.Object {
  var cookie_prefix: js.UndefOr[String] = js.undefined
  var persistence_type: js.UndefOr[Persistence] = js.undefined
}

object PartialHasOptedInOutOptio {
  @scala.inline
  def apply(cookie_prefix: String = null, persistence_type: Persistence = null): PartialHasOptedInOutOptio = {
    val __obj = js.Dynamic.literal()
    if (cookie_prefix != null) __obj.updateDynamic("cookie_prefix")(cookie_prefix.asInstanceOf[js.Any])
    if (persistence_type != null) __obj.updateDynamic("persistence_type")(persistence_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialHasOptedInOutOptio]
  }
}

