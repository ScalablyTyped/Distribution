package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictpropNameSilent
  extends /* key */ StringDictionary[js.Any] {
  var silent: js.UndefOr[Boolean] = js.undefined
}

object DictpropNameSilent {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): DictpropNameSilent = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameSilent]
  }
}

