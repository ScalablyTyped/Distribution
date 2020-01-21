package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPropNameSilentAny
  extends /* propName */ StringDictionary[js.Any] {
  var silent: js.UndefOr[Boolean] = js.undefined
}

object AnonPropNameSilentAny {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): AnonPropNameSilentAny = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPropNameSilentAny]
  }
}

