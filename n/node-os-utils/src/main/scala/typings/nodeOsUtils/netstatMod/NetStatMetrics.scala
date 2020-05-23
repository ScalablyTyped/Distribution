package typings.nodeOsUtils.netstatMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeOsUtils.anon.InputMb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetStatMetrics extends /* key */ StringDictionary[InputMb] {
  var total: InputMb
}

object NetStatMetrics {
  @scala.inline
  def apply(total: InputMb, StringDictionary: /* key */ StringDictionary[InputMb] = null): NetStatMetrics = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NetStatMetrics]
  }
}

