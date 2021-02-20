package typings.pouchdbMapreduce

import typings.pouchdbCore.PouchDB.Core.BasicResponse
import typings.pouchdbCore.PouchDB.Core.Callback
import typings.pouchdbMapreduce.PouchDB.Query.Options
import typings.pouchdbMapreduce.PouchDB.Query.Response
import typings.pouchdbMapreduce.anon.Doc
import typings.pouchdbMapreduce.pouchdbMapreduceStrings.ok
import typings.pouchdbMapreduce.pouchdbMapreduceStrings.update_after
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PouchDB {
  
  /* Rewritten from type alias, can be one of: 
    - typings.pouchdbMapreduce.pouchdbMapreduceStrings._sum
    - typings.pouchdbMapreduce.pouchdbMapreduceStrings._count
    - typings.pouchdbMapreduce.pouchdbMapreduceStrings._stats
  */
  trait BuiltInReducers extends StObject
  object BuiltInReducers {
    
    @scala.inline
    def _count: typings.pouchdbMapreduce.pouchdbMapreduceStrings._count = "_count".asInstanceOf[typings.pouchdbMapreduce.pouchdbMapreduceStrings._count]
    
    @scala.inline
    def _stats: typings.pouchdbMapreduce.pouchdbMapreduceStrings._stats = "_stats".asInstanceOf[typings.pouchdbMapreduce.pouchdbMapreduceStrings._stats]
    
    @scala.inline
    def _sum: typings.pouchdbMapreduce.pouchdbMapreduceStrings._sum = "_sum".asInstanceOf[typings.pouchdbMapreduce.pouchdbMapreduceStrings._sum]
  }
  
  @js.native
  trait Database[Content /* <: js.Object */] extends StObject {
    
    /**
      * Invoke a map/reduce function, which allows you to perform more complex queries
      * on PouchDB than what you get with allDocs().
      */
    def query[Result, Model](fun: String): js.Promise[Response[Result]] = js.native
    /**
      * Invoke a map/reduce function, which allows you to perform more complex queries
      * on PouchDB than what you get with allDocs().
      */
    def query[Result, Model](fun: String, callback: Callback[Response[Result]]): Unit = js.native
    def query[Result, Model](fun: String, opts: Options[Model, Result]): js.Promise[Response[Result]] = js.native
    /**
      * Invoke a map/reduce function, which allows you to perform more complex queries
      * on PouchDB than what you get with allDocs().
      */
    def query[Result, Model](fun: String, opts: Options[Model, Result], callback: Callback[Response[Result]]): Unit = js.native
    def query[Result, Model](fun: Filter[Model, Result]): js.Promise[Response[Result]] = js.native
    def query[Result, Model](fun: Filter[Model, Result], callback: Callback[Response[Result]]): Unit = js.native
    def query[Result, Model](fun: Filter[Model, Result], opts: Options[Model, Result]): js.Promise[Response[Result]] = js.native
    def query[Result, Model](fun: Filter[Model, Result], opts: Options[Model, Result], callback: Callback[Response[Result]]): Unit = js.native
    def query[Result, Model](fun: Map[Model, Result]): js.Promise[Response[Result]] = js.native
    def query[Result, Model](fun: Map[Model, Result], callback: Callback[Response[Result]]): Unit = js.native
    def query[Result, Model](fun: Map[Model, Result], opts: Options[Model, Result]): js.Promise[Response[Result]] = js.native
    def query[Result, Model](fun: Map[Model, Result], opts: Options[Model, Result], callback: Callback[Response[Result]]): Unit = js.native
    
    /**
      * Cleans up any stale map/reduce indexes.
      *
      * As design docs are deleted or modified, their associated index
      * files(in CouchDB) or companion databases (in local PouchDBs) continue
      * to take up space on disk. viewCleanup() removes these unnecessary
      * index files.
      */
    def viewCleanup(): js.Promise[BasicResponse] = js.native
    /**
      * Cleans up any stale map/reduce indexes.
      *
      * As design docs are deleted or modified, their associated index
      * files(in CouchDB) or companion databases (in local PouchDBs) continue
      * to take up space on disk. viewCleanup() removes these unnecessary
      * index files.
      */
    def viewCleanup(callback: Callback[BasicResponse]): Unit = js.native
  }
  
  @js.native
  trait Filter[Content /* <: js.Object */, Reduction] extends StObject {
    
    // Assume that Content | Reduction is enough leverage in most cases to handle intermediate map emits
    def map(doc: Content): Unit = js.native
    def map(doc: Content, emit: js.Function2[/* key */ js.Any, /* value */ Content | Reduction, Unit]): Unit = js.native
    // Assume that Content | Reduction is enough leverage in most cases to handle intermediate map emits
    @JSName("map")
    var map_Original: Map[Content, Reduction] = js.native
    
    var reduce: js.UndefOr[(Reducer[Content, Reduction]) | BuiltInReducers | String] = js.native
  }
  
  /**
    * CouchDB-style Map function
    *
    * @param emit CouchDB does not support emit as an argument and maps defined this way will always run locally
    */
  type Map[Content /* <: js.Object */, Result] = js.Function2[
    /* doc */ Content, 
    /* emit */ js.UndefOr[js.Function2[/* key */ js.Any, /* value */ Content | Result, Unit]], 
    Unit
  ]
  
  object Query {
    
    @js.native
    trait Options[Content /* <: js.Object */, Reduction] extends StObject {
      
      /** Include attachment data. */
      var attachments: js.UndefOr[Boolean] = js.native
      
      /** Return attachment data as Blobs/Buffers, instead of as base64-encoded strings. */
      var binary: js.UndefOr[Boolean] = js.native
      
      /** Include conflicts in the _conflicts field of a doc. */
      var conflicts: js.UndefOr[Boolean] = js.native
      
      /** Reverse the order of the output rows. */
      var descending: js.UndefOr[Boolean] = js.native
      
      /** Get rows with keys in a certain range (inclusive/inclusive). */
      var endkey: js.UndefOr[js.Any] = js.native
      
      /** True if you want the reduce function to group results by keys, rather than returning a single result. */
      var group: js.UndefOr[Boolean] = js.native
      
      /**
        * Number of elements in a key to group by, assuming the keys are arrays.
        * Defaults to the full length of the array.
        */
      var group_level: js.UndefOr[Double] = js.native
      
      /** Include the document in each row in the doc field. */
      var include_docs: js.UndefOr[Boolean] = js.native
      
      /** Include rows having a key equal to the given options.endkey. */
      var inclusive_end: js.UndefOr[Boolean] = js.native
      
      /** Only return rows matching this key. */
      var key: js.UndefOr[js.Any] = js.native
      
      /** Array of keys to fetch in a single shot. */
      var keys: js.UndefOr[js.Array[_]] = js.native
      
      /** Maximum number of rows to return. */
      var limit: js.UndefOr[Double] = js.native
      
      /** Reduce function, or the string name of a built-in function: '_sum', '_count', or '_stats'. */
      var reduce: js.UndefOr[(Reducer[Content, Reduction]) | BuiltInReducers | Boolean] = js.native
      
      /** Number of rows to skip before returning (warning: poor performance on IndexedDB/LevelDB!). */
      var skip: js.UndefOr[Double] = js.native
      
      /**
        * unspecified (default): Returns the latest results, waiting for the view to build if necessary.
        * 'ok': Returns results immediately, even if they’re out-of-date.
        * 'update_after': Returns results immediately, but kicks off a build afterwards.
        */
      var stale: js.UndefOr[ok | update_after] = js.native
      
      /** Get rows with keys in a certain range (inclusive/inclusive). */
      var startkey: js.UndefOr[js.Any] = js.native
    }
    object Options {
      
      @scala.inline
      def apply[Content /* <: js.Object */, Reduction](): Options[Content, Reduction] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options[Content, Reduction]]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options[_, _], Content /* <: js.Object */, Reduction] (val x: Self with (Options[Content, Reduction])) extends AnyVal {
        
        @scala.inline
        def setAttachments(value: Boolean): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
        
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
        def setEndkey(value: js.Any): Self = StObject.set(x, "endkey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndkeyUndefined: Self = StObject.set(x, "endkey", js.undefined)
        
        @scala.inline
        def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
        
        @scala.inline
        def setGroup_level(value: Double): Self = StObject.set(x, "group_level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroup_levelUndefined: Self = StObject.set(x, "group_level", js.undefined)
        
        @scala.inline
        def setInclude_docs(value: Boolean): Self = StObject.set(x, "include_docs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInclude_docsUndefined: Self = StObject.set(x, "include_docs", js.undefined)
        
        @scala.inline
        def setInclusive_end(value: Boolean): Self = StObject.set(x, "inclusive_end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInclusive_endUndefined: Self = StObject.set(x, "inclusive_end", js.undefined)
        
        @scala.inline
        def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setKeys(value: js.Array[_]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
        
        @scala.inline
        def setKeysVarargs(value: js.Any*): Self = StObject.set(x, "keys", js.Array(value :_*))
        
        @scala.inline
        def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        @scala.inline
        def setReduce(value: (Reducer[Content, Reduction]) | BuiltInReducers | Boolean): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReduceFunction3(
          value: (/* keys */ js.Any | Null, /* values */ js.Array[Content | Reduction], /* rereduce */ Boolean) => js.Array[Reduction] | Reduction
        ): Self = StObject.set(x, "reduce", js.Any.fromFunction3(value))
        
        @scala.inline
        def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
        
        @scala.inline
        def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
        
        @scala.inline
        def setStale(value: ok | update_after): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
        
        @scala.inline
        def setStartkey(value: js.Any): Self = StObject.set(x, "startkey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartkeyUndefined: Self = StObject.set(x, "startkey", js.undefined)
      }
    }
    
    @js.native
    trait Response[Content /* <: js.Object */] extends StObject {
      
      var offset: Double = js.native
      
      var rows: js.Array[Doc[Content]] = js.native
      
      var total_rows: Double = js.native
    }
    object Response {
      
      @scala.inline
      def apply[Content /* <: js.Object */](offset: Double, rows: js.Array[Doc[Content]], total_rows: Double): Response[Content] = {
        val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
        __obj.asInstanceOf[Response[Content]]
      }
      
      @scala.inline
      implicit class ResponseMutableBuilder[Self <: Response[_], Content /* <: js.Object */] (val x: Self with Response[Content]) extends AnyVal {
        
        @scala.inline
        def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRows(value: js.Array[Doc[Content]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowsVarargs(value: Doc[Content]*): Self = StObject.set(x, "rows", js.Array(value :_*))
        
        @scala.inline
        def setTotal_rows(value: Double): Self = StObject.set(x, "total_rows", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * CouchDB-style Reduction function
    *
    * @param keys From CouchDB documentation: Array of pairs of docid-key for related map function results;
    *             PouchDB may pass a simple array and also supports complex keys.
    */
  type Reducer[Content /* <: js.Object */, Reduction] = js.Function3[
    /* keys */ js.Any | Null, 
    /* values */ js.Array[Content | Reduction], 
    /* rereduce */ Boolean, 
    js.Array[Reduction] | Reduction
  ]
}
