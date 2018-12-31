package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MangoQuery extends js.Object {
  // A string that enables you to specify which page of results you require. Used for paging through result sets.
  var bookmark: js.UndefOr[java.lang.String] = js.undefined
  // Include execution statistics in the query response. Optional, default: false.
  var execution_stats: js.UndefOr[scala.Boolean] = js.undefined
  // JSON array specifying which fields of each object should be returned. If it is omitted,
  // the entire object is returned.
  // http://docs.couchdb.org/en/latest/api/database/find.html#filtering-fields
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // Maximum number of results returned. Default is 25.
  var limit: js.UndefOr[scala.Double] = js.undefined
  // Read quorum needed for the result. This defaults to 1.
  var r: js.UndefOr[scala.Double] = js.undefined
  // JSON object describing criteria used to select documents.
  var selector: MangoSelector
  // Skip the first 'n' results, where 'n' is the value specified.
  var skip: js.UndefOr[scala.Double] = js.undefined
  // JSON array following sort syntax.
  var sort: js.UndefOr[js.Array[SortOrder]] = js.undefined
  // Whether or not the view results should be returned from a “stable” set of shards.
  var stable: js.UndefOr[scala.Boolean] = js.undefined
  // Combination of update = false and stable = true options.Possible options: "ok", false (default).
  var stale: js.UndefOr[nanoLib.nanoLibStrings.ok | nanoLib.nanoLibNumbers.`false`] = js.undefined
  // Whether to update the index prior to returning the result. Default is true.
  var update: js.UndefOr[scala.Boolean] = js.undefined
  // Instruct a query to use a specific index.
  // Specified either as "<design_document>" or ["<design_document>", "<index_name>"].
  var use_index: js.UndefOr[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])] = js.undefined
}

