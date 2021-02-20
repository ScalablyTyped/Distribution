package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbCore.pouchdbCoreBooleans.`false`
import typings.pouchdbCore.pouchdbCoreStrings.all_docs
import typings.pouchdbCore.pouchdbCoreStrings.main_only
import typings.pouchdbCore.pouchdbCoreStrings.now
import typings.pouchdbFind.PouchDB.Find.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangesOptions extends StObject {
  
  /** Include attachments. */
  var attachments: js.UndefOr[Boolean] = js.native
  
  /**
    * Only available for http databases, this configures how many changes to fetch at a time.
    * Increasing this can reduce the number of requests made. Default is 25.
    */
  var batch_size: js.UndefOr[Double] = js.native
  
  /** Return attachment data as Blobs/Buffers, instead of as base64-encoded strings. */
  var binary: js.UndefOr[Boolean] = js.native
  
  /** Include conflicts. */
  var conflicts: js.UndefOr[Boolean] = js.native
  
  /** Reverse the order of the output documents. */
  var descending: js.UndefOr[Boolean] = js.native
  
  /** Only show changes for docs with these ids (array of strings). */
  var doc_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Reference a filter function from a design document to selectively get updates.
    * To use a view function, pass '_view' here and provide a reference to the view function in options.view.
    * See filtered changes for details.
    */
  var filter: js.UndefOr[String | (js.Function2[/* doc */ js.Any, /* params */ js.Any, _])] = js.native
  
  /**
    * For http adapter only, time in milliseconds for server to give a heartbeat to keep long connections open.
    * Defaults to 10000 (10 seconds), use false to disable the default.
    */
  var heartbeat: js.UndefOr[Double | `false`] = js.native
  
  /** Include contents for each document. */
  var include_docs: js.UndefOr[Boolean] = js.native
  
  /** Maximum number of documents to return. */
  var limit: js.UndefOr[Double | `false`] = js.native
  
  /**
    * Does "live" changes.
    */
  var live: js.UndefOr[Boolean] = js.native
  
  /**
    * Object containing properties that are passed to the filter function, e.g. {"foo:"bar"},
    * where "bar" will be available in the filter function as params.query.foo.
    * To access the params, define your filter function like function (doc, params).
    */
  var query_params: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * (previously options.returnDocs): Is available for non-http databases and defaults to true.
    * Passing false prevents the changes feed from keeping all the documents in memory – in other
    * words complete always has an empty results array, and the change event is the only way to get the event.
    * Useful for large change sets where otherwise you would run out of memory.
    */
  var return_docs: js.UndefOr[Boolean] = js.native
  
  /**
    * Filter using a query/pouchdb-find selector. Note: Selectors are not supported in CouchDB 1.x.
    * Cannot be used in combination with the filter option.
    */
  var selector: js.UndefOr[Selector] = js.native
  
  /**
    * Only available for http databases. Specifies that seq information only be generated every N changes.
    * Larger values can improve changes throughput with CouchDB 2.0 and later.
    * Note that last_seq is always populated regardless.
    */
  var seq_interval: js.UndefOr[Double] = js.native
  
  /**
    * Start the results from the change immediately after the given sequence number.
    * You can also pass `'now'` if you want only new changes (when `live` is `true`).
    *
    */
  var since: js.UndefOr[now | Double | String] = js.native
  
  /**
    * Specifies how many revisions are returned in the changes array.
    * The default, 'main_only', will only return the current “winning” revision;
    * 'all_docs' will return all leaf revisions (including conflicts and deleted former conflicts).
    * Most likely you won’t need this unless you’re writing a replicator.
    */
  var style: js.UndefOr[main_only | all_docs] = js.native
  
  /**
    * Request timeout (in milliseconds).
    */
  var timeout: js.UndefOr[Double | `false`] = js.native
  
  /**
    * Specify a view function (e.g. 'design_doc_name/view_name' or 'view_name' as shorthand for 'view_name/view_name') to act as a filter.
    * Documents counted as “passed” for a view filter if a map function emits at least one record for them.
    * Note: options.filter must be set to '_view' for this option to work.
    */
  var view: js.UndefOr[String] = js.native
}
object ChangesOptions {
  
  @scala.inline
  def apply(): ChangesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangesOptions]
  }
  
  @scala.inline
  implicit class ChangesOptionsMutableBuilder[Self <: ChangesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: Boolean): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setBatch_size(value: Double): Self = StObject.set(x, "batch_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatch_sizeUndefined: Self = StObject.set(x, "batch_size", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setConflicts(value: Boolean): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    @scala.inline
    def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescendingUndefined: Self = StObject.set(x, "descending", js.undefined)
    
    @scala.inline
    def setDoc_ids(value: js.Array[String]): Self = StObject.set(x, "doc_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc_idsUndefined: Self = StObject.set(x, "doc_ids", js.undefined)
    
    @scala.inline
    def setDoc_idsVarargs(value: String*): Self = StObject.set(x, "doc_ids", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: String | (js.Function2[/* doc */ js.Any, /* params */ js.Any, _])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFunction2(value: (/* doc */ js.Any, /* params */ js.Any) => _): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setHeartbeat(value: Double | `false`): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeatUndefined: Self = StObject.set(x, "heartbeat", js.undefined)
    
    @scala.inline
    def setInclude_docs(value: Boolean): Self = StObject.set(x, "include_docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_docsUndefined: Self = StObject.set(x, "include_docs", js.undefined)
    
    @scala.inline
    def setLimit(value: Double | `false`): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setLive(value: Boolean): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
    
    @scala.inline
    def setQuery_params(value: StringDictionary[js.Any]): Self = StObject.set(x, "query_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_paramsUndefined: Self = StObject.set(x, "query_params", js.undefined)
    
    @scala.inline
    def setReturn_docs(value: Boolean): Self = StObject.set(x, "return_docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_docsUndefined: Self = StObject.set(x, "return_docs", js.undefined)
    
    @scala.inline
    def setSelector(value: Selector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setSeq_interval(value: Double): Self = StObject.set(x, "seq_interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq_intervalUndefined: Self = StObject.set(x, "seq_interval", js.undefined)
    
    @scala.inline
    def setSince(value: now | Double | String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    @scala.inline
    def setStyle(value: main_only | all_docs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double | `false`): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
