package typings.nano.mod

import typings.nano.anon.Doc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSearchResponse[V] extends js.Object {
  // token which if supplied to a subsequent search will return the next page of results.
  var bookmark: String
  // facet counts
  var counts: js.UndefOr[js.Object] = js.undefined
  var highlights: js.UndefOr[js.Object] = js.undefined
  // facet range results
  var ranges: js.UndefOr[js.Object] = js.undefined
  //  Array of search results
  var rows: js.Array[Doc[V]]
  // Number of documents in the search resykts
  var total_rows: Double
}

object DocumentSearchResponse {
  @scala.inline
  def apply[V](
    bookmark: String,
    rows: js.Array[Doc[V]],
    total_rows: Double,
    counts: js.Object = null,
    highlights: js.Object = null,
    ranges: js.Object = null
  ): DocumentSearchResponse[V] = {
    val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    if (counts != null) __obj.updateDynamic("counts")(counts.asInstanceOf[js.Any])
    if (highlights != null) __obj.updateDynamic("highlights")(highlights.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSearchResponse[V]]
  }
}

