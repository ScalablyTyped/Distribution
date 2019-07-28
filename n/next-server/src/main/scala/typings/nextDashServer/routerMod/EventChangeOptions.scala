package typings.nextDashServer.routerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventChangeOptions
  extends /* key */ StringDictionary[js.Any] {
  var shallow: js.UndefOr[Boolean] = js.undefined
}

object EventChangeOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    shallow: js.UndefOr[Boolean] = js.undefined
  ): EventChangeOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow)
    __obj.asInstanceOf[EventChangeOptions]
  }
}

