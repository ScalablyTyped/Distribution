package typings.nextReactDevOverlay.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayMiddlewareOptions extends js.Object {
  var rootDirectory: String = js.native
  def serverStats(): js.Any = js.native
  def stats(): js.Any = js.native
}

object OverlayMiddlewareOptions {
  @scala.inline
  def apply(rootDirectory: String, serverStats: () => js.Any, stats: () => js.Any): OverlayMiddlewareOptions = {
    val __obj = js.Dynamic.literal(rootDirectory = rootDirectory.asInstanceOf[js.Any], serverStats = js.Any.fromFunction0(serverStats), stats = js.Any.fromFunction0(stats))
    __obj.asInstanceOf[OverlayMiddlewareOptions]
  }
  @scala.inline
  implicit class OverlayMiddlewareOptionsOps[Self <: OverlayMiddlewareOptions] (val x: Self) extends AnyVal {
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
    def setRootDirectory(value: String): Self = this.set("rootDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerStats(value: () => js.Any): Self = this.set("serverStats", js.Any.fromFunction0(value))
    @scala.inline
    def setStats(value: () => js.Any): Self = this.set("stats", js.Any.fromFunction0(value))
  }
  
}

