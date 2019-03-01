package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSearchResponse[V] extends js.Object {
  // token which if supplied to a subsequent search will return the next page of results.
  var bookmark: java.lang.String
  // facet counts
  var counts: js.UndefOr[js.Object] = js.undefined
  var highlights: js.UndefOr[js.Object] = js.undefined
  // facet range results
  var ranges: js.UndefOr[js.Object] = js.undefined
  //  Array of search results
  var rows: js.Array[nanoLib.Anon_Doc[V]]
  // Number of documents in the search resykts
  var total_rows: scala.Double
}

object DocumentSearchResponse {
  @scala.inline
  def apply[V](
    bookmark: java.lang.String,
    rows: js.Array[nanoLib.Anon_Doc[V]],
    total_rows: scala.Double,
    counts: js.Object = null,
    highlights: js.Object = null,
    ranges: js.Object = null
  ): DocumentSearchResponse[V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bookmark")(bookmark)
    __obj.updateDynamic("rows")(rows)
    __obj.updateDynamic("total_rows")(total_rows)
    if (counts != null) __obj.updateDynamic("counts")(counts)
    if (highlights != null) __obj.updateDynamic("highlights")(highlights)
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    __obj.asInstanceOf[DocumentSearchResponse[V]]
  }
}

