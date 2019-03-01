package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PropNameSilentAny
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_PropNameSilentAny {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_PropNameSilentAny = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[Anon_PropNameSilentAny]
  }
}

