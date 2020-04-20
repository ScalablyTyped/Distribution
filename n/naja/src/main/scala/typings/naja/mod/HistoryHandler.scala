package typings.naja.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryHandler extends js.Object {
  var uiCache: Boolean
}

object HistoryHandler {
  @scala.inline
  def apply(uiCache: Boolean): HistoryHandler = {
    val __obj = js.Dynamic.literal(uiCache = uiCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryHandler]
  }
}

