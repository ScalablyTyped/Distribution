package typings.nodeDashWit.nodeDashWitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WitContext extends js.Object {
  var entities: js.UndefOr[js.Array[WitEntity]] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var reference_time: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[js.Array[String]] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
}

object WitContext {
  @scala.inline
  def apply(
    entities: js.Array[WitEntity] = null,
    location: String = null,
    reference_time: String = null,
    state: js.Array[String] = null,
    timezone: String = null
  ): WitContext = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities)
    if (location != null) __obj.updateDynamic("location")(location)
    if (reference_time != null) __obj.updateDynamic("reference_time")(reference_time)
    if (state != null) __obj.updateDynamic("state")(state)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    __obj.asInstanceOf[WitContext]
  }
}

