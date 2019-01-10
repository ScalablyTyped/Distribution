package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://console.bluemix.net/docs/services/Cloudant/api/search.html#queries
trait DocumentSearchParams extends js.Object {
  // A bookmark that was received from a previous search. Used for pagination.
  var bookmark: js.UndefOr[java.lang.String] = js.undefined
  // An array of field names for which facet counts are requested.
  var counts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // Filters the result set using key value pairs supplied to the drilldown parameter.
  var drilldown: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // The name of a string field to group results by.
  var group_field: js.UndefOr[java.lang.String] = js.undefined
  // The maximum group count when used in conjunction with group_field.
  var group_limit: js.UndefOr[scala.Double] = js.undefined
  // Defines the order of the groups in a search when used with group_field.
  var group_sort: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  // Which fields are to be highlighted.
  var highlight_fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // The number of gradments that are returned in highlights. Defaults to 1.
  var highlight_number: js.UndefOr[scala.Double] = js.undefined
  // String used after a highlighted word. Defaults to </em>.
  var highlight_post_tag: js.UndefOr[java.lang.String] = js.undefined
  // String used before a highlighted word. Defaults to <em>.
  var highlight_pre_tag: js.UndefOr[java.lang.String] = js.undefined
  // The number of characters in each fragment for highlight. Defaults to 100.
  var highlight_size: js.UndefOr[scala.Double] = js.undefined
  // Include the full document bodies in the response. Defaults to false
  var include_docs: js.UndefOr[scala.Boolean] = js.undefined
  // An array of fields to include in the search results.
  var include_fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // The maximum number of returned documents. Positive integer up to 200.
  var limit: js.UndefOr[scala.Double] = js.undefined
  // Alias of 'query'. One of q or query must be present.
  var q: js.UndefOr[java.lang.String] = js.undefined
  // The Lucene query to perform. One of q or query must be present.
  var query: js.UndefOr[java.lang.String] = js.undefined
  // Defines ranges for faceted numeric search fields.
  var ranges: js.UndefOr[js.Object] = js.undefined
  // Specifies the sort order of the results.
  var sort: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  // Do not wait for the index to finish building to return results.
  var stale: js.UndefOr[scala.Boolean] = js.undefined
}

