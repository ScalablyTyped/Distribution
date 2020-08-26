package typings.naja.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryHandler extends js.Object {
  var uiCache: Boolean = js.native
}

object HistoryHandler {
  @scala.inline
  def apply(uiCache: Boolean): HistoryHandler = {
    val __obj = js.Dynamic.literal(uiCache = uiCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryHandler]
  }
  @scala.inline
  implicit class HistoryHandlerOps[Self <: HistoryHandler] (val x: Self) extends AnyVal {
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
    def setUiCache(value: Boolean): Self = this.set("uiCache", value.asInstanceOf[js.Any])
  }
  
}

