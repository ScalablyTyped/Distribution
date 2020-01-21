package typings.nodeOsUtils.netstatMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeOsUtils.AnonInputMb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetStatMetrics extends /* key */ StringDictionary[AnonInputMb] {
  var total: AnonInputMb
}

object NetStatMetrics {
  @scala.inline
  def apply(total: AnonInputMb, StringDictionary: /* key */ StringDictionary[AnonInputMb] = null): NetStatMetrics = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NetStatMetrics]
  }
}

