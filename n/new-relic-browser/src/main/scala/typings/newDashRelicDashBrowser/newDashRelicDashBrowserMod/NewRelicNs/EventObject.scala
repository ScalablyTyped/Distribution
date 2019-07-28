package typings.newDashRelicDashBrowser.newDashRelicDashBrowserMod.NewRelicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObject extends js.Object {
  /** End time in ms since epoch.  Defaults to same as start resulting in trace object with a duration of zero. */
  var end: js.UndefOr[Double] = js.undefined
  /** Event name */
  var name: String
  /** Origin of event */
  var origin: js.UndefOr[String] = js.undefined
  /** Start time in ms since epoch */
  var start: Double
  /** Event type */
  var `type`: js.UndefOr[String] = js.undefined
}

object EventObject {
  @scala.inline
  def apply(
    name: String,
    start: Double,
    end: Int | Double = null,
    origin: String = null,
    `type`: String = null
  ): EventObject = {
    val __obj = js.Dynamic.literal(name = name, start = start)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EventObject]
  }
}

