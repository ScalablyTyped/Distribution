package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesOptions extends js.Object {
  /** Include attachments. */
  var attachments: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only available for http databases, this configures how many changes to fetch at a time.
    * Increasing this can reduce the number of requests made. Default is 25.
    */
  var batch_size: js.UndefOr[scala.Double] = js.undefined
  /** Return attachment data as Blobs/Buffers, instead of as base64-encoded strings. */
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  /** Include conflicts. */
  var conflicts: js.UndefOr[scala.Boolean] = js.undefined
  /** Reverse the order of the output documents. */
  var descending: js.UndefOr[scala.Boolean] = js.undefined
  /** Only show changes for docs with these ids (array of strings). */
  var doc_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Reference a filter function from a design document to selectively get updates.
    * To use a view function, pass '_view' here and provide a reference to the view function in options.view.
    * See filtered changes for details.
    */
  var filter: js.UndefOr[java.lang.String | (js.Function2[/* doc */ js.Any, /* params */ js.Any, _])] = js.undefined
  /**
    * For http adapter only, time in milliseconds for server to give a heartbeat to keep long connections open.
    * Defaults to 10000 (10 seconds), use false to disable the default.
    */
  var heartbeat: js.UndefOr[scala.Double | pouchdbDashCoreLib.pouchdbDashCoreLibNumbers.`false`] = js.undefined
  /** Include contents for each document. */
  var include_docs: js.UndefOr[scala.Boolean] = js.undefined
  /** Maximum number of documents to return. */
  var limit: js.UndefOr[scala.Double | pouchdbDashCoreLib.pouchdbDashCoreLibNumbers.`false`] = js.undefined
  /**
    * Does "live" changes.
    */
  var live: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Object containing properties that are passed to the filter function, e.g. {"foo:"bar"},
    * where "bar" will be available in the filter function as params.query.foo.
    * To access the params, define your filter function like function (doc, params).
    */
  var query_params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * (previously options.returnDocs): Is available for non-http databases and defaults to true.
    * Passing false prevents the changes feed from keeping all the documents in memory – in other
    * words complete always has an empty results array, and the change event is the only way to get the event.
    * Useful for large change sets where otherwise you would run out of memory.
    */
  var return_docs: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Filter using a query/pouchdb-find selector. Note: Selectors are not supported in CouchDB 1.x.
    * Cannot be used in combination with the filter option.
    */
  var selector: js.UndefOr[pouchdbDashFindLib.PouchDBNs.FindNs.Selector] = js.undefined
  /**
    * Only available for http databases. Specifies that seq information only be generated every N changes.
    * Larger values can improve changes throughput with CouchDB 2.0 and later.
    * Note that last_seq is always populated regardless.
    */
  var seq_interval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Start the results from the change immediately after the given sequence number.
    * You can also pass `'now'` if you want only new changes (when `live` is `true`).
    *
    */
  var since: js.UndefOr[
    pouchdbDashCoreLib.pouchdbDashCoreLibStrings.now | scala.Double | java.lang.String
  ] = js.undefined
  /**
    * Specifies how many revisions are returned in the changes array.
    * The default, 'main_only', will only return the current “winning” revision;
    * 'all_docs' will return all leaf revisions (including conflicts and deleted former conflicts).
    * Most likely you won’t need this unless you’re writing a replicator.
    */
  var style: js.UndefOr[
    pouchdbDashCoreLib.pouchdbDashCoreLibStrings.main_only | pouchdbDashCoreLib.pouchdbDashCoreLibStrings.all_docs
  ] = js.undefined
  /**
    * Request timeout (in milliseconds).
    */
  var timeout: js.UndefOr[scala.Double | pouchdbDashCoreLib.pouchdbDashCoreLibNumbers.`false`] = js.undefined
  /**
    * Specify a view function (e.g. 'design_doc_name/view_name' or 'view_name' as shorthand for 'view_name/view_name') to act as a filter.
    * Documents counted as “passed” for a view filter if a map function emits at least one record for them.
    * Note: options.filter must be set to '_view' for this option to work.
    */
  var view: js.UndefOr[java.lang.String] = js.undefined
}

object ChangesOptions {
  @scala.inline
  def apply(
    attachments: js.UndefOr[scala.Boolean] = js.undefined,
    batch_size: scala.Int | scala.Double = null,
    binary: js.UndefOr[scala.Boolean] = js.undefined,
    conflicts: js.UndefOr[scala.Boolean] = js.undefined,
    descending: js.UndefOr[scala.Boolean] = js.undefined,
    doc_ids: js.Array[java.lang.String] = null,
    filter: java.lang.String | (js.Function2[/* doc */ js.Any, /* params */ js.Any, _]) = null,
    heartbeat: scala.Double | pouchdbDashCoreLib.pouchdbDashCoreLibNumbers.`false` = null,
    include_docs: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Double | pouchdbDashCoreLib.pouchdbDashCoreLibNumbers.`false` = null,
    live: js.UndefOr[scala.Boolean] = js.undefined,
    query_params: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    return_docs: js.UndefOr[scala.Boolean] = js.undefined,
    selector: pouchdbDashFindLib.PouchDBNs.FindNs.Selector = null,
    seq_interval: scala.Int | scala.Double = null,
    since: pouchdbDashCoreLib.pouchdbDashCoreLibStrings.now | scala.Double | java.lang.String = null,
    style: pouchdbDashCoreLib.pouchdbDashCoreLibStrings.main_only | pouchdbDashCoreLib.pouchdbDashCoreLibStrings.all_docs = null,
    timeout: scala.Double | pouchdbDashCoreLib.pouchdbDashCoreLibNumbers.`false` = null,
    view: java.lang.String = null
  ): ChangesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments)
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts)
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending)
    if (doc_ids != null) __obj.updateDynamic("doc_ids")(doc_ids)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(live)) __obj.updateDynamic("live")(live)
    if (query_params != null) __obj.updateDynamic("query_params")(query_params)
    if (!js.isUndefined(return_docs)) __obj.updateDynamic("return_docs")(return_docs)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (seq_interval != null) __obj.updateDynamic("seq_interval")(seq_interval.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[ChangesOptions]
  }
}

