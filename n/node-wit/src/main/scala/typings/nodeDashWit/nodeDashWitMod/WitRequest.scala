package typings.nodeDashWit.nodeDashWitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WitRequest extends js.Object {
  var context: js.UndefOr[WitContext] = js.undefined
  var entities: js.UndefOr[js.Array[WitEntity]] = js.undefined
  var sessionId: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object WitRequest {
  @scala.inline
  def apply(
    context: WitContext = null,
    entities: js.Array[WitEntity] = null,
    sessionId: String = null,
    text: String = null
  ): WitRequest = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WitRequest]
  }
}

