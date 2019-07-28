package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PropNameSilentAny
  extends /* propName */ StringDictionary[js.Any] {
  var silent: js.UndefOr[Boolean] = js.undefined
}

object Anon_PropNameSilentAny {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): Anon_PropNameSilentAny = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[Anon_PropNameSilentAny]
  }
}

