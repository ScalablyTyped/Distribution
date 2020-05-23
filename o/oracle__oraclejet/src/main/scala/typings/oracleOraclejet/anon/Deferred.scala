package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deferred
  extends /* key */ StringDictionary[js.Any] {
  var deferred: js.UndefOr[Boolean] = js.undefined
  var fetchSize: js.UndefOr[Double] = js.undefined
}

object Deferred {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    deferred: js.UndefOr[Boolean] = js.undefined,
    fetchSize: js.UndefOr[Double] = js.undefined
  ): Deferred = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchSize)) __obj.updateDynamic("fetchSize")(fetchSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deferred]
  }
}

