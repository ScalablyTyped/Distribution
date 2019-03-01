package typings
package parseLib.ParseNs.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// According to http://docs.parseplatform.org/rest/guide/#aggregate-queries
trait AggregationOptions extends js.Object {
  var group: js.UndefOr[parseLib.Anon_Key] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var `match`: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var project: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  // Sort documentation https://docs.mongodb.com/v3.2/reference/operator/aggregation/sort/#pipe._S_sort
  var sort: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[parseLib.parseLibNumbers.`1` | parseLib.parseLibNumbers.`-1`]
  ] = js.undefined
}

object AggregationOptions {
  @scala.inline
  def apply(
    group: parseLib.Anon_Key = null,
    limit: scala.Int | scala.Double = null,
    `match`: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    project: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    skip: scala.Int | scala.Double = null,
    sort: org.scalablytyped.runtime.StringDictionary[parseLib.parseLibNumbers.`1` | parseLib.parseLibNumbers.`-1`] = null
  ): AggregationOptions = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (project != null) __obj.updateDynamic("project")(project)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[AggregationOptions]
  }
}

