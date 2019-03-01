package typings
package nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextOptions extends js.Object {
  var nice: js.UndefOr[scala.Double] = js.undefined
  var ready: scala.Boolean
  var scopes: org.scalablytyped.runtime.StringDictionary[Scope]
  var serial: js.UndefOr[js.Any] = js.undefined
  var status: js.UndefOr[js.Any] = js.undefined
}

object ContextOptions {
  @scala.inline
  def apply(
    ready: scala.Boolean,
    scopes: org.scalablytyped.runtime.StringDictionary[Scope],
    nice: scala.Int | scala.Double = null,
    serial: js.Any = null,
    status: js.Any = null
  ): ContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ready")(ready)
    __obj.updateDynamic("scopes")(scopes)
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (serial != null) __obj.updateDynamic("serial")(serial)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ContextOptions]
  }
}

