package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/find.html#execution-statistics
trait MangoExecutionStats extends js.Object {
  // Total execution time in milliseconds as measured by the database.
  var execution_time_ms: scala.Double
  // Number of results returned from the query.
  var results_returned: scala.Double
  // Number of documents fetched from the database / index, equivalent to using include_docs = true in a view.
  var total_docs_examined: scala.Double
  // Number of index keys examined. Currently always 0.
  var total_keys_examined: scala.Double
  // Number of documents fetched from the database using an out - of - band document fetch.
  // This is only non - zero when read quorum > 1 is specified in the query parameters.
  var total_quorum_docs_examined: scala.Double
}

