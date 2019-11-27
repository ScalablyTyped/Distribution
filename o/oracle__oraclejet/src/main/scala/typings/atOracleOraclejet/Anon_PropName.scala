package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PropName
  extends /* propName */ StringDictionary[js.Any] {
  var silent: js.UndefOr[Boolean] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
}

object Anon_PropName {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    startIndex: Int | Double = null
  ): Anon_PropName = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PropName]
  }
}

