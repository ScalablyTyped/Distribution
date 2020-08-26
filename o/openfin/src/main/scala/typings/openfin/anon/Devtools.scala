package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Devtools extends js.Object {
  var devtools: Boolean = js.native
  var reload: Boolean = js.native
  var reloadIgnoringCache: Boolean = js.native
  var zoom: Boolean = js.native
}

object Devtools {
  @scala.inline
  def apply(devtools: Boolean, reload: Boolean, reloadIgnoringCache: Boolean, zoom: Boolean): Devtools = {
    val __obj = js.Dynamic.literal(devtools = devtools.asInstanceOf[js.Any], reload = reload.asInstanceOf[js.Any], reloadIgnoringCache = reloadIgnoringCache.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Devtools]
  }
  @scala.inline
  implicit class DevtoolsOps[Self <: Devtools] (val x: Self) extends AnyVal {
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
    def setDevtools(value: Boolean): Self = this.set("devtools", value.asInstanceOf[js.Any])
    @scala.inline
    def setReload(value: Boolean): Self = this.set("reload", value.asInstanceOf[js.Any])
    @scala.inline
    def setReloadIgnoringCache(value: Boolean): Self = this.set("reloadIgnoringCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: Boolean): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
  
}

