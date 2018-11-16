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

