package typings.nano.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://console.bluemix.net/docs/services/Cloudant/api/search.html#queries
trait DocumentSearchParams extends js.Object {
  // A bookmark that was received from a previous search. Used for pagination.
  var bookmark: js.UndefOr[String] = js.undefined
  // An array of field names for which facet counts are requested.
  var counts: js.UndefOr[js.Array[String]] = js.undefined
  // Filters the result set using key value pairs supplied to the drilldown parameter.
  var drilldown: js.UndefOr[js.Array[String]] = js.undefined
  // The name of a string field to group results by.
  var group_field: js.UndefOr[String] = js.undefined
  // The maximum group count when used in conjunction with group_field.
  var group_limit: js.UndefOr[Double] = js.undefined
  // Defines the order of the groups in a search when used with group_field.
  var group_sort: js.UndefOr[String | js.Array[String]] = js.undefined
  // Which fields are to be highlighted.
  var highlight_fields: js.UndefOr[js.Array[String]] = js.undefined
  // The number of gradments that are returned in highlights. Defaults to 1.
  var highlight_number: js.UndefOr[Double] = js.undefined
  // String used after a highlighted word. Defaults to </em>.
  var highlight_post_tag: js.UndefOr[String] = js.undefined
  // String used before a highlighted word. Defaults to <em>.
  var highlight_pre_tag: js.UndefOr[String] = js.undefined
  // The number of characters in each fragment for highlight. Defaults to 100.
  var highlight_size: js.UndefOr[Double] = js.undefined
  // Include the full document bodies in the response. Defaults to false
  var include_docs: js.UndefOr[Boolean] = js.undefined
  // An array of fields to include in the search results.
  var include_fields: js.UndefOr[js.Array[String]] = js.undefined
  // The maximum number of returned documents. Positive integer up to 200.
  var limit: js.UndefOr[Double] = js.undefined
  // Alias of 'query'. One of q or query must be present.
  var q: js.UndefOr[String] = js.undefined
  // The Lucene query to perform. One of q or query must be present.
  var query: js.UndefOr[String] = js.undefined
  // Defines ranges for faceted numeric search fields.
  var ranges: js.UndefOr[js.Object] = js.undefined
  // Specifies the sort order of the results.
  var sort: js.UndefOr[String | js.Array[String]] = js.undefined
  // Do not wait for the index to finish building to return results.
  var stale: js.UndefOr[Boolean] = js.undefined
}

object DocumentSearchParams {
  @scala.inline
  def apply(
    bookmark: String = null,
    counts: js.Array[String] = null,
    drilldown: js.Array[String] = null,
    group_field: String = null,
    group_limit: Int | Double = null,
    group_sort: String | js.Array[String] = null,
    highlight_fields: js.Array[String] = null,
    highlight_number: Int | Double = null,
    highlight_post_tag: String = null,
    highlight_pre_tag: String = null,
    highlight_size: Int | Double = null,
    include_docs: js.UndefOr[Boolean] = js.undefined,
    include_fields: js.Array[String] = null,
    limit: Int | Double = null,
    q: String = null,
    query: String = null,
    ranges: js.Object = null,
    sort: String | js.Array[String] = null,
    stale: js.UndefOr[Boolean] = js.undefined
  ): DocumentSearchParams = {
    val __obj = js.Dynamic.literal()
    if (bookmark != null) __obj.updateDynamic("bookmark")(bookmark.asInstanceOf[js.Any])
    if (counts != null) __obj.updateDynamic("counts")(counts.asInstanceOf[js.Any])
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown.asInstanceOf[js.Any])
    if (group_field != null) __obj.updateDynamic("group_field")(group_field.asInstanceOf[js.Any])
    if (group_limit != null) __obj.updateDynamic("group_limit")(group_limit.asInstanceOf[js.Any])
    if (group_sort != null) __obj.updateDynamic("group_sort")(group_sort.asInstanceOf[js.Any])
    if (highlight_fields != null) __obj.updateDynamic("highlight_fields")(highlight_fields.asInstanceOf[js.Any])
    if (highlight_number != null) __obj.updateDynamic("highlight_number")(highlight_number.asInstanceOf[js.Any])
    if (highlight_post_tag != null) __obj.updateDynamic("highlight_post_tag")(highlight_post_tag.asInstanceOf[js.Any])
    if (highlight_pre_tag != null) __obj.updateDynamic("highlight_pre_tag")(highlight_pre_tag.asInstanceOf[js.Any])
    if (highlight_size != null) __obj.updateDynamic("highlight_size")(highlight_size.asInstanceOf[js.Any])
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs.asInstanceOf[js.Any])
    if (include_fields != null) __obj.updateDynamic("include_fields")(include_fields.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSearchParams]
  }
}

