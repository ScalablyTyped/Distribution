package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddDeferred
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var add: js.UndefOr[scala.Boolean] = js.undefined
  var deferred: js.UndefOr[scala.Boolean] = js.undefined
  var merge: js.UndefOr[scala.Boolean] = js.undefined
  var remove: js.UndefOr[scala.Boolean] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AddDeferred {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    add: js.UndefOr[scala.Boolean] = js.undefined,
    deferred: js.UndefOr[scala.Boolean] = js.undefined,
    merge: js.UndefOr[scala.Boolean] = js.undefined,
    remove: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AddDeferred = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add)
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred)
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[Anon_AddDeferred]
  }
}

