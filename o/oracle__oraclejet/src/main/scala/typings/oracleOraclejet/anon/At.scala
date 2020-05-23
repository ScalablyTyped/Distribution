package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait At
  extends /* key */ StringDictionary[js.Any] {
  var at: js.UndefOr[Double] = js.undefined
  var deferred: js.UndefOr[Boolean] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var merge: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
}

object At {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    at: js.UndefOr[Double] = js.undefined,
    deferred: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    merge: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    sort: js.UndefOr[Boolean] = js.undefined
  ): At = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(at)) __obj.updateDynamic("at")(at.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred.get.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[At]
  }
}

