package typings.nodeDashWit.nodeDashWitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WitResponse extends js.Object {
  var quickReplies: js.UndefOr[js.Any] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object WitResponse {
  @scala.inline
  def apply(quickReplies: js.Any = null, text: String = null): WitResponse = {
    val __obj = js.Dynamic.literal()
    if (quickReplies != null) __obj.updateDynamic("quickReplies")(quickReplies.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WitResponse]
  }
}

