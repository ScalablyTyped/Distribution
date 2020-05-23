package typings.parse.mod.global.Parse.Query

import org.scalablytyped.runtime.StringDictionary
import typings.parse.anon.Dictkey
import typings.parse.parseNumbers.`-1`
import typings.parse.parseNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// According to http://docs.parseplatform.org/rest/guide/#aggregate-queries
trait AggregationOptions extends js.Object {
  var group: js.UndefOr[Dictkey] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var `match`: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var project: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  // Sort documentation https://docs.mongodb.com/v3.2/reference/operator/aggregation/sort/#pipe._S_sort
  var sort: js.UndefOr[StringDictionary[`1` | `-1`]] = js.undefined
}

object AggregationOptions {
  @scala.inline
  def apply(
    group: Dictkey = null,
    limit: js.UndefOr[Double] = js.undefined,
    `match`: StringDictionary[js.Any] = null,
    project: StringDictionary[js.Any] = null,
    skip: js.UndefOr[Double] = js.undefined,
    sort: StringDictionary[`1` | `-1`] = null
  ): AggregationOptions = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationOptions]
  }
}

