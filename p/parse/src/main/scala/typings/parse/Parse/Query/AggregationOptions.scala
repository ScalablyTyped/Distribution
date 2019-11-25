package typings.parse.Parse.Query

import org.scalablytyped.runtime.StringDictionary
import typings.parse.Anon_Key
import typings.parse.parseNumbers.`-1`
import typings.parse.parseNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// According to http://docs.parseplatform.org/rest/guide/#aggregate-queries
trait AggregationOptions extends js.Object {
  var group: js.UndefOr[Anon_Key] = js.undefined
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
    group: Anon_Key = null,
    limit: Int | Double = null,
    `match`: StringDictionary[js.Any] = null,
    project: StringDictionary[js.Any] = null,
    skip: Int | Double = null,
    sort: StringDictionary[`1` | `-1`] = null
  ): AggregationOptions = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationOptions]
  }
}

