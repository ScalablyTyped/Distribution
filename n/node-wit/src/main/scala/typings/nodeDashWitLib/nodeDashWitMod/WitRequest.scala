package typings
package nodeDashWitLib.nodeDashWitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WitRequest extends js.Object {
  var context: js.UndefOr[WitContext] = js.undefined
  var entities: js.UndefOr[js.Array[WitEntity]] = js.undefined
  var sessionId: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object WitRequest {
  @scala.inline
  def apply(
    context: WitContext = null,
    entities: js.Array[WitEntity] = null,
    sessionId: java.lang.String = null,
    text: java.lang.String = null
  ): WitRequest = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (entities != null) __obj.updateDynamic("entities")(entities)
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[WitRequest]
  }
}

