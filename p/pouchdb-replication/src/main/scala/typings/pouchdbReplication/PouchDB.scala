package typings.pouchdbReplication

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbCore.EventEmitter
import typings.pouchdbCore.PouchDB.Core.Callback
import typings.pouchdbCore.PouchDB.Core.ExistingDocument
import typings.pouchdbFind.PouchDB.Find.Selector
import typings.pouchdbReplication.PouchDB.Replication.ReplicateOptions
import typings.pouchdbReplication.PouchDB.Replication.Replication
import typings.pouchdbReplication.PouchDB.Replication.ReplicationResultComplete
import typings.pouchdbReplication.PouchDB.Replication.Sync
import typings.pouchdbReplication.PouchDB.Replication.SyncOptions
import typings.pouchdbReplication.PouchDB.Replication.SyncResultComplete
import typings.pouchdbReplication.anon.From
import typings.pouchdbReplication.pouchdbReplicationBooleans.`false`
import typings.pouchdbReplication.pouchdbReplicationStrings.active
import typings.pouchdbReplication.pouchdbReplicationStrings.change
import typings.pouchdbReplication.pouchdbReplicationStrings.complete
import typings.pouchdbReplication.pouchdbReplicationStrings.denied
import typings.pouchdbReplication.pouchdbReplicationStrings.error
import typings.pouchdbReplication.pouchdbReplicationStrings.paused
import typings.pouchdbReplication.pouchdbReplicationStrings.pull
import typings.pouchdbReplication.pouchdbReplicationStrings.push
import typings.pouchdbReplication.pouchdbReplicationStrings.source
import typings.pouchdbReplication.pouchdbReplicationStrings.target
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PouchDB {
  
  @js.native
  trait Database[Content /* <: js.Object */] extends StObject {
    
    var replicate: From = js.native
    
    /**
      * Sync data from src to target and target to src. This is a convenience method for bidirectional data replication.
      *
      * In other words, this code:
      * `PouchDB.replicate('mydb', 'http://localhost:5984/mydb')`;
      * `PouchDB.replicate('http://localhost:5984/mydb', 'mydb')`;
      * is equivalent to this code:
      * `PouchDB.sync('mydb', 'http://localhost:5984/mydb')`;
      */
    def sync[Content](remote: String): Sync[Content] = js.native
    def sync[Content](
      remote: String,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[SyncResultComplete[Content]]
    ): Sync[Content] = js.native
    def sync[Content](remote: String, options: SyncOptions): Sync[Content] = js.native
    def sync[Content](remote: String, options: SyncOptions, callback: Callback[SyncResultComplete[Content]]): Sync[Content] = js.native
    def sync[Content](remote: Database[Content]): Sync[Content] = js.native
    def sync[Content](
      remote: Database[Content],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[SyncResultComplete[Content]]
    ): Sync[Content] = js.native
    def sync[Content](remote: Database[Content], options: SyncOptions): Sync[Content] = js.native
    def sync[Content](remote: Database[Content], options: SyncOptions, callback: Callback[SyncResultComplete[Content]]): Sync[Content] = js.native
  }
  
  object Replication {
    
    @js.native
    trait ReplicateOptions extends StObject {
      
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
      implicit class ReplicateOptionsMutableBuilder[Self <: ReplicateOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBack_off_function(value: /* delay */ Double => Double): Self = StObject.set(x, "back_off_function", js.Any.fromFunction1(value))
        
        @scala.inline
        def setBack_off_functionUndefined: Self = StObject.set(x, "back_off_function", js.undefined)
        
        @scala.inline
        def setBatch_size(value: Double): Self = StObject.set(x, "batch_size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBatch_sizeUndefined: Self = StObject.set(x, "batch_size", js.undefined)
        
        @scala.inline
        def setBatches_limit(value: Double): Self = StObject.set(x, "batches_limit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBatches_limitUndefined: Self = StObject.set(x, "batches_limit", js.undefined)
        
        @scala.inline
        def setCheckpoint(value: Boolean | target | source): Self = StObject.set(x, "checkpoint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCheckpointUndefined: Self = StObject.set(x, "checkpoint", js.undefined)
        
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
        def setHeartbeat(value: js.Any): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeartbeatUndefined: Self = StObject.set(x, "heartbeat", js.undefined)
        
        @scala.inline
        def setLive(value: Boolean): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
        
        @scala.inline
        def setQuery_params(value: StringDictionary[js.Any]): Self = StObject.set(x, "query_params", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuery_paramsUndefined: Self = StObject.set(x, "query_params", js.undefined)
        
        @scala.inline
        def setRetry(value: Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
        
        @scala.inline
        def setSelector(value: Selector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setSince(value: js.Any): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
        
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
    
    @js.native
    trait Replication[Content /* <: js.Object */]
      extends js.Promise[ReplicationResultComplete[Content]]
         with ReplicationEventEmitter[Content, ReplicationResult[Content], ReplicationResultComplete[Content]]
    
    @js.native
    trait ReplicationEventEmitter[Content /* <: js.Object */, C, F] extends EventEmitter {
      
      def cancel(): Unit = js.native
      
      @JSName("on")
      def on_active(event: active, listener: js.Function0[_]): this.type = js.native
      @JSName("on")
      def on_change(event: change, listener: js.Function1[/* info */ C, _]): this.type = js.native
      @JSName("on")
      def on_complete(event: complete, listener: js.Function1[/* info */ F, _]): this.type = js.native
      @JSName("on")
      def on_denied(event: denied, listener: js.Function1[/* err */ js.Object, _]): this.type = js.native
      @JSName("on")
      def on_error(event: error, listener: js.Function1[/* err */ js.Object, _]): this.type = js.native
      @JSName("on")
      def on_paused(event: paused, listener: js.Function1[/* err */ js.Object, _]): this.type = js.native
    }
    
    @js.native
    trait ReplicationResult[Content /* <: js.Object */] extends StObject {
      
      var doc_write_failures: Double = js.native
      
      var docs: js.Array[ExistingDocument[Content]] = js.native
      
      var docs_read: Double = js.native
      
      var docs_written: Double = js.native
      
      var errors: js.Array[_] = js.native
      
      var last_seq: Double = js.native
      
      var ok: Boolean = js.native
      
      var start_time: Date = js.native
    }
    object ReplicationResult {
      
      @scala.inline
      def apply[Content /* <: js.Object */](
        doc_write_failures: Double,
        docs: js.Array[ExistingDocument[Content]],
        docs_read: Double,
        docs_written: Double,
        errors: js.Array[_],
        last_seq: Double,
        ok: Boolean,
        start_time: Date
      ): ReplicationResult[Content] = {
        val __obj = js.Dynamic.literal(doc_write_failures = doc_write_failures.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], docs_read = docs_read.asInstanceOf[js.Any], docs_written = docs_written.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], last_seq = last_seq.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
        __obj.asInstanceOf[ReplicationResult[Content]]
      }
      
      @scala.inline
      implicit class ReplicationResultMutableBuilder[Self <: ReplicationResult[_], Content /* <: js.Object */] (val x: Self with ReplicationResult[Content]) extends AnyVal {
        
        @scala.inline
        def setDoc_write_failures(value: Double): Self = StObject.set(x, "doc_write_failures", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDocs(value: js.Array[ExistingDocument[Content]]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDocsVarargs(value: ExistingDocument[Content]*): Self = StObject.set(x, "docs", js.Array(value :_*))
        
        @scala.inline
        def setDocs_read(value: Double): Self = StObject.set(x, "docs_read", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDocs_written(value: Double): Self = StObject.set(x, "docs_written", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrors(value: js.Array[_]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsVarargs(value: js.Any*): Self = StObject.set(x, "errors", js.Array(value :_*))
        
        @scala.inline
        def setLast_seq(value: Double): Self = StObject.set(x, "last_seq", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStart_time(value: Date): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ReplicationResultComplete[Content /* <: js.Object */] extends ReplicationResult[Content] {
      
      var end_time: Date = js.native
      
      var status: String = js.native
    }
    object ReplicationResultComplete {
      
      @scala.inline
      def apply[Content /* <: js.Object */](
        doc_write_failures: Double,
        docs: js.Array[ExistingDocument[Content]],
        docs_read: Double,
        docs_written: Double,
        end_time: Date,
        errors: js.Array[_],
        last_seq: Double,
        ok: Boolean,
        start_time: Date,
        status: String
      ): ReplicationResultComplete[Content] = {
        val __obj = js.Dynamic.literal(doc_write_failures = doc_write_failures.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], docs_read = docs_read.asInstanceOf[js.Any], docs_written = docs_written.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], last_seq = last_seq.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[ReplicationResultComplete[Content]]
      }
      
      @scala.inline
      implicit class ReplicationResultCompleteMutableBuilder[Self <: ReplicationResultComplete[_], Content /* <: js.Object */] (val x: Self with ReplicationResultComplete[Content]) extends AnyVal {
        
        @scala.inline
        def setEnd_time(value: Date): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Sync[Content /* <: js.Object */]
      extends js.Promise[SyncResultComplete[Content]]
         with ReplicationEventEmitter[Content, SyncResult[Content], SyncResultComplete[Content]]
    
    @js.native
    trait SyncOptions extends ReplicateOptions {
      
      var pull: js.UndefOr[ReplicateOptions] = js.native
      
      var push: js.UndefOr[ReplicateOptions] = js.native
    }
    object SyncOptions {
      
      @scala.inline
      def apply(): SyncOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SyncOptions]
      }
      
      @scala.inline
      implicit class SyncOptionsMutableBuilder[Self <: SyncOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPull(value: ReplicateOptions): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
        
        @scala.inline
        def setPush(value: ReplicateOptions): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      }
    }
    
    @js.native
    trait SyncResult[Content /* <: js.Object */] extends StObject {
      
      var change: ReplicationResult[Content] = js.native
      
      var direction: push | pull = js.native
    }
    object SyncResult {
      
      @scala.inline
      def apply[Content /* <: js.Object */](change: ReplicationResult[Content], direction: push | pull): SyncResult[Content] = {
        val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
        __obj.asInstanceOf[SyncResult[Content]]
      }
      
      @scala.inline
      implicit class SyncResultMutableBuilder[Self <: SyncResult[_], Content /* <: js.Object */] (val x: Self with SyncResult[Content]) extends AnyVal {
        
        @scala.inline
        def setChange(value: ReplicationResult[Content]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDirection(value: push | pull): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SyncResultComplete[Content /* <: js.Object */] extends StObject {
      
      var pull: js.UndefOr[ReplicationResultComplete[Content]] = js.native
      
      var push: js.UndefOr[ReplicationResultComplete[Content]] = js.native
    }
    object SyncResultComplete {
      
      @scala.inline
      def apply[Content /* <: js.Object */](): SyncResultComplete[Content] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SyncResultComplete[Content]]
      }
      
      @scala.inline
      implicit class SyncResultCompleteMutableBuilder[Self <: SyncResultComplete[_], Content /* <: js.Object */] (val x: Self with SyncResultComplete[Content]) extends AnyVal {
        
        @scala.inline
        def setPull(value: ReplicationResultComplete[Content]): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
        
        @scala.inline
        def setPush(value: ReplicationResultComplete[Content]): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      }
    }
  }
  
  @js.native
  trait Static extends StObject {
    
    /**
      * Replicate data from source to target. Both the source and target can be a PouchDB instance or a string
      * representing a CouchDB database URL or the name of a local PouchDB database. If options.live is true,
      * then this will track future changes and also replicate them automatically.
      * This method returns an object with the method cancel(), which you call if you want to cancel live replication.
      */
    def replicate[Content](source: String, target: String): Replication[Content] = js.native
    def replicate[Content](
      source: String,
      target: String,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[ReplicationResultComplete[Content]]
    ): Replication[Content] = js.native
    def replicate[Content](source: String, target: String, options: ReplicateOptions): Replication[Content] = js.native
    def replicate[Content](
      source: String,
      target: String,
      options: ReplicateOptions,
      callback: Callback[ReplicationResultComplete[Content]]
    ): Replication[Content] = js.native
    def replicate[Content](source: String, target: Database[Content]): Replication[Content] = js.native
    def replicate[Content](
      source: String,
      target: Database[Content],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[ReplicationResultComplete[Content]]
    ): Replication[Content] = js.native
    def replicate[Content](source: String, target: Database[Content], options: ReplicateOptions): Replication[Content] = js.native
    def replicate[Content](
      source: String,
      target: Database[Content],
      options: ReplicateOptions,
      callback: Callback[ReplicationResultComplete[Content]]
    ): Replication[Content] = js.native
    def replicate[Content](source: Database[Content], target: String): Replication[Content] = js.native
    def replicate[Content](
      source: Database[Content],
      target: String,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[ReplicationResultComplete[Content]]
    ): Replication[Content] = js.native
    def replicate[Content](source: Database[Content], target: String, options: ReplicateOptions): Replication[Content] = js.native
    def replicate[Content](
      source: Database[Content],
      target: String,
      options: ReplicateOptions,
      callback: Callback[ReplicationResultComplete[Content]]
    ): Replication[Content] = js.native
    def replicate[Content](source: Database[Content], target: Database[Content]): Replication[Content] = js.native
    def replicate[Content](
      source: Database[Content],
      target: Database[Content],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[ReplicationResultComplete[Content]]
    ): Replication[Content] = js.native
    def replicate[Content](source: Database[Content], target: Database[Content], options: ReplicateOptions): Replication[Content] = js.native
    def replicate[Content](
      source: Database[Content],
      target: Database[Content],
      options: ReplicateOptions,
      callback: Callback[ReplicationResultComplete[Content]]
    ): Replication[Content] = js.native
    
    /**
      * Sync data from src to target and target to src. This is a convenience method for bidirectional data replication.
      *
      * In other words, this code:
      * `PouchDB.replicate('mydb', 'http://localhost:5984/mydb')`;
      * `PouchDB.replicate('http://localhost:5984/mydb', 'mydb')`;
      * is equivalent to this code:
      * `PouchDB.sync('mydb', 'http://localhost:5984/mydb')`;
      */
    def sync[Content](source: String, target: String): Sync[Content] = js.native
    def sync[Content](
      source: String,
      target: String,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[SyncResultComplete[Content]]
    ): Sync[Content] = js.native
    def sync[Content](source: String, target: String, options: SyncOptions): Sync[Content] = js.native
    def sync[Content](
      source: String,
      target: String,
      options: SyncOptions,
      callback: Callback[SyncResultComplete[Content]]
    ): Sync[Content] = js.native
    def sync[Content](source: String, target: Database[Content]): Sync[Content] = js.native
    def sync[Content](
      source: String,
      target: Database[Content],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[SyncResultComplete[Content]]
    ): Sync[Content] = js.native
    def sync[Content](source: String, target: Database[Content], options: SyncOptions): Sync[Content] = js.native
    def sync[Content](
      source: String,
      target: Database[Content],
      options: SyncOptions,
      callback: Callback[SyncResultComplete[Content]]
    ): Sync[Content] = js.native
    def sync[Content](source: Database[Content], target: String): Sync[Content] = js.native
    def sync[Content](
      source: Database[Content],
      target: String,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[SyncResultComplete[Content]]
    ): Sync[Content] = js.native
    def sync[Content](source: Database[Content], target: String, options: SyncOptions): Sync[Content] = js.native
    def sync[Content](
      source: Database[Content],
      target: String,
      options: SyncOptions,
      callback: Callback[SyncResultComplete[Content]]
    ): Sync[Content] = js.native
    def sync[Content](source: Database[Content], target: Database[Content]): Sync[Content] = js.native
    def sync[Content](
      source: Database[Content],
      target: Database[Content],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[SyncResultComplete[Content]]
    ): Sync[Content] = js.native
    def sync[Content](source: Database[Content], target: Database[Content], options: SyncOptions): Sync[Content] = js.native
    def sync[Content](
      source: Database[Content],
      target: Database[Content],
      options: SyncOptions,
      callback: Callback[SyncResultComplete[Content]]
    ): Sync[Content] = js.native
  }
}
