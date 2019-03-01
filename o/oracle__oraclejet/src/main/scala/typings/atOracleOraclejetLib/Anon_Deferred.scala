package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deferred
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var deferred: js.UndefOr[scala.Boolean] = js.undefined
  var fetchSize: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Deferred {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    deferred: js.UndefOr[scala.Boolean] = js.undefined,
    fetchSize: scala.Int | scala.Double = null
  ): Anon_Deferred = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred)
    if (fetchSize != null) __obj.updateDynamic("fetchSize")(fetchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Deferred]
  }
}

