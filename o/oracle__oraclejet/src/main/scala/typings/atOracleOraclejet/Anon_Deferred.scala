package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deferred
  extends /* propName */ StringDictionary[js.Any] {
  var deferred: js.UndefOr[Boolean] = js.undefined
  var fetchSize: js.UndefOr[Double] = js.undefined
}

object Anon_Deferred {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    deferred: js.UndefOr[Boolean] = js.undefined,
    fetchSize: Int | Double = null
  ): Anon_Deferred = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred)
    if (fetchSize != null) __obj.updateDynamic("fetchSize")(fetchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Deferred]
  }
}

