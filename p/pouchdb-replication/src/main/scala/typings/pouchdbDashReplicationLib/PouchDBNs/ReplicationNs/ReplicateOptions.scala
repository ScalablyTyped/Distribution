package typings
package pouchdbDashReplicationLib.PouchDBNs.ReplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReplicateOptions extends js.Object {
  /**
               * Backoff function to be used in retry replication. This is a function that takes the current
               * backoff as input (or 0 the first time) and returns a new backoff in milliseconds.
               * You can use this to tweak when and how replication will try to reconnect to a remote database when the user goes offline.
               * Defaults to a function that chooses a random backoff between 0 and 2 seconds and doubles every time it fails to connect.
               * The default delay will never exceed 10 minutes.
               */
  var back_off_function: js.UndefOr[js.Function1[/* delay */ scala.Double, scala.Double]] = js.undefined
  /**
               * Number of change feed items to process at a time. Defaults to 100.
               * This affects the number of docs and attachments held in memory and the number sent at a time to the target server.
               * You may need to adjust downward if targeting devices with low amounts of memory
               * e.g. or if the documents and/or attachments are large in size or if there are many conflicted revisions.
               * If your documents are small in size, then increasing this number will probably speed replication up.
               */
  var batch_size: js.UndefOr[scala.Double] = js.undefined
  /**
               * Number of batches to process at a time. Defaults to 10.
               * This (along wtih batch_size) controls how many docs are kept in memory at a time,
               * so the maximum docs in memory at once would equal batch_size × batches_limit.
               */
  var batches_limit: js.UndefOr[scala.Double] = js.undefined
  /** Only show changes for docs with these ids (array of strings). */
  var doc_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Reference a filter function from a design document to selectively get updates.
               * To use a view function, pass '_view' here and provide a reference to the view function in options.view.
               * See filtered changes for details.
               */
  var filter: js.UndefOr[java.lang.String | (js.Function2[/* doc */ js.Any, /* params */ js.Any, _])] = js.undefined
  /** Configure the heartbeat supported by CouchDB which keeps the change connection alive. */
  var heartbeat: js.UndefOr[js.Any] = js.undefined
  /** If true, starts subscribing to future changes in the source database and continue replicating them. */
  var live: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Object containing properties that are passed to the filter function, e.g. {"foo:"bar"},
               * where "bar" will be available in the filter function as params.query.foo.
               * To access the params, define your filter function like function (doc, params).
               */
  var query_params: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
               * If true will attempt to retry replications in the case of failure (due to being offline),
               * using a backoff algorithm that retries at longer and longer intervals until a connection is re-established,
               * with a maximum delay of 10 minutes. Only applicable if options.live is also true.
               */
  var retry: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Filter using a query/pouchdb-find selector. Note: Selectors are not supported in CouchDB 1.x.
               */
  var selector: js.UndefOr[pouchdbDashFindLib.PouchDBNs.FindNs.Selector] = js.undefined
  /** Replicate changes after the given sequence number. */
  var since: js.UndefOr[js.Any] = js.undefined
  /** Request timeout (in milliseconds). */
  var timeout: js.UndefOr[
    scala.Double | pouchdbDashReplicationLib.pouchdbDashReplicationLibNumbers.`false`
  ] = js.undefined
  /**
               * Specify a view function (e.g. 'design_doc_name/view_name' or 'view_name' as shorthand for 'view_name/view_name') to act as a filter.
               * Documents counted as “passed” for a view filter if a map function emits at least one record for them.
               * Note: options.filter must be set to '_view' for this option to work.
               */
  var view: js.UndefOr[java.lang.String] = js.undefined
}

