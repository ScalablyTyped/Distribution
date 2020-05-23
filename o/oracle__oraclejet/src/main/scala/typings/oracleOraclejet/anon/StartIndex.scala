package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartIndex
  extends /* key */ StringDictionary[js.Any] {
  var silent: js.UndefOr[Boolean] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
}

object StartIndex {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    startIndex: js.UndefOr[Double] = js.undefined
  ): StartIndex = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartIndex]
  }
}

