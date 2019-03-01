package typings
package nextDashServerLib.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventChangeOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var shallow: js.UndefOr[scala.Boolean] = js.undefined
}

object EventChangeOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    shallow: js.UndefOr[scala.Boolean] = js.undefined
  ): EventChangeOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow)
    __obj.asInstanceOf[EventChangeOptions]
  }
}

