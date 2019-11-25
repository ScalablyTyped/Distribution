package typings.nextgenDashEvents.nextgenDashEventsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextOptions extends js.Object {
  var nice: js.UndefOr[Double] = js.undefined
  var ready: Boolean
  var scopes: StringDictionary[Scope]
  var serial: js.UndefOr[js.Any] = js.undefined
  var status: js.UndefOr[js.Any] = js.undefined
}

object ContextOptions {
  @scala.inline
  def apply(
    ready: Boolean,
    scopes: StringDictionary[Scope],
    nice: Int | Double = null,
    serial: js.Any = null,
    status: js.Any = null
  ): ContextOptions = {
    val __obj = js.Dynamic.literal(ready = ready.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (serial != null) __obj.updateDynamic("serial")(serial.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextOptions]
  }
}

