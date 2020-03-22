package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSilent
  extends /* propName */ StringDictionary[js.Any] {
  var deferred: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
}

object AnonSilent {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    deferred: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined
  ): AnonSilent = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSilent]
  }
}

