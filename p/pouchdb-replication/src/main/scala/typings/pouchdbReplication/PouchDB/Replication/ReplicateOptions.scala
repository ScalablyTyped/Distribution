package typings.pouchdbReplication.PouchDB.Replication

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbFind.PouchDB.Find.Selector
import typings.pouchdbReplication.pouchdbReplicationBooleans.`false`
import typings.pouchdbReplication.pouchdbReplicationStrings.source
import typings.pouchdbReplication.pouchdbReplicationStrings.target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicateOptions extends js.Object {
  
  /**
    * Backoff function to be used in retry replication. This is a function that takes the current
    * backoff as input (or 0 the first time) and returns a new backoff in milliseconds.
    * You can use this to tweak when and how replication will try to reconnect to a remote database when the user goes offline.
    * Defaults to a function that chooses a random backoff between 0 and 2 seconds and doubles every time it fails to connect.
    * The default delay will never exceed 10 minutes.
    */
  var back_off_function: js.UndefOr[js.Function1[/* delay */ Double, Double]] = js.native
  
  /**
    * Number of change feed items to process at a time. Defaults to 100.
    * This affects the number of docs and attachments held in memory and the number sent at a time to the target server.
    * You may need to adjust downward if targeting devices with low amounts of memory
    * e.g. or if the documents and/or attachments are large in size or if there are many conflicted revisions.
    * If your documents are small in size, then increasing this number will probably speed replication up.
    */
  var batch_size: js.UndefOr[Double] = js.native
  
  /**
    * Number of batches to process at a time. Defaults to 10.
    * This (along wtih batch_size) controls how many docs are kept in memory at a time,
    * so the maximum docs in memory at once would equal batch_size × batches_limit.
    */
  var batches_limit: js.UndefOr[Double] = js.native
  
  /**
    * Can be used if you want to disable checkpoints on the source, target, or both.
    * Setting this option to false will prevent writing checkpoints on both source and target.
    * Setting it to source will only write checkpoints on the source.
    * Setting it to target will only write checkpoints on the target.
    */
  var checkpoint: js.UndefOr[Boolean | target | source] = js.native
  
  /** Only show changes for docs with these ids (array of strings). */
  var doc_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Reference a filter function from a design document to selectively get updates.
    * To use a view function, pass '_view' here and provide a reference to the view function in options.view.
    * See filtered changes for details.
    */
  var filter: js.UndefOr[String | (js.Function2[/* doc */ js.Any, /* params */ js.Any, _])] = js.native
  
  /** Configure the heartbeat supported by CouchDB which keeps the change connection alive. */
  var heartbeat: js.UndefOr[js.Any] = js.native
  
  /** If true, starts subscribing to future changes in the source database and continue replicating them. */
  var live: js.UndefOr[Boolean] = js.native
  
  /**
    * Object containing properties that are passed to the filter function, e.g. {"foo:"bar"},
    * where "bar" will be available in the filter function as params.query.foo.
    * To access the params, define your filter function like function (doc, params).
    */
  var query_params: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * If true will attempt to retry replications in the case of failure (due to being offline),
    * using a backoff algorithm that retries at longer and longer intervals until a connection is re-established,
    * with a maximum delay of 10 minutes. Only applicable if options.live is also true.
    */
  var retry: js.UndefOr[Boolean] = js.native
  
  /**
    * Filter using a query/pouchdb-find selector. Note: Selectors are not supported in CouchDB 1.x.
    */
  var selector: js.UndefOr[Selector] = js.native
  
  /** Replicate changes after the given sequence number. */
  var since: js.UndefOr[js.Any] = js.native
  
  /** Request timeout (in milliseconds). */
  var timeout: js.UndefOr[Double | `false`] = js.native
  
  /**
    * Specify a view function (e.g. 'design_doc_name/view_name' or 'view_name' as shorthand for 'view_name/view_name') to act as a filter.
    * Documents counted as “passed” for a view filter if a map function emits at least one record for them.
    * Note: options.filter must be set to '_view' for this option to work.
    */
  var view: js.UndefOr[String] = js.native
}
object ReplicateOptions {
  
  @scala.inline
  def apply(): ReplicateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicateOptions]
  }
  
  @scala.inline
  implicit class ReplicateOptionsOps[Self <: ReplicateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBack_off_function(value: /* delay */ Double => Double): Self = this.set("back_off_function", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBack_off_function: Self = this.set("back_off_function", js.undefined)
    
    @scala.inline
    def setBatch_size(value: Double): Self = this.set("batch_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatch_size: Self = this.set("batch_size", js.undefined)
    
    @scala.inline
    def setBatches_limit(value: Double): Self = this.set("batches_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatches_limit: Self = this.set("batches_limit", js.undefined)
    
    @scala.inline
    def setCheckpoint(value: Boolean | target | source): Self = this.set("checkpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckpoint: Self = this.set("checkpoint", js.undefined)
    
    @scala.inline
    def setDoc_idsVarargs(value: String*): Self = this.set("doc_ids", js.Array(value :_*))
    
    @scala.inline
    def setDoc_ids(value: js.Array[String]): Self = this.set("doc_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoc_ids: Self = this.set("doc_ids", js.undefined)
    
    @scala.inline
    def setFilterFunction2(value: (/* doc */ js.Any, /* params */ js.Any) => _): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilter(value: String | (js.Function2[/* doc */ js.Any, /* params */ js.Any, _])): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setHeartbeat(value: js.Any): Self = this.set("heartbeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeat: Self = this.set("heartbeat", js.undefined)
    
    @scala.inline
    def setLive(value: Boolean): Self = this.set("live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLive: Self = this.set("live", js.undefined)
    
    @scala.inline
    def setQuery_params(value: StringDictionary[js.Any]): Self = this.set("query_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery_params: Self = this.set("query_params", js.undefined)
    
    @scala.inline
    def setRetry(value: Boolean): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    
    @scala.inline
    def setSelector(value: Selector): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setSince(value: js.Any): Self = this.set("since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double | `false`): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
