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
  var query_params: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
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

