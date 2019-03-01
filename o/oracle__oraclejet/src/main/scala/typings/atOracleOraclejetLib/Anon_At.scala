package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_At
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var at: js.UndefOr[scala.Double] = js.undefined
  var deferred: js.UndefOr[scala.Boolean] = js.undefined
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var merge: js.UndefOr[scala.Boolean] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var sort: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_At {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    at: scala.Int | scala.Double = null,
    deferred: js.UndefOr[scala.Boolean] = js.undefined,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    merge: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_At = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[Anon_At]
  }
}

