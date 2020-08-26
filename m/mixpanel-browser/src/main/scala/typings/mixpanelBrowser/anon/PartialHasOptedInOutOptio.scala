package typings.mixpanelBrowser.anon

import typings.mixpanelBrowser.mod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mixpanel-browser.mixpanel-browser.HasOptedInOutOptions> */
@js.native
trait PartialHasOptedInOutOptio extends js.Object {
  var cookie_prefix: js.UndefOr[String] = js.native
  var persistence_type: js.UndefOr[Persistence] = js.native
}

object PartialHasOptedInOutOptio {
  @scala.inline
  def apply(): PartialHasOptedInOutOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHasOptedInOutOptio]
  }
  @scala.inline
  implicit class PartialHasOptedInOutOptioOps[Self <: PartialHasOptedInOutOptio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCookie_prefix(value: String): Self = this.set("cookie_prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie_prefix: Self = this.set("cookie_prefix", js.undefined)
    @scala.inline
    def setPersistence_type(value: Persistence): Self = this.set("persistence_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistence_type: Self = this.set("persistence_type", js.undefined)
  }
  
}

