package typings.pouchdbDashReplication.PouchDB.Replication

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbDashFind.PouchDB.Find.Selector
import typings.pouchdbDashReplication.pouchdbDashReplicationNumbers.`false`
import typings.pouchdbDashReplication.pouchdbDashReplicationStrings.source
import typings.pouchdbDashReplication.pouchdbDashReplicationStrings.target
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
  var back_off_function: js.UndefOr[js.Function1[/* delay */ Double, Double]] = js.undefined
  /**
    * Number of change feed items to process at a time. Defaults to 100.
    * This affects the number of docs and attachments held in memory and the number sent at a time to the target server.
    * You may need to adjust downward if targeting devices with low amounts of memory
    * e.g. or if the documents and/or attachments are large in size or if there are many conflicted revisions.
    * If your documents are small in size, then increasing this number will probably speed replication up.
    */
  var batch_size: js.UndefOr[Double] = js.undefined
  /**
    * Number of batches to process at a time. Defaults to 10.
    * This (along wtih batch_size) controls how many docs are kept in memory at a time,
    * so the maximum docs in memory at once would equal batch_size × batches_limit.
    */
  var batches_limit: js.UndefOr[Double] = js.undefined
  /**
    * Can be used if you want to disable checkpoints on the source, target, or both.
    * Setting this option to false will prevent writing checkpoints on both source and target.
    * Setting it to source will only write checkpoints on the source.
    * Setting it to target will only write checkpoints on the target.
    */
  var checkpoint: js.UndefOr[Boolean | target | source] = js.undefined
  /** Only show changes for docs with these ids (array of strings). */
  var doc_ids: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Reference a filter function from a design document to selectively get updates.
    * To use a view function, pass '_view' here and provide a reference to the view function in options.view.
    * See filtered changes for details.
    */
  var filter: js.UndefOr[String | (js.Function2[/* doc */ js.Any, /* params */ js.Any, _])] = js.undefined
  /** Configure the heartbeat supported by CouchDB which keeps the change connection alive. */
  var heartbeat: js.UndefOr[js.Any] = js.undefined
  /** If true, starts subscribing to future changes in the source database and continue replicating them. */
  var live: js.UndefOr[Boolean] = js.undefined
  /**
    * Object containing properties that are passed to the filter function, e.g. {"foo:"bar"},
    * where "bar" will be available in the filter function as params.query.foo.
    * To access the params, define your filter function like function (doc, params).
    */
  var query_params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * If true will attempt to retry replications in the case of failure (due to being offline),
    * using a backoff algorithm that retries at longer and longer intervals until a connection is re-established,
    * with a maximum delay of 10 minutes. Only applicable if options.live is also true.
    */
  var retry: js.UndefOr[Boolean] = js.undefined
  /**
    * Filter using a query/pouchdb-find selector. Note: Selectors are not supported in CouchDB 1.x.
    */
  var selector: js.UndefOr[Selector] = js.undefined
  /** Replicate changes after the given sequence number. */
  var since: js.UndefOr[js.Any] = js.undefined
  /** Request timeout (in milliseconds). */
  var timeout: js.UndefOr[Double | `false`] = js.undefined
  /**
    * Specify a view function (e.g. 'design_doc_name/view_name' or 'view_name' as shorthand for 'view_name/view_name') to act as a filter.
    * Documents counted as “passed” for a view filter if a map function emits at least one record for them.
    * Note: options.filter must be set to '_view' for this option to work.
    */
  var view: js.UndefOr[String] = js.undefined
}

object ReplicateOptions {
  @scala.inline
  def apply(
    back_off_function: /* delay */ Double => Double = null,
    batch_size: Int | Double = null,
    batches_limit: Int | Double = null,
    checkpoint: Boolean | target | source = null,
    doc_ids: js.Array[String] = null,
    filter: String | (js.Function2[/* doc */ js.Any, /* params */ js.Any, _]) = null,
    heartbeat: js.Any = null,
    live: js.UndefOr[Boolean] = js.undefined,
    query_params: StringDictionary[js.Any] = null,
    retry: js.UndefOr[Boolean] = js.undefined,
    selector: Selector = null,
    since: js.Any = null,
    timeout: Double | `false` = null,
    view: String = null
  ): ReplicateOptions = {
    val __obj = js.Dynamic.literal()
    if (back_off_function != null) __obj.updateDynamic("back_off_function")(js.Any.fromFunction1(back_off_function))
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (batches_limit != null) __obj.updateDynamic("batches_limit")(batches_limit.asInstanceOf[js.Any])
    if (checkpoint != null) __obj.updateDynamic("checkpoint")(checkpoint.asInstanceOf[js.Any])
    if (doc_ids != null) __obj.updateDynamic("doc_ids")(doc_ids)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat)
    if (!js.isUndefined(live)) __obj.updateDynamic("live")(live)
    if (query_params != null) __obj.updateDynamic("query_params")(query_params)
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (since != null) __obj.updateDynamic("since")(since)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[ReplicateOptions]
  }
}

