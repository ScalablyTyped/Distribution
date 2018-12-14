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

